package pt.rvcoding.personalwebsitecomposehtml.presentation.components

import androidx.compose.runtime.Composable
import com.varabyte.kobweb.compose.css.FontWeight
import com.varabyte.kobweb.compose.css.TextAlign
import com.varabyte.kobweb.compose.css.UserSelect
import com.varabyte.kobweb.compose.css.userSelect
import com.varabyte.kobweb.compose.foundation.layout.Arrangement
import com.varabyte.kobweb.compose.foundation.layout.Box
import com.varabyte.kobweb.compose.foundation.layout.Column
import com.varabyte.kobweb.compose.foundation.layout.ColumnScope
import com.varabyte.kobweb.compose.ui.Alignment
import com.varabyte.kobweb.compose.ui.Modifier
import com.varabyte.kobweb.compose.ui.graphics.Colors
import com.varabyte.kobweb.compose.ui.modifiers.*
import com.varabyte.kobweb.compose.ui.styleModifier
import com.varabyte.kobweb.compose.ui.thenIf
import com.varabyte.kobweb.silk.components.style.breakpoint.Breakpoint
import com.varabyte.kobweb.silk.components.style.toModifier
import com.varabyte.kobweb.silk.components.text.SpanText
import com.varabyte.kobweb.silk.theme.colors.ColorMode
import org.jetbrains.compose.web.css.px
import pt.rvcoding.personalwebsitecomposehtml.components.composables.PxSpacer
import pt.rvcoding.personalwebsitecomposehtml.components.SpanTextLink
import pt.rvcoding.personalwebsitecomposehtml.models.ContentType
import pt.rvcoding.personalwebsitecomposehtml.models.PersonalContent
import pt.rvcoding.personalwebsitecomposehtml.styles.MyTextStyle
import pt.rvcoding.personalwebsitecomposehtml.util.Res

@Composable
fun TextSide(
    colorMode: ColorMode,
    breakpoint: Breakpoint,
    expanded: Boolean,
    title: String,
    subTitle: String,
    subSubTitle: String = "",
    description: List<PersonalContent>,
    extra: @Composable (ColumnScope) -> Unit
) {
    Column(
        modifier = Modifier
            .fillMaxSize()
            .thenIf(
                condition = !expanded,
                other = Modifier
                    .height(
                        size = (Res.Dimens.MAX_CARD_HEIGHT_COLLAPSED - 24).px
                    )
            )
            .styleModifier { property("overflow", "hidden") }
            .padding(
                top = 50.px,
                bottom = 50.px,
                leftRight = when {
                    breakpoint <= Breakpoint.SM -> 25.px
                    else -> 50.px
                }
            ),
        verticalArrangement = Arrangement.Center,
        horizontalAlignment = if (breakpoint <= Breakpoint.SM)
            Alignment.CenterHorizontally else Alignment.Start
    ) {
        SpanText(
            text = title,
            modifier = Modifier
                .margin(bottom = 12.px)
                .fontFamily(Res.String.ROBOTO_CONDENSED)
                .color(if (colorMode.isLight) Colors.Black else Colors.White)
                .fontSize(50.px)
                .fontWeight(FontWeight.Bold)
                .textAlign(
                    if (breakpoint <= Breakpoint.SM) TextAlign.Center
                    else TextAlign.Start
                )
                .styleModifier {
                    userSelect(UserSelect.None)
                }
        )
        SpanText(
            text = subTitle,
            modifier = Modifier
                .margin(bottom = 24.px)
                .fontFamily(Res.String.ROBOTO_REGULAR)
                .color(if (colorMode.isLight) Colors.Black else Colors.White)
                .fontSize(18.px)
                .textAlign(
                    if (breakpoint <= Breakpoint.SM) TextAlign.Center
                    else TextAlign.Start
                )
                .styleModifier {
                    userSelect(UserSelect.None)
                }
        )
        if (subSubTitle.isNotBlank()) {
            SpanText(
                text = subSubTitle,
                modifier = MyTextStyle.toModifier()
            )
            PxSpacer(20)
        }

        if (!expanded) return@Column

        Box(
            modifier = Modifier
                .height(4.px)
                .width(40.px)
                .margin(bottom = 24.px)
                .background(
                    if (colorMode.isLight) Res.Theme.BLUE.color
                    else Res.Theme.LIGHT_BLUE.color
                )
                .align(
                    if (breakpoint <= Breakpoint.SM) Alignment.CenterHorizontally
                    else Alignment.Start
                )
        ) {}
        description.forEachIndexed { index, content ->
            if (content.contentType == ContentType.Paragraph) { PxSpacer(16) }
            SpanTextLink(
                modifier = MyTextStyle
                    .toModifier()
                    .margin(
                        left = if (content.contentType == ContentType.BulletText) 25.px else 0.px,
                        bottom = if (index == description.size - 1) 36.px else 0.px
                    ),
                text = content.content,
                breakpoint = breakpoint
            )
        }

        extra.invoke(this)
    }
}