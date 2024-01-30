package pt.rvcoding.personalwebsitecompose.models

import kotlinx.serialization.SerialName
import kotlinx.serialization.Serializable


@Serializable
data class Profile(
    val name: String,
    val profession: String,
    val description: List<PersonalContent>,
    val email: String,
)

@Serializable
data class PersonalContent(
    val type: ContentType,
    val content: String,
)

@Serializable
sealed class ContentType {
    @Serializable
    @SerialName("Text")
    data object Text : ContentType()

    @Serializable
    @SerialName("BulletText")
    data object BulletText : ContentType()
}