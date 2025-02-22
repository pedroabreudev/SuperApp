package com.pedroabreudev.superapp.presentation.screens

import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material3.Surface
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.rememberNavController
import com.pedroabreudev.superapp.presentation.screens.home.HomeScreen

@Composable
fun AppNavGraph() {
    val navController = rememberNavController()

    Surface(modifier = Modifier.fillMaxSize()) {
        NavHost(navController, startDestination = Routes.HomeScreen.route) {
            composable(route = Routes.HomeScreen.route) {
                HomeScreen()
            }
        }
    }

}