package de.pascalkuehnold.movieapp.navigation

import androidx.compose.runtime.Composable
import androidx.navigation.NavType
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.rememberNavController
import androidx.navigation.navArgument
import de.pascalkuehnold.movieapp.screens.details.DetailsScreen
import de.pascalkuehnold.movieapp.screens.home.HomeScreen


/**
 * Created by Pascal Kühnold on 7/15/2022.
 */
@Composable
fun MovieNavigation() {
    val navController = rememberNavController()

    NavHost(
        navController = navController,
        startDestination = MovieScreens.HomeScreen.name
    ){
        composable(MovieScreens.HomeScreen.name){
            //pass where this should lead us -> should be HomeScreen Composable
            HomeScreen(navController = navController)
        }

        composable(
                route = MovieScreens.DetailsScreen.name+"/{movieId}",
                arguments = listOf(
                    navArgument(name = "movieId") {
                        type = NavType.StringType
                    }
                )
            )
        { backStackEntry ->

            DetailsScreen(
                navController = navController,
                movieId = backStackEntry.arguments?.getString("movieId")
            )
        }

    }


}