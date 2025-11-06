package com.example.lemonade.model


import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.setValue
import androidx.compose.ui.graphics.Color
import kotlin.random.Random

class LemonadeState {
    var name by mutableStateOf("")
    var exprimir by mutableStateOf( Random.nextInt(1,10))
    var rating by mutableStateOf(0)
    var gold = Color(0xFFFFD700)
}