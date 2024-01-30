package pt.rvcoding.personalwebsitecompose.models

import kotlinx.serialization.SerialName
import kotlinx.serialization.Serializable

@Serializable
sealed class ApiResponse {
    @Serializable
    @SerialName("success")
    data class Success(val data: PersonalData) : ApiResponse()
    @Serializable
    @SerialName("error")
    data class Error(val errorMessage: String) : ApiResponse()
}