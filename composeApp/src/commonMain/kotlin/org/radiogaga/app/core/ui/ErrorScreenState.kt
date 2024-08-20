package org.radiogaga.app.core.ui

import androidx.compose.runtime.Composable
import androidx.compose.ui.graphics.vector.ImageVector
import city_list.composeapp.generated.resources.Res
import city_list.composeapp.generated.resources.no_internet_connection
import city_list.composeapp.generated.resources.nothing_found
import city_list.composeapp.generated.resources.something_went_wrong
import org.jetbrains.compose.resources.StringResource
import org.radiogaga.app.core.imgresources.NothingFoundImg
import org.radiogaga.app.core.imgresources.SomethingWentWrongImg

enum class ErrorScreenState(
    val errorImg: @Composable () -> ImageVector,
    val errorDescriptionResId: StringResource
) {
    NO_INTERNET(
        { SomethingWentWrongImg },
        Res.string.no_internet_connection
    ),
    SERVER_ERROR(
        { SomethingWentWrongImg },
        Res.string.something_went_wrong
    ),
    NOTHING_FOUND(
        { NothingFoundImg },
        Res.string.nothing_found
    )
}