package com.mangdewa.gdscunikom.ui.screen

import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp

@Composable
fun Surface() {
    Column {
        Surface(
            modifier = Modifier.size(300.dp).padding(20.dp),
            color = MaterialTheme.colorScheme.primary,
            shape = RoundedCornerShape(32.dp),
            shadowElevation = 16.dp
        ) {
            Text("Hello Jetpack Compose", Modifier.padding(16.dp))
        }
    }
}