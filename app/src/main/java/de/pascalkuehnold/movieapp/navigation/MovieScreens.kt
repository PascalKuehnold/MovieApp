package de.pascalkuehnold.movieapp.navigation


/**
 * Created by Pascal Kühnold on 7/15/2022.
 */
enum class MovieScreens{
    HomeScreen,
    DetailsScreen;

    companion object{
        fun fromRoute(route: String?): MovieScreens = when (route?.substringBefore("/")){
            HomeScreen.name -> HomeScreen
            DetailsScreen.name -> DetailsScreen
            null -> HomeScreen
            else -> throw IllegalArgumentException("Route $route is not recognized")
        }
    }
}