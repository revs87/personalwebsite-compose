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

        const val ABOUTME_PHOTO = "aboutme.png"

        const val PORTFOLIO_APP_CVNOTES_VIDEO = "cvnotes.webm"
        const val PORTFOLIO_APP_CVNOTES_LOGO = "ic_cvnotes.png"
        val PORTFOLIO_APP_CVNOTES_LOGO_LIST by lazy { listOf(
            PORTFOLIO_APP_CVNOTES_LOGO,
        ) }
        const val PORTFOLIO_APP_CVNOTES_LINK = "https://play.google.com/store/apps/details?id=pt.rvcoding.cvnotes"
        val PORTFOLIO_APP_CVNOTES_LINK_LIST by lazy { listOf(
            PORTFOLIO_APP_CVNOTES_LINK,
        ) }
        const val PORTFOLIO_APP_CVNOTES_LINK_GH = "https://github.com/revs87/cvnotes-and"

        const val SENSORMATIC_LOGO = "logo_sensormatic.svg"
        const val SENSORMATIC_PHOTO_1 = "img_sensormatic1.jpeg"
        const val SENSORMATIC_PHOTO_2 = "img_sensormatic2.jpeg"
        const val SENSORMATIC_PHOTO_3 = "img_sensormatic3.png"
        const val SENSORMATIC_APP1 = "PSINTAND.gif"
        const val SENSORMATIC_APP2 = "MATCHING.gif"
        const val SENSORMATIC_APP1_LOGO = "PSINTAND_logo.png"
        const val SENSORMATIC_APP2_LOGO = "MATCHING_logo.png"
        const val SENSORMATIC_APP1_LINK = ""
        const val SENSORMATIC_APP2_LINK = ""
        val SENSORMATIC_PSINTAND_LOGO_LIST by lazy { listOf(
            SENSORMATIC_APP1_LOGO,
        ) }
        val SENSORMATIC_PSINTAND_LOGO_LINK_LIST by lazy { listOf(
            SENSORMATIC_APP1_LINK,
        ) }
        val SENSORMATIC_MATCHING_LOGO_LIST by lazy { listOf(
            SENSORMATIC_APP2_LOGO,
        ) }
        val SENSORMATIC_MATCHING_LOGO_LINK_LIST by lazy { listOf(
            SENSORMATIC_APP2_LINK,
        ) }

        const val THEFLOOW_LOGO = "logo_thefloow.jpg"
        const val THEFLOOW_PHOTO_1 = "img_thefloow1.jpg"
        const val THEFLOOW_PHOTO_2 = "img_thefloow2.jpg"
        const val THEFLOOW_PHOTO_3 = "img_thefloow3.jpg"
        const val THEFLOOW_LOGO_1 = "logo_br_liberty.png"
        const val THEFLOOW_LOGO_1_LINK = "https://play.google.com/store/apps/details?id=br.com.libertyseguros.mobile.DirecaoEmConta_Mobi"
        const val THEFLOOW_LOGO_2 = "logo_ie_aig_smartlane.png"
        const val THEFLOOW_LOGO_2_LINK = "https://appadvice.com/app/aig-smartlane/1282031966"
        const val THEFLOOW_LOGO_3 = "logo_pt_fidelidadedrive.png"
        const val THEFLOOW_LOGO_3_LINK = "https://play.google.com/store/apps/details?id=pt.fidelidade.drive"
        const val THEFLOOW_LOGO_4 = "logo_uk_driveplus.png"
        const val THEFLOOW_LOGO_4_LINK = "https://play.google.com/store/apps/details?id=com.directline.driveplusv2"
        const val THEFLOOW_LOGO_5 = "logo_uk_drivesure.png"
        const val THEFLOOW_LOGO_5_LINK = "https://www.churchill.com/car-insurance/drivesure-telematics"
        const val THEFLOOW_LOGO_6 = "logo_uk_greenflag.png"
        const val THEFLOOW_LOGO_6_LINK = "https://play.google.com/store/apps/details?id=com.directline.greenflag"
        const val THEFLOOW_LOGO_7 = "logo_uk_shotgun.png"
        const val THEFLOOW_LOGO_7_LINK = "https://www.directline.com/shotgun"
        const val THEFLOOW_LOGO_8 = "logo_us_csaa.png"
        const val THEFLOOW_LOGO_8_LINK = "https://play.google.com/store/apps/details?id=com.thefloow.telematics.smarttrek"
        const val THEFLOOW_LOGO_9 = "logo_us_yubi.png"
        const val THEFLOOW_LOGO_9_LINK = "https://play.google.com/store/apps/details?id=com.thefloow.production.plymouthrockprac.yubi20.app"
        val THEFLOOW_LOGO_LIST by lazy { listOf(
            THEFLOOW_LOGO_2,
            THEFLOOW_LOGO_3,
            THEFLOOW_LOGO_1,
            THEFLOOW_LOGO_4,
            THEFLOOW_LOGO_5,
            THEFLOOW_LOGO_6,
            THEFLOOW_LOGO_7,
            THEFLOOW_LOGO_8,
            THEFLOOW_LOGO_9,
        ) }
        val THEFLOOW_LOGO_LINK_LIST by lazy { listOf(
            THEFLOOW_LOGO_2_LINK,
            THEFLOOW_LOGO_3_LINK,
            THEFLOOW_LOGO_1_LINK,
            THEFLOOW_LOGO_4_LINK,
            THEFLOOW_LOGO_5_LINK,
            THEFLOOW_LOGO_6_LINK,
            THEFLOOW_LOGO_7_LINK,
            THEFLOOW_LOGO_8_LINK,
            THEFLOOW_LOGO_9_LINK,
        ) }

        const val ITSECTOR_LOGO = "logo_itsector.jpg"
        const val ITSECTOR_PHOTO_1 = "img_itsector1.jpg"
        const val ITSECTOR_LOGO_1 = "logo_ao_atlantico.png"
        const val ITSECTOR_LOGO_1_LINK = "https://play.google.com/store/apps/details?id=com.exictos.mbanka.atlantico"
        const val ITSECTOR_LOGO_2 = "logo_ao_standard_bank.png"
        const val ITSECTOR_LOGO_2_LINK = "http://www.standardbank.co.mz/"
        const val ITSECTOR_LOGO_3 = "logo_mz_millennium_bim.png"
        const val ITSECTOR_LOGO_3_LINK = "https://play.google.com/store/apps/details?id=com.ebankit.android.millenniumbim"
        const val ITSECTOR_LOGO_4 = "logo_mz_moza.png"
        const val ITSECTOR_LOGO_4_LINK = "https://play.google.com/store/apps/details?id=com.ebankit.android.moza"
        const val ITSECTOR_LOGO_5 = "logo_mz_unico.png"
        const val ITSECTOR_LOGO_5_LINK = "https://play.google.com/store/apps/details?id=com.ebankit.android.bunico"
        const val ITSECTOR_LOGO_6 = "logo_pl_millennium.png"
        const val ITSECTOR_LOGO_6_LINK = "https://play.google.com/store/apps/details?id=wit.android.bcpBankingApp.millenniumPL"
        const val ITSECTOR_LOGO_7 = "logo_pl_millennium_corp.png"
        const val ITSECTOR_LOGO_7_LINK = "https://play.google.com/store/apps/details?id=pl.millennium.corpApp"
        const val ITSECTOR_LOGO_8 = "logo_pt_big.png"
        const val ITSECTOR_LOGO_8_LINK = "https://www.big.pt/"
        const val ITSECTOR_LOGO_9 = "logo_pt_millennium.png"
        const val ITSECTOR_LOGO_9_LINK = "https://play.google.com/store/apps/details?id=com.ebankit.android.pt2020"
        val ITSECTOR_LOGO_LIST by lazy { listOf(
            ITSECTOR_LOGO_1,
            ITSECTOR_LOGO_2,
            ITSECTOR_LOGO_3,
            ITSECTOR_LOGO_4,
            ITSECTOR_LOGO_5,
            ITSECTOR_LOGO_6,
            ITSECTOR_LOGO_7,
            ITSECTOR_LOGO_8,
            ITSECTOR_LOGO_9,
        ) }
        val ITSECTOR_LOGO_LINK_LIST by lazy { listOf(
            ITSECTOR_LOGO_1_LINK,
            ITSECTOR_LOGO_2_LINK,
            ITSECTOR_LOGO_3_LINK,
            ITSECTOR_LOGO_4_LINK,
            ITSECTOR_LOGO_5_LINK,
            ITSECTOR_LOGO_6_LINK,
            ITSECTOR_LOGO_7_LINK,
            ITSECTOR_LOGO_8_LINK,
            ITSECTOR_LOGO_9_LINK,
        ) }

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
        const val MAX_CARD_HEIGHT_EXTENDED = MAX_CARD_HEIGHT + (MAX_CARD_HEIGHT * 0.4).toInt()
        const val MAX_CARD_HEIGHT_COLLAPSED = 420
        const val MAX_CARD_HEIGHT_COLLAPSED_MOBILE = 280
        const val ICON_SIZE = 24
        const val ICON_SIZE_LG = 32
        const val LOGO_APP_SIZE = 72
    }
}