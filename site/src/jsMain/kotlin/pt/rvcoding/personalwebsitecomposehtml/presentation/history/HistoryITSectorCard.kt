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
import pt.rvcoding.personalwebsitecomposehtml.domain.ImageConfig
import pt.rvcoding.personalwebsitecomposehtml.domain.ImageRowConfig
import pt.rvcoding.personalwebsitecomposehtml.models.content.ContentData
import pt.rvcoding.personalwebsitecomposehtml.presentation.components.*
import pt.rvcoding.personalwebsitecomposehtml.util.Res

@Composable
fun HistoryITSectorCard(colorMode: ColorMode = ColorMode.LIGHT) {
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
        ImageSide(
            breakpoint = breakpoint,
            expanded = expanded,
            croppedOnCollapsed = false,
            croppedOnExpanded = false,
            shadowed = if (expanded) false else true,
            imageSrc = if (expanded) Res.Image.ITSECTOR_LOGO else Res.Image.ITSECTOR_PHOTO_1
        )
        TextSide(
            colorMode = colorMode,
            breakpoint = breakpoint,
            contentAlignment = ContentAlignment.Left,
            expanded = expanded,
            title = ContentData.HistoryITSector.main.title,
            subTitle = ContentData.HistoryITSector.main.subTitle,
            subSubTitle = ContentData.HistoryITSector.main.period,
            description = ContentData.HistoryITSector.main.description,
            extra = {}
        )
        if (expanded) {
            TextSide(
                colorMode = colorMode,
                breakpoint = breakpoint,
                contentAlignment = ContentAlignment.Left,
                expanded = expanded,
                title = ContentData.HistoryITSector.content1.title,
                subTitle = ContentData.HistoryITSector.content1.subTitle,
                subSubTitle = ContentData.HistoryITSector.content1.period,
                description = ContentData.HistoryITSector.content1.description,
                extra = {}
            )
            ImageSideWithRowOfImages(
                breakpoint = breakpoint,
                expanded = expanded,
                imageRowConfig = ImageRowConfig(
                    imageSrc = listOf(
                        Res.Image.ITSECTOR_LOGO_1,
                        Res.Image.ITSECTOR_LOGO_2,
                        Res.Image.ITSECTOR_LOGO_3,
                        Res.Image.ITSECTOR_LOGO_4,
                        Res.Image.ITSECTOR_LOGO_5,
                        Res.Image.ITSECTOR_LOGO_6,
                        Res.Image.ITSECTOR_LOGO_7,
                        Res.Image.ITSECTOR_LOGO_8,
                        Res.Image.ITSECTOR_LOGO_9,
                    ),
                    imageLink = listOf(
                        Res.Image.ITSECTOR_LOGO_1_LINK,
                        Res.Image.ITSECTOR_LOGO_2_LINK,
                        Res.Image.ITSECTOR_LOGO_3_LINK,
                        Res.Image.ITSECTOR_LOGO_4_LINK,
                        Res.Image.ITSECTOR_LOGO_5_LINK,
                        Res.Image.ITSECTOR_LOGO_6_LINK,
                        Res.Image.ITSECTOR_LOGO_7_LINK,
                        Res.Image.ITSECTOR_LOGO_8_LINK,
                        Res.Image.ITSECTOR_LOGO_9_LINK,
                    )
                ),
                imageConfig = ImageConfig(imageSrc = Res.Image.ITSECTOR_PHOTO_1),
            )
        }
    }
}
