package pt.rvcoding.personalwebsitecomposehtml.models

import kotlinx.serialization.SerialName
import kotlinx.serialization.Serializable

@Serializable
data class FigConfig(
    @SerialName("msg_hello_world")
    val msgHelloWorld: String,
    @SerialName("menu_history_work_enabled")
    val menuHistoryWorkEnabled: Boolean,
    @SerialName("menu_history_projects_enabled")
    val menuHistoryProjectsEnabled: Boolean,
    @SerialName("menu_about_me_enabled")
    val menuAboutMeEnabled: Boolean
)