package com.cau.fallzero.navigation

sealed class Screen(val route: String) {
    object Home : Screen("home")
    object Exercise : Screen("exercise")
    object Result : Screen("result")
}