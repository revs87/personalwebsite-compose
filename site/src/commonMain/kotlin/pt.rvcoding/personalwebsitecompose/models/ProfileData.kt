package pt.rvcoding.personalwebsitecompose.models

import pt.rvcoding.personalwebsitecompose.models.ContentType.BulletText
import pt.rvcoding.personalwebsitecompose.models.ContentType.Text

const val ABOUT_ME_1 =
    "With over a decade of experience, " +
            "I am offering a comprehensive expertise in software development, spanning from conceptualization to delivery."
const val ABOUT_ME_2 =
    "By adhering to clean coding principles within the mobile infrastructure, I advocate for quality through the implementation of team standards," +
            " thorough peer reviewing, pair programming and by spending weekly hours on self development and side projects."
const val ABOUT_ME_3 =
    "I aspire to secure a tech lead position while concurrently pursuing a specialized development role that promises both short- and long-term impact."
const val ABOUT_ME_4 =
    "Here are the enduring themes that continually drive my professional pursuits:"
private const val BULLET = "\u2022"

private val profile = listOf(
    PersonalContent(Text, ABOUT_ME_1),
    PersonalContent(Text, ABOUT_ME_2),
    PersonalContent(Text, ABOUT_ME_3),
    PersonalContent(Text, ABOUT_ME_4),
    PersonalContent(BulletText, "$BULLET Designing and executing comprehensive, end-to-end features;"),
    PersonalContent(BulletText, "$BULLET Proactively identifying and addressing challenges in alignment with the company's strategy and vision;"),
    PersonalContent(BulletText, "$BULLET Conducting thorough reviews, maintaining, and scaling the existing code base;"),
    PersonalContent(BulletText, "$BULLET Providing guidance through mentoring, effectively delegating tasks, and meticulously documenting processes."),
)

object ProfileData {
    val Default by lazy {
        Profile(
            name = "Rui Vieira",
            profession = "Senior Android and Kotlin Multiplatform Developer",
            description = profile,
            email = "revss87@gmail.com",
            linkedin = "https://www.linkedin.com/in/revs87",
            github = "https://github.com/revs87",
            stackoverflow = "https://stackoverflow.com/users/2996699/edgar-v",
            twitterX = "https://x.com/revs87",
            instagram = "https://www.instagram.com/revs87"
        )
    }
}