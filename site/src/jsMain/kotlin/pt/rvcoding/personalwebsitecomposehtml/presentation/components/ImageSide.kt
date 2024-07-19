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
import org.jetbrains.compose.web.css.px
import pt.rvcoding.personalwebsitecomposehtml.util.Res

@Composable
fun ImageSide(
    breakpoint: Breakpoint = Breakpoint.XL,
    expanded: Boolean = true,
    cropped: Boolean = true,
    shadowed: Boolean = true,
    imageSrc: String = Res.Image.PROFILE_PHOTO
) {
    Box(
        modifier = Modifier
            .fillMaxWidth()
            .thenIf(
                condition = breakpoint > Breakpoint.MD,
                other = Modifier
                    .padding(bottom = 24.px)
                    .height(size = (
                            if (expanded) Res.Dimens.MAX_CARD_HEIGHT
                            else Res.Dimens.MAX_CARD_HEIGHT_COLLAPSED
                         ).px
                    )
            )
    ) {
        Box(
            modifier = Modifier
                .fillMaxSize(),
            contentAlignment = Alignment.Center
        ) {
            Image(
                modifier = Modifier
                    .then(
                        if (cropped || !expanded) { Modifier.fillMaxSize() }
                        else { Modifier.fillMaxWidth() }
                    )
                    .borderRadius(r = Res.Dimens.BORDER_RADIUS.px)
                    .objectFit(if (cropped || !expanded) ObjectFit.Cover else ObjectFit.Contain)
                    .styleModifier {
                        userSelect(UserSelect.None)
                    }
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
                    ),
                src = imageSrc
            )
        }
    }
}