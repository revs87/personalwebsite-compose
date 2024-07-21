package pt.rvcoding.personalwebsitecomposehtml.models.content

import pt.rvcoding.personalwebsitecomposehtml.models.BULLET
import pt.rvcoding.personalwebsitecomposehtml.models.ContentType.BulletText
import pt.rvcoding.personalwebsitecomposehtml.models.ContentType.Text
import pt.rvcoding.personalwebsitecomposehtml.models.PersonalContent


object ContentData {
    object Profile {
        val main by lazy {
            Profile(
                name = "Rui Vieira",
                profession = "Android Engineer",
                description = mainDescription,
                email = "revss87@gmail.com",
                linkedin = "https://www.linkedin.com/in/revs87",
                github = "https://github.com/revs87",
                stackoverflow = "https://stackoverflow.com/users/2996699/edgar-v",
                twitterX = "https://x.com/revs87",
                instagram = "https://www.instagram.com/revs87"
            )
        }
        private val mainDescription = listOf(
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
    }

    object HistorySensormatic {
        val main by lazy {
            History(
                title = "Sensormatic by Johnson Controls",
                subTitle = "Android Lead",
                period = "February 2023 – now",
                description = mainDescription,
            )
        }
        private val mainDescription = listOf(
            PersonalContent(Text, "Within a DDD architecture, I run B2B Android apps and libraries influent to the INDITEX group retail flow (Retail sector – Zara, Bershka, " +
                    "Pull&Bear, Massimo Dutti, Oysho, Stradivarius, Lefties and Zara Home) embracing +40k devices all around the world."),
            PersonalContent(BulletText, "$BULLET Physical tech used: Barcode readers, Active (Sleds) RSSI/RFID readers and passive RFID circuits."),
            PersonalContent(BulletText, "$BULLET Hard tech used: Gradle, Github, Hilt, Koin, Jetpack Compose, TDD, Performance, INDITEX external libraries integration and management."),
            PersonalContent(BulletText, "$BULLET Side perks: Android lead, critical/side-thinking awareness, tech debt evaluation and orchestration, passing the value to others by " +
                    "lecturing. Responsible for product ownership, board updates and new starter interviews."),
            PersonalContent(BulletText, "$BULLET Collaboration frameworks and tools: GitHub, DevHub, Azure, AppCenter, JFrog, Grafana, AppInsights, Jira, Agile Kanban."),
        )
        val content1 by lazy {
            History(
                title = "SINT Picking",
                subTitle = "Android B2B App",
                period = "",
                description = emptyList(),
            )
        }
        val content2 by lazy {
            History(
                title = "Matching",
                subTitle = "Android B2B App",
                period = "",
                description = emptyList(),
            )
        }
    }

    object HistoryTheFloow {
        val main by lazy {
            History(
                title = "The Floow",
                subTitle = "Senior Android Developer",
                period = "May 2016 – February 2023",
                description = mainDescription,
            )
        }
        private val mainDescription = listOf(
            PersonalContent(Text, "Worked on Android apps for evaluating vehicle driving behaviour (using bespoke activity recognition) and engaging a driving score that " +
                    "enables appealing insurance discounts (Insurance sector)."),
            PersonalContent(BulletText, "$BULLET Established concrete know how into full app development based on clean architecture layers (UI – Domain – Data) and based on a set " +
                    "of MVVM rules for connecting Business Logic and Data to the UI. Also considered coding principles such as Separation of concerns, " +
                    "abstraction layers, dependency inversion for Repository and UseCase layers, and testing inclusion (JUnit, Mockito, Cucumber, Gherkin)."),
            PersonalContent(BulletText, "$BULLET Deepened my knowledge in Kotlin: its data mangling power, coroutines and flows."),
            PersonalContent(BulletText, "$BULLET Fully on board with Jetpack Compose and ViewModel integration (and w/ or w/o Material)."),
            PersonalContent(BulletText, "$BULLET Role of problem finder to procure short term impact: analysed and identified weaknesses around app's background service against" +
                    "multiple device brands and multiple Android versions (source: https://dontkillmyapp.com)."),
            PersonalContent(BulletText, "$BULLET Shell and Python scripting: for multiple AARs flattening and to exploit automation under a CI/CD custom integration."),
            PersonalContent(BulletText, "$BULLET Collaboration frameworks and tools: Firebase, Jira, Agile Scrum, Git, Bitbucket, Bamboo, Jenkins, Miro, ZeroHeight, Crowdin, ZenDesk."),
        )
    }

    object HistoryITSector {
        val main by lazy {
            History(
                title = "ITsector",
                subTitle = "Android Developer",
                period = "October 2013 – April 2016",
                description = mainDescription,
            )
        }
        private val mainDescription = listOf(
            PersonalContent(Text, "Designed, developed, debugged, modified and deployed Android banking apps (Fintech sector) to thousands of users in Africa and PT."),
            PersonalContent(BulletText, "$BULLET Provided mentorship and collaborative environment supplying continuous assistance for development and issue resolution."),
            PersonalContent(BulletText, "$BULLET Led productive team of 2 developers in Android app creation."),
            PersonalContent(BulletText, "$BULLET Modelling RESTful web services and convey offline data availability."),
            PersonalContent(BulletText, "$BULLET Developed controllers and components from scratch."),
            PersonalContent(BulletText, "$BULLET Worked as Outsourcer in partnership with Bank Millennium in Warsaw, Poland."),
            PersonalContent(BulletText, "$BULLET Handled keystore and app deployments through alpha, beta and prod."),
        )
    }

    object HistoryINESC {
        val main by lazy {
            History(
                title = "INESCTec + CRACS",
                subTitle = "Researcher",
                period = "October 2011 – August 2013",
                description = mainDescription,
            )
        }
        private val mainDescription = listOf(
            PersonalContent(Text, "Designed, developed, debugged, modified and deployed Android banking apps (Fintech sector) to thousands of users in Africa and PT."),
            PersonalContent(BulletText, "$BULLET Provided mentorship and collaborative environment supplying continuous assistance for development and issue resolution."),
        )
    }

    object HistoryFCUP {
        val main by lazy {
            History(
                title = "Faculty of Sciences - University of Porto",
                subTitle = "Student",
                period = "September 2005 – September 2011",
                description = mainDescription,
            )
        }
        private val mainDescription = listOf(
            PersonalContent(Text, "Designed, developed, debugged, modified and deployed Android banking apps (Fintech sector) to thousands of users in Africa and PT."),
            PersonalContent(BulletText, "$BULLET Provided mentorship and collaborative environment supplying continuous assistance for development and issue resolution."),
        )
    }
}