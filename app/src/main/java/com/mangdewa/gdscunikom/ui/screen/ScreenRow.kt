package com.mangdewa.gdscunikom.ui.screen

import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.width
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.outlined.AccountBox
import androidx.compose.material3.Card
import androidx.compose.material3.DropdownMenuItem
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.ExposedDropdownMenuBox
import androidx.compose.material3.ExposedDropdownMenuDefaults
import androidx.compose.material3.Icon
import androidx.compose.material3.Text
import androidx.compose.material3.TextField
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Devices
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp

@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun ScreenRow() {
    var expanded by remember { mutableStateOf(false) }
    //val contextForToast = LocalContext.current.applicationContext
    val arrangement = listOf("Space Between", "Space Around", "Space Evenly", "Top", "Center", "Bottom")
    var selectedOptionText by remember { mutableStateOf(arrangement[0]) }

    Column(
        horizontalAlignment = Alignment.CenterHorizontally
    ) {
        ExposedDropdownMenuBox(
            expanded = expanded,
            onExpandedChange = {
                expanded = !expanded
            },
            modifier = Modifier
                .padding(top = 16.dp)
        ) {
            TextField(
                readOnly = true,
                value = selectedOptionText,
                onValueChange = { },
                label = { Text(text = "Label") },
                trailingIcon = {
                    ExposedDropdownMenuDefaults.TrailingIcon(expanded = expanded)
                },
                modifier = Modifier.menuAnchor()
            )
            ExposedDropdownMenu(
                expanded = expanded,
                onDismissRequest = {
                    expanded = false
                }
            ) {
                arrangement.forEach {
                    DropdownMenuItem(
                        onClick = {
                            selectedOptionText = it
                            expanded = false
                        },
                        text = {
                            Text(text = it)
                        }
                    )
                }
            }
        }

        when(selectedOptionText){
            "Space Between" -> ItemRow(vertical = Arrangement.SpaceBetween)
            "Space Around" -> ItemRow(vertical = Arrangement.SpaceAround)
            "Space Evenly" -> ItemRow(vertical = Arrangement.SpaceEvenly)
            "End" -> ItemRow(vertical = Arrangement.End)
            "Center" -> ItemRow(vertical = Arrangement.Center)
            "Start" -> ItemRow(vertical = Arrangement.Start)
        }
    }
}


@Composable
fun ItemRow(
    vertical: Arrangement.Horizontal
) {
    Row(
        horizontalArrangement = vertical,
        verticalAlignment = Alignment.CenterVertically,
        modifier = Modifier
            .fillMaxSize()
    ) {
        ItemCardRow(title = "A")
        ItemCardRow(title = "B")
        ItemCardRow(title = "C")
    }
}

@Composable
fun ItemCardRow(
    title: String
) {
    Card(
        modifier = Modifier
            .width(100.dp)
            .height(120.dp)
            .padding(8.dp)
    ) {
        Column(
            verticalArrangement = Arrangement.Center,
            horizontalAlignment = Alignment.CenterHorizontally,
            modifier = Modifier
                .fillMaxSize()
        ) {
            Text(
                text = title,
                modifier = Modifier
                    .padding(8.dp)
            )
        }
    }
}

@Preview(showSystemUi = true, device = Devices.PIXEL)
@Composable
fun RowPreview() {
    ScreenRow()
}