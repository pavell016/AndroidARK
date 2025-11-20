package com.example.exemplesdetot.view

import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Slider
import androidx.compose.material3.SliderDefaults
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.saveable.rememberSaveable
import androidx.compose.runtime.setValue
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.unit.dp

@Composable
fun SliderExample() {

    // Valor actual del slider
    var sliderValue by rememberSaveable { mutableStateOf(50f) }

    Column(
        modifier = Modifier
            .fillMaxWidth()
            .padding(16.dp)
    ) {

        Text(
            text = "Valor seleccionado: ${sliderValue.toInt()}",
            style = MaterialTheme.typography.titleMedium
        )

        Spacer(modifier = Modifier.height(16.dp))

        Slider(
            value = sliderValue,                 // Valor actual del slider
            onValueChange = { sliderValue = it }, // Cuando el usuario mueve el slider

            valueRange = 0f..100f,              // Rango permitido del slider
            //steps = 4,                          // Número de posiciones intermedias (divide en 5 segmentos)

            modifier = Modifier
                .fillMaxWidth()
                .padding(horizontal = 10.dp),

            colors = SliderDefaults.colors(
                thumbColor = Color.Red,                // Color del punto
                activeTrackColor = Color(0xFFFF9800),  // Color de la barra activa
                inactiveTrackColor = Color.LightGray,  // Color de la barra inactiva
                activeTickColor = Color.Red,           // Color de marcas activas
                inactiveTickColor = Color.Gray         // Color de marcas inactivas
            )
        )
    }
}
