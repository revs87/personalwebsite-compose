package pt.rvcoding.personalwebsitecomposehtml.presentation.history

import androidx.compose.runtime.*
import com.varabyte.kobweb.compose.foundation.layout.Column
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
import pt.rvcoding.personalwebsitecomposehtml.presentation.components.EmptySide
import pt.rvcoding.personalwebsitecomposehtml.presentation.components.ImageSide
import pt.rvcoding.personalwebsitecomposehtml.presentation.components.TextSide
import pt.rvcoding.personalwebsitecomposehtml.util.Res

@Composable
fun HistoryTheFloowCard(colorMode: ColorMode = ColorMode.LIGHT) {
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
                        if (expanded) (Res.Dimens.MAX_CARD_HEIGHT * 2).px
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
            title = ContentData.HistoryTheFloow.main.title,
            subTitle = ContentData.HistoryTheFloow.main.subTitle,
            subSubTitle = ContentData.HistoryTheFloow.main.period,
            description = ContentData.HistoryTheFloow.main.description,
            extra = {}
        )
        ImageSide(
            breakpoint = breakpoint,
            expanded = expanded,
            croppedOnCollapsed = true,
            croppedOnExpanded = false,
            shadowed = true,
            imageSrc = if (expanded) Res.Image.THEFLOOW_LOGO else Res.Image.THEFLOOW_PHOTO_1
        )
        if (expanded) {
            ImageSide(
                breakpoint = breakpoint,
                expanded = expanded,
                imageSrc = Res.Image.THEFLOOW_PHOTO_2
            )
            TextSide(
                colorMode = colorMode,
                breakpoint = breakpoint,
                contentAlignment = ContentAlignment.Left,
                expanded = expanded,
                title = ContentData.HistoryTheFloow.content1.title,
                subTitle = ContentData.HistoryTheFloow.content1.subTitle,
                subSubTitle = ContentData.HistoryTheFloow.content1.period,
                description = ContentData.HistoryTheFloow.content1.description,
                extra = {}
            )
        }
    }
}
