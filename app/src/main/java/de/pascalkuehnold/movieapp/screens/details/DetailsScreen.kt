package de.pascalkuehnold.movieapp.screens.details

import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxHeight
import androidx.compose.foundation.layout.fillMaxWidth

import androidx.compose.material.*
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.ArrowBack
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.unit.dp
import androidx.navigation.NavController


/**
 * Created by Pascal Kühnold on 7/15/2022.
 */
@Composable
fun DetailsScreen(navController: NavController, movieTitle: String?) {

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
                verticalArrangement = Arrangement.Center,
                horizontalAlignment = Alignment.CenterHorizontally
            ) {
                Text(
                    text = movieTitle.toString(),
                    style = MaterialTheme.typography.h5
                )
            }
        }
    }
}