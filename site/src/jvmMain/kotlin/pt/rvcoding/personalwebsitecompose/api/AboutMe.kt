package pt.rvcoding.personalwebsitecompose.api

import com.varabyte.kobweb.api.Api
import com.varabyte.kobweb.api.ApiContext
import com.varabyte.kobweb.api.http.setBodyText
import kotlinx.serialization.encodeToString
import kotlinx.serialization.json.Json
import pt.rvcoding.personalwebsitecompose.models.ApiResponse
import pt.rvcoding.personalwebsitecompose.models.ContentType.BulletText
import pt.rvcoding.personalwebsitecompose.models.ContentType.Text
import pt.rvcoding.personalwebsitecompose.models.PersonalContent
import pt.rvcoding.personalwebsitecompose.models.PersonalData

const val ABOUT_ME_1 =
    "With over a decade of experience, " +
            "I am offering a comprehensive expertise in software development, spanning from conceptualization to delivery.\n" +
            "By adhering to clean coding principles within the mobile infrastructure, I advocate for quality through the implementation of thorough peer reviewing, team standards, pair programming and a couple of hours per week for self development.\n"
const val ABOUT_ME_2 =
    "I aspire to secure a tech lead position while concurrently pursuing a specialized development role that promises both short- and long-term impact.\n" +
            "Here are the enduring themes that continually drive my professional pursuits:"
private const val BULLET = "\u2022"

private val personalData = PersonalData(
    name = "Rui Vieira",
    profession = "Senior Android and Kotlin Multiplatform Developer",
    description = listOf(
        PersonalContent(Text, ABOUT_ME_1),
        PersonalContent(Text, ABOUT_ME_2),
        PersonalContent(BulletText, "$BULLET Designing and executing comprehensive, end-to-end features;"),
        PersonalContent(BulletText, "$BULLET Proactively identifying and addressing challenges in alignment with the company's strategy and vision;"),
        PersonalContent(BulletText, "$BULLET Conducting thorough reviews, maintaining, and scaling the existing code base;"),
        PersonalContent(BulletText, "$BULLET Providing guidance through mentoring, effectively delegating tasks, and meticulously documenting processes."),
    ),
    email = "revss87@gmail.com"
)

@Api
suspend fun aboutMe(context: ApiContext) {
    try {
        context.res.setBodyText(
            Json.encodeToString<ApiResponse>(
                ApiResponse.Success(data = personalData)
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