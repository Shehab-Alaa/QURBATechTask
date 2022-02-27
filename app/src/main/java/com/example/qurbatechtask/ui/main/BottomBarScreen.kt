package com.example.qurbatechtask.ui.main

import com.example.qurbatechtask.R

sealed class BottomBarScreen(
    val route: String,
    val icon: Int
) {
    object Home : BottomBarScreen(
        route = "home",
        icon = R.drawable.ic_home
    )

    object Food : BottomBarScreen(
        route = "food",
        icon = R.drawable.ic_food
    )

    object Settings : BottomBarScreen(
        route = "settings",
        icon = R.drawable.ic_settings
    )

    object Groups : BottomBarScreen(
        route = "groups",
        icon = R.drawable.ic_groups
    )

    object Profile : BottomBarScreen(
        route = "profile",
        icon = R.drawable.ic_profile
    )
}