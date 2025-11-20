package com.example.exemplesdetot.view

import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.rememberScrollState
import androidx.compose.foundation.verticalScroll
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp

@Composable
fun all(){
    Column(
        //modifier = Modifier
        //    .fillMaxSize()
        //    .verticalScroll(rememberScrollState())   // Hace scrolleable toda la columna
        //    .padding(16.dp)                          // Padding general
    ) {
        //columnex()
        //boxex()
        //rowex()
        //buttex()
        //textb()
        //Activity()
        //CardExample()
        //BadgeBoxExample()
        //DividerExample()
        //DropdownMenuExample()
        SliderExample()
    }
}