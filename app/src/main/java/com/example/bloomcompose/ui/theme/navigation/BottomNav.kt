package com.example.bloomcompose.ui.theme.navigation

import com.example.bloomcompose.R

enum class BottomNav(val route: String, val icon: Int, val screenName: String) {
    HOME(NavScreen.HomeScreen.route,
        R.drawable.ic_baseline_home_24,
        "Home"),
    FAVORTITES(NavScreen.FavoritesScreen.route,
        R.drawable.ic_baseline_favorite_border_24,
        "Favorites"),
    PROFILE(NavScreen.ProfileScreen.route,
        R.drawable.ic_baseline_account_circle_24,
        "Profile"),
    CART(NavScreen.CartScreen.route,
         R.drawable.ic_baseline_shopping_cart_24,
        "Cart"),
}