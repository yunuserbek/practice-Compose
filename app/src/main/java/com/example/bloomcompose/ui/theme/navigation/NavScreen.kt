package com.example.bloomcompose.ui.theme.navigation

sealed class NavScreen(val route:String) {
    object WelcomeScreen:NavScreen("welcome_Screen")
    object HomeScreen:NavScreen("Home_Screen")
    object FavoritesScreen:NavScreen("favorites_Screen")
    object ProfileScreen:NavScreen("Profile_Screen")
    object CartScreen:NavScreen("Cart_Screen")

}