package com.example.exemplesdetot.view

import androidx.compose.foundation.background
import androidx.compose.foundation.border
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
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
fun boxex(){
    Box(
        modifier = Modifier
            .fillMaxWidth()                      // Ocupa todo el ancho disponible
            .heightIn(min = 150.dp)              // Altura mínima
            .background(
                color = Color(0xFFBBDEFB),       // Fondo
                shape = RoundedCornerShape(20.dp) // Bordes redondeados
            )
            .border(
                width = 2.dp,
                color = Color.Blue,
                shape = RoundedCornerShape(20.dp) // Borde con forma
            )
            .padding(12.dp)                      // Padding interno
            .clip(RoundedCornerShape(20.dp))     // Recorta el contenido a la forma
            .shadow(
                elevation = 10.dp,
                shape = RoundedCornerShape(20.dp),
                clip = false
            )
            .alpha(1f)                           // Transparencia
            .verticalScroll(rememberScrollState()) // Scroll vertical interno
            .clickable { /* acción opcional */ }, // Hacer clic
        contentAlignment = Alignment.Center       // Alineación del contenido dentro del Box
    ) {

        // Contenido scrolleable dentro del Box
        Column(
            verticalArrangement = Arrangement.spacedBy(6.dp)
        ) {
            Text("Elemento 1")
            Text("Elemento 2")
            Text("Elemento 3")
            Text("Elemento 4")
            Text("Elemento 5")
            Text("Elemento 6")
            Text("Elemento 7")
        }
    }

}