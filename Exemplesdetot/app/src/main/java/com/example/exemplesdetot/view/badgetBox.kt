package com.example.exemplesdetot.view

import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Email
import androidx.compose.material3.Badge
import androidx.compose.material3.BadgedBox
import androidx.compose.material3.Icon
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.unit.dp

@Composable
fun BadgeBoxExample() {

    // Valor que mostrará el badge
    val notificationCount = 5

    BadgedBox(
        modifier = Modifier.padding(16.dp),
        badge = {
            // Contenido del badge (el numerito)
            Badge(
                containerColor = Color.Red,        // Color de fondo del badge
                contentColor = Color.White         // Color del texto dentro del badge
            ) {
                Text(notificationCount.toString())
            }
        }
    ) {
        // El contenido principal sobre el cual se coloca el badge
        Icon(
            imageVector = Icons.Default.Email,
            contentDescription = "Icono Email",
            modifier = Modifier.size(48.dp),
            tint = Color.Black
        )
    }
}
