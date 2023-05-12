package com.example.promoespacioapp.presentation.menu

import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.material.Card
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp

@Composable
private fun LabelHeader(){
    Card(
        modifier = Modifier
            .padding(8.dp, 1.dp, 8.dp, 8.dp)
            .size(56.dp)
            .clickable {

            }, shape = CircleShape, elevation = 3.dp,
        //backgroundColor = color
    ){}
}