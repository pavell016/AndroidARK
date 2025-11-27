package com.example.navigationexample

sealed class Routes(val route: String) {
    object Composable1:Routes("composable1")
    object Composable2:Routes("composable2")
    object Composable3:Routes("composable3")
    object Composable4:Routes("composable4/{secretNumber}"){
        fun createRoute(secretNumber:Int) = "pantalla4/$secretNumber"
    }
}