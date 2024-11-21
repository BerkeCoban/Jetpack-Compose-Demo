package com.berke.composedemo

import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.runtime.Composable
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.Button
import androidx.compose.material3.Text
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp
import androidx.navigation.NavController
import com.berke.composedemo.navigation.Screen

@Composable
fun GridScreen(navController: NavController) {

    Column(
        modifier = Modifier.fillMaxSize(),
        verticalArrangement = Arrangement.Center,
        horizontalAlignment = Alignment.CenterHorizontally
    ) {

        Button(onClick = { navController.navigate(route = Screen.Home.route) }, shape = RoundedCornerShape(16.dp)) {
            Text(text = "Instagram UI")
        }

        Button(onClick = { navController.navigate(route = Screen.Detail.route) }, shape = RoundedCornerShape(16.dp)) {
            Text(text = "Card UI")
        }
    }

}