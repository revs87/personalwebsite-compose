package pt.rvcoding.personalwebsitecompose.api

import com.varabyte.kobweb.api.Api
import com.varabyte.kobweb.api.ApiContext
import com.varabyte.kobweb.api.http.setBodyText
import kotlinx.serialization.encodeToString
import kotlinx.serialization.json.Json
import pt.rvcoding.personalwebsitecompose.models.ApiResponse
import pt.rvcoding.personalwebsitecompose.models.ProfileData


@Api(routeOverride = "profile")
suspend fun profile(context: ApiContext) {
    try {
        context.res.setBodyText(
            Json.encodeToString<ApiResponse>(
                ApiResponse.Success(data = ProfileData.Default)
            )
        )
    } catch (e: Exception) {
        context.res.setBodyText(
            Json.encodeToString<ApiResponse>(
                ApiResponse.Error(errorMessage = e.message.toString())
            )
        )
    }
}