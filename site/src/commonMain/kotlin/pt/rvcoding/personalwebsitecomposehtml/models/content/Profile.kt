package pt.rvcoding.personalwebsitecomposehtml.models.content

import kotlinx.serialization.Serializable
import pt.rvcoding.personalwebsitecomposehtml.models.PersonalContent


@Serializable
data class Profile(
    val name: String,
    val profession: String,
    val description: List<PersonalContent>,
    val email: String,
    val linkedin: String? = null,
    val github: String? = null,
    val stackoverflow: String? = null,
    val twitterX: String? = null,
    val instagram: String? = null
)
