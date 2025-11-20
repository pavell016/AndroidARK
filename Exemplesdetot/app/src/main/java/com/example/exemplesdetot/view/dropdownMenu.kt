package com.example.exemplesdetot.view

import androidx.compose.foundation.BorderStroke
import androidx.compose.foundation.background
import androidx.compose.foundation.border
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.ArrowDropDown
import androidx.compose.material.icons.filled.Star
import androidx.compose.material3.Divider
import androidx.compose.material3.DropdownMenu
import androidx.compose.material3.DropdownMenuItem
import androidx.compose.material3.Icon
import androidx.compose.material3.OutlinedButton
import androidx.compose.material3.SegmentedButtonDefaults.Icon
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
fun DropdownMenuExample() {

    // Estado que controla si el menú está abierto o cerrado
    var expanded by rememberSaveable { mutableStateOf(false) }

    // Elemento seleccionado
    var selectedOption by rememberSaveable { mutableStateOf("Selecciona una opción") }

    // Opciones del menú
    val options = listOf("Messi", "Lamine Yamal", "Raphinha", "Pedri")

    Column(modifier = Modifier.padding(16.dp)) {

        // Botón (puede ser cualquier Composable)
        OutlinedButton(
            onClick = { expanded = true },
            modifier = Modifier.fillMaxWidth(),
            shape = RoundedCornerShape(12.dp),
            border = BorderStroke(2.dp, Color.Red)
        ) {
            Text(selectedOption)
            Icon(
                imageVector = Icons.Default.ArrowDropDown,
                contentDescription = null,
                modifier = Modifier.padding(start = 8.dp)
            )
        }

        // Menú desplegable
        DropdownMenu(
            expanded = expanded,     // Muestra o oculta el menú
            onDismissRequest = { expanded = false },
            modifier = Modifier
                .background(Color(0xFFFFE0B2))    // Fondo del menú
                .border(1.dp, Color.Red)          // Borde exterior
        ) {

            options.forEach { opcion ->
                DropdownMenuItem(
                    text = { Text(opcion) },

                    // Al hacer clic en cada ítem
                    onClick = {
                        selectedOption = opcion
                        expanded = false      // Cerrar menú al seleccionar
                    },

                    // Puedes poner un icono a la izquierda
                    leadingIcon = {
                        Icon(
                            Icons.Default.Star,
                            contentDescription = null,
                            tint = if (selectedOption == opcion) Color.DarkGray else Color.LightGray
                        )
                    }
                )

                // Optional: a divider between items
                Divider(color = Color.Gray.copy(alpha = 0.3f))
            }
        }
    }
}
