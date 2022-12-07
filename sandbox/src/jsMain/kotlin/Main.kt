package sandbox

import androidx.compose.runtime.Composable
import dev.petuska.kmdc.top.app.bar.*
import dev.petuska.kmdc.typography.MDCBody1
import dev.petuska.kmdcx.icons.MDCIcon
import dev.petuska.kmdcx.icons.mdcIcon
import org.jetbrains.compose.web.css.Position
import org.jetbrains.compose.web.css.position
import org.jetbrains.compose.web.dom.Text
import org.jetbrains.compose.web.renderComposableInBody

fun main() {
  println("My main")
  renderComposableInBody {
    Test()
  }
}

@Composable
fun Test() {
  MDCTopAppBar() {
    TopAppBar(attrs = {
      onNav { println("onNav") }
      style {
        position(Position.Relative)
      }
    }) {
      Row {
        Section(align = MDCTopAppBarSectionAlign.Start) {
          NavButton(attrs = { mdcIcon() }) { Text(MDCIcon.Menu.type) }
          Title("Contextual Title")
        }
        Section(
          align = MDCTopAppBarSectionAlign.End,
          attrs = {
            attr("role", "toolbar")
          }
        ) {
          ActionButton(attrs = { mdcIcon() }) { Text(MDCIcon.Share.type) }
          ActionButton(attrs = { mdcIcon() }) { Text(MDCIcon.Delete.type) }
          ActionButton(attrs = { mdcIcon() }) { Text(MDCIcon.MoreVert.type) }
        }
      }
    }
    Main {
      MDCBody1("123")
    }
  }
}
