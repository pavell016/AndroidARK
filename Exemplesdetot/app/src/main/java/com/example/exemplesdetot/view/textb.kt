package com.example.exemplesdetot.view

import androidx.compose.foundation.background
import androidx.compose.foundation.border
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.heightIn
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.foundation.text.KeyboardActions
import androidx.compose.foundation.text.KeyboardOptions
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Clear
import androidx.compose.material.icons.filled.Person
import androidx.compose.material3.Icon
import androidx.compose.material3.LocalTextStyle
import androidx.compose.material3.Text
import androidx.compose.material3.TextField
import androidx.compose.material3.TextFieldDefaults
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.alpha
import androidx.compose.ui.draw.clip
import androidx.compose.ui.draw.shadow
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.semantics.SemanticsProperties.ImeAction
import androidx.compose.ui.semantics.SemanticsPropertyKey
import androidx.compose.ui.text.input.ImeAction
import androidx.compose.ui.text.input.KeyboardCapitalization
import androidx.compose.ui.text.input.KeyboardType
import androidx.compose.ui.text.input.VisualTransformation
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp


@Composable
fun textb(){
    // Estado del texto escrito en el TextField
    var texto by remember { mutableStateOf("") }

    TextField(
        value = texto,                     // Texto actual
        onValueChange = { texto = it },    // Qué hacer cuando cambia el texto

        modifier = Modifier
            .fillMaxWidth()                // Ocupa todo el ancho disponible del padre
            .heightIn(min = 60.dp)         // Altura mínima del TextField (crece si es multilinea)

            // Fondo del TextField con color y bordes redondeados
            .background(
                color = Color(0xFFFFF8E1),
                shape = RoundedCornerShape(16.dp)
            )

            // Borde externo del TextField con forma redondeada
            .border(
                width = 2.dp,
                color = Color(0xFFFFAB00),
                shape = RoundedCornerShape(16.dp)
            )

            .padding(4.dp)                 // Espacio EXTERNO al TextField (margin interno)

            // Sombra decorativa alrededor del TextField
            .shadow(
                elevation = 6.dp,
                shape = RoundedCornerShape(16.dp)
            )

            .clip(RoundedCornerShape(16.dp)) // Recorta su contenido con la forma redondeada
            .alpha(1f),                      // Transparencia (1f = totalmente visible)

        // Estilo base del texto dentro del TextField
        textStyle = LocalTextStyle.current.copy(
            color = Color.Black,             // Color del texto
            fontSize = 16.sp                 // Tamaño del texto
        ),

        // Texto que aparece fuera del cuadro cuando no está vacío
        label = { Text("Etiqueta del campo") },

        // Texto gris dentro del cuadro cuando está vacío
        placeholder = { Text("Escribe algo aquí...") },

        // Icono al principio del TextField
        leadingIcon = {
            Icon(Icons.Default.Person, contentDescription = "Icono izquierdo")
        },

        // Icono al final del TextField
        trailingIcon = {
            Icon(Icons.Default.Clear, contentDescription = "Icono derecho")
        },

        singleLine = false,                  // Permite varias líneas
        maxLines = 4,                        // Máximo número de líneas visibles

        enabled = true,                      // El usuario puede escribir
        readOnly = false,                    // Si fuese true, solo se puede seleccionar el texto

        // Para transformar el texto (ej: contraseña → PasswordVisualTransformation)
        visualTransformation = VisualTransformation.None,

        // Configuración del teclado del dispositivo
        keyboardOptions = KeyboardOptions(
            capitalization = KeyboardCapitalization.Sentences,  // Capitaliza inicio de frases
            autoCorrect = true,                                   // Activar autocorrector
            keyboardType = KeyboardType.Text                     // Tipo de teclado (texto)
        ),

        // Qué hacer cuando el usuario presiona la acción del teclado
        keyboardActions = KeyboardActions(
            onDone = { /* Acción al presionar "Done" */ }
        ),

        // Personalización completa de colores del TextField
        colors = TextFieldDefaults.colors(
            unfocusedContainerColor = Color(0xFFFFF8E1),    // Color cuando NO está enfocado
            focusedContainerColor = Color(0xFFFFF3E0),       // Color cuando está enfocado
            focusedIndicatorColor = Color.Transparent,        // Línea inferior (oculta porque usamos borde)
            unfocusedIndicatorColor = Color.Transparent,      // Línea inferior oculta
            cursorColor = Color.Black,                        // Color del cursor
            focusedTextColor = Color.Black,                   // Texto cuando enfocado
            unfocusedTextColor = Color.DarkGray               // Texto cuando NO está enfocado
        )
    )


}