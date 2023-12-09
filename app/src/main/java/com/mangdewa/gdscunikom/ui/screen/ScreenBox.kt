package com.mangdewa.gdscunikom.ui.screen

import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.size
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Close
import androidx.compose.material3.Card
import androidx.compose.material3.Icon
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.unit.dp
import com.mangdewa.gdscunikom.R

@Composable
fun ScreenBox() {
    Box {
        Card {
            Box(modifier = Modifier.size(200.dp)) {
                Image(
                    painter = painterResource(id = R.drawable.android),
                    contentDescription = "Example Image",
                    modifier = Modifier.size(200.dp),
                    contentScale = ContentScale.Crop
                )
                Icon(
                    modifier = Modifier.align(Alignment.TopEnd),
                    imageVector = Icons.Default.Close,
                    contentDescription = "Home Icon"
                )
            }
        }
    }
}