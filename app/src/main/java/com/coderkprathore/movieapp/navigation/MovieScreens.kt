package com.coderkprathore.movieapp.navigation

// www.google.com/sign_in
enum class MovieScreens {
    HomeScreen,
    DetailsScreen;
    companion object {
        fun fromRoute(route: String?) : MovieScreens
        = when (route?.substringBefore("/")) {
            HomeScreen.name -> HomeScreen
            DetailsScreen.name -> DetailsScreen
            null -> HomeScreen
            else -> throw IllegalAccessException(" Route $route is not recognize")

        }
    }
}