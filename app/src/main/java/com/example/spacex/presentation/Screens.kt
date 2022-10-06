package com.example.spacex.presentation

sealed class Screens(val route: String) {
    object SXSplashScreens: Screens("spacex_splash_screen")
    object SXHomeScreen: Screens("spacex_home_screen")
    object SXRouteDestination: Screens("spacex_route_screen")
}
