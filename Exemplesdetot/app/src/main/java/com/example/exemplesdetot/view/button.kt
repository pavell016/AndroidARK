package com.example.exemplesdetot.view

import androidx.compose.foundation.background
import androidx.compose.foundation.border
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.PaddingValues
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.Button
import androidx.compose.material3.ButtonDefaults
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.alpha
import androidx.compose.ui.draw.clip
import androidx.compose.ui.draw.shadow
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.unit.dp

@Composable
fun buttex(){
    Button(
        onClick = { /* acción */ },
        enabled = true,                                 // Activado/desactivado
        modifier = Modifier
            .fillMaxWidth()                             // Ocupa todo el ancho
            .height(56.dp)                              // Altura estándar para botones
            .background(Color.Transparent)              // Fondo externo (normalmente transparente)
            .shadow(
                elevation = 8.dp,
                shape = RoundedCornerShape(20.dp),
                clip = false
            )
            .clip(RoundedCornerShape(20.dp))            // Recorta el botón en sí
            .border(
                width = 2.dp,
                color = Color.Blue,
                shape = RoundedCornerShape(20.dp)
            )
            .alpha(1f),                                 // Transparencia
        shape = RoundedCornerShape(20.dp),              // Bordes redondeados del botón
        elevation = ButtonDefaults.buttonElevation(
            defaultElevation = 6.dp,
            pressedElevation = 10.dp,
            disabledElevation = 0.dp
        ),
        colors = ButtonDefaults.buttonColors(
            containerColor = Color(0xFF64B5F6),         // Color de fondo
            contentColor = Color.White,                 // Color del texto/íconos
            disabledContainerColor = Color.Gray,
            disabledContentColor = Color.DarkGray
        ),
        contentPadding = PaddingValues(16.dp)           // Padding interno del contenido
    ) {
        Row(
            verticalAlignment = Alignment.CenterVertically,
            horizontalArrangement = Arrangement.Center
        ) {
            Text(text = "Mi Botón Completo")
        }
    }

}

