package com.co.eve.Navigation.Ui

import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material.Surface
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import androidx.navigation.NavHost
import androidx.navigation.NavType
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.rememberNavController
import androidx.navigation.navArgument

@Composable
fun MainContent() {
    val navController = rememberNavController()
    Surface(
        modifier = Modifier.fillMaxSize()
    ) {
        NavHost(
            navController = navController,
            startDestination = "splashScreen"
        ) {
            composable("splashScreen"){
                SplashScreen(navController)
            }
            composable("genderSelection"){
                GenderSelection(navController)
            }
            composable("genderSelected?item={item}",
                arguments = listOf(
                    navArgument("item"){
                        type = NavType.StringType
                        defaultValue = "Item not available"
                        nullable = true
                    }
                )
            ){
                val item = it.arguments?.getString("item")
                GenderSelected(item = item)
            }
        }
    }
}

@Preview
@Composable
fun MainPreview() {
    MainContent()
}