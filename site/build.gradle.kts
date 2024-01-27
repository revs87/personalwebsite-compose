import com.varabyte.kobweb.gradle.application.util.configAsKobwebApplication
import kotlinx.html.link
import java.util.*

plugins {
    alias(libs.plugins.kotlin.multiplatform)
    alias(libs.plugins.jetbrains.compose)
    alias(libs.plugins.kobweb.application)
    // alias(libs.plugins.kobwebx.markdown)
}

group = "pt.rvcoding.personalwebsitecompose"
version = "1.0-SNAPSHOT"


task("kobweb") {
    doLast {
        if (System.getProperty("os.name").lowercase(Locale.ROOT).contains("windows")) {
            Runtime.getRuntime().exec(".\\kobweb-0.9.13\\bin\\kobweb.bat run -p site/")
        } else {
            Runtime.getRuntime().exec("./kobweb-0.9.13/bin/kobweb run -p site/")
        }
    }
}

//tasks.create("stage") {
//    dependsOn("installDist", "clean")
//    mustRunAfter("clean")
//}


kobweb {
    app {
        index {
            description.set("Powered by Kobweb")

            head.add {
                link {
                    rel = "stylesheet"
                    href = "/fonts/faces.css"
                }
            }
        }
    }
}

kotlin {
    configAsKobwebApplication("personalwebsitecompose")

    sourceSets {
        commonMain.dependencies {
            implementation(compose.runtime)
            implementation(compose.ui)
        }

        jsMain.dependencies {
            implementation(compose.html.core)
            implementation(libs.kobweb.core)
            implementation(libs.kobweb.silk)
            implementation(libs.silk.icons.fa)
            // implementation(libs.kobwebx.markdown)
            
        }
    }
}
