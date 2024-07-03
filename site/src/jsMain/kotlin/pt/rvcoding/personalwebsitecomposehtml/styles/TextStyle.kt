package pt.rvcoding.personalwebsitecomposehtml.styles

import com.varabyte.kobweb.compose.css.*
import com.varabyte.kobweb.compose.ui.Modifier
import com.varabyte.kobweb.compose.ui.graphics.Colors
import com.varabyte.kobweb.compose.ui.modifiers.*
import com.varabyte.kobweb.compose.ui.styleModifier
import com.varabyte.kobweb.silk.components.style.ComponentStyle
import com.varabyte.kobweb.silk.components.style.hover
import org.jetbrains.compose.web.css.ms
import org.jetbrains.compose.web.css.percent
import org.jetbrains.compose.web.css.px
import pt.rvcoding.personalwebsitecomposehtml.util.Res


val MyTextStyle by ComponentStyle {
    base {
        Modifier
            .fontFamily(Res.String.ROBOTO_REGULAR)
            .fontSize(14.px)
            .color(if (colorMode.isLight) Colors.Black else Colors.White)
            .opacity(60.percent)
            .lineHeight(2)
            .styleModifier {
                userSelect(UserSelect.None)
            }
    }
}

val MyLinkStyle by ComponentStyle {
    base {
        Modifier
            .fontFamily(Res.String.ROBOTO_REGULAR)
            .fontSize(14.px)
            .opacity(60.percent)
            .lineHeight(2)
            .styleModifier {
                userSelect(UserSelect.None)
            }
            .color(if (colorMode.isLight) Colors.Black else Colors.White)
            .fontWeight(FontWeight.Bold)
            .cursor(Cursor.Pointer)
            .transition(
                CSSTransition(property = "color", duration = 300.ms)
            )
    }
    hover {
        Modifier
            .opacity(80.percent)
            .color(
                if (colorMode.isLight) Res.Theme.BLACK.color
                else Res.Theme.WHITE.color
            )
    }
}