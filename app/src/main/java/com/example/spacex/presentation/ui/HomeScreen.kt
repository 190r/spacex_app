package com.example.spacex.presentation.ui

import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.material.Card
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import androidx.navigation.NavHostController

@Composable
fun HomeScreen() {
    Box(modifier = Modifier.fillMaxWidth())
}

@Composable
fun SpaceXRouteItem() {
    Card(modifier = Modifier.fillMaxSize()) {

    }
}

@Preview
@Composable
fun SpaceXRoutePreview() {
    SpaceXRouteItem()
}