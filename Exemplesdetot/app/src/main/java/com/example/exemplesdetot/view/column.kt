package com.example.exemplesdetot.view

import androidx.compose.foundation.background
import androidx.compose.foundation.border
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.heightIn
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.rememberScrollState
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.foundation.verticalScroll
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
fun columnex(){
    Column(
        modifier = Modifier
            .fillMaxWidth()                     // Ocupa todo el ancho
            .heightIn(min = 100.dp)             // Altura mínima (opcional)
            .background(
                color = Color(0xFFFFE0B2),      // Color de fondo
                shape = RoundedCornerShape(16.dp) // Bordes redondeados
            )
            .border(
                width = 2.dp,
                color = Color.Red,
                shape = RoundedCornerShape(16.dp) // Borde con forma
            )
            .padding(12.dp)                     // Padding interno
            .clip(RoundedCornerShape(16.dp))    // Recorta el contenido con la forma
            .shadow(
                elevation = 8.dp,
                shape = RoundedCornerShape(16.dp),
                clip = false
            )
            .alpha(1f)                           // Transparencia
            .clickable { /* acción opcional */ }, // Evento clic opcional
        verticalArrangement = Arrangement.spacedBy(10.dp), // Espaciado vertical entre hijos
        horizontalAlignment = Alignment.Start              // Alineación horizontal
    ) {
        Text("Linea 1")
        Text("Linea 2")
        Text("Linea 3")
        Text("Linea 4")
        Text("Linea 5")
        Text("Linea 6")
    }

}