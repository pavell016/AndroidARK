package com.example.exemplesdetot.view

import androidx.compose.foundation.background
import androidx.compose.foundation.border
import androidx.compose.foundation.clickable
import androidx.compose.foundation.horizontalScroll
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.heightIn
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.rememberScrollState
import androidx.compose.foundation.shape.RoundedCornerShape
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
fun rowex(){
    Row(
        modifier = Modifier
            .fillMaxWidth()                          // Ocupa todo el ancho
            .heightIn(min = 80.dp)                   // Altura mínima
            .background(
                color = Color(0xFFC8E6C9),           // Fondo
                shape = RoundedCornerShape(16.dp)     // Bordes redondeados
            )
            .border(
                width = 2.dp,
                color = Color.Green,
                shape = RoundedCornerShape(16.dp)     // Borde redondeado
            )
            .padding(12.dp)                          // Espacio interno
            .clip(RoundedCornerShape(16.dp))         // Recorta el contenido
            .shadow(
                elevation = 8.dp,
                shape = RoundedCornerShape(16.dp),
                clip = false
            )
            .horizontalScroll(rememberScrollState())  // Scroll horizontal
            .alpha(1f)                                // Transparencia
            .clickable { /* acción opcional */ },     // Evento clic
        horizontalArrangement = Arrangement.spacedBy(12.dp),  // Espaciado entre elementos
        verticalAlignment = Alignment.CenterVertically         // Alineación vertical
    ) {

        // Contenido scrolleable dentro del Row
        Text("Item 1")
        Text("Item 2")
        Text("Item 3")
        Text("Item 4")
        Text("Item 5")
        Text("Item 6")
    }

}