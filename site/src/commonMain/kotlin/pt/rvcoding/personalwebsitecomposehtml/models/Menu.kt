package pt.rvcoding.personalwebsitecomposehtml.models


enum class Menu(val title: String) {
    PROFILE(title = "Profile"),
    PORTFOLIO(title = "Portfolio"),
    HISTORY(title = "History");

    companion object {
        val Default by lazy { PROFILE }

        fun fromString(str: String): Menu = when (str) {
            PROFILE.title -> PROFILE
            PORTFOLIO.title -> PORTFOLIO
            HISTORY.title -> HISTORY
            else -> PROFILE
        }
    }
}