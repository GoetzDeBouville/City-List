package org.radiogaga.app.core.imgresources

import androidx.compose.foundation.Image
import androidx.compose.material3.MaterialTheme
import androidx.compose.runtime.Composable
import androidx.compose.runtime.remember
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import org.jetbrains.compose.ui.tooling.preview.Preview
import org.radiogaga.app.theme.AppTheme

val NothingFoundImg: ImageVector
    @Composable
    get() {
        val onBackground = MaterialTheme.colorScheme.onBackground

        _NothingFoundImg = remember(onBackground) {
            ImageVector.Builder(
                name = "NothingFound",
                defaultWidth = 800.dp,
                defaultHeight = 800.dp,
                viewportWidth = 91.723f,
                viewportHeight = 91.723f
            ).apply {
                path(fill = SolidColor(onBackground)) {
                    moveTo(31.858f, 90.53f)
                    curveToRelative(-0.251f, -0.063f, -0.491f, -0.193f, -0.854f, -0.285f)
                    curveToRelative(-0.269f, -0.068f, -0.715f, -0.156f, -1.143f, -0.284f)
                    curveToRelative(-0.3f, -0.093f, -0.878f, -0.362f, -1.711f, -0.572f)
                    curveToRelative(-0.285f, -0.069f, -0.638f, -0.365f, -1.143f, -0.57f)
                    curveToRelative(-1.433f, -0.586f, -2.6f, -1.353f, -4f, -2f)
                    arcToRelative(
                        6.412f,
                        6.412f,
                        0f,
                        isMoreThanHalf = false,
                        isPositiveArc = true,
                        -0.854f,
                        -0.285f
                    )
                    curveToRelative(-0.384f, -0.235f, -0.725f, -0.873f, -1.141f, -1.14f)
                    curveToRelative(-0.31f, -0.2f, -0.337f, -0.06f, -0.571f, -0.286f)
                    curveToRelative(-0.15f, -0.145f, -0.743f, -0.29f, -1.138f, -0.571f)
                    arcToRelative(
                        43.184f,
                        43.184f,
                        0f,
                        isMoreThanHalf = false,
                        isPositiveArc = true,
                        -5.994f,
                        -5.7f
                    )
                    arcToRelative(
                        33.517f,
                        33.517f,
                        0f,
                        isMoreThanHalf = false,
                        isPositiveArc = true,
                        -2.284f,
                        -2.569f
                    )
                    arcToRelative(
                        53.031f,
                        53.031f,
                        0f,
                        isMoreThanHalf = false,
                        isPositiveArc = true,
                        -9.984f,
                        -23.393f
                    )
                    curveToRelative(-0.011f, -5.717f, -0.177f, -11.59f, 0.855f, -16.263f)
                    arcToRelative(
                        26.9f,
                        26.9f,
                        0f,
                        isMoreThanHalf = false,
                        isPositiveArc = true,
                        1.714f,
                        -6.847f
                    )
                    curveToRelative(0.247f, -1.178f, 0.892f, -1.961f, 1.139f, -3.135f)
                    curveToRelative(0.639f, -0.124f, 0.114f, -1.409f, 0.284f, -2f)
                    curveToRelative(0.426f, -0.242f, 0.414f, -0.917f, 0.572f, -1.427f)
                    arcToRelative(
                        33.955f,
                        33.955f,
                        0f,
                        isMoreThanHalf = false,
                        isPositiveArc = true,
                        4.849f,
                        -5.136f
                    )
                    arcToRelative(
                        27.743f,
                        27.743f,
                        0f,
                        isMoreThanHalf = false,
                        isPositiveArc = true,
                        5.135f,
                        -4.564f
                    )
                    curveToRelative(3.477f, -2.992f, 7.632f, -5.3f, 11.127f, -8.274f)
                    curveToRelative(3.031f, -0.582f, 5.063f, -2.165f, 8.273f, -2.568f)
                    curveToRelative(1.138f, -0.673f, 2.967f, -0.646f, 4.279f, -1.141f)
                    arcToRelative(
                        9.438f,
                        9.438f,
                        0f,
                        isMoreThanHalf = false,
                        isPositiveArc = true,
                        4f,
                        -1.142f
                    )
                    curveToRelative(0.331f, 0.048f, 0.508f, -0.063f, 0.569f, -0.284f)
                    curveToRelative(6.851f, -0.572f, 10.846f, 1.708f, 16.833f, 2f)
                    curveToRelative(0.609f, 0.724f, 1.935f, 0.727f, 2f, 2f)
                    curveToRelative(1.174f, 0.154f, 1.668f, 0.993f, 2.566f, 1.426f)
                    curveToRelative(0.462f, 0.586f, 1.432f, 0.662f, 2.568f, 0.571f)
                    curveToRelative(0.46f, 0.584f, 1.372f, 0.72f, 2f, 1.14f)
                    curveToRelative(2.928f, 2.016f, 5.75f, 4.142f, 7.7f, 7.133f)
                    arcToRelative(
                        29.217f,
                        29.217f,
                        0f,
                        isMoreThanHalf = false,
                        isPositiveArc = true,
                        5.7f,
                        8.845f
                    )
                    arcToRelative(
                        41.1f,
                        41.1f,
                        0f,
                        isMoreThanHalf = false,
                        isPositiveArc = true,
                        4.28f,
                        10.271f
                    )
                    curveToRelative(0.539f, 1.933f, 0.95f, 4f, 1.429f, 5.99f)
                    curveToRelative(-0.051f, 2.425f, 1.444f, 3.307f, 1.711f, 5.422f)
                    arcToRelative(
                        34.6f,
                        34.6f,
                        0f,
                        isMoreThanHalf = false,
                        isPositiveArc = true,
                        -2.57f,
                        15.692f
                    )
                    arcToRelative(
                        50.417f,
                        50.417f,
                        0f,
                        isMoreThanHalf = false,
                        isPositiveArc = false,
                        -3.137f,
                        5.99f
                    )
                    curveToRelative(-0.93f, 0.594f, -1.167f, 1.877f, -2f, 2.569f)
                    curveToRelative(-0.362f, 1.16f, -1.389f, 1.652f, -1.711f, 2.853f)
                    curveToRelative(-1.545f, 1.5f, -2.75f, 3.334f, -4.28f, 4.85f)
                    curveToRelative(-1.225f, 1.815f, -3.21f, 2.873f, -4.565f, 4.564f)
                    curveToRelative(-1.922f, 1.12f, -3.352f, 2.732f, -5.42f, 3.708f)
                    curveToRelative(-1.7f, 1.248f, -3.924f, 1.972f, -5.7f, 3.138f)
                    curveToRelative(-2.411f, 0.635f, -5.325f, 0.764f, -7.42f, 1.713f)
                    reflectiveCurveToRelative(-4.987f, 1.1f, -7.417f, 1.712f)
                    quadToRelative(-1.523f, 0.049f, -3f, 0.05f)
                    arcTo(
                        48f,
                        48f,
                        0f,
                        isMoreThanHalf = false,
                        isPositiveArc = true,
                        31.858f,
                        90.53f
                    )
                    close()
                    moveTo(43.115f, 86.254f)
                    arcToRelative(
                        5.406f,
                        5.406f,
                        0f,
                        isMoreThanHalf = false,
                        isPositiveArc = true,
                        1.3f,
                        0f
                    )
                    horizontalLineToRelative(3.424f)
                    curveToRelative(0.453f, -0.131f, -1.167f, -2.535f, 0.284f, -2.852f)
                    arcToRelative(
                        1.281f,
                        1.281f,
                        0f,
                        isMoreThanHalf = false,
                        isPositiveArc = true,
                        1.143f,
                        0.569f
                    )
                    arcToRelative(
                        1.279f,
                        1.279f,
                        0f,
                        isMoreThanHalf = false,
                        isPositiveArc = false,
                        1.139f,
                        0.571f
                    )
                    arcToRelative(
                        20.519f,
                        20.519f,
                        0f,
                        isMoreThanHalf = false,
                        isPositiveArc = false,
                        2.317f,
                        0f
                    )
                    arcToRelative(
                        9.514f,
                        9.514f,
                        0f,
                        isMoreThanHalf = false,
                        isPositiveArc = true,
                        3.677f,
                        0.289f
                    )
                    curveToRelative(1.618f, -1.807f, 4.537f, -2.307f, 6.559f, -3.709f)
                    arcToRelative(
                        39.788f,
                        39.788f,
                        0f,
                        isMoreThanHalf = false,
                        isPositiveArc = false,
                        6.561f,
                        -3.71f
                    )
                    curveToRelative(0.617f, -0.241f, -0.107f, -1.817f, 0.572f, -2f)
                    curveToRelative(0.582f, -0.611f, 1.129f, 0.078f, 1.711f, 0.284f)
                    arcToRelative(
                        46.917f,
                        46.917f,
                        0f,
                        isMoreThanHalf = false,
                        isPositiveArc = true,
                        4.852f,
                        -4.85f
                    )
                    curveToRelative(0.873f, -1.214f, 1.4f, -2.781f, 2.851f, -3.422f)
                    curveToRelative(0.843f, -1.915f, 2.176f, -3.342f, 3.141f, -5.136f)
                    arcToRelative(
                        37.56f,
                        37.56f,
                        0f,
                        isMoreThanHalf = false,
                        isPositiveArc = false,
                        2.567f,
                        -5.705f
                    )
                    curveToRelative(-0.086f, -2.483f, 0.234f, -5.369f, -0.286f, -7.419f)
                    verticalLineToRelative(-4.279f)
                    curveToRelative(-0.742f, -6.868f, -2.129f, -13.088f, -4.849f, -17.975f)
                    curveToRelative(-0.962f, -2.84f, -2.61f, -5f, -4f, -7.418f)
                    curveToRelative(-1.458f, -2.25f, -3.458f, -3.958f, -4.565f, -6.562f)
                    arcToRelative(
                        34.309f,
                        34.309f,
                        0f,
                        isMoreThanHalf = false,
                        isPositiveArc = false,
                        -9.414f,
                        -6.561f
                    )
                    curveToRelative(-5.963f, -0.027f, -9.814f, -2.168f, -15.691f, -2.281f)
                    arcToRelative(
                        1.118f,
                        1.118f,
                        0f,
                        isMoreThanHalf = false,
                        isPositiveArc = false,
                        -0.857f,
                        0.284f
                    )
                    arcToRelative(
                        1.128f,
                        1.128f,
                        0f,
                        isMoreThanHalf = false,
                        isPositiveArc = true,
                        -0.857f,
                        0.286f
                    )
                    arcToRelative(
                        30.92f,
                        30.92f,
                        0f,
                        isMoreThanHalf = false,
                        isPositiveArc = false,
                        -18.541f,
                        5.706f
                    )
                    curveToRelative(-1.835f, 2.157f, -4.849f, 3.139f, -7.135f, 4.848f)
                    curveToRelative(-1.6f, 0.4f, -2.168f, 1.825f, -3.708f, 2.283f)
                    arcToRelative(
                        27.076f,
                        27.076f,
                        0f,
                        isMoreThanHalf = false,
                        isPositiveArc = true,
                        -3.138f,
                        2.853f
                    )
                    arcToRelative(
                        28.11f,
                        28.11f,
                        0f,
                        isMoreThanHalf = false,
                        isPositiveArc = false,
                        -5.422f,
                        14.264f
                    )
                    arcToRelative(
                        20.2f,
                        20.2f,
                        0f,
                        isMoreThanHalf = false,
                        isPositiveArc = false,
                        -1.711f,
                        4.28f
                    )
                    arcToRelative(
                        74.459f,
                        74.459f,
                        0f,
                        isMoreThanHalf = false,
                        isPositiveArc = false,
                        0.572f,
                        12.552f
                    )
                    curveToRelative(0.162f, 0.5f, 0.226f, 0.166f, 0.36f, -0.17f)
                    curveToRelative(0.1f, -0.253f, 0.242f, -0.507f, 0.495f, -0.4f)
                    curveToRelative(0.247f, -0.418f, 0.429f, -0.905f, 1.143f, -0.856f)
                    arcToRelative(
                        0.757f,
                        0.757f,
                        0f,
                        isMoreThanHalf = false,
                        isPositiveArc = true,
                        0.922f,
                        0.213f
                    )
                    curveToRelative(0.311f, 0.289f, 0.473f, 0.578f, 0.5f, -0.213f)
                    arcToRelative(
                        10.952f,
                        10.952f,
                        0f,
                        isMoreThanHalf = false,
                        isPositiveArc = true,
                        -0.57f,
                        -2.568f
                    )
                    curveToRelative(0.135f, -2.718f, -0.582f, -6.287f, 1.427f, -7.132f)
                    arcToRelative(
                        14.425f,
                        14.425f,
                        0f,
                        isMoreThanHalf = false,
                        isPositiveArc = false,
                        4.335f,
                        0.287f
                    )
                    curveToRelative(0.859f, -0.022f, 1.718f, -0.045f, 2.512f, 0f)
                    curveToRelative(0.823f, -0.035f, 0.493f, -1.217f, 1.424f, -1.142f)
                    curveToRelative(6.4f, 0.17f, 8.551f, 0.041f, 15.409f, 0f)
                    curveToRelative(2.451f, -0.784f, 4.984f, -1.481f, 6.848f, -2.853f)
                    curveToRelative(2.361f, -0.773f, 3.727f, -2.548f, 5.99f, -3.424f)
                    curveToRelative(1.46f, 4.341f, 3.875f, 7.728f, 5.707f, 11.7f)
                    curveToRelative(-4.44f, 4.31f, -11.932f, 5.568f, -16.546f, 9.7f)
                    curveToRelative(-1.676f, 0.512f, -2.453f, 1.923f, -4f, 2.567f)
                    curveToRelative(-0.954f, 1.232f, -2.343f, 2.028f, -3.422f, 3.139f)
                    curveToRelative(-2.638f, 1.736f, -4.417f, 4.33f, -6.848f, 6.275f)
                    arcToRelative(
                        6.217f,
                        6.217f,
                        0f,
                        isMoreThanHalf = false,
                        isPositiveArc = true,
                        -2.854f,
                        3.139f
                    )
                    arcToRelative(
                        5.975f,
                        5.975f,
                        0f,
                        isMoreThanHalf = false,
                        isPositiveArc = false,
                        -1.711f,
                        -2.568f
                    )
                    curveToRelative(0.063f, 1.837f, 0.952f, 2.855f, 0.857f, 4.851f)
                    curveToRelative(0.448f, 1.45f, 0.443f, 3.359f, 1.14f, 4.564f)
                    arcToRelative(
                        1.352f,
                        1.352f,
                        0f,
                        isMoreThanHalf = false,
                        isPositiveArc = false,
                        0.858f,
                        0.286f
                    )
                    curveToRelative(-0.548f, -1.278f, -1.008f, -3.977f, 0f, -5.136f)
                    arcToRelative(
                        1.227f,
                        1.227f,
                        0f,
                        isMoreThanHalf = false,
                        isPositiveArc = true,
                        1.207f,
                        0.234f
                    )
                    curveToRelative(0.347f, 0.252f, 0.6f, 0.5f, 1.074f, 0.052f)
                    arcToRelative(
                        26.27f,
                        26.27f,
                        0f,
                        isMoreThanHalf = false,
                        isPositiveArc = true,
                        3.993f,
                        -5.422f
                    )
                    curveToRelative(0.59f, -1.027f, 1.694f, -1.539f, 2.284f, -2.567f)
                    curveToRelative(1.066f, -0.456f, 1.269f, -1.775f, 2.567f, -2f)
                    arcToRelative(
                        18.856f,
                        18.856f,
                        0f,
                        isMoreThanHalf = false,
                        isPositiveArc = true,
                        5.705f,
                        -3.711f
                    )
                    curveToRelative(1.546f, -1.5f, 3.454f, -2.635f, 5.134f, -3.994f)
                    curveToRelative(3.851f, -2.047f, 8.123f, -3.671f, 12.27f, -5.42f)
                    curveToRelative(2.933f, 5.433f, 4.18f, 12.556f, 5.707f, 19.4f)
                    arcToRelative(
                        44.682f,
                        44.682f,
                        0f,
                        isMoreThanHalf = false,
                        isPositiveArc = false,
                        0.284f,
                        7.135f
                    )
                    curveToRelative(0.111f, 0.284f, 0.345f, 0.077f, 0.691f, -0.13f)
                    arcToRelative(
                        1.334f,
                        1.334f,
                        0f,
                        isMoreThanHalf = false,
                        isPositiveArc = true,
                        1.307f,
                        -0.158f
                    )
                    curveToRelative(1.15f, 0.581f, 1.926f, 4.406f, 0.285f, 5.135f)
                    curveToRelative(-1.893f, 0.468f, -1.919f, -0.93f, -3.137f, -1.14f)
                    curveToRelative(-1.046f, 0.667f, -1.741f, 1.682f, -3.137f, 2f)
                    arcToRelative(
                        10.105f,
                        10.105f,
                        0f,
                        isMoreThanHalf = false,
                        isPositiveArc = true,
                        -2.855f,
                        -0.285f
                    )
                    curveToRelative(-1.357f, 0.925f, -3.333f, 1.232f, -5.134f, 1.712f)
                    arcToRelative(
                        48.256f,
                        48.256f,
                        0f,
                        isMoreThanHalf = false,
                        isPositiveArc = true,
                        -15.977f,
                        -1.712f
                    )
                    arcToRelative(
                        27.094f,
                        27.094f,
                        0f,
                        isMoreThanHalf = false,
                        isPositiveArc = false,
                        -3.993f,
                        -2.282f
                    )
                    arcToRelative(
                        9.186f,
                        9.186f,
                        0f,
                        isMoreThanHalf = false,
                        isPositiveArc = false,
                        2.283f,
                        3.71f
                    )
                    curveToRelative(-0.123f, 0.543f, -0.619f, 0.715f, -0.574f, 1.424f)
                    curveToRelative(2.127f, 0.539f, 4f, 1.332f, 6.279f, 1.714f)
                    curveToRelative(0.506f, -0.337f, -1f, -2.113f, 0.284f, -2.569f)
                    curveToRelative(1.6f, -0.746f, 3.1f, 0.826f, 4.281f, 1.427f)
                    curveToRelative(0.148f, 0.422f, 0.421f, 0.717f, 0.569f, 1.141f)
                    curveToRelative(-0.318f, 0.351f, -0.247f, 0.586f, 0.284f, 0.572f)
                    curveTo(41.576f, 86.371f, 42.346f, 86.313f, 43.115f, 86.254f)
                    close()
                    moveTo(25.274f, 81.354f)
                    curveToRelative(0.517f, 0.383f, 1f, 0.768f, 1.447f, 0.33f)
                    curveToRelative(-1.188f, -1.094f, -2.092f, -3.537f, -1.139f, -5.134f)
                    curveToRelative(-1.715f, -0.666f, -2.627f, -2.13f, -4f, -3.138f)
                    curveToRelative(-0.149f, 2.255f, 2.082f, 4.349f, 0.284f, 5.706f)
                    curveToRelative(0.716f, 0.616f, 1.766f, 0.9f, 2.282f, 1.712f)
                    horizontalLineToRelative(0f)
                    arcTo(
                        2.04f,
                        2.04f,
                        0f,
                        isMoreThanHalf = false,
                        isPositiveArc = true,
                        25.275f,
                        81.355f
                    )
                    close()
                    moveTo(43.838f, 57.719f)
                    curveToRelative(-0.648f, 1.351f, -1.963f, 2.032f, -3.136f, 2.855f)
                    arcToRelative(
                        17.168f,
                        17.168f,
                        0f,
                        isMoreThanHalf = false,
                        isPositiveArc = true,
                        -2.852f,
                        1.141f
                    )
                    curveToRelative(-0.748f, 0.964f, -2.066f, 1.361f, -2.857f, 2.281f)
                    curveToRelative(-0.964f, 0.747f, -1.81f, 1.614f, -2.853f, 2.282f)
                    arcToRelative(
                        12.943f,
                        12.943f,
                        0f,
                        isMoreThanHalf = false,
                        isPositiveArc = true,
                        -2.568f,
                        2.567f
                    )
                    curveToRelative(-0.881f, 0.927f, -2.143f, 1.47f, -2.567f, 2.854f)
                    arcToRelative(
                        19.616f,
                        19.616f,
                        0f,
                        isMoreThanHalf = false,
                        isPositiveArc = false,
                        2.567f,
                        2f
                    )
                    curveToRelative(0.995f, 0.531f, 1.324f, 1.721f, 2.568f, 2f)
                    curveToRelative(1.6f, 1.449f, 3.919f, 2.17f, 5.71f, 3.424f)
                    curveToRelative(1.765f, 0.233f, 3.117f, 0.874f, 4.849f, 1.14f)
                    horizontalLineToRelative(6.846f)
                    arcToRelative(
                        41.656f,
                        41.656f,
                        0f,
                        isMoreThanHalf = false,
                        isPositiveArc = false,
                        6.277f,
                        -2.282f
                    )
                    curveToRelative(-0.1f, -1.047f, -1.131f, -1.152f, -0.857f, -2.566f)
                    curveToRelative(0.284f, -3.772f, -0.615f, -7.016f, 0f, -10.272f)
                    quadToRelative(-1.563f, -5.141f, -3.424f, -9.986f)
                    curveToRelative(-0.013f, -0.174f, -0.042f, -0.337f, -0.285f, -0.284f)
                    curveToRelative(-0.016f, -0.174f, -0.041f, -0.338f, -0.286f, -0.284f)
                    curveToRelative(-0.062f, 0.221f, -0.236f, 0.331f, -0.57f, 0.284f)
                    curveTo(48.189f, 55.792f, 46.085f, 56.829f, 43.839f, 57.72f)
                    close()
                    moveTo(19.785f, 76.919f)
                    curveToRelative(-0.015f, -0.049f, -0.072f, -0.1f, -0.193f, -0.087f)
                    curveTo(19.702f, 77.104f, 19.812f, 77.014f, 19.786f, 76.925f)
                    close()
                    moveTo(13.597f, 66.844f)
                    curveToRelative(-0.111f, 0.742f, -0.848f, 0.862f, -0.854f, 1.713f)
                    curveToRelative(0.444f, 0.6f, 0.508f, 1.582f, 1.427f, 1.711f)
                    curveToRelative(-0.214f, -1.735f, 0.454f, -2.588f, 0.284f, -4.278f)
                    curveToRelative(0.114f, -0.742f, 0.851f, -0.861f, 0.857f, -1.714f)
                    curveToRelative(-0.89f, -1.105f, -1.391f, -2.6f, -2.281f, -3.707f)
                    curveTo(13.095f, 62.789f, 13.79f, 64.378f, 13.597f, 66.85f)
                    close()
                    moveTo(13.597f, 48.014f)
                    curveToRelative(-0.235f, 7.276f, 3.564f, 10.514f, 6.279f, 14.836f)
                    curveToRelative(0.833f, -0.115f, 0.925f, -0.976f, 1.426f, -1.426f)
                    arcToRelative(
                        3.991f,
                        3.991f,
                        0f,
                        isMoreThanHalf = false,
                        isPositiveArc = false,
                        1.426f,
                        -1.427f
                    )
                    arcToRelative(
                        9.527f,
                        9.527f,
                        0f,
                        isMoreThanHalf = false,
                        isPositiveArc = false,
                        2.856f,
                        -3.136f
                    )
                    curveToRelative(1.454f, -0.447f, 1.926f, -1.875f, 3.137f, -2.569f)
                    arcToRelative(
                        36.506f,
                        36.506f,
                        0f,
                        isMoreThanHalf = false,
                        isPositiveArc = true,
                        3.422f,
                        -2.568f
                    )
                    curveToRelative(2.121f, -1.778f, 4.776f, -3.023f, 7.132f, -4.565f)
                    arcToRelative(
                        16.176f,
                        16.176f,
                        0f,
                        isMoreThanHalf = false,
                        isPositiveArc = false,
                        4f,
                        -2f
                    )
                    curveToRelative(1.14f, -0.857f, 2.776f, -1.217f, 3.708f, -2.282f)
                    curveToRelative(-0.993f, -0.909f, -0.806f, -3f, -2f, -3.711f)
                    arcToRelative(
                        2.012f,
                        2.012f,
                        0f,
                        isMoreThanHalf = false,
                        isPositiveArc = false,
                        -0.857f,
                        0.572f
                    )
                    curveToRelative(-3.469f, 1.476f, -6.553f, 3.336f, -10.84f, 3.993f)
                    curveToRelative(-1.393f, -0.01f, -2.8f, 0f, -4.216f, 0.007f)
                    curveToRelative(-5.765f, 0.035f, -11.532f, 0.071f, -16.042f, -1.148f)
                    arcTo(
                        15.778f,
                        15.778f,
                        0f,
                        isMoreThanHalf = false,
                        isPositiveArc = false,
                        13.597f,
                        48.02f
                    )
                    close()
                    moveTo(9.32f, 61.714f)
                    curveToRelative(0f, 0.158f, 0.23f, 0.323f, 0.285f, 0f)
                    arcToRelative(
                        0.185f,
                        0.185f,
                        0f,
                        isMoreThanHalf = false,
                        isPositiveArc = false,
                        -0.153f,
                        -0.187f
                    )
                    curveTo(9.397f, 61.529f, 9.343f, 61.579f, 9.32f, 61.716f)
                    close()
                    moveTo(9.89f, 60.857f)
                    curveToRelative(-0.187f, -1.329f, 0.448f, -1.832f, 0.571f, -2.853f)
                    curveToRelative(0.211f, -0.454f, 1.4f, 0.064f, 1.142f, -0.856f)
                    curveToRelative(-0.779f, -1.316f, -1.3f, -2.883f, -2f, -4.279f)
                    curveTo(9.47f, 55.678f, 8.406f, 58.739f, 9.89f, 60.861f)
                    close()
                    moveTo(12.832f, 60.483f)
                    curveToRelative(0.015f, 0.05f, 0.074f, 0.1f, 0.2f, 0.089f)
                    curveToRelative(-0.057f, -0.134f, -0.113f, -0.179f, -0.152f, -0.179f)
                    reflectiveCurveTo(12.818f, 60.442f, 12.832f, 60.486f)
                    close()
                    moveTo(63.532f, 75.408f)
                    curveToRelative(0.212f, -0.878f, -0.784f, -0.549f, -0.572f, -1.428f)
                    verticalLineToRelative(-2.852f)
                    curveToRelative(-0.354f, -1.643f, -0.721f, -3.271f, -1.141f, -4.85f)
                    curveToRelative(-0.107f, -0.594f, 0.159f, -0.5f, 0.462f, -0.413f)
                    reflectiveCurveToRelative(0.652f, 0.184f, 0.68f, -0.443f)
                    curveToRelative(-0.243f, -3.654f, -1.566f, -6.232f, -2.283f, -9.416f)
                    curveToRelative(-1.425f, -2.47f, -2.215f, -5.582f, -3.706f, -7.988f)
                    curveToRelative(0.112f, -0.836f, 1.674f, -0.227f, 2f, -0.855f)
                    arcToRelative(
                        4.567f,
                        4.567f,
                        0f,
                        isMoreThanHalf = false,
                        isPositiveArc = true,
                        1.568f,
                        0.038f
                    )
                    curveToRelative(0.563f, 0.085f, 1.029f, 0.172f, 1.284f, -0.038f)
                    curveToRelative(0.422f, -0.148f, 0.719f, -0.422f, 1.141f, -0.572f)
                    lineTo(76.934f, 46.591f)
                    curveToRelative(1.242f, 0.178f, 2.544f, 2.048f, 3.711f, 0.572f)
                    arcToRelative(
                        5.872f,
                        5.872f,
                        0f,
                        isMoreThanHalf = false,
                        isPositiveArc = true,
                        0.57f,
                        2.853f
                    )
                    verticalLineToRelative(3.424f)
                    curveToRelative(-0.275f, 2.863f, -1.088f, 5.188f, -1.425f, 7.988f)
                    arcToRelative(
                        11.9f,
                        11.9f,
                        0f,
                        isMoreThanHalf = false,
                        isPositiveArc = false,
                        -1.714f,
                        3.139f
                    )
                    curveToRelative(-0.8f, 0.338f, -1.06f, 1.22f, -1.714f, 1.711f)
                    arcToRelative(
                        5.782f,
                        5.782f,
                        0f,
                        isMoreThanHalf = false,
                        isPositiveArc = false,
                        -1.709f,
                        1.712f
                    )
                    curveToRelative(-1.617f, 0.571f, -2.15f, 2.225f, -3.708f, 2.852f)
                    curveToRelative(-2.529f, 1.942f, -4.533f, 4.409f, -7.418f, 5.993f)
                    curveTo(62.858f, 76.761f, 63.364f, 75.583f, 63.527f, 75.411f)
                    close()
                    moveTo(62.96f, 51.156f)
                    curveToRelative(2.386f, 5.7f, 4.923f, 11.246f, 4.277f, 19.972f)
                    curveToRelative(0.063f, 0.345f, 0.319f, 0.175f, 0.573f, 0f)
                    curveToRelative(0.069f, -0.409f, 0.472f, -0.482f, 0.571f, -0.857f)
                    curveToRelative(0.933f, 0.076f, 0.6f, -1.107f, 1.427f, -1.139f)
                    arcToRelative(
                        19.114f,
                        19.114f,
                        0f,
                        isMoreThanHalf = false,
                        isPositiveArc = true,
                        2.282f,
                        -2.854f
                    )
                    arcToRelative(
                        30.982f,
                        30.982f,
                        0f,
                        isMoreThanHalf = false,
                        isPositiveArc = false,
                        3.992f,
                        -6.562f
                    )
                    curveToRelative(-0.016f, -3.216f, 0.178f, -6.645f, -0.569f, -9.129f)
                    curveToRelative(-0.75f, 0f, -1.5f, 0f, -2.26f, -0.007f)
                    curveToRelative(-0.656f, 0f, -1.313f, -0.007f, -1.965f, -0.007f)
                    arcTo(
                        43.027f,
                        43.027f,
                        0f,
                        isMoreThanHalf = false,
                        isPositiveArc = false,
                        62.955f,
                        51.161f
                    )
                    close()
                    moveTo(48.981f, 31.47f)
                    curveToRelative(1.2f, -1.465f, 3.278f, -2.047f, 4.849f, -3.137f)
                    curveToRelative(1.176f, -1.485f, 3.059f, -2.267f, 3.992f, -3.993f)
                    arcToRelative(
                        16.045f,
                        16.045f,
                        0f,
                        isMoreThanHalf = false,
                        isPositiveArc = false,
                        3.427f,
                        -4.565f
                    )
                    curveToRelative(0.639f, -0.692f, 1.1f, -1.563f, 1.71f, -2.282f)
                    curveToRelative(0.724f, -0.516f, 0.721f, -1.752f, 1.711f, -2f)
                    curveToRelative(-0.077f, -0.461f, 0.27f, -0.49f, 0.284f, -0.856f)
                    curveToRelative(0.724f, 0.131f, 0.994f, 1.2f, 2.281f, 1.141f)
                    arcToRelative(
                        40.036f,
                        40.036f,
                        0f,
                        isMoreThanHalf = false,
                        isPositiveArc = true,
                        4.281f,
                        5.137f
                    )
                    arcToRelative(
                        17.7f,
                        17.7f,
                        0f,
                        isMoreThanHalf = false,
                        isPositiveArc = true,
                        1.713f,
                        3.135f
                    )
                    curveToRelative(0.616f, 0.911f, 1.6f, 1.446f, 2f, 2.571f)
                    curveToRelative(2.115f, 4.063f, 4.185f, 8.174f, 4.85f, 13.692f)
                    curveToRelative(-5.89f, -1.028f, -10.758f, 1.4f, -15.692f, 2.282f)
                    curveToRelative(-3.689f, -0.266f, -6.254f, 0.594f, -9.131f, 1.141f)
                    curveTo(52.991f, 39.823f, 51.272f, 35.361f, 48.976f, 31.473f)
                    close()
                    moveTo(65.527f, 19.77f)
                    curveToRelative(-1.054f, 1.894f, -1.911f, 3.984f, -3.423f, 5.421f)
                    curveToRelative(-1.178f, 1.768f, -2.778f, 3.115f, -3.994f, 4.85f)
                    curveToRelative(-0.739f, 0.4f, -1.317f, 0.964f, -2f, 1.425f)
                    curveToRelative(-0.23f, 1.008f, -1.74f, 0.734f, -1.709f, 2f)
                    curveToRelative(0.473f, 1.139f, 1.152f, 2.079f, 1.709f, 3.137f)
                    curveToRelative(0.337f, 0.427f, 0.356f, 1.167f, 0.859f, 1.427f)
                    curveToRelative(0.445f, 0.409f, 0.222f, 1.487f, 1.139f, 1.426f)
                    curveToRelative(4.8f, -1.387f, 9.909f, -2.454f, 15.121f, -3.423f)
                    curveToRelative(-0.838f, -7.439f, -3.381f, -13.165f, -7.7f, -17.118f)
                    close()
                    moveTo(19.313f, 37.744f)
                    curveToRelative(-1.6f, -0.4f, -3.6f, -0.4f, -5.137f, -0.856f)
                    curveToRelative(-1.772f, 0.329f, -4.616f, 0.321f, -5.422f, -1.428f)
                    arcToRelative(
                        2.479f,
                        2.479f,
                        0f,
                        isMoreThanHalf = false,
                        isPositiveArc = true,
                        2.281f,
                        -2.281f
                    )
                    curveToRelative(-0.035f, -3.935f, 1.842f, -5.959f, 2.854f, -8.844f)
                    curveToRelative(1.35f, -1.22f, 2.272f, -2.863f, 4f, -3.71f)
                    curveToRelative(0.041f, -0.624f, 0.721f, -0.612f, 1.429f, -0.57f)
                    curveToRelative(-0.211f, -0.779f, 0.563f, -0.573f, 0.569f, -1.141f)
                    arcToRelative(
                        6.109f,
                        6.109f,
                        0f,
                        isMoreThanHalf = false,
                        isPositiveArc = false,
                        2.282f,
                        -1.427f
                    )
                    curveToRelative(3.526f, -1.512f, 5.263f, -4.82f, 9.13f, -5.99f)
                    arcToRelative(
                        1.987f,
                        1.987f,
                        0f,
                        isMoreThanHalf = false,
                        isPositiveArc = true,
                        0.853f,
                        -0.572f
                    )
                    arcToRelative(
                        5.838f,
                        5.838f,
                        0f,
                        isMoreThanHalf = false,
                        isPositiveArc = true,
                        1.714f,
                        3.137f
                    )
                    curveToRelative(0.58f, 0.084f, 0.557f, 0.77f, 1.138f, 0.857f)
                    curveToRelative(0.282f, 0.385f, 0.966f, 0.368f, 1.142f, 0.854f)
                    curveToRelative(3.177f, 4.34f, 6.525f, 8.5f, 8.558f, 13.98f)
                    curveToRelative(-0.127f, 0.916f, -1.108f, 0.983f, -1.71f, 1.428f)
                    arcToRelative(
                        5.493f,
                        5.493f,
                        0f,
                        isMoreThanHalf = false,
                        isPositiveArc = true,
                        -2f,
                        1.14f
                    )
                    arcToRelative(
                        9.377f,
                        9.377f,
                        0f,
                        isMoreThanHalf = false,
                        isPositiveArc = false,
                        -0.569f,
                        2.281f
                    )
                    curveToRelative(-1.747f, 0.525f, -3.6f, 1.025f, -5.423f, 1.711f)
                    curveToRelative(-1.735f, 0.656f, -4.807f, 0.93f, -7.418f, 1.428f)
                    close()
                    moveTo(30.437f, 15.204f)
                    curveToRelative(-2.835f, 2.015f, -5.735f, 3.968f, -8.559f, 5.992f)
                    curveToRelative(-2.721f, 3.651f, -6.358f, 6.385f, -7.132f, 11.982f)
                    arcToRelative(
                        30.806f,
                        30.806f,
                        0f,
                        isMoreThanHalf = false,
                        isPositiveArc = false,
                        5.988f,
                        -0.284f
                    )
                    horizontalLineToRelative(6.278f)
                    arcToRelative(
                        53.024f,
                        53.024f,
                        0f,
                        isMoreThanHalf = false,
                        isPositiveArc = false,
                        7.132f,
                        -1.428f
                    )
                    arcToRelative(
                        13.181f,
                        13.181f,
                        0f,
                        isMoreThanHalf = false,
                        isPositiveArc = false,
                        3.14f,
                        -1.139f
                    )
                    arcToRelative(
                        5.8f,
                        5.8f,
                        0f,
                        isMoreThanHalf = false,
                        isPositiveArc = false,
                        3.139f,
                        -1.427f
                    )
                    curveToRelative(-3.019f, -4.877f, -5.716f, -10.071f, -9.414f, -14.266f)
                    curveTo(30.998f, 15.018f, 30.501f, 14.903f, 30.432f, 15.212f)
                    close()
                    moveTo(44.7f, 22.904f)
                    curveToRelative(-0.795f, -1.963f, -2.245f, -3.27f, -3.139f, -5.135f)
                    curveToRelative(-1.243f, -1.513f, -2.65f, -2.862f, -3.42f, -4.85f)
                    curveToRelative(-0.883f, -0.453f, -0.9f, -1.762f, -1.714f, -2.282f)
                    curveToRelative(-0.059f, -1.04f, -1.261f, -1.955f, -0.569f, -2.853f)
                    arcToRelative(
                        3.623f,
                        3.623f,
                        0f,
                        isMoreThanHalf = false,
                        isPositiveArc = true,
                        3.137f,
                        0.857f
                    )
                    curveToRelative(2.857f, -1.9f, 7.795f, -1.715f, 11.982f, -2.282f)
                    arcToRelative(
                        10.233f,
                        10.233f,
                        0f,
                        isMoreThanHalf = false,
                        isPositiveArc = true,
                        2.434f,
                        0.154f
                    )
                    arcToRelative(
                        9.776f,
                        9.776f,
                        0f,
                        isMoreThanHalf = false,
                        isPositiveArc = false,
                        2.7f,
                        0.13f
                    )
                    curveToRelative(2.293f, 1.229f, 5.285f, 1.752f, 6.565f, 3.994f)
                    curveToRelative(-0.365f, 2.963f, -2.325f, 4.334f, -3.139f, 6.848f)
                    curveToRelative(-1.957f, 1.752f, -3.37f, 4.05f, -5.135f, 5.99f)
                    curveToRelative(-2.1f, 1.613f, -4.454f, 2.966f, -6.563f, 4.565f)
                    curveTo(46.445f, 26.683f, 46.037f, 24.334f, 44.695f, 22.915f)
                    close()
                    moveTo(46.7f, 10.636f)
                    curveToRelative(-1.56f, 0.437f, -3.736f, 0.26f, -5.422f, 0.57f)
                    curveToRelative(0.962f, 2.465f, 2.682f, 4.167f, 4f, 6.278f)
                    curveToRelative(1.261f, 2.16f, 2.612f, 4.232f, 3.708f, 6.56f)
                    arcToRelative(
                        10.079f,
                        10.079f,
                        0f,
                        isMoreThanHalf = false,
                        isPositiveArc = false,
                        2.855f,
                        -2f
                    )
                    arcToRelative(
                        28.433f,
                        28.433f,
                        0f,
                        isMoreThanHalf = false,
                        isPositiveArc = true,
                        2.567f,
                        -2.281f
                    )
                    curveToRelative(1.718f, -2.371f, 3.874f, -4.307f, 5.418f, -6.848f)
                    curveToRelative(-1.49f, -1.455f, -3.979f, -1.915f, -6.276f, -2.566f)
                    arcToRelative(
                        12.317f,
                        12.317f,
                        0f,
                        isMoreThanHalf = false,
                        isPositiveArc = true,
                        -4.195f,
                        0.286f
                    )
                    curveToRelative(-0.537f, -0.019f, -1.074f, -0.037f, -1.592f, -0.037f)
                    curveTo(47.388f, 10.612f, 47.033f, 10.621f, 46.694f, 10.647f)
                    close()
                }
            }.build()
        }

        return _NothingFoundImg!!
    }

@Suppress("ObjectPropertyName")
private var _NothingFoundImg: ImageVector? = null



@Preview
@Composable
private fun ShowImg() {
    AppTheme {
        Image(
            imageVector = NothingFoundImg,
            contentDescription = null,
        )
    }
}