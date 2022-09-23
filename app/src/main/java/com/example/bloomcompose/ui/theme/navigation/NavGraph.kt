package com.example.bloomcompose.ui.theme.navigation

import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.material.BottomAppBar
import androidx.compose.material.BottomNavigationItem
import androidx.compose.material.Icon
import androidx.compose.material.MaterialTheme
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.res.vectorResource
import androidx.compose.ui.unit.dp
import androidx.navigation.NavGraph.Companion.findStartDestination
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.currentBackStackEntryAsState
import androidx.navigation.compose.rememberNavController
import com.example.bloomcompose.ui.theme.componet.CustomScaffold
import com.example.bloomcompose.ui.theme.screen.WelcomeScreen

@Composable
fun NavGraph(startDestination: String=NavScreen.WelcomeScreen.route) {
    val navController = rememberNavController()
    val navBackStackEntry by navController.currentBackStackEntryAsState()
    val currentRoute = navBackStackEntry?.destination?.route

    CustomScaffold(modifier = Modifier,
        bottomBar = {
            BottomNav.values().forEach {navItem->
                if (navItem.route == currentRoute){
                    BottomAppBar(elevation = 16.dp, backgroundColor = MaterialTheme.colors.background) {
                        BottomNav.values().forEach { screen->
                            BottomNavigationItem(selected = currentRoute==screen.route
                                , selectedContentColor = MaterialTheme.colors.primary
                                , unselectedContentColor = MaterialTheme.colors.secondary
                                ,icon = { Icon(imageVector = ImageVector.vectorResource(id = screen.icon), contentDescription =""
                                    , modifier = Modifier.size(24.dp) )},
                                onClick = {
                                    if (currentRoute==screen.route){
                                        return@BottomNavigationItem
                                    }
                                    if (currentRoute !=screen.route){
                                        navController.navigate(screen.route){
                                            NavScreen.HomeScreen.route.let {
                                                popUpTo(navController.graph.findStartDestination().id){
                                                    saveState = true
                                                }
                                            }
                                            launchSingleTop =true
                                            restoreState = true
                                        }
                                    }
                                })
                        }

                    }
                }

            }
    }, content ={
        NavHost(navController = navController, startDestination = startDestination, modifier = Modifier.padding(it)){
            composable(NavScreen.WelcomeScreen.route){
                WelcomeScreen()
            }

        }
    })
}