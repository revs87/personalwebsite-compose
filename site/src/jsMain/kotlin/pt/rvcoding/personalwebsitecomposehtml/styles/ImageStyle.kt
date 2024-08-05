package pt.rvcoding.personalwebsitecomposehtml.styles

import com.varabyte.kobweb.compose.css.CSSTransition
import com.varabyte.kobweb.compose.css.TransitionProperty
import com.varabyte.kobweb.compose.ui.Modifier
import com.varabyte.kobweb.compose.ui.modifiers.padding
import com.varabyte.kobweb.compose.ui.modifiers.transition
import com.varabyte.kobweb.silk.components.style.ComponentStyle
import com.varabyte.kobweb.silk.components.style.active
import com.varabyte.kobweb.silk.components.style.hover
import org.jetbrains.compose.web.css.ms
import org.jetbrains.compose.web.css.px

val ImageStyle by ComponentStyle {
    base {
        Modifier
            .transition(CSSTransition(property = TransitionProperty.All, duration = 300.ms))
    }
    hover {
        Modifier
            .padding(all = 4.px)
    }
    active {
        Modifier
            .padding(all = 8.px)
    }
}
val ImageMobileStyle by ComponentStyle {
    base {
        Modifier
            .transition(CSSTransition(property = TransitionProperty.All, duration = 300.ms))
    }
    active {
        Modifier
            .padding(all = 8.px)
    }
}