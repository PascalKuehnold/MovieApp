package de.pascalkuehnold.movieapp.ui.components

import androidx.compose.material.Scaffold
import androidx.compose.material.Text
import androidx.compose.material.TopAppBar
import androidx.compose.runtime.Composable
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.unit.dp
import de.pascalkuehnold.movieapp.ui.theme.MovieAppTheme


/**
 * Created by Pascal Kühnold on 7/15/2022.
 */
@Composable
fun MainApp(content: @Composable () -> Unit) {
    MovieAppTheme {
        content()
    }
}