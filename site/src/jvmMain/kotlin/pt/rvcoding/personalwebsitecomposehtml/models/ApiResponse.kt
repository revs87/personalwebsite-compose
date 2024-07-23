package pt.rvcoding.personalwebsitecomposehtml.models

import kotlinx.serialization.SerialName
import kotlinx.serialization.Serializable
import pt.rvcoding.personalwebsitecomposehtml.models.content.Profile

@Serializable
sealed class ApiResponse {
    @Serializable
    @SerialName("config")
    data class ConfigSuccess(val data: FigConfig) : ApiResponse()

    @Serializable
    @SerialName("success")
    data class ProfileSuccess(val data: Profile) : ApiResponse()

    @Serializable
    @SerialName("error")
    data class Error(val errorMessage: String) : ApiResponse()
}