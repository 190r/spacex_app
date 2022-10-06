package com.example.spacex.presentation.ui

import androidx.compose.runtime.Composable
import androidx.navigation.NavHostController
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import com.example.spacex.presentation.Screens

@Composable
fun NavigationSetup(navController: NavHostController) {
    NavHost(
        navController = navController,
        startDestination = Screens.SXSplashScreens.route
    ) {
        composable(Screens.SXSplashScreens.route) {
            SpaceXSplashScreen()
        }
        composable(Screens.SXHomeScreen.route) {
            HomeScreen()
        }
    }
}