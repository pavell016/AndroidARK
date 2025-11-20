package com.example.cardtesting.view

import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.Card
import androidx.compose.material3.CardDefaults
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.painter.Painter
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp

@Composable
fun BusinessCard(
    image: Painter,
    name: String,
    position: String,
    phone: String,
    email: String
) {
    Card(
        modifier = Modifier
            .fillMaxWidth()
            .padding(16.dp),
        shape = RoundedCornerShape(12.dp),
        elevation = CardDefaults.cardElevation(8.dp)
    ) {
        Row(
            modifier = Modifier
                .padding(16.dp)
                .fillMaxWidth(),
            horizontalArrangement = Arrangement.SpaceEvenly, // o Arrangement.Center
            verticalAlignment = Alignment.CenterVertically
        ) {
            // Imagen a la izquierda
            Image(
                painter = image,
                contentDescription = "Profile Picture",
                modifier = Modifier
                    .size(80.dp)
            )

            Spacer(modifier = Modifier.width(16.dp))

            // Texto a la derecha
            Column {
                Text(
                    text = name,
                    style = MaterialTheme.typography.titleMedium,
                    fontSize = 20.sp
                )
                Text(
                    text = position,
                    style = MaterialTheme.typography.bodyMedium,
                    fontSize = 16.sp
                )
                Spacer(modifier = Modifier.height(8.dp))
                Text(
                    text = "Tel: $phone",
                    style = MaterialTheme.typography.bodySmall,
                    fontSize = 14.sp
                )
                Text(
                    text = "Email: $email",
                    style = MaterialTheme.typography.bodySmall,
                    fontSize = 14.sp
                )
            }
        }
    }
}