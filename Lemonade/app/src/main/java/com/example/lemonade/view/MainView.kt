package com.example.lemonade.view

import com.example.lemonade.R
import androidx.compose.foundation.Image
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Star
import androidx.compose.material.icons.filled.StarBorder
import androidx.compose.material3.Button
import androidx.compose.material3.Icon
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Text
import androidx.compose.material3.TextField
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.unit.dp
import com.example.lemonade.model.LemonadeState
import kotlin.random.Random


var ls = LemonadeState()
@Composable
fun MainView(modifier: Modifier = Modifier) {
    var steps by remember { mutableStateOf(0) }
    var isNameSubmitted by remember { mutableStateOf(false) }
    Column(
        modifier = modifier
            .fillMaxSize()
            .padding(16.dp),
        horizontalAlignment = Alignment.CenterHorizontally,
        verticalArrangement = Arrangement.Center
    ) {
        when(steps){
            0->{
                TextField(
                    value = ls.name,
                    onValueChange = { ls.name = it },
                    label = { Text(text = "Introdueix el teu nom") },
                    singleLine = true
                )

                Spacer(modifier = Modifier.height(16.dp))

                Button(
                    onClick = {
                        if (ls.name.isNotBlank()) {
                            steps++
                        }
                    }
                ) {
                    Text("Enviar")
                }
            }
            1->{
                Text(
                    text = "Agafa una llimona, ${ls.name}!",
                    style = MaterialTheme.typography.headlineSmall,
                    modifier = Modifier.padding(bottom = 24.dp)
                )
                Image(
                    painter = painterResource(id = R.drawable.lemon_tree), // nombre del archivo sin extensión
                    contentDescription = "lemon tree",
                    modifier = Modifier
                        .size(200.dp)
                        .clip(RoundedCornerShape(16.dp))
                        .clickable{
                            steps++
                        }
                )
            }
            2->{
                var count = 0
                Text(
                    text = "Esprem la llimona ${ls.name}!",
                    style = MaterialTheme.typography.headlineSmall,
                    modifier = Modifier.padding(bottom = 24.dp)
                )
                Image(
                    painter = painterResource(id = R.drawable.lemon_squeeze),
                    contentDescription = "lemon tree",
                    modifier = Modifier
                        .size(200.dp)
                        .clip(RoundedCornerShape(16.dp))
                        .clickable{
                            count++
                            if (count >= ls.exprimir){
                                steps++
                            }
                        }
                )
            }
            3->{
                Text(
                    text = "Beu-te-la  ${ls.name}!",
                    style = MaterialTheme.typography.headlineSmall,
                    modifier = Modifier.padding(bottom = 24.dp)
                )
                Image(
                    painter = painterResource(id = R.drawable.lemon_drink),
                    contentDescription = "lemon tree",
                    modifier = Modifier
                        .size(200.dp)
                        .clip(RoundedCornerShape(16.dp))
                        .clickable{
                            steps++
                        }
                )
                Spacer(Modifier.height(8.dp))
                Row(
                    horizontalArrangement = Arrangement.Center,
                    verticalAlignment = Alignment.CenterVertically
                ) {
                    for (i in 1..5) {
                        Icon(
                            imageVector = if (i <= ls.rating) {
                                Icons.Default.Star
                            }else {
                                Icons.Default.StarBorder
                            }, // canvia les icones segons quina icona es la que es selecciona
                            contentDescription = "Estrella $i",
                            modifier = Modifier
                                .size(40.dp)
                                .clickable { ls.rating = i },
                            tint = ls.gold
                        )
                    }
                }
            }
            4->{
                Text(
                    text = "Comença de nou ${ls.name}!",
                    style = MaterialTheme.typography.headlineSmall,
                    modifier = Modifier.padding(bottom = 24.dp)
                )
                Image(
                    painter = painterResource(id = R.drawable.lemon_restart),
                    contentDescription = "lemon tree",
                    modifier = Modifier
                        .size(200.dp)
                        .clip(RoundedCornerShape(16.dp))
                        .clickable{
                            ls.exprimir = Random.nextInt(1,10)
                            ls.rating=0
                            steps=0
                        }
                )
            }
        }
    }
}
