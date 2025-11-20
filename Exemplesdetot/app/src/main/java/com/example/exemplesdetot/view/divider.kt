package com.example.exemplesdetot.view

import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxHeight
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.Divider
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.unit.dp

@Composable
fun DividerExample() {

    Column(){
        Divider(
            modifier = Modifier
                .fillMaxWidth()           // Ocupar todo el espacio horizontal
                .height(3.dp)             // Grosor del Divider
                .padding(horizontal = 16.dp)
                .clip(RoundedCornerShape(50)), // Bordes redondeados del divider
            color = Color(0xFF2196F3)     // Color azul
        )
        Spacer(modifier = Modifier.height(20.dp))
        Row(
            modifier = Modifier
                .fillMaxWidth()
                .height(60.dp)
                .padding(16.dp),
            verticalAlignment = Alignment.CenterVertically
        ) {

            Text("Izquierda")

            Divider(
                modifier = Modifier
                    .fillMaxHeight()
                    .width(2.dp)
                    .padding(horizontal = 16.dp),
                color = Color.Gray
            )

            Text("Derecha")
        }
    }


}
