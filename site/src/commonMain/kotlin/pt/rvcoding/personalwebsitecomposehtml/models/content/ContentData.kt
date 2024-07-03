package pt.rvcoding.personalwebsitecomposehtml.models.content

import pt.rvcoding.personalwebsitecomposehtml.models.BULLET
import pt.rvcoding.personalwebsitecomposehtml.models.ContentType.*
import pt.rvcoding.personalwebsitecomposehtml.models.PersonalContent


private val profile = listOf(
    PersonalContent(Text,
    "With over a decade of experience, " +
            "I am offering a comprehensive expertise in software development, spanning from conceptualization to delivery. " +

            "Within the Android mobile infrastructure, " +
            "I advocate for quality by adhering to clean coding principles, " +
            "through the implementation of team standards, testing models, " +
            "thorough peer review, " +
            "pair programming and by spending enough time for self-development and side projects. " +

            "I aspire to secure a tech lead position while recurring to a specialized developer role that promises both short- and long-term impact. " +

            "Here are the enduring themes that continually drive my professional pursuits:"
    ),
    PersonalContent(BulletText, "$BULLET Designing and executing comprehensive, end-to-end features;"),
    PersonalContent(BulletText, "$BULLET Proactively identifying and addressing challenges in alignment with the company's strategy and vision;"),
    PersonalContent(BulletText, "$BULLET Conducting thorough reviews, maintaining, and scaling the existing code base;"),
    PersonalContent(BulletText, "$BULLET Providing guidance through mentoring, effectively delegating tasks, and meticulously documenting processes."),
)

private val historySensormatic = listOf(
    PersonalContent(Text, "February 2023 – now"),
    PersonalContent(Paragraph),
    PersonalContent(Text, "Within a DDD architecture, I run B2B Android apps and libraries influent to the INDITEX group retail flow (Retail sector – Zara, Bershka, " +
            "Pull&Bear, Massimo Dutti, Oysho, Stradivarius, Lefties and Zara Home) embracing +40k devices all around the world."),
    PersonalContent(BulletText, "$BULLET Physical tech used: Barcode readers, Active (Sleds) RSSI/RFID readers and passive RFID circuits."),
    PersonalContent(BulletText, "$BULLET Hard tech used: Gradle, Github, Hilt, Koin, Jetpack Compose, TDD, Performance, INDITEX external libraries integration and management."),
    PersonalContent(BulletText, "$BULLET Side perks: Android lead, critical/side-thinking awareness, tech debt evaluation and orchestration, passing the value to others by " +
            "lecturing. Responsible for product ownership, board updates and new starter interviews."),
    PersonalContent(BulletText, "$BULLET Collaboration frameworks and tools: GitHub, DevHub, Azure, AppCenter, JFrog, Grafana, AppInsights, Jira, Agile Kanban."),
)

object ContentData {
    val Profile by lazy {
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
    val HistorySensormatic by lazy {
        History(
            title = "Sensormatic by Johnson Controls",
            subTitle = "Android Lead",
            description = historySensormatic,
        )
    }
}