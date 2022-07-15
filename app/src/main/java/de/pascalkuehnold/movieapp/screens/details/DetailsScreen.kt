package de.pascalkuehnold.movieapp.screens.details

import androidx.compose.foundation.layout.*
import androidx.compose.material.*
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.ArrowBack
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.unit.dp
import androidx.navigation.NavController
import de.pascalkuehnold.movieapp.model.Movie
import de.pascalkuehnold.movieapp.model.getMovies
import de.pascalkuehnold.movieapp.widgets.HorizontalImageCarousel
import de.pascalkuehnold.movieapp.widgets.MovieRow


/**
 * Created by Pascal Kühnold on 7/15/2022.
 */
@Composable
fun DetailsScreen(navController: NavController, movieId: String?) {

    val movie: Movie = getMovies().first {
        it.id == movieId
    }

    Scaffold(
        topBar = {
            TopAppBar(
                backgroundColor = Color.LightGray,
                elevation = 5.dp,
                title = { Text("Movie Details")},
                navigationIcon = {
                    IconButton(
                        onClick = {
                            navController.navigateUp()
                        }
                    ) {
                        Icon(
                            imageVector = Icons.Default.ArrowBack,
                            contentDescription = "Back Arrow"
                        )
                    }
                }
            )
        }
    ) {
        Surface(
            modifier = Modifier
                .fillMaxHeight()
                .fillMaxWidth()
        ) {
            Column(
                verticalArrangement = Arrangement.Top,
                horizontalAlignment = Alignment.CenterHorizontally
            ) {
                MovieRow(movie = movie)
                Spacer(modifier = Modifier.height(8.dp))
                Divider()
                Text(text = "Movie Images", style = MaterialTheme.typography.h5)
                HorizontalImageCarousel(movie)
            }
        }
    }
}

