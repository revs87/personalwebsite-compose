package pt.rvcoding.personalwebsitecomposehtml.util

import com.varabyte.kobweb.compose.ui.graphics.Color

object Res {
    enum class Theme(val color: Color) {
        BLACK(color = Color.rgb(r = 0, g = 0, b = 0)),
        WHITE(color = Color.rgb(r = 255, g = 255, b = 255)),
        BLUE(color = Color.rgb(r = 33, g = 150, b = 243)), //#2196F3
        LIGHT_BLUE(color = Color.rgb(r = 168, g = 236, b = 255)), //#A8ECFF
        DARK_BLUE(color = Color.rgb(r = 34, g = 63, b = 94)),
        SOCIAL_ICON_BACKGROUND_LIGHT(color = Color.rgb(r = 230, g = 230, b = 230)),
        SOCIAL_ICON_BACKGROUND_DARK(color = Color.rgb(r = 48, g = 82, b = 118)),
        GRADIENT_ONE(color = Color.rgb(r = 161, g = 196, b = 253)),
        GRADIENT_ONE_DARK(color = Color.rgb(r = 19, g = 38, b = 58)),
        GRADIENT_TWO(color = Color.rgb(r = 194, g = 233, b = 251)),
        GRADIENT_TWO_DARK(color = Color.rgb(r = 20, g = 46, b = 73))
    }

    object Icon {
        const val EMAIL_LIGHT = "mail.svg"
        const val EMAIL_DARK = "mail_light.svg"
        const val LINKEDIN = "linkedin.svg"
        const val LINKEDIN_LIGHT = "linkedin_light.svg"
        const val GITHUB = "github.svg"
        const val GITHUB_LIGHT = "github_light.svg"
        const val STACKOVERFLOW = "stack_overflow.svg"
        const val STACKOVERFLOW_LIGHT = "stack_overflow_light.svg"
        const val INSTAGRAM = "instagram.svg"
        const val INSTAGRAM_LIGHT = "instagram_light.svg"
        const val X = "twitter_x.svg"
        const val X_LIGHT = "twitter_x_light.svg"
        const val SUN = "sun.svg"
        const val MOON = "moon.svg"
        const val GOTOTOP = "gototop.svg"
        const val GOTOTOP_LIGHT = "gototop_light.svg"
        const val MENU = "menu.svg"
        const val MENU_LIGHT = "menu_light.svg"
        const val HOME = "home.svg"
        const val HOME_LIGHT = "home_light.svg"
        const val PORTFOLIO = "portfolio.svg"
        const val PORTFOLIO_LIGHT = "portfolio_light.svg"
        const val HISTORY = "history.svg"
        const val HISTORY_LIGHT = "history_light.svg"
        const val ABOUTME = "aboutme.svg"
        const val ABOUTME_LIGHT = "aboutme_light.svg"
    }

    object Image {
        const val PROFILE_PHOTO = "img_profile.jpg"
        const val SENSORMATIC_LOGO = "logo_sensormatic.svg"
        const val SENSORMATIC_PHOTO_1 = "img_sensormatic1.jpeg"
        const val SENSORMATIC_PHOTO_2 = "img_sensormatic2.jpeg"
        const val THEFLOOW_LOGO = "logo_thefloow.jpg"
        const val THEFLOOW_PHOTO_1 = "img_thefloow1.jpg"
        const val THEFLOOW_PHOTO_2 = "img_thefloow2.jpg"
        const val ITSECTOR_LOGO = "logo_itsector.jpg"
        const val ITSECTOR_PHOTO_1 = "img_itsector1.jpg"
        const val INESC_LOGO = "logo_inesc.png"
        const val INESC_LOGO_LIGHT = "logo_inesc_light.svg"
        const val FCUP_LOGO = "logo_fcup.jpeg"
        const val FCUP_LOGO_LIGHT = "logo_fcup_light.png"
        const val FCUP_PHOTO_1 = "img_fcup1.jpg"
    }

    object String {
        const val BUTTON_TEXT = "Get in touch"
        const val ROBOTO_CONDENSED = "RobotoCondensedBold"
        const val ROBOTO_REGULAR = "RobotoRegular"
        const val SAVED_THEME = "theme"
    }

    object Dimens {
        const val BORDER_RADIUS = 8
        const val MAX_CARD_WIDTH = 1200
        const val MAX_CARD_HEIGHT = 920
        const val MAX_CARD_HEIGHT_COLLAPSED = 420
        const val MAX_CARD_HEIGHT_COLLAPSED_MOBILE = 280
        const val ICON_SIZE = 24
        const val ICON_SIZE_LG = 32
    }
}