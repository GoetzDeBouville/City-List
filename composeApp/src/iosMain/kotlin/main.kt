import androidx.compose.ui.window.ComposeUIViewController
import org.radiogaga.app.App
import org.radiogaga.app.core.di.KoinInit
import platform.UIKit.UIViewController

fun MainViewController(): UIViewController = ComposeUIViewController(
    configure = {
        KoinInit().init()
    }
) {
    App()
}
