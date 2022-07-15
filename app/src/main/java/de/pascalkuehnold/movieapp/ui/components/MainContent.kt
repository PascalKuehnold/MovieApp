package de.pascalkuehnold.movieapp.ui.components

import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.items
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp
import androidx.navigation.NavController
import de.pascalkuehnold.movieapp.model.Movie
import de.pascalkuehnold.movieapp.model.getMovies
import de.pascalkuehnold.movieapp.navigation.MovieScreens
import de.pascalkuehnold.movieapp.widgets.MovieRow


/**
 * Created by Pascal Kühnold on 7/15/2022.
 */
@Composable
fun MainContent(
    movieList: List<Movie> = getMovies(),
    navController: NavController
) {
    Column(
        modifier = Modifier
            .padding(12.dp)
    ) {
        LazyColumn(
            content = {

                items(items = movieList){
                    MovieRow(movie = it){ movie ->

                        navController.navigate(
                            route = MovieScreens.DetailsScreen.name+"/$movie"
                        )
                    }
                }
            }
        )
    }
}