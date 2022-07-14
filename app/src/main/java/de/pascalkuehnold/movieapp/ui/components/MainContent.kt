package de.pascalkuehnold.movieapp.ui.components

import android.util.Log
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.items
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp
import androidx.navigation.NavController
import de.pascalkuehnold.movieapp.navigation.MovieScreens


/**
 * Created by Pascal Kühnold on 7/15/2022.
 */
@Composable
fun MainContent(
    movieList: List<String> = listOf("Avatar", "300", "Harry Potter", "Life"),
    navController: NavController
) {
    Column(
        modifier = Modifier
            .padding(12.dp)
    ) {
        LazyColumn(
            content = {

                items(items = movieList){
                    MovieRow(movieTitle = it){ movie ->

                        navController.navigate(
                            route = MovieScreens.DetailsScreen.name+"/$movie"
                        )
                    }
                }
            }
        )
    }
}