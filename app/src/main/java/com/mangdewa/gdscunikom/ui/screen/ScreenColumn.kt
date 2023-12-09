package com.mangdewa.gdscunikom.ui.screen

import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
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
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.runtime.getValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Devices
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp

@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun ScreenColumn() {
    var expanded by remember { mutableStateOf(false) }
    //val contextForToast = LocalContext.current.applicationContext

    val arrangement = listOf("Equal Weight", "Space Between", "Space Around", "Space Evenly", "Top", "Center", "Bottom")
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
            "Equal Weight" -> ItemColumnsWeight()
            "Space Between" -> ItemColumns(vertical = Arrangement.SpaceBetween)
            "Space Around" -> ItemColumns(vertical = Arrangement.SpaceAround)
            "Space Evenly" -> ItemColumns(vertical = Arrangement.SpaceEvenly)
            "Top" -> ItemColumns(vertical = Arrangement.Top)
            "Center" -> ItemColumns(vertical = Arrangement.Center)
            "Bottom" -> ItemColumns(vertical = Arrangement.Bottom)
        }
    }
}


@Composable
fun ItemColumns(
    vertical: Arrangement.Vertical,
) {
    Column(
        verticalArrangement = vertical,
        modifier = Modifier
            .fillMaxSize()
    ) {
        ItemCard(
            title = "Dewa",
        )
        ItemCard(
            title = "Zulfi",
        )
        ItemCard(
            title = "Ariq",
        )
    }
}

@Composable
fun ItemColumnsWeight() {
    Column(
        modifier = Modifier
            .fillMaxSize()
    ) {
        ItemCard(
            title = "Dewa",
            modifier = Modifier
                .weight(1f)
        )
        ItemCard(
            title = "Zulfi",
            modifier = Modifier
                .weight(1f)
        )
        ItemCard(
            title = "Ariq",
            modifier = Modifier
                .weight(1f)
        )
    }
}

@Composable
fun ItemCard(
    title: String,
    modifier: Modifier = Modifier
) {
    Card(
        modifier = modifier
            .height(50.dp)
            .fillMaxWidth()
            .padding(8.dp)
    ) {
        Row {
            Icon(
                imageVector = Icons.Outlined.AccountBox,
                contentDescription = null,
                modifier = Modifier
                    .padding(8.dp)
            )
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
fun ColumnPreview() {
    ScreenColumn()
}