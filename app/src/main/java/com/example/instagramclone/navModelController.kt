package com.example.instagramclone

import androidx.compose.material3.windowsizeclass.WindowWidthSizeClass
import androidx.compose.runtime.Composable
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.rememberNavController

class navModelController {
    @Composable
    fun myNavController(
        windowSize: WindowWidthSizeClass,
    ) {
        val navController = rememberNavController()
        NavHost(navController = navController, startDestination = "start") {
            composable("start") {
                // Content for the start destination
                MainScreenScaffold().MyScaffold(navController)
            }
            composable("profile") {
                // Content for the destination
                profileScreenScaffold().MyProfileScaffold()
            }
            // Define other destinations as needed
        }
        ///we keep the parameters depending on the screen size
        when (windowSize) {
            WindowWidthSizeClass.Compact -> {}
            WindowWidthSizeClass.Expanded ->{}
            WindowWidthSizeClass.Medium ->{}
        }
    }
}

