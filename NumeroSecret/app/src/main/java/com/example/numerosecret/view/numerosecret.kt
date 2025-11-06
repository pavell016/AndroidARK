package com.example.numerosecret.view

import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.text.KeyboardOptions
import androidx.compose.material3.Button
import androidx.compose.material3.ButtonDefaults.buttonColors
import androidx.compose.material3.Text
import androidx.compose.material3.TextField
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.input.KeyboardType
import androidx.compose.ui.unit.dp
import kotlin.random.Random

fun comprovacion(num1: Int, num2:Int): String {
    return when {
        num1 == num2 -> "Has encertat!"
        num1 < num2 -> "El número que busques és més petit"
        else -> "El número que busques és més gran"
    }
}
@Composable
fun NumeroSecret(modifier: Modifier = Modifier){
    var random: Int = (0..100).random()
    var texto by remember{ mutableStateOf("") }
    var resultat by remember{ mutableStateOf("") }
    var intentos by remember{ mutableStateOf(0) }
    Column(
        modifier = modifier
            .fillMaxSize()
            .padding(16.dp),
        horizontalAlignment = Alignment.CenterHorizontally,  // centra horizontalmente
        verticalArrangement = Arrangement.Center
    ) {
        Text(text = resultat)
        Spacer(modifier = Modifier.height(16.dp))
        TextField(
            value = texto,
            onValueChange = { texto = it },
            label = { Text(text = "Escriu un numero") },
            keyboardOptions = KeyboardOptions(keyboardType = KeyboardType.Number)
        )
        Spacer(modifier = Modifier.height(16.dp))
        Button(onClick = {
            intentos++
            resultat = comprovacion(random, texto.toInt())
        }) {
            Text("Comprova")
        }
        Spacer(modifier = Modifier.height(16.dp))
        Text(text = "Intentos -> $intentos")
        Spacer(modifier = Modifier.height(16.dp))
        Button(
            onClick = {
                intentos = 0
                random = (0..100).random()
                resultat = ""
                texto = ""
            },
            colors = buttonColors(containerColor = Color.Red)
        ) {
            Text("Reiniciar", color = Color.White)
        }
    }
}
