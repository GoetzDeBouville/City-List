package org.radiogaga.app.core.imgresources


import androidx.compose.material3.MaterialTheme
import androidx.compose.runtime.Composable
import androidx.compose.runtime.remember
import androidx.compose.ui.graphics.PathFillType
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val SearchIc: ImageVector
    @Composable
    get() {
        val onBackground = MaterialTheme.colorScheme.onBackground

        _SearchImg = remember(onBackground) {
            ImageVector.Builder(
                name = "SearchImg",
                defaultWidth = 24.dp,
                defaultHeight = 24.dp,
                viewportWidth = 24f,
                viewportHeight = 24f
            ).apply {
                path(
                    fill = SolidColor(onBackground),
                    stroke = SolidColor(onBackground),
                    strokeLineWidth = 1f,
                    pathFillType = PathFillType.EvenOdd
                ) {
                    moveTo(13.46f, 24.45f)
                    curveTo(7.17f, 24.45f, 2.071f, 19.44f, 2.071f, 13.25f)
                    curveTo(2.071f, 7.06f, 7.17f, 2.04f, 13.46f, 2.04f)
                    curveTo(19.75f, 2.04f, 24.85f, 7.06f, 24.85f, 13.25f)
                    curveTo(24.85f, 19.44f, 19.75f, 24.45f, 13.46f, 24.45f)
                    lineTo(13.46f, 24.45f)
                    close()
                    moveTo(31.688f, 30.25f)
                    lineTo(23.429f, 22.12f)
                    curveTo(25.591f, 19.77f, 26.92f, 16.67f, 26.92f, 13.25f)
                    curveTo(26.92f, 5.93f, 20.894f, 0f, 13.46f, 0f)
                    curveTo(6.026f, 0f, 0f, 5.93f, 0f, 13.25f)
                    curveTo(0f, 20.56f, 6.026f, 26.49f, 13.46f, 26.49f)
                    curveTo(16.672f, 26.49f, 19.618f, 25.38f, 21.932f, 23.53f)
                    lineTo(30.224f, 31.69f)
                    curveTo(30.629f, 32.09f, 31.284f, 32.09f, 31.688f, 31.69f)
                    curveTo(32.093f, 31.3f, 32.093f, 30.65f, 31.688f, 30.25f)
                    lineTo(31.688f, 30.25f)
                    close()
                }
            }.build()
        }

        return _SearchImg!!
    }

@Suppress("ObjectPropertyName")
private var _SearchImg: ImageVector? = null
