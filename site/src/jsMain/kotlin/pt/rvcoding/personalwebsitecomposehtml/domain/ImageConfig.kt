package pt.rvcoding.personalwebsitecomposehtml.domain

import pt.rvcoding.personalwebsitecomposehtml.util.Res

data class ImageConfig(
    val croppedOnCollapsed: Boolean = true,
    val croppedOnExpanded: Boolean = true,
    val shadowed: Boolean = true,
    val imageSrc: String = Res.Image.PROFILE_PHOTO
) {
    companion object {
        val Default by lazy { ImageConfig() }
    }
}