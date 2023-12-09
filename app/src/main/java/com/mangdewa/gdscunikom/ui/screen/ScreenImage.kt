package com.mangdewa.gdscunikom.ui.screen

import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Column
import androidx.compose.runtime.Composable
import androidx.compose.ui.res.painterResource
import coil.compose.AsyncImage
import com.mangdewa.gdscunikom.R

@Composable
fun ScreenImage() {
    Column {
        ImageLocal()
        ImageOnline()
    }
}

@Composable
fun ImageLocal() {
    Image(
        painter = painterResource(id = R.drawable.android),
        contentDescription = null,
    )
}

@Composable
fun ImageOnline() {
    AsyncImage(
        model = "https://images.radio.com/podcast/5741486d63.jpg",
        contentDescription = null,
    )
}