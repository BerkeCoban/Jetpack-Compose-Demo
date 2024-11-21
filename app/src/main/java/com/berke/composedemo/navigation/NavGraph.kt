package com.berke.composedemo.navigation

import androidx.compose.runtime.Composable
import androidx.navigation.NavHostController
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import com.berke.composedemo.DetailScreen
import com.berke.composedemo.GridScreen
import com.berke.composedemo.ProfileScreen


@Composable
fun SetupNavGraph(
  navController: NavHostController
) {
  NavHost(
    navController = navController,
    startDestination = Screen.Splash.route
  ){
    composable(
      route = Screen.Splash.route
    ) {
      GridScreen(navController)
    }
    composable(
    route = Screen.Home.route
    ) {
      ProfileScreen(navController)
    }
    composable(
      route = Screen.Detail.route
    ) {
      DetailScreen()
    }
  }
}