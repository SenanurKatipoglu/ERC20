package com.example.erc20token.navigation

import androidx.compose.runtime.Composable
import androidx.navigation.NavHostController
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import com.example.erc20token.screen.dashboard.DashboardScreen
import com.example.erc20token.screen.login.LoginScreen

/**
 * Created by KATIPOGLU on 7.09.2024.
 */

@Composable
fun AppNavigation(navController: NavHostController){
 NavHost(navController = navController, startDestination = "Login"){
     composable("Login"){
         DashboardScreen()
     }
 }


}