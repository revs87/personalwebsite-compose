package pt.rvcoding.personalwebsitecomposehtml.presentation.profile

import androidx.compose.runtime.*
import com.varabyte.kobweb.compose.ui.Modifier
import com.varabyte.kobweb.compose.ui.graphics.Colors
import com.varabyte.kobweb.compose.ui.modifiers.*
import com.varabyte.kobweb.compose.ui.thenIf
import com.varabyte.kobweb.silk.components.layout.SimpleGrid
import com.varabyte.kobweb.silk.components.layout.numColumns
import com.varabyte.kobweb.silk.components.style.breakpoint.Breakpoint
import com.varabyte.kobweb.silk.theme.breakpoint.rememberBreakpoint
import com.varabyte.kobweb.silk.theme.colors.ColorMode
import org.jetbrains.compose.web.css.percent
import org.jetbrains.compose.web.css.px
import pt.rvcoding.personalwebsitecomposehtml.util.Res

@Composable
fun ProfileCard(colorMode: ColorMode = ColorMode.LIGHT) {
    var expanded by remember { mutableStateOf(true) }
    val breakpoint = rememberBreakpoint()
    SimpleGrid(
        numColumns = numColumns(base = 1, md = 2),
        modifier = Modifier
            .fillMaxWidth(
                if (breakpoint <= Breakpoint.MD) 100.percent
                else Res.Dimens.MAX_CARD_WIDTH.px
            )
            .thenIf(
                condition = breakpoint > Breakpoint.MD,
                other = Modifier
                    .height(
                        if (expanded) Res.Dimens.MAX_CARD_HEIGHT.px
                        else Res.Dimens.MAX_CARD_HEIGHT_COLLAPSED.px
                    )
            )
            .boxShadow(
                color = Colors.Black.copy(alpha = 10),
                blurRadius = if (breakpoint <= Breakpoint.MD) 18.px else 24.px,
                spreadRadius = if (breakpoint <= Breakpoint.MD) 18.px else 24.px
            )
            .padding(all = 12.px)
            .borderRadius(r = Res.Dimens.BORDER_RADIUS.px)
            .margin(bottom = if (breakpoint <= Breakpoint.MD) 24.px else 32.px)
            .background(
                if (colorMode.isLight) Colors.White else
                    Res.Theme.DARK_BLUE.color
            )
            .onClick { expanded = !expanded }
    ) {
        LeftSide(colorMode = colorMode, breakpoint = breakpoint, expanded = expanded)
        RightSide(breakpoint = breakpoint, expanded = expanded)
    }
}