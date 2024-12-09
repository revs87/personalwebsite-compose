package pt.rvcoding.personalwebsitecomposehtml.models.content

import kotlinx.serialization.Serializable
import pt.rvcoding.personalwebsitecomposehtml.models.PersonalContent


@Serializable
data class AboutMe(
    val title: String,
    val description: List<PersonalContent>,
    val description2: List<PersonalContent>,
)
