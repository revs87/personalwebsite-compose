package pt.rvcoding.personalwebsitecomposehtml.models

import kotlinx.serialization.SerialName
import kotlinx.serialization.Serializable


@Serializable
data class PersonalContent(
    val contentType: ContentType,
    val content: String = "",
)

@Serializable
sealed class ContentType {
    @Serializable
    @SerialName("Text")
    data object Text : ContentType()

    @Serializable
    @SerialName("BulletText")
    data object BulletText : ContentType()

    @Serializable
    @SerialName("Paragraph")
    data object Paragraph : ContentType()
}

internal const val BULLET = "\u2022"
