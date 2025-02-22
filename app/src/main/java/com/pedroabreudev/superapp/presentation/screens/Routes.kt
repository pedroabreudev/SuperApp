package com.pedroabreudev.superapp.presentation.screens

sealed class Routes(val route: String) {

    data object HomeScreen : Routes(route = "home_screen")
}