package com.adewan.playpal.features.navigation

import androidx.compose.runtime.Composable
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.rememberNavController
import com.adewan.playpal.features.login.LOGIN_SCREEN_ROUTE
import com.adewan.playpal.features.login.LoginScreen

@Composable
fun AppNavHost() {
    val navController = rememberNavController()
    NavHost(navController = navController, startDestination = LOGIN_SCREEN_ROUTE) {
        composable(LOGIN_SCREEN_ROUTE) {
            LoginScreen()
        }
    }
}
