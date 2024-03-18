package pt.rvcoding.personalwebsitecomposehtml.models

import pt.rvcoding.personalwebsitecomposehtml.models.ContentType.BulletText
import pt.rvcoding.personalwebsitecomposehtml.models.ContentType.Text

const val ABOUT_ME =
    "With over a decade of experience, " +
            "I am offering a comprehensive expertise in software development, spanning from conceptualization to delivery. " +

            "Within the Android mobile infrastructure, " +
            "I advocate for quality by adhering to clean coding principles, " +
            "through the implementation of team standards, testing models, " +
            "thorough peer review, " +
            "pair programming and by spending enough time for self-development and side projects. " +

            "I aspire to secure a tech lead position while recurring to a specialized developer role that promises both short- and long-term impact. " +

            "Here are the enduring themes that continually drive my professional pursuits:"

private const val BULLET = "\u2022"

private val profile = listOf(
    PersonalContent(Text, ABOUT_ME),
    PersonalContent(BulletText, "$BULLET Designing and executing comprehensive, end-to-end features;"),
    PersonalContent(BulletText, "$BULLET Proactively identifying and addressing challenges in alignment with the company's strategy and vision;"),
    PersonalContent(BulletText, "$BULLET Conducting thorough reviews, maintaining, and scaling the existing code base;"),
    PersonalContent(BulletText, "$BULLET Providing guidance through mentoring, effectively delegating tasks, and meticulously documenting processes."),
)

object ProfileData {
    val Default by lazy {
        Profile(
            name = "Rui Vieira",
            profession = "Android Lead, Senior Android Developer and Kotlin Multiplatform Developer",
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