package org.radiogaga.app.core.imgresources

import androidx.compose.foundation.Image
import androidx.compose.material3.MaterialTheme
import androidx.compose.runtime.Composable
import androidx.compose.runtime.remember
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import org.jetbrains.compose.ui.tooling.preview.Preview
import org.radiogaga.app.theme.AppTheme

val SomethingWentWrongImg: ImageVector
    @Composable
    get() {
        val onBackground = MaterialTheme.colorScheme.onBackground

        _SomethingWentWrongImg = remember(onBackground) {
            ImageVector.Builder(
                name = "Error",
                defaultWidth = 800.dp,
                defaultHeight = 800.dp,
                viewportWidth = 100f,
                viewportHeight = 100f
            ).apply {
                path(fill = SolidColor(onBackground)) {
                    moveTo(17.24f, 94.8f)
                    curveToRelative(-0.23f, -1f, -1.42f, -1.03f, -1.7f, -1.97f)
                    arcToRelative(
                        51.25f,
                        51.25f,
                        0f,
                        isMoreThanHalf = false,
                        isPositiveArc = true,
                        -1.13f,
                        -12.42f
                    )
                    curveToRelative(-0.52f, -4.09f, -1.44f, -7.78f, -1.98f, -11.86f)
                    curveToRelative(-2.79f, 0.32f, -5.34f, 0.88f, -7.06f, 2.26f)
                    arcToRelative(
                        30.45f,
                        30.45f,
                        0f,
                        isMoreThanHalf = false,
                        isPositiveArc = false,
                        -1.41f,
                        11.3f
                    )
                    curveToRelative(0.57f, 2.35f, 1.02f, 4.81f, 1.41f, 7.34f)
                    curveToRelative(0.71f, 1.98f, 1.6f, 5.24f, -1.41f, 5.36f)
                    curveToRelative(-2.2f, -0.44f, -2.11f, -3.17f, -2.54f, -5.36f)
                    curveToRelative(-0.62f, -0.04f, -0.12f, -1.2f, -0.28f, -1.69f)
                    curveToRelative(-0.63f, -0.04f, -0.12f, -1.2f, -0.28f, -1.7f)
                    curveToRelative(-0.56f, -0.67f, -0.32f, -2.13f, -0.85f, -2.82f)
                    arcToRelative(
                        41.64f,
                        41.64f,
                        0f,
                        isMoreThanHalf = false,
                        isPositiveArc = true,
                        1.69f,
                        -13.55f
                    )
                    arcToRelative(
                        10.94f,
                        10.94f,
                        0f,
                        isMoreThanHalf = false,
                        isPositiveArc = true,
                        6.78f,
                        -4.23f
                    )
                    arcToRelative(
                        6.6f,
                        6.6f,
                        0f,
                        isMoreThanHalf = false,
                        isPositiveArc = true,
                        3.11f,
                        0.56f
                    )
                    curveToRelative(0.4f, -1.6f, -1.14f, -3.52f, -0.85f, -5.93f)
                    curveToRelative(0.47f, -1.05f, 2f, -1.01f, 2.54f, -1.98f)
                    curveToRelative(0.4f, 0.03f, 0.8f, 0.05f, 0.85f, -0.28f)
                    curveToRelative(7.45f, -0.17f, 13.03f, -2.22f, 20.04f, -2.82f)
                    arcToRelative(
                        64.38f,
                        64.38f,
                        0f,
                        isMoreThanHalf = false,
                        isPositiveArc = false,
                        7.91f,
                        0.28f
                    )
                    curveToRelative(-0.01f, -1.78f, -0.56f, -3.02f, -0.57f, -4.8f)
                    horizontalLineToRelative(-14.12f)
                    arcToRelative(
                        6.81f,
                        6.81f,
                        0f,
                        isMoreThanHalf = false,
                        isPositiveArc = true,
                        -2.82f,
                        -0.85f
                    )
                    curveToRelative(-0.88f, 0.74f, -2.1f, 0.01f, -2.82f, -0.28f)
                    curveToRelative(-0.86f, -1.86f, -0.23f, -4.95f, 0f, -7.34f)
                    verticalLineToRelative(-9.32f)
                    curveToRelative(0.53f, -3.71f, 0.01f, -8.45f, 1.41f, -11.3f)
                    curveToRelative(2.79f, -0.79f, 6.43f, -0.72f, 9.03f, -1.69f)
                    curveToRelative(0.69f, -0.35f, -0.89f, -0.78f, -1.13f, -1.13f)
                    arcToRelative(
                        2.62f,
                        2.62f,
                        0f,
                        isMoreThanHalf = false,
                        isPositiveArc = true,
                        -0.85f,
                        -1.98f
                    )
                    curveToRelative(0.2f, -2.16f, 2.79f, -1.92f, 3.39f, -3.67f)
                    curveToRelative(-0.79f, -0.53f, -2.41f, -0.23f, -2.82f, -1.13f)
                    curveToRelative(-1.08f, -0.14f, -2.19f, -0.26f, -2.26f, -1.41f)
                    curveToRelative(-0.26f, -2.05f, 1.36f, -2.22f, 2.82f, -2.54f)
                    curveToRelative(-1.41f, -3.48f, 2.43f, -5.15f, 5.65f, -3.95f)
                    curveToRelative(0.54f, 1.32f, 0.38f, 3.55f, -0.57f, 4.23f)
                    curveToRelative(-0.99f, 0.8f, -2.3f, 1.27f, -3.1f, 2.26f)
                    curveToRelative(0.32f, 0.53f, 1.09f, 0.6f, 1.41f, 1.13f)
                    curveToRelative(0.19f, 0.01f, 0.39f, 0f, 0.6f, 0f)
                    curveToRelative(0.67f, -0.02f, 1.35f, -0.05f, 1.38f, 0.57f)
                    curveToRelative(0.07f, 2.05f, -1.47f, 2.49f, -1.98f, 3.95f)
                    curveToRelative(0.66f, 1.04f, 2.4f, 0.98f, 1.98f, 3.11f)
                    curveToRelative(10.8f, -0.77f, 21.4f, -1.75f, 33.03f, -1.69f)
                    arcToRelative(
                        5.26f,
                        5.26f,
                        0f,
                        isMoreThanHalf = false,
                        isPositiveArc = false,
                        2.26f,
                        0.28f
                    )
                    curveToRelative(1.86f, 1.15f, 4.86f, 1.16f, 5.93f, 3.11f)
                    curveToRelative(0.15f, 2.31f, -0.81f, 3.51f, -1.13f, 5.36f)
                    verticalLineToRelative(21.18f)
                    curveToRelative(-0.51f, 0.33f, -0.22f, 1.47f, -0.57f, 1.98f)
                    curveToRelative(-0.09f, 0.66f, -0.87f, 0.63f, -1.13f, 1.13f)
                    curveToRelative(-2.02f, 0.41f, -2.43f, -0.77f, -3.39f, -1.41f)
                    curveToRelative(-0.24f, 0.4f, -0.95f, 0.34f, -1.65f, 0.28f)
                    arcToRelative(
                        4.51f,
                        4.51f,
                        0f,
                        isMoreThanHalf = false,
                        isPositiveArc = false,
                        -1.18f,
                        0f
                    )
                    arcToRelative(
                        2.82f,
                        2.82f,
                        0f,
                        isMoreThanHalf = false,
                        isPositiveArc = false,
                        -1.41f,
                        0.14f
                    )
                    arcToRelative(
                        2.81f,
                        2.81f,
                        0f,
                        isMoreThanHalf = false,
                        isPositiveArc = true,
                        -1.41f,
                        0.14f
                    )
                    curveToRelative(-1.69f, 0.29f, -3.68f, 0.28f, -5.36f, 0.56f)
                    curveToRelative(-0.19f, 1.97f, 0.25f, 3.32f, 0.28f, 5.08f)
                    curveToRelative(2.48f, 0f, 4.74f, -0.16f, 7.05f, -0.31f)
                    arcToRelative(
                        82.31f,
                        82.31f,
                        0f,
                        isMoreThanHalf = false,
                        isPositiveArc = true,
                        9.89f,
                        -0.25f
                    )
                    curveToRelative(2.65f, 0.74f, 6.22f, 0.56f, 8.75f, 1.41f)
                    curveToRelative(0.31f, 1.1f, 0.14f, 2.68f, 0.85f, 3.39f)
                    curveToRelative(-0.53f, 1.45f, 0.3f, 3.29f, 0f, 5.37f)
                    arcToRelative(
                        15.19f,
                        15.19f,
                        0f,
                        isMoreThanHalf = false,
                        isPositiveArc = false,
                        2.26f,
                        -0.28f
                    )
                    curveToRelative(3.35f, -1.01f, 7.77f, -0.13f, 9.32f, 2.82f)
                    curveToRelative(0.26f, 0.49f, 0.1f, 1.41f, 0.57f, 1.7f)
                    curveToRelative(0.03f, 1.94f, -0.15f, 4.1f, 0.28f, 5.65f)
                    verticalLineToRelative(9.88f)
                    arcToRelative(
                        21.1f,
                        21.1f,
                        0f,
                        isMoreThanHalf = false,
                        isPositiveArc = true,
                        -0.28f,
                        4.51f
                    )
                    curveToRelative(0.15f, 1.75f, -0.55f, 2.66f, -2.26f, 2.54f)
                    curveToRelative(-2.07f, -0.06f, -1.42f, -3.49f, -1.13f, -5.08f)
                    lineTo(96.3f, 68.82f)
                    curveToRelative(-0.74f, -1.84f, -3.39f, -1.77f, -6.04f, -1.7f)
                    curveToRelative(-0.83f, 0.02f, -1.66f, 0.04f, -2.43f, 0.01f)
                    verticalLineToRelative(22.02f)
                    curveToRelative(-0.04f, 2.4f, 0.29f, 5.19f, -1.41f, 5.93f)
                    curveToRelative(-1.61f, -0.09f, -1.57f, -1.81f, -1.98f, -3.11f)
                    verticalLineToRelative(-4.8f)
                    curveToRelative(-0.8f, -8.23f, 0.23f, -18.3f, -0.56f, -26.54f)
                    curveToRelative(-2.62f, -0.49f, -5.75f, -0.46f, -7.91f, -1.41f)
                    curveToRelative(-10.11f, -0.38f, -18.9f, -0.03f, -28.8f, 0.28f)
                    curveToRelative(-5.01f, 0.73f, -10.87f, 0.61f, -15.53f, 1.7f)
                    curveToRelative(-4.81f, 0.84f, -8.57f, 2.72f, -13.27f, 3.67f)
                    arcToRelative(
                        128.43f,
                        128.43f,
                        0f,
                        isMoreThanHalf = false,
                        isPositiveArc = true,
                        1.98f,
                        21.74f
                    )
                    arcToRelative(
                        14.19f,
                        14.19f,
                        0f,
                        isMoreThanHalf = false,
                        isPositiveArc = false,
                        0.85f,
                        3.11f
                    )
                    verticalLineToRelative(4.52f)
                    curveToRelative(-0.12f, 1.29f, -0.62f, 2.21f, -1.98f, 2.26f)
                    horizontalLineToRelative(-0.06f)
                    arcTo(
                        1.72f,
                        1.72f,
                        0f,
                        isMoreThanHalf = false,
                        isPositiveArc = true,
                        17.24f,
                        94.8f
                    )
                    close()
                    moveTo(13.86f, 62.04f)
                    horizontalLineToRelative(0.57f)
                    verticalLineToRelative(-0.56f)
                    horizontalLineToRelative(-0.57f)
                    close()
                    moveTo(55.64f, 50.75f)
                    curveToRelative(0.8f, 1.46f, -0.54f, 5.05f, 2.26f, 4.52f)
                    arcToRelative(
                        22.66f,
                        22.66f,
                        0f,
                        isMoreThanHalf = false,
                        isPositiveArc = true,
                        -0.28f,
                        -4.8f
                    )
                    horizontalLineToRelative(-3.67f)
                    curveToRelative(-0.02f, 0.76f, 0.29f, 0.57f, 0.72f, 0.38f)
                    arcToRelative(
                        1.59f,
                        1.59f,
                        0f,
                        isMoreThanHalf = false,
                        isPositiveArc = true,
                        0.63f,
                        -0.17f
                    )
                    arcTo(
                        0.78f,
                        0.78f,
                        0f,
                        isMoreThanHalf = false,
                        isPositiveArc = true,
                        55.64f,
                        50.75f
                    )
                    close()
                    moveTo(27.41f, 24.21f)
                    arcToRelative(
                        28.25f,
                        28.25f,
                        0f,
                        isMoreThanHalf = false,
                        isPositiveArc = false,
                        0.28f,
                        5.65f
                    )
                    curveToRelative(-0.14f, 3.15f, 0.15f, 5.87f, 0.28f, 8.75f)
                    verticalLineToRelative(6.78f)
                    curveToRelative(0.08f, 0.5f, -0.79f, 1.41f, 0f, 1.69f)
                    curveToRelative(0.86f, -1.12f, 3.28f, -0.67f, 4.8f, -1.13f)
                    curveToRelative(4.01f, -0.12f, 7.78f, 0f, 11.55f, 0.12f)
                    curveToRelative(2.89f, 0.09f, 5.78f, 0.18f, 8.78f, 0.17f)
                    curveToRelative(0.13f, -0.4f, 0.72f, -0.34f, 1.3f, -0.29f)
                    arcToRelative(
                        3.14f,
                        3.14f,
                        0f,
                        isMoreThanHalf = false,
                        isPositiveArc = false,
                        0.96f,
                        0f
                    )
                    horizontalLineToRelative(2.54f)
                    arcToRelative(
                        12.36f,
                        12.36f,
                        0f,
                        isMoreThanHalf = false,
                        isPositiveArc = false,
                        2.24f,
                        -0.16f
                    )
                    arcToRelative(
                        10.9f,
                        10.9f,
                        0f,
                        isMoreThanHalf = false,
                        isPositiveArc = true,
                        2.84f,
                        -0.12f
                    )
                    arcToRelative(
                        57.14f,
                        57.14f,
                        0f,
                        isMoreThanHalf = false,
                        isPositiveArc = true,
                        9.6f,
                        -0.85f
                    )
                    curveToRelative(-0.07f, -7.05f, -0.99f, -15.59f, 0.56f, -21.74f)
                    curveToRelative(-2.18f, -1.04f, -5.49f, -0.94f, -8.8f, -0.85f)
                    curveToRelative(-1.63f, 0.05f, -3.26f, 0.09f, -4.75f, 0f)
                    curveToRelative(-0.36f, 0.01f, -0.39f, 0.36f, -0.85f, 0.28f)
                    curveToRelative(-5.22f, 0.24f, -10.55f, 0.37f, -16.09f, 0.28f)
                    curveTo(37.18f, 22.88f, 32.91f, 24.16f, 27.41f, 24.21f)
                    close()
                    moveTo(35.6f, 93.1f)
                    arcToRelative(
                        32.54f,
                        32.54f,
                        0f,
                        isMoreThanHalf = false,
                        isPositiveArc = true,
                        -4.52f,
                        -0.85f
                    )
                    curveToRelative(0.74f, -0.67f, 2.39f, -0.43f, 3.39f, -0.85f)
                    horizontalLineToRelative(3.39f)
                    curveToRelative(1.77f, -0.2f, 3.27f, -0.69f, 5.08f, -0.85f)
                    curveToRelative(1.31f, -0.03f, 3.61f, -1.37f, 4.52f, 0f)
                    curveToRelative(0.16f, 2.7f, -3.26f, 1.82f, -5.08f, 2.54f)
                    close()
                    moveTo(64.68f, 88.87f)
                    curveToRelative(-0.33f, -2.89f, 2.76f, -4.86f, 3.95f, -2.26f)
                    quadToRelative(0.19f, 2.73f, -1.69f, 3.39f)
                    arcToRelative(
                        2.95f,
                        2.95f,
                        0f,
                        isMoreThanHalf = false,
                        isPositiveArc = true,
                        -0.4f,
                        0.03f
                    )
                    arcTo(
                        2.25f,
                        2.25f,
                        0f,
                        isMoreThanHalf = false,
                        isPositiveArc = true,
                        64.68f,
                        88.87f
                    )
                    close()
                    moveTo(28.26f, 87.46f)
                    curveToRelative(-0.04f, -1.35f, 0.94f, -1.7f, 2.26f, -1.69f)
                    arcToRelative(
                        4.11f,
                        4.11f,
                        0f,
                        isMoreThanHalf = false,
                        isPositiveArc = false,
                        1.69f,
                        -0.14f
                    )
                    arcToRelative(
                        4.1f,
                        4.1f,
                        0f,
                        isMoreThanHalf = false,
                        isPositiveArc = true,
                        1.69f,
                        -0.14f
                    )
                    arcToRelative(
                        66.99f,
                        66.99f,
                        0f,
                        isMoreThanHalf = false,
                        isPositiveArc = false,
                        6.78f,
                        -0.56f
                    )
                    curveToRelative(2.57f, 0.03f, 4.53f, -0.55f, 7.06f, -0.56f)
                    arcToRelative(
                        11.74f,
                        11.74f,
                        0f,
                        isMoreThanHalf = false,
                        isPositiveArc = true,
                        3.39f,
                        -0.28f
                    )
                    curveToRelative(0.51f, -0.72f, 2.2f, -0.24f, 2.82f, -0.85f)
                    curveToRelative(1.39f, -0.16f, 2.08f, 0.37f, 2.26f, 1.41f)
                    curveToRelative(-0.09f, 1.6f, -1.81f, 1.57f, -3.11f, 1.98f)
                    curveToRelative(-0.51f, 0.34f, -1.64f, 0.05f, -1.98f, 0.56f)
                    arcToRelative(
                        3.1f,
                        3.1f,
                        0f,
                        isMoreThanHalf = false,
                        isPositiveArc = true,
                        -0.96f,
                        0f
                    )
                    curveToRelative(-0.58f, -0.06f, -1.17f, -0.11f, -1.3f, 0.29f)
                    arcToRelative(
                        59.9f,
                        59.9f,
                        0f,
                        isMoreThanHalf = false,
                        isPositiveArc = false,
                        -9.04f,
                        0.85f
                    )
                    horizontalLineToRelative(-6.21f)
                    curveToRelative(-0.85f, 0f, -1.77f, 0.09f, -2.62f, 0.09f)
                    curveTo(29.83f, 88.39f, 28.8f, 88.23f, 28.26f, 87.46f)
                    close()
                    moveTo(25.71f, 77.29f)
                    curveToRelative(-0.54f, -1.21f, 0.32f, -3.18f, 0f, -5.08f)
                    curveToRelative(0.38f, -0.09f, 0.23f, -0.71f, 0.28f, -1.13f)
                    arcToRelative(
                        5.39f,
                        5.39f,
                        0f,
                        isMoreThanHalf = false,
                        isPositiveArc = false,
                        1.13f,
                        -1.98f
                    )
                    arcToRelative(
                        29.54f,
                        29.54f,
                        0f,
                        isMoreThanHalf = false,
                        isPositiveArc = true,
                        8.75f,
                        -5.08f
                    )
                    horizontalLineToRelative(4.8f)
                    curveToRelative(3.25f, 1.65f, 4.41f, 6.87f, 3.39f, 11.86f)
                    arcToRelative(
                        87.75f,
                        87.75f,
                        0f,
                        isMoreThanHalf = false,
                        isPositiveArc = false,
                        -11.29f,
                        1.7f
                    )
                    arcToRelative(
                        17.42f,
                        17.42f,
                        0f,
                        isMoreThanHalf = false,
                        isPositiveArc = false,
                        -3.21f,
                        0.02f
                    )
                    curveToRelative(-0.64f, 0.05f, -1.25f, 0.09f, -1.82f, 0.09f)
                    arcTo(
                        4.09f,
                        4.09f,
                        0f,
                        isMoreThanHalf = false,
                        isPositiveArc = true,
                        25.71f,
                        77.3f
                    )
                    close()
                    moveTo(28.82f, 71.08f)
                    arcToRelative(
                        8.16f,
                        8.16f,
                        0f,
                        isMoreThanHalf = false,
                        isPositiveArc = false,
                        -0.56f,
                        3.67f
                    )
                    arcToRelative(
                        22.12f,
                        22.12f,
                        0f,
                        isMoreThanHalf = false,
                        isPositiveArc = false,
                        6.77f,
                        -0.56f
                    )
                    curveToRelative(0.62f, -0.19f, -0.54f, -0.94f, -0.85f, -1.13f)
                    curveToRelative(-0.24f, -0.61f, -0.73f, -0.96f, -0.56f, -1.98f)
                    curveToRelative(1.53f, -0.94f, 2.6f, 0.7f, 3.95f, 0.85f)
                    curveToRelative(0.22f, 0.63f, 0.99f, 0.71f, 1.41f, 1.13f)
                    curveToRelative(0.18f, 0.69f, 0.51f, 0.53f, 0.98f, 0.38f)
                    arcToRelative(
                        1.75f,
                        1.75f,
                        0f,
                        isMoreThanHalf = false,
                        isPositiveArc = true,
                        0.99f,
                        -0.1f
                    )
                    curveToRelative(0.21f, -2.75f, -0.19f, -4.89f, -1.41f, -6.21f)
                    horizontalLineToRelative(-4.8f)
                    curveTo(32.71f, 68.38f, 30.36f, 69.33f, 28.82f, 71.08f)
                    close()
                    moveTo(7.36f, 75.6f)
                    curveToRelative(-0.82f, -1.69f, 0.15f, -4.89f, 2.26f, -3.67f)
                    curveToRelative(0.57f, 1.3f, 0.71f, 2.71f, -0.28f, 3.67f)
                    curveToRelative(-0.66f, 0.04f, -0.92f, 0.19f, -1.25f, 0.19f)
                    arcTo(
                        1.8f,
                        1.8f,
                        0f,
                        isMoreThanHalf = false,
                        isPositiveArc = true,
                        7.36f,
                        75.6f
                    )
                    close()
                    moveTo(90.93f, 72.21f)
                    curveToRelative(-0.68f, -2.44f, 1.28f, -3.52f, 3.11f, -2.54f)
                    curveToRelative(0.47f, 0.47f, 0.22f, 1.66f, 0.28f, 2.54f)
                    arcToRelative(
                        11.82f,
                        11.82f,
                        0f,
                        isMoreThanHalf = false,
                        isPositiveArc = true,
                        -1.69f,
                        1.13f
                    )
                    curveTo(91.87f, 73.15f, 91.56f, 72.53f, 90.93f, 72.21f)
                    close()
                    moveTo(56.49f, 72.78f)
                    curveToRelative(0.06f, 0.01f, -0.53f, -0.26f, -0.56f, -0.28f)
                    curveToRelative(-0.95f, -0.63f, -0.94f, -1.66f, -1.41f, -2.83f)
                    arcToRelative(
                        4.32f,
                        4.32f,
                        0f,
                        isMoreThanHalf = false,
                        isPositiveArc = true,
                        6.78f,
                        -3.1f
                    )
                    arcToRelative(
                        5.37f,
                        5.37f,
                        0f,
                        isMoreThanHalf = false,
                        isPositiveArc = true,
                        0.85f,
                        3.1f
                    )
                    curveToRelative(-0.27f, 1.95f, -2.57f, 3.26f, -4.55f, 3.26f)
                    arcTo(
                        3.84f,
                        3.84f,
                        0f,
                        isMoreThanHalf = false,
                        isPositiveArc = true,
                        56.49f,
                        72.78f
                    )
                    close()
                    moveTo(57.9f, 68.26f)
                    verticalLineToRelative(0.85f)
                    curveToRelative(0.46f, 0.46f, 1.78f, 0.34f, 1.7f, -0.56f)
                    curveToRelative(0f, -0.42f, -0.39f, -0.58f, -0.81f, -0.58f)
                    arcTo(
                        1.32f,
                        1.32f,
                        0f,
                        isMoreThanHalf = false,
                        isPositiveArc = false,
                        57.9f,
                        68.26f
                    )
                    close()
                    moveTo(65.52f, 72.21f)
                    curveToRelative(-1.06f, -1.12f, -0.95f, -3.54f, -0.56f, -5.36f)
                    curveToRelative(1.79f, -2.31f, 6.69f, -1.36f, 7.9f, 0.85f)
                    arcToRelative(
                        4.87f,
                        4.87f,
                        0f,
                        isMoreThanHalf = false,
                        isPositiveArc = true,
                        -2.26f,
                        5.08f
                    )
                    curveToRelative(-0.55f, 0.01f, -1.1f, 0.02f, -1.64f, 0.02f)
                    arcTo(
                        7.09f,
                        7.09f,
                        0f,
                        isMoreThanHalf = false,
                        isPositiveArc = true,
                        65.52f,
                        72.21f
                    )
                    close()
                    moveTo(67.78f, 69.11f)
                    curveToRelative(-0.23f, 1.02f, 2.13f, 0.68f, 1.98f, 0f)
                    arcToRelative(
                        1.77f,
                        1.77f,
                        0f,
                        isMoreThanHalf = false,
                        isPositiveArc = false,
                        -1.98f,
                        0f
                    )
                    close()
                    moveTo(75.12f, 69.67f)
                    curveToRelative(-0.31f, -1.53f, -0.31f, -2.96f, 0.57f, -3.95f)
                    curveToRelative(1.64f, -1.23f, 4.49f, -0.14f, 5.37f, 1.13f)
                    arcToRelative(
                        2.54f,
                        2.54f,
                        0f,
                        isMoreThanHalf = false,
                        isPositiveArc = true,
                        -2.74f,
                        4f
                    )
                    curveTo(76.95f, 70.84f, 75.6f, 70.48f, 75.12f, 69.67f)
                    close()
                    moveTo(78.8f, 68.83f)
                    curveToRelative(0.19f, -0.76f, -0.58f, -0.55f, -0.85f, -0.85f)
                    curveTo(77.78f, 68.71f, 78.06f, 69f, 78.8f, 68.82f)
                    close()
                    moveTo(42.1f, 43.98f)
                    arcToRelative(
                        6.96f,
                        6.96f,
                        0f,
                        isMoreThanHalf = false,
                        isPositiveArc = true,
                        -0.57f,
                        -3.67f
                    )
                    arcToRelative(
                        4.31f,
                        4.31f,
                        0f,
                        isMoreThanHalf = false,
                        isPositiveArc = true,
                        1.7f,
                        -1.98f
                    )
                    curveToRelative(0.38f, -0.75f, 1.66f, -0.6f, 2.26f, -1.13f)
                    curveToRelative(0.83f, -0.02f, 1.59f, 0.01f, 2.31f, 0.05f)
                    curveToRelative(1.79f, 0.09f, 3.28f, 0.18f, 4.75f, -0.61f)
                    arcToRelative(
                        8.44f,
                        8.44f,
                        0f,
                        isMoreThanHalf = false,
                        isPositiveArc = false,
                        3.41f,
                        0.17f
                    )
                    arcToRelative(
                        8.21f,
                        8.21f,
                        0f,
                        isMoreThanHalf = false,
                        isPositiveArc = true,
                        3.08f,
                        0.11f
                    )
                    curveToRelative(1.53f, 0.91f, 1.46f, 4.66f, 0.28f, 5.93f)
                    curveToRelative(-1.72f, 1.45f, -4.92f, 1.43f, -8.12f, 1.41f)
                    curveToRelative(-0.59f, 0f, -1.18f, -0.01f, -1.76f, 0f)
                    arcToRelative(
                        25.92f,
                        25.92f,
                        0f,
                        isMoreThanHalf = false,
                        isPositiveArc = true,
                        -4.32f,
                        0.54f
                    )
                    arcTo(
                        4.75f,
                        4.75f,
                        0f,
                        isMoreThanHalf = false,
                        isPositiveArc = true,
                        42.09f,
                        43.98f
                    )
                    close()
                    moveTo(44.07f, 41.72f)
                    curveToRelative(0.77f, 0.63f, 2.27f, 0.17f, 2.83f, -0.28f)
                    verticalLineToRelative(-1.98f)
                    curveTo(45.46f, 39.72f, 44.17f, 40.13f, 44.06f, 41.72f)
                    close()
                    moveTo(54.52f, 41.44f)
                    arcToRelative(
                        3.63f,
                        3.63f,
                        0f,
                        isMoreThanHalf = false,
                        isPositiveArc = false,
                        3.11f,
                        -0.28f
                    )
                    verticalLineToRelative(-1.98f)
                    horizontalLineToRelative(-3.11f)
                    close()
                    moveTo(49.44f, 39.46f)
                    curveToRelative(-0.14f, 0.89f, 0.51f, 1f, 0.28f, 1.98f)
                    horizontalLineToRelative(1.7f)
                    verticalLineToRelative(-2.26f)
                    curveToRelative(-0.14f, 0f, -0.28f, 0f, -0.43f, -0.01f)
                    reflectiveCurveToRelative(-0.27f, -0.01f, -0.4f, -0.01f)
                    arcTo(
                        1.59f,
                        1.59f,
                        0f,
                        isMoreThanHalf = false,
                        isPositiveArc = false,
                        49.43f,
                        39.46f
                    )
                    close()
                    moveTo(37.01f, 36.08f)
                    arcToRelative(
                        8.19f,
                        8.19f,
                        0f,
                        isMoreThanHalf = false,
                        isPositiveArc = true,
                        -3.39f,
                        -1.41f
                    )
                    arcToRelative(
                        0.77f,
                        0.77f,
                        0f,
                        isMoreThanHalf = false,
                        isPositiveArc = false,
                        -0.56f,
                        -0.85f
                    )
                    curveToRelative(-0.03f, -0.45f, 0.13f, -1.08f, -0.28f, -1.13f)
                    curveToRelative(-0.05f, -1.74f, 0.61f, -2.78f, 0.56f, -4.52f)
                    arcToRelative(
                        0.77f,
                        0.77f,
                        0f,
                        isMoreThanHalf = false,
                        isPositiveArc = false,
                        0.56f,
                        -0.85f
                    )
                    arcToRelative(
                        8.47f,
                        8.47f,
                        0f,
                        isMoreThanHalf = false,
                        isPositiveArc = true,
                        2.54f,
                        -1.41f
                    )
                    curveToRelative(2.55f, -0.49f, 5.12f, 0.61f, 5.93f, 2.26f)
                    curveToRelative(0.2f, 3.13f, -0.42f, 5.42f, -1.7f, 7.06f)
                    arcToRelative(
                        8.42f,
                        8.42f,
                        0f,
                        isMoreThanHalf = false,
                        isPositiveArc = true,
                        -3.43f,
                        0.85f
                    )
                    quadTo(37.13f, 36.07f, 37.01f, 36.07f)
                    close()
                    moveTo(36.73f, 29.87f)
                    curveToRelative(-0.07f, 1.34f, -0.88f, 1.95f, -1.13f, 3.11f)
                    arcToRelative(
                        4.67f,
                        4.67f,
                        0f,
                        isMoreThanHalf = false,
                        isPositiveArc = false,
                        3.67f,
                        0.56f
                    )
                    curveToRelative(0.84f, -0.87f, 0.6f, -2.97f, 0.28f, -4.24f)
                    quadToRelative(-0.35f, -0.03f, -0.66f, -0.03f)
                    arcTo(
                        3.48f,
                        3.48f,
                        0f,
                        isMoreThanHalf = false,
                        isPositiveArc = false,
                        36.73f,
                        29.86f
                    )
                    close()
                    moveTo(59.88f, 34.1f)
                    curveToRelative(-0.98f, -1.19f, -1.03f, -3.3f, -1.13f, -5.36f)
                    curveToRelative(0.52f, -3.24f, 3.96f, -5.29f, 7.62f, -3.67f)
                    curveToRelative(0.29f, 0.74f, 1.12f, 0.95f, 1.41f, 1.69f)
                    curveToRelative(-0.05f, 0.33f, 0.06f, 0.5f, 0.28f, 0.56f)
                    curveToRelative(0.25f, 4.12f, -2.16f, 7.28f, -5.66f, 7.28f)
                    arcTo(
                        6.9f,
                        6.9f,
                        0f,
                        isMoreThanHalf = false,
                        isPositiveArc = true,
                        59.88f,
                        34.1f
                    )
                    close()
                    moveTo(61.29f, 32.12f)
                    arcToRelative(
                        2.85f,
                        2.85f,
                        0f,
                        isMoreThanHalf = false,
                        isPositiveArc = false,
                        3.95f,
                        -2.54f
                    )
                    curveToRelative(-0.36f, -0.86f, -0.78f, -1.2f, -1.2f, -1.2f)
                    curveTo(62.9f, 28.38f, 61.7f, 30.82f, 61.29f, 32.12f)
                    close()
                }
            }.build()
        }

        return _SomethingWentWrongImg!!
    }

@Suppress("ObjectPropertyName")
private var _SomethingWentWrongImg: ImageVector? = null



@Preview
@Composable
private fun ShowImg() {
    AppTheme {
        Image(
            imageVector = SomethingWentWrongImg,
            contentDescription = null,
        )
    }
}