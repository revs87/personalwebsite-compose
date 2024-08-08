package pt.rvcoding.personalwebsitecomposehtml.presentation.history

import androidx.compose.animation.core.animateDpAsState
import androidx.compose.runtime.*
import androidx.compose.ui.unit.dp
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
import pt.rvcoding.personalwebsitecomposehtml.presentation.components.ContentAlignment
import pt.rvcoding.personalwebsitecomposehtml.presentation.components.ImageSide
import pt.rvcoding.personalwebsitecomposehtml.presentation.components.ImageSideWithRowOfImages
import pt.rvcoding.personalwebsitecomposehtml.presentation.components.TextSide
import pt.rvcoding.personalwebsitecomposehtml.util.Res
import pt.rvcoding.personalwebsitecomposehtml.util.Res.Image.SENSORMATIC_APP1
import pt.rvcoding.personalwebsitecomposehtml.util.Res.Image.SENSORMATIC_APP2
import pt.rvcoding.personalwebsitecomposehtml.util.Res.Image.SENSORMATIC_MATCHING_LOGO_LINK_LIST
import pt.rvcoding.personalwebsitecomposehtml.util.Res.Image.SENSORMATIC_MATCHING_LOGO_LIST
import pt.rvcoding.personalwebsitecomposehtml.util.Res.Image.SENSORMATIC_PSINTAND_LOGO_LINK_LIST
import pt.rvcoding.personalwebsitecomposehtml.util.Res.Image.SENSORMATIC_PSINTAND_LOGO_LIST

@Composable
fun HistorySensormaticCard(
    colorMode: ColorMode = ColorMode.LIGHT,
    gridLinesExpandedHeightList: List<Int> = listOf(
        Res.Dimens.MAX_CARD_HEIGHT,
        Res.Dimens.MAX_CARD_HEIGHT,
        Res.Dimens.MAX_CARD_HEIGHT_EXTENDED,
        Res.Dimens.MAX_CARD_HEIGHT_EXTENDED,
    )
) {
    val breakpoint = rememberBreakpoint()
    var expanded by remember { mutableStateOf(false) }
    val cardHeight by animateDpAsState(
        targetValue =
            if (expanded) (gridLinesExpandedHeightList.sum()).dp
            else Res.Dimens.MAX_CARD_HEIGHT_COLLAPSED.dp
    )

    SimpleGrid(
        numColumns = numColumns(base = 1, md = 2),
        modifier = Modifier
            .fillMaxWidth(
                if (breakpoint <= Breakpoint.MD) 100.percent
                else Res.Dimens.MAX_CARD_WIDTH.px
            )
            .thenIf(
                condition = breakpoint > Breakpoint.MD,
                other = Modifier.height(cardHeight.value.px)
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
            croppedOnCollapsed = true,
            croppedOnExpanded = false,
            shadowed = if (expanded) false else true,
            imageSrc = if (expanded) Res.Image.SENSORMATIC_LOGO else Res.Image.SENSORMATIC_PHOTO_2
        )
        TextSide(
            colorMode = colorMode,
            breakpoint = breakpoint,
            contentAlignment = ContentAlignment.Left,
            expanded = expanded,
            title = ContentData.HistorySensormatic.main.title,
            subTitle = ContentData.HistorySensormatic.main.subTitle,
            subSubTitle = ContentData.HistorySensormatic.main.period,
            description = ContentData.HistorySensormatic.main.description,
            extra = {}
        )
        if (expanded) {
            ImageSide(
                breakpoint = breakpoint,
                expanded = expanded,
                imageSrc = Res.Image.SENSORMATIC_PHOTO_1
            )
            TextSide(
                colorMode = colorMode,
                breakpoint = breakpoint,
                contentAlignment = ContentAlignment.Left,
                expanded = expanded,
                title = ContentData.HistorySensormatic.content1.title,
                subTitle = ContentData.HistorySensormatic.content1.subTitle,
                subSubTitle = ContentData.HistorySensormatic.content1.period,
                description = ContentData.HistorySensormatic.content1.description,
                extra = {}
            )

            TextSide(
                colorMode = colorMode,
                breakpoint = breakpoint,
                contentAlignment = ContentAlignment.Left,
                expanded = expanded,
                title = ContentData.HistorySensormatic.content2.title,
                subTitle = ContentData.HistorySensormatic.content2.subTitle,
                subSubTitle = ContentData.HistorySensormatic.content2.period,
                description = ContentData.HistorySensormatic.content2.description,
                extra = {}
            )
            ImageSideWithRowOfImages(
                breakpoint = breakpoint,
                expanded = expanded,
                extendedHeight = true,
                imageConfig = ImageConfig(
                    imageSrc = SENSORMATIC_APP1,
                    croppedOnExpanded = false
                ),
                imageRowConfig = ImageRowConfig(
                    imageSrc = SENSORMATIC_PSINTAND_LOGO_LIST,
                    imageLink = SENSORMATIC_PSINTAND_LOGO_LINK_LIST
                )
            )

            TextSide(
                colorMode = colorMode,
                breakpoint = breakpoint,
                contentAlignment = ContentAlignment.Left,
                expanded = expanded,
                title = ContentData.HistorySensormatic.content3.title,
                subTitle = ContentData.HistorySensormatic.content3.subTitle,
                subSubTitle = ContentData.HistorySensormatic.content3.period,
                description = ContentData.HistorySensormatic.content3.description,
                extra = {}
            )
            ImageSideWithRowOfImages(
                breakpoint = breakpoint,
                expanded = expanded,
                extendedHeight = true,
                imageConfig = ImageConfig(
                    imageSrc = SENSORMATIC_APP2,
                    croppedOnExpanded = false
                ),
                imageRowConfig = ImageRowConfig(
                    imageSrc = SENSORMATIC_MATCHING_LOGO_LIST,
                    imageLink = SENSORMATIC_MATCHING_LOGO_LINK_LIST
                )
            )
        }
    }
}
