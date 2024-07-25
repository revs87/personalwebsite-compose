package pt.rvcoding.personalwebsitecomposehtml.domain

import pt.rvcoding.personalwebsitecomposehtml.util.Res

data class ImageRowConfig(
    val croppedOnCollapsed: Boolean = false,
    val croppedOnExpanded: Boolean = false,
    val shadowed: Boolean = true,
    val imageSrc: List<String> = listOf(Res.Image.PROFILE_PHOTO),
    val imageLink: List<String> = listOf("https://example.com")
) {
    companion object {
        val Default by lazy { ImageRowConfig() }
    }
}