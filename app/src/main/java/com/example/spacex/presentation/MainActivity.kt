package com.example.spacex.presentation

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.navigation.compose.rememberNavController
import com.example.spacex.presentation.ui.NavigationSetup
import com.example.spacex.presentation.theme.SpaceXTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            val navController = rememberNavController()
            SpaceXTheme {
                NavigationSetup(navController)
            }
        }
    }
}