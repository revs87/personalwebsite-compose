package pt.rvcoding.personalwebsitecomposehtml.presentation.components

import androidx.compose.runtime.Composable
import com.varabyte.kobweb.compose.css.ObjectFit
import com.varabyte.kobweb.compose.css.UserSelect
import com.varabyte.kobweb.compose.css.userSelect
import com.varabyte.kobweb.compose.foundation.layout.Arrangement
import com.varabyte.kobweb.compose.foundation.layout.Box
import com.varabyte.kobweb.compose.foundation.layout.Column
import com.varabyte.kobweb.compose.foundation.layout.Row
import com.varabyte.kobweb.compose.ui.Alignment
import com.varabyte.kobweb.compose.ui.Modifier
import com.varabyte.kobweb.compose.ui.graphics.Colors
import com.varabyte.kobweb.compose.ui.modifiers.*
import com.varabyte.kobweb.compose.ui.styleModifier
import com.varabyte.kobweb.compose.ui.thenIf
import com.varabyte.kobweb.silk.components.graphics.Image
import com.varabyte.kobweb.silk.components.style.breakpoint.Breakpoint
import com.varabyte.kobweb.silk.components.style.toModifier
import org.jetbrains.compose.web.css.px
import pt.rvcoding.personalwebsitecomposehtml.domain.ImageConfig
import pt.rvcoding.personalwebsitecomposehtml.domain.ImageRowConfig
import pt.rvcoding.personalwebsitecomposehtml.styles.ImageStyle
import pt.rvcoding.personalwebsitecomposehtml.util.Res

@Composable
fun ImageSideWithRowOfImages(
    breakpoint: Breakpoint = Breakpoint.XL,
    expanded: Boolean = true,
    imageRowConfig: ImageRowConfig = ImageRowConfig.Default,
    imageConfig: ImageConfig = ImageConfig.Default
) {
    val cropped1 = if (expanded) imageRowConfig.croppedOnExpanded else imageRowConfig.croppedOnCollapsed
    val cropped2 = if (expanded) imageConfig.croppedOnExpanded else imageConfig.croppedOnCollapsed

    Box(
        modifier = Modifier
            .fillMaxWidth()
            .then(
                when {
                    breakpoint > Breakpoint.MD -> {
                        Modifier
                            .padding(bottom = 24.px)
                            .height(size = (
                                    if (expanded) Res.Dimens.MAX_CARD_HEIGHT
                                    else Res.Dimens.MAX_CARD_HEIGHT_COLLAPSED
                                    ).px
                            )
                    }
                    !expanded -> {
                        Modifier
                            .height(size = Res.Dimens.MAX_CARD_HEIGHT_COLLAPSED_MOBILE.px)
                    }
                    else -> Modifier
                }
            )
    ) {
        Column(
            modifier = Modifier.fillMaxSize(),
            horizontalAlignment = Alignment.CenterHorizontally,
            verticalArrangement = Arrangement.SpaceAround
        ) {
            Box(
                modifier = ImageStyle
                    .toModifier()
                    .fillMaxSize(),
                contentAlignment = Alignment.Center
            ) {
                Image(
                    modifier = Modifier
                        .then(
                            if (cropped2) { Modifier.fillMaxSize() }
                            else { Modifier.fillMaxWidth() }
                        )
                        .borderRadius(r = Res.Dimens.BORDER_RADIUS.px)
                        .objectFit(if (cropped2) ObjectFit.Cover else ObjectFit.Contain)
                        .thenIf(
                            condition = imageConfig.shadowed,
                            other = Modifier
                                .boxShadow(
                                    color = Colors.Black.copy(alpha = 70),
                                    blurRadius = Res.Dimens.BORDER_RADIUS.px,
                                    spreadRadius = 3.px,
                                    offsetX = 2.px,
                                    offsetY = 1.px
                                )
                        )
                        .styleModifier {
                            userSelect(UserSelect.None)
                        },
                    src = imageConfig.imageSrc
                )
            }

            Row(
                modifier = Modifier.fillMaxWidth().padding(topBottom = 12.px),
                horizontalArrangement = Arrangement.Center,
                verticalAlignment = Alignment.CenterVertically
            ) {
                imageRowConfig.imageSrc.forEach { imageSrc ->
                    Box(
                        modifier = ImageStyle
                            .toModifier()
                            .fillMaxSize(),
                        contentAlignment = Alignment.Center
                    ) {
                        Image(
                            modifier = Modifier
                                .then(
                                    if (cropped1) { Modifier.fillMaxSize() }
                                    else { Modifier.fillMaxWidth() }
                                )
                                .borderRadius(r = Res.Dimens.BORDER_RADIUS.px)
                                .objectFit(if (cropped1) ObjectFit.Cover else ObjectFit.Contain)
                                .thenIf(
                                    condition = imageRowConfig.shadowed,
                                    other = Modifier
                                        .boxShadow(
                                            color = Colors.Black.copy(alpha = 70),
                                            blurRadius = Res.Dimens.BORDER_RADIUS.px,
                                            spreadRadius = 3.px,
                                            offsetX = 2.px,
                                            offsetY = 1.px
                                        )
                                )
                                .styleModifier {
                                    userSelect(UserSelect.None)
                                }
                                .onClick {

                                },
                            src = imageSrc
                        )
                    }
                }
            }
        }
    }
}