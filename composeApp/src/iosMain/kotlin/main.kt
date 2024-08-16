import androidx.compose.ui.window.ComposeUIViewController
import org.radiogaga.app.App
import org.radiogaga.app.core.di.initKoin
import platform.UIKit.UIViewController

fun MainViewController(): UIViewController = ComposeUIViewController(
    configure = {
        initKoin()
    }
) {
    App()
}
