package org.radiogaga.app.feature.search.ui

import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.WindowInsets
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.safeDrawing
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.widthIn
import androidx.compose.foundation.layout.windowInsetsPadding
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.items
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.foundation.text.BasicTextField
import androidx.compose.foundation.text.KeyboardOptions
import androidx.compose.material3.ButtonDefaults
import androidx.compose.material3.Card
import androidx.compose.material3.CardColors
import androidx.compose.material3.CircularProgressIndicator
import androidx.compose.material3.ElevatedButton
import androidx.compose.material3.HorizontalDivider
import androidx.compose.material3.Icon
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
import androidx.navigation.NavController
import androidx.navigation.compose.rememberNavController
import city_list.composeapp.generated.resources.Res
import city_list.composeapp.generated.resources.ic_dark_mode
import city_list.composeapp.generated.resources.ic_light_mode
import city_list.composeapp.generated.resources.input_string
import city_list.composeapp.generated.resources.theme
import org.jetbrains.compose.resources.stringResource
import org.jetbrains.compose.resources.vectorResource
import org.jetbrains.compose.ui.tooling.preview.Preview
import org.koin.compose.viewmodel.koinViewModel
import org.radiogaga.app.core.domain.model.City
import org.radiogaga.app.core.imgresources.CrossIc
import org.radiogaga.app.core.imgresources.SearchIc
import org.radiogaga.app.core.ui.ErrorScreen
import org.radiogaga.app.theme.AppTheme
import org.radiogaga.app.theme.LocalThemeIsDark

@Composable
fun SearchScreen(
    navController: NavController,
    viewModel: SearchScreenVM = koinViewModel()
) {
    val state by viewModel.state.collectAsState()

    Content(navController, state, accept = viewModel::accept)
}

@Composable
private fun Content(
    navController: NavController,
    state: SearchScreenState,
    accept: (SearchScreenEvent) -> Unit
) {
    Scaffold(
        modifier = Modifier
            .background(color = MaterialTheme.colorScheme.background)
            .fillMaxSize()
            .windowInsetsPadding(WindowInsets.safeDrawing)
    ) {
        var text by remember { mutableStateOf("") }
        Column(modifier = Modifier.padding(horizontal = 16.dp)) {
            SearchTextField(
                text = text,
                accept,
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
                is SearchScreenState.Data -> CityList(navController, state.cityList)
            }
            Spacer(
                modifier = Modifier.weight(1f)
            )
            DarkThemeButton()
        }
    }
}

@Composable
private fun DarkThemeButton() {
    var isDark by LocalThemeIsDark.current
    val icon = remember(isDark) {
        if (isDark) Res.drawable.ic_light_mode
        else Res.drawable.ic_dark_mode
    }

    Column(modifier = Modifier.fillMaxWidth()) {
        ElevatedButton(
            modifier = Modifier
                .padding(horizontal = 8.dp, vertical = 4.dp)
                .align(Alignment.CenterHorizontally)
                .widthIn(min = 100.dp),
            onClick = { isDark = !isDark },
            content = {
                Icon(vectorResource(icon), contentDescription = null)
                Spacer(Modifier.size(ButtonDefaults.IconSpacing))
                Text(stringResource(Res.string.theme))
            }
        )
    }
}

@Composable
private fun SearchTextField(
    text: String = "",
    accept: (SearchScreenEvent) -> Unit,
    onTextChange: (String) -> Unit
) {
    Box {
        BasicTextField(
            modifier = Modifier
                .clip(RoundedCornerShape(16.dp))
                .background(MaterialTheme.colorScheme.surfaceVariant),
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
                        modifier = Modifier
                            .weight(1f)
                            .padding(start = 8.dp),
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
                            modifier = Modifier.clickable {
                                onTextChange("")
                                accept(SearchScreenEvent.ClearSearch)
                            }
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
private fun CityList(
    navController: NavController,
    cities: List<City>
) {
    LazyColumn {
        items(cities) { city ->
            CityItem(navController, city)
        }
    }
}


@Composable
private fun CityItem(navController: NavController, city: City) {
    Card(
        modifier = Modifier
            .fillMaxWidth()
            .padding(vertical = 4.dp, horizontal = 8.dp)
            .clickable {
                // navController.navigate("city_details/${city.id}") !переход на следующий экран
            },
        colors = CardColors(
            containerColor = Color.Transparent,
            contentColor = Color.Unspecified,
            disabledContainerColor = Color.Unspecified,
            disabledContentColor = Color.Unspecified
        )
    ) {
        Column(
            modifier = Modifier.padding(vertical = 8.dp)
        ) {
            Text(
                text = city.title,
                style = MaterialTheme.typography.titleMedium.copy(
                    color = MaterialTheme.colorScheme.primary
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
            navController = rememberNavController(),
            SearchScreenState.Loading,
            {}
        )
    }
}

private val demolist = listOf(
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
