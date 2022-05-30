import nju.lalala.demaxiya.css.UICSS
import nju.lalala.demaxiya.view.UIView
import tornadofx.*

fun main(args: Array<String>) {
    launch<MainApp>(args)
}

class MainApp : App(UIView::class, UICSS::class) {
    init {
        // 启用热重载CSS的功能
        reloadStylesheetsOnFocus()
    }
}