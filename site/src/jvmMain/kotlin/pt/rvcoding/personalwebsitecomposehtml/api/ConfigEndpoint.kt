package pt.rvcoding.personalwebsitecomposehtml.api

import com.github.theapache64.fig.Fig
import com.varabyte.kobweb.api.Api
import com.varabyte.kobweb.api.ApiContext
import com.varabyte.kobweb.api.http.setBodyText
import kotlinx.serialization.encodeToString
import kotlinx.serialization.json.Json
import pt.rvcoding.personalwebsitecomposehtml.models.ApiResponse
import pt.rvcoding.personalwebsitecomposehtml.models.FigConfig


@Api(routeOverride = "config")
suspend fun config(context: ApiContext) {

    try {
        context.res.setBodyText(
            Json.encodeToString<ApiResponse>(
                ApiResponse.ConfigSuccess(data = getFigConfig())
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

private lateinit var mFig: Fig

suspend fun getFigConfig(): FigConfig {
    if (::mFig.isInitialized.not()) { mFig = Fig() }
    mFig.init(sheetUrl = "https://docs.google.com/spreadsheets/d/1csA2uKp2_8DyjpnCr0ehK7RQHWGLGFTITHOAozK9zZ0/edit?usp=sharing")

    val config = FigConfig(
        msgHelloWorld = mFig.getValue("msg_hello_world", "") ?: "",
        menuHistoryWorkEnabled = mFig.getValue("menu_history_work_enabled", null).asBoolean(),
        menuHistoryProjectsEnabled = mFig.getValue("menu_history_projects_enabled", null).asBoolean(),
        menuAboutMeEnabled = mFig.getValue("menu_about_me_enabled", null).asBoolean()
    )
    println(config)
    return config
}

private fun String?.asBoolean(): Boolean {
    return when {
        this == null -> false
        this.lowercase() == "true" -> true
        else -> false
    }
}
