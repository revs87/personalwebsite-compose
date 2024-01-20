package pt.rvcoding.personalwebsitecompose.components

import androidx.compose.runtime.Composable
import com.varabyte.kobweb.compose.css.Cursor
import com.varabyte.kobweb.compose.foundation.layout.Box
import com.varabyte.kobweb.compose.ui.Modifier
import com.varabyte.kobweb.compose.ui.modifiers.*
import com.varabyte.kobweb.silk.components.graphics.Image
import com.varabyte.kobweb.silk.components.navigation.Link
import com.varabyte.kobweb.silk.theme.colors.ColorMode
import org.jetbrains.compose.web.css.CSSSizeValue
import org.jetbrains.compose.web.css.CSSUnit
import org.jetbrains.compose.web.css.LineStyle
import org.jetbrains.compose.web.css.px
import pt.rvcoding.personalwebsitecompose.util.Res
import pt.rvcoding.personalwebsitecompose.util.Res.Dimens.BORDER_RADIUS

@Composable
fun IconButton(
    modifier: Modifier = Modifier,
    colorMode: ColorMode,
    link: String = "",
    icon: String,
    iconSize: CSSSizeValue<CSSUnit.px> = Res.Dimens.ICON_SIZE.px,
    onClick: (() -> Unit)? = null
) {
    Link(path = link) {
        Box(
            modifier = modifier
                .padding(all = 8.px)
                .borderRadius(r = BORDER_RADIUS.px)
                .cursor(Cursor.Pointer)
                .border(
                    width = 1.px,
                    style = LineStyle.Solid,
                    color = if (colorMode.isLight) Res.Theme.SOCIAL_ICON_BACKGROUND_LIGHT.color
                    else Res.Theme.SOCIAL_ICON_BACKGROUND_DARK.color
                )
                .onClick { onClick?.invoke() }
        ){
            Image(
                modifier = Modifier.size(iconSize),
                src = icon
            )
        }
    }
}

enum class SocialIcon(
    val icon: String,
    val link: String
) {
    LinkedIn(
        icon = Res.Icon.LINKEDIN,
        link = "https://www.linkedin.com/in/revs87"
    ),
    LinkedInLight(
        icon = Res.Icon.LINKEDIN_LIGHT,
        link = "https://www.linkedin.com/in/revs87"
    ),
    Github(
        icon = Res.Icon.GITHUB,
        link = "https://github.com/revs87"
    ),
    GithubLight(
        icon = Res.Icon.GITHUB_LIGHT,
        link = "https://github.com/revs87"
    ),
    StackOverflow(
        icon = Res.Icon.STACKOVERFLOW,
        link = "https://stackoverflow.com/users/2996699/edgar-v"
    ),
    StackOverflowLight(
        icon = Res.Icon.STACKOVERFLOW_LIGHT,
        link = "https://stackoverflow.com/users/2996699/edgar-v"
    ),
    X(
        icon = Res.Icon.X,
        link = "https://x.com/revs87"
    ),
    XLight(
        icon = Res.Icon.X_LIGHT,
        link = "https://x.com/revs87"
    ),
    Instagram(
        icon = Res.Icon.INSTAGRAM,
        link = "https://www.instagram.com/revs87"
    ),
    InstagramLight(
        icon = Res.Icon.INSTAGRAM_LIGHT,
        link = "https://www.instagram.com/revs87"
    )
}