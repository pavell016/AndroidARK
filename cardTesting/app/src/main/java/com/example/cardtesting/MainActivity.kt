package com.example.cardtesting

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
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.tooling.preview.Preview
import com.example.cardtesting.ui.theme.CardTestingTheme
import com.example.cardtesting.view.BusinessCard

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContent {
            CardTestingTheme {
                BusinessCard(
                    image = painterResource(id = R.drawable.tick), // tu PNG en drawable
                    name = "Juan Pérez",
                    position = "Desarrollador Android",
                    phone = "+34 123 456 789",
                    email = "juan.perez@empresa.com"
                )
            }
        }
    }
}