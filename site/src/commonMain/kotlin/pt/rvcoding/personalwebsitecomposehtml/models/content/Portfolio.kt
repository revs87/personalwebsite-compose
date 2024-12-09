package pt.rvcoding.personalwebsitecomposehtml.models.content

import kotlinx.serialization.Serializable
import pt.rvcoding.personalwebsitecomposehtml.models.PersonalContent


@Serializable
data class Portfolio(
    val title: String,
    val subTitle: String,
    val subSubTitle: String,
    val description: List<PersonalContent>,
)
