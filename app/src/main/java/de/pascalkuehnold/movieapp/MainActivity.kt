package de.pascalkuehnold.movieapp

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material.MaterialTheme
import androidx.compose.material.Surface
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import de.pascalkuehnold.movieapp.ui.components.MainApp
import de.pascalkuehnold.movieapp.ui.components.MainContent
import de.pascalkuehnold.movieapp.ui.theme.MovieAppTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            MainApp {
                MainContent()
            }
        }
    }
}


@Preview(showBackground = true)
@Composable
fun defaultPreview(){
    MainApp {
        MainContent()
    }
}