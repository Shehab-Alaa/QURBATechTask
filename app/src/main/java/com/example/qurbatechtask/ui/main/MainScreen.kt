package com.example.qurbatechtask.ui.main

import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.RowScope
import androidx.compose.foundation.layout.padding
import androidx.compose.material.*
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.colorResource
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.tooling.preview.Preview
import androidx.navigation.NavDestination
import androidx.navigation.NavDestination.Companion.hierarchy
import androidx.navigation.NavHostController
import androidx.navigation.compose.currentBackStackEntryAsState
import androidx.navigation.compose.rememberNavController
import com.example.qurbatechtask.R

@Composable
fun MainScreen() {
    val navController = rememberNavController()
    Scaffold(
        topBar = { AppTopBar() },
        bottomBar = { BottomBar(navController = navController) }
    ) { innerPadding ->
        // Apply the padding globally to the whole BottomNavScreensController
        Box(modifier = Modifier.padding(innerPadding)) {
            BottomNavGraph(navController = navController)
        }
    }
}

@Composable
fun AppTopBar(){
    TopAppBar(
        title = { Icon(painterResource(id = R.drawable.ic_logo), contentDescription = "Logo")},
        actions = {
            IconButton(onClick = { }) {
                Icon(painterResource(id = R.drawable.ic_search), contentDescription = "Search")
            }
            IconButton(onClick = { }) {
                Icon(painterResource(id = R.drawable.ic_notification), contentDescription = "Notification")
            }
            IconButton(onClick = { }) {
                Icon(painterResource(id = R.drawable.ic_cart), contentDescription = "Cart")
            }
        },
        backgroundColor = colorResource(id = R.color.white),
        contentColor = colorResource(id = R.color.blue),
    )
}

@Composable
fun BottomBar(navController: NavHostController) {
    val screens = listOf(
        BottomBarScreen.Home,
        BottomBarScreen.Food,
        BottomBarScreen.Settings,
        BottomBarScreen.Groups,
        BottomBarScreen.Profile,
    )
    val navBackStackEntry by navController.currentBackStackEntryAsState()
    val currentDestination = navBackStackEntry?.destination

    BottomNavigation(
        backgroundColor = colorResource(id = R.color.white),
    ) {
        screens.forEach { screen ->
            AddItem(
                screen = screen,
                currentDestination = currentDestination,
                navController = navController
            )
        }
    }
}

@Composable
fun RowScope.AddItem(
    screen: BottomBarScreen,
    currentDestination: NavDestination?,
    navController: NavHostController
) {
    BottomNavigationItem(
        icon = { Icon(painterResource(id = screen.icon), contentDescription = "Navigation Icon") },
        selected = currentDestination?.hierarchy?.any { it.route == screen.route } == true,
        unselectedContentColor = colorResource(id = R.color.blue),
        selectedContentColor = colorResource(id = R.color.purple),
        onClick = {}
        /*onClick = {
          navController.navigate(screen.route) {
              popUpTo(navController.graph.findStartDestination().id)
              launchSingleTop = true
          }
        }*/
    )
}

@Preview
@Composable
fun ComposablePreview() {
    MainScreen()
}
