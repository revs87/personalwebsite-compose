package pt.rvcoding.personalwebsitecomposehtml.domain

import org.jetbrains.compose.web.css.CSSSizeValue
import org.jetbrains.compose.web.css.CSSUnit
import org.jetbrains.compose.web.css.px
import pt.rvcoding.personalwebsitecomposehtml.util.Res

data class ImageConfig(
    val croppedOnCollapsed: Boolean = true,
    val croppedOnExpanded: Boolean = true,
    val shadowed: Boolean = true,
    val sidePadding: CSSSizeValue<CSSUnit.px> = 0.px,
    val imageSrc: String = Res.Image.PROFILE_PHOTO
) {
    companion object {
        val Default by lazy { ImageConfig() }
    }
}