package pt.rvcoding.personalwebsitecomposehtml.presentation.history

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
import pt.rvcoding.personalwebsitecomposehtml.models.content.ContentData
import pt.rvcoding.personalwebsitecomposehtml.presentation.components.ContentAlignment
import pt.rvcoding.personalwebsitecomposehtml.presentation.components.ImageSide
import pt.rvcoding.personalwebsitecomposehtml.presentation.components.TextSide
import pt.rvcoding.personalwebsitecomposehtml.util.Res

@Composable
fun HistoryINESCCard(colorMode: ColorMode = ColorMode.LIGHT, gridLines: Int = 2) {
    var expanded by remember { mutableStateOf(false) }
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
                        if (expanded) (Res.Dimens.MAX_CARD_HEIGHT * gridLines).px
                        else Res.Dimens.MAX_CARD_HEIGHT_COLLAPSED.px
                    )
            )
            .boxShadow(
                color = Colors.Black.copy(alpha = 10),
                blurRadius = if (breakpoint <= Breakpoint.MD) 18.px else 24.px,
                spreadRadius = if (breakpoint <= Breakpoint.MD) 12.px else 18.px
            )
            .padding(all = 12.px)
            .borderRadius(r = Res.Dimens.BORDER_RADIUS.px)
            .margin(
                top = if (breakpoint <= Breakpoint.MD) 12.px else 24.px,
                bottom = if (breakpoint <= Breakpoint.MD) 12.px else 24.px,
            )
            .background(
                if (colorMode.isLight) Colors.White else Res.Theme.DARK_BLUE.color
            )
            .onClick { expanded = !expanded }
    ) {
        TextSide(
            colorMode = colorMode,
            breakpoint = breakpoint,
            contentAlignment = ContentAlignment.Right,
            expanded = expanded,
            title = ContentData.HistoryINESC.main.title,
            subTitle = ContentData.HistoryINESC.main.subTitle,
            subSubTitle = ContentData.HistoryINESC.main.period,
            description = ContentData.HistoryINESC.main.description,
            extra = {}
        )
        ImageSide(
            breakpoint = breakpoint,
            expanded = expanded,
            croppedOnCollapsed = false,
            croppedOnExpanded = false,
            shadowed = false,
            imageSrc = if (colorMode == ColorMode.LIGHT) Res.Image.INESC_LOGO else Res.Image.INESC_LOGO_LIGHT
        )
        if (expanded) {
            TextSide(
                colorMode = colorMode,
                breakpoint = breakpoint,
                contentAlignment = ContentAlignment.Right,
                expanded = expanded,
                title = ContentData.HistoryINESC.content1.title,
                subTitle = ContentData.HistoryINESC.content1.subTitle,
                subSubTitle = ContentData.HistoryINESC.content1.period,
                description = ContentData.HistoryINESC.content1.description,
                extra = {}
            )
            TextSide(
                colorMode = colorMode,
                breakpoint = breakpoint,
                contentAlignment = ContentAlignment.Left,
                expanded = expanded,
                title = ContentData.HistoryINESC.content2.title,
                subTitle = ContentData.HistoryINESC.content2.subTitle,
                subSubTitle = ContentData.HistoryINESC.content2.period,
                description = ContentData.HistoryINESC.content2.description,
                extra = {}
            )
        }
    }
}
