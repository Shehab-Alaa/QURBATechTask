package com.example.qurbatechtask.ui.main

import androidx.compose.runtime.Composable
import androidx.navigation.NavHostController
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import com.example.qurbatechtask.ui.home.HomeScreen

@Composable
fun BottomNavGraph(navController: NavHostController) {
    NavHost(
        navController = navController,
        startDestination = BottomBarScreen.Home.route
    ) {
        composable(route = BottomBarScreen.Home.route) {
            HomeScreen()
        }
        composable(route = BottomBarScreen.Food.route) {

        }
        composable(route = BottomBarScreen.Settings.route) {

        }
        composable(route = BottomBarScreen.Groups.route) {

        }
        composable(route = BottomBarScreen.Profile.route) {

        }
    }
}