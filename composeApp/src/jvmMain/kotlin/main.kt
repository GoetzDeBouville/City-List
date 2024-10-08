import androidx.compose.ui.unit.dp
import androidx.compose.ui.window.Window
import androidx.compose.ui.window.application
import androidx.compose.ui.window.rememberWindowState
import org.radiogaga.app.App
import org.radiogaga.app.core.di.KoinInit
import java.awt.Dimension

fun main() = application {
    KoinInit().init()
    Window(
        title = "City List",
        state = rememberWindowState(width = 800.dp, height = 600.dp),
        onCloseRequest = ::exitApplication,
    ) {
        window.minimumSize = Dimension(350, 600)
        App()
    }
}