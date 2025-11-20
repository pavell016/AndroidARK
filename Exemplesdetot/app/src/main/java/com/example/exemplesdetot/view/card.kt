package com.example.exemplesdetot.view

import androidx.compose.foundation.BorderStroke
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.Button
import androidx.compose.material3.Card
import androidx.compose.material3.CardDefaults
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.unit.dp

@Composable
fun CardExample() {

    Card(
        modifier = Modifier
            .fillMaxWidth()                   // El Card ocupa todo el ancho disponible
            .padding(16.dp)                   // Separación exterior del Card
            .clickable {                      // Permite que el Card sea clicable
                println("Card clicado!")
            },
        shape = RoundedCornerShape(16.dp),    // Redondeado de bordes
        colors = CardDefaults.cardColors(
            containerColor = Color(0xFFFFE0B2),   // Color de fondo del Card
            contentColor = Color.Black            // Color del texto dentro del Card
        ),
        elevation = CardDefaults.cardElevation(
            defaultElevation = 10.dp              // Sombras y elevada visual
        ),
        border = BorderStroke(2.dp, Color.Red)    // Borde alrededor del Card
    ) {
        Column(
            modifier = Modifier
                .padding(16.dp)               // Padding interior (contenido del Card)
        ) {
            Text(
                text = "Título del Card",
                style = MaterialTheme.typography.titleLarge
            )

            Spacer(modifier = Modifier.height(8.dp))

            Text(
                text = "Este es el contenido del Card. Aquí puedes poner texto, imágenes, filas o columnas completas.",
                style = MaterialTheme.typography.bodyMedium
            )

            Spacer(modifier = Modifier.height(12.dp))

            Button(
                onClick = { println("Botón dentro del Card") }
            ) {
                Text("Botón dentro del Card")
            }
        }
    }
}
