package com.example.navigationexample

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.rememberNavController
import com.example.navigationexample.ui.theme.NavigationExampleTheme
import com.example.navigationexample.view.Screen1
import com.example.navigationexample.view.Screen2
import com.example.navigationexample.view.Screen3
import com.example.navigationexample.view.Screen4

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContent {
            NavigationExampleTheme {
                val navigationController = rememberNavController()
                NavHost(
                    navController = navigationController,
                    startDestination = Routes.Composable1.route
                ) {
                    composable(Routes.Composable1.route) { Screen1(navigationController) }
                    composable(Routes.Composable2.route) { Screen2(navigationController) }
                    composable(Routes.Composable3.route) { Screen3(navigationController) }
                    composable(Routes.Composable4.route) { Screen4(navigationController, 3) }
                }
            }
        }
    }
}

