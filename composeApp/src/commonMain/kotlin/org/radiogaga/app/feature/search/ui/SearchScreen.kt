package org.radiogaga.app.feature.search.ui

import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.items
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.foundation.text.BasicTextField
import androidx.compose.foundation.text.KeyboardOptions
import androidx.compose.material3.Card
import androidx.compose.material3.CardColors
import androidx.compose.material3.CircularProgressIndicator
import androidx.compose.material3.HorizontalDivider
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.collectAsState
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.text.input.ImeAction
import androidx.compose.ui.unit.dp
import city_list.composeapp.generated.resources.Res
import city_list.composeapp.generated.resources.input_string
import org.jetbrains.compose.resources.stringResource
import org.jetbrains.compose.ui.tooling.preview.Preview
import org.radiogaga.app.core.domain.model.City
import org.radiogaga.app.core.imgresources.CrossIc
import org.radiogaga.app.core.imgresources.SearchIc
import org.radiogaga.app.core.ui.ErrorScreen
import org.radiogaga.app.theme.AppTheme

@Composable
fun SearchScreen(viewModel: SearchScreenVM) {
    val state by viewModel.state.collectAsState()

    Content(state, accept = viewModel::accept)
}

@Composable
private fun Content(
    state: SearchScreenState,
    accept: (SearchScreenEvent) -> Unit
) {
    Scaffold(modifier = Modifier.background(color = MaterialTheme.colorScheme.background)) {
        var text by remember { mutableStateOf("") }

        Column {
            SearchTextField(
                text = text,
                onTextChange = { inputText ->
                    text = inputText
                    accept(SearchScreenEvent.SearchTextChanged(text))
                }
            )

            Spacer(
                modifier = Modifier.height(16.dp)
            )

            when (state) {
                is SearchScreenState.Error -> ErrorScreen(state.errorType)
                is SearchScreenState.Loading -> Loading()
                is SearchScreenState.Data -> CityList(state.cityList)
            }
        }
    }
}


@Composable
fun SearchTextField(
    text: String = "",
    onTextChange: (String) -> Unit
) {
    Box {
        BasicTextField(
            modifier = Modifier
                .clip(RoundedCornerShape(16.dp))
                .background(MaterialTheme.colorScheme.surfaceVariant)
                .padding(horizontal = 16.dp),
            value = text,
            onValueChange = onTextChange,
            singleLine = true,
            cursorBrush = SolidColor(MaterialTheme.colorScheme.primary),
            textStyle = MaterialTheme.typography.titleMedium.copy(
                color = MaterialTheme.colorScheme.primary
            ),
            decorationBox = { innerTextField ->
                Row(
                    modifier = Modifier
                        .fillMaxWidth()
                        .height(36.dp)
                        .padding(8.dp),
                    verticalAlignment = Alignment.CenterVertically
                ) {
                    Image(
                        modifier = Modifier.size(8.dp),
                        imageVector = SearchIc,
                        contentDescription = "",
                    )

                    Box(
                        modifier = Modifier.weight(1f),
                        contentAlignment = Alignment.CenterStart
                    ) {

                        if (text.isEmpty()) {
                            Text(
                                modifier = Modifier.padding(start = 8.dp),
                                text = stringResource(Res.string.input_string),
                                style = MaterialTheme.typography.titleSmall.copy(
                                    color = MaterialTheme.colorScheme.onSurfaceVariant
                                ),
                            )
                        }
                        innerTextField()
                    }

                    if (text.isNotEmpty()) {
                        Image(
                            imageVector = CrossIc,
                            contentDescription = "Clear Icon",
                            modifier = Modifier.clickable { onTextChange("") }
                        )
                    }
                }
            },
            keyboardOptions = KeyboardOptions.Default.copy(imeAction = ImeAction.Search)
        )
    }
}

@Composable
private fun Loading() {
    Box(
        modifier = Modifier.fillMaxSize(),
        contentAlignment = Alignment.Center
    ) {
        CircularProgressIndicator(
            modifier = Modifier.size(48.dp)
        )
    }
}


@Composable
private fun CityList(cities: List<City>) {
    LazyColumn {
        items(cities) { city ->
            CityItem(city)
        }
    }
}


@Composable
private fun CityItem(city: City) {
    Card(
        modifier = Modifier
            .fillMaxWidth()
            .padding(vertical = 4.dp, horizontal = 8.dp),
        colors = CardColors(
            containerColor = Color.Transparent,
            contentColor = Color.Unspecified,
            disabledContainerColor = Color.Unspecified,
            disabledContentColor = Color.Unspecified
        )
    ) {
        Column(
            modifier = Modifier.padding(vertical = 8.dp, horizontal = 16.dp)
        ) {
            Text(
                text = city.title,
                style = MaterialTheme.typography.titleMedium.copy(
                    color = MaterialTheme.colorScheme.onPrimary
                )
            )
            Spacer(modifier = Modifier.height(8.dp))
            Text(
                text = city.subTitle,
                style = MaterialTheme.typography.titleSmall.copy(
                    color = MaterialTheme.colorScheme.onBackground
                )
            )
            Spacer(modifier = Modifier.height(8.dp))
            HorizontalDivider(
                color = MaterialTheme.colorScheme.primary,
                thickness = 1.dp,
                modifier = Modifier.fillMaxWidth()
            )
        }
    }
}


@Preview
@Composable
private fun ShowContentPreview() {
    AppTheme {
        Content(
            SearchScreenState.Data(
                listOf(
                    City(
                        title = "Los-Angeles",
                        subTitle = "Country: US population: 2kk",
                        latitude = 4.5f,
                        longitude = 6.7f
                    ),
                    City(
                        title = "London",
                        subTitle = "Country: UK population: 18kk",
                        latitude = 4.5f,
                        longitude = 6.7f
                    ),
                    City(
                        title = "Tokio",
                        subTitle = "Country: JP population: 22kk",
                        latitude = 4.5f,
                        longitude = 6.7f
                    ),
                )
            ),
            {}
        )
    }
}

