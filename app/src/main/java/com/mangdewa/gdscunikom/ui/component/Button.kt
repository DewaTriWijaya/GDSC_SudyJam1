package com.mangdewa.gdscunikom.ui.component

import androidx.compose.material3.Button
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.sp
import com.mangdewa.gdscunikom.R

@Composable
fun ButtonClick(
    text: String,
    onClick: () -> Unit
) {
    Button(
        onClick = onClick
    ) {
        Text(
            text = text,
            fontSize = 16.sp
        )
    }
}

@Composable
fun TextGDSC() {
    Text(
        text = "Dewa"
    )
}

@Preview(showBackground = true)
@Composable
fun PreviwGDSC() {
    TextGDSC()
}

@Preview()
@Composable
fun ButtonPreview() {
    ButtonClick(
        text = stringResource(id = R.string.state_calculator),
        onClick = { }
    )
}