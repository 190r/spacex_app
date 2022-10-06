package com.example.spacex.presentation.ui

import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.*
import androidx.compose.material.MaterialTheme
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.tooling.preview.Devices
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.example.spacex.R
import com.example.spacex.presentation.theme.DarkSpace


@Composable
fun SpaceXSplashScreen() {
    Box(
        modifier = Modifier
            .background(color = DarkSpace)
            .fillMaxSize()
    ) {
        Column(
            modifier = Modifier.fillMaxSize(),
            horizontalAlignment = Alignment.CenterHorizontally,
            verticalArrangement = Arrangement.Center
        ) {
            Image(
                painter = painterResource(id = R.drawable.spacex_splashscreen),
                contentDescription = "Space X patch",
                contentScale = ContentScale.Fit,
                modifier = Modifier.size(150.dp)
            )
            Text(
                text = "Space X",
                style = MaterialTheme.typography.h5,
                color = Color.LightGray
            )
        }
    }
}

@Preview(device = Devices.PIXEL_4_XL, showBackground = true)
@Composable
fun SplashScreenPreview() {
    SpaceXSplashScreen()
}