package pt.rvcoding.personalwebsitecomposehtml.models


enum class Menu(val title: String) {
    PROFILE(title = "Profile"),
    PORTFOLIO(title = "Portfolio"),
    HISTORY(title = "History"),
    ABOUT_ME(title = "About me");

    companion object {
        val Default by lazy { PROFILE }
        val Active by lazy { listOf(PROFILE) }

        fun fromString(str: String): Menu = when (str) {
            PROFILE.title -> PROFILE
            PORTFOLIO.title -> PORTFOLIO
            HISTORY.title -> HISTORY
            ABOUT_ME.title -> ABOUT_ME
            else -> PROFILE
        }
    }
}