package com.example.estateapp101.navigation

//import com.example.estateapp101.ui.theme.screen.about.AboutScreen
import com.example.estateapp101.ui.theme.screen.home.HomeScreen
import com.example.estateapp101.ui.theme.screen.login.LoginScreen
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.navigation.NavHostController
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.rememberNavController
import com.example.estateapp101.ui.theme.screen.products.AddProductsScreen
import com.example.estateapp101.ui.theme.screen.products.ViewProductsScreen
import com.example.estateapp101.ui.theme.screen.register.SignupScreen

@Composable
fun AppNavHost(
    modifier: Modifier = Modifier,
    navController:NavHostController = rememberNavController(),
    startDestination:String = LOGIN_URL
){
    NavHost(
        navController = navController,
        startDestination = startDestination,
        modifier = modifier){
        composable(LOGIN_URL){
            LoginScreen(navController = navController)
        }
        composable(SIGNUP_URL){
             SignupScreen(navController = navController)
        }
        composable(HOME_URL){
            HomeScreen(navController = navController)
        }
        composable(ADD_PRODUCTS_URL){
           AddProductsScreen(navController = navController)
        }
        composable(VIEW_PRODUCTS_URL){
           ViewProductsScreen(navController = navController)
        }
    }
}