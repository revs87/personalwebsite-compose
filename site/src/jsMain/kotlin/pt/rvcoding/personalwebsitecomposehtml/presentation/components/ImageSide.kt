package pt.rvcoding.personalwebsitecomposehtml.presentation.components

import androidx.compose.runtime.Composable
import com.varabyte.kobweb.compose.css.ObjectFit
import com.varabyte.kobweb.compose.css.UserSelect
import com.varabyte.kobweb.compose.css.userSelect
import com.varabyte.kobweb.compose.foundation.layout.Box
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
import pt.rvcoding.personalwebsitecomposehtml.styles.ImageStyle
import pt.rvcoding.personalwebsitecomposehtml.util.Res

@Composable
fun ImageSide(
    breakpoint: Breakpoint = Breakpoint.XL,
    expanded: Boolean = true,
    croppedOnCollapsed: Boolean = true,
    croppedOnExpanded: Boolean = true,
    shadowed: Boolean = true,
    imageSrc: String = Res.Image.PROFILE_PHOTO
) {
    val cropped = if (expanded) croppedOnExpanded else croppedOnCollapsed

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
        Box(
            modifier = ImageStyle
                .toModifier()
                .fillMaxSize(),
            contentAlignment = Alignment.Center
        ) {
            Image(
                modifier = Modifier
                    .then(
                        if (cropped) { Modifier.fillMaxSize() }
                        else { Modifier.fillMaxWidth() }
                    )
                    .borderRadius(r = Res.Dimens.BORDER_RADIUS.px)
                    .objectFit(if (cropped) ObjectFit.Cover else ObjectFit.Contain)
                    .thenIf(
                        condition = shadowed,
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
                src = imageSrc
            )
        }
    }
}