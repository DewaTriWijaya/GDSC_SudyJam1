package com.mangdewa.gdscunikom.ui.screen

import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.tooling.preview.Device
import androidx.compose.ui.tooling.preview.Devices
import androidx.compose.ui.tooling.preview.Preview
import androidx.navigation.NavHostController
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.rememberNavController
import com.mangdewa.gdscunikom.R
import com.mangdewa.gdscunikom.ui.Screen
import com.mangdewa.gdscunikom.ui.component.ButtonClick

@Composable
fun ScreenHome(
    navController: NavHostController = rememberNavController()
) {
    NavHost(
        navController = navController,
        startDestination = Screen.Home.route,
        modifier = Modifier
    ) {
        composable(Screen.Home.route){
            Column(
                horizontalAlignment = Alignment.CenterHorizontally,
                verticalArrangement = Arrangement.Center,
                modifier = Modifier
                    .fillMaxSize()
            ) {
                ButtonClick(
                    text = stringResource(R.string.column),
                    onClick = {
                        navController.navigate("column")
                    }
                )
                ButtonClick(
                    text = stringResource(R.string.row),
                    onClick = {
                        navController.navigate("row")
                    }
                )
                ButtonClick(
                    text = stringResource(R.string.box),
                    onClick = {
                        navController.navigate("box")
                    }
                )
                ButtonClick(
                    text = stringResource(R.string.image),
                    onClick = {
                        navController.navigate("image")
                    }
                )
                ButtonClick(
                    text = stringResource(R.string.state_calculator),
                    onClick = {
                        navController.navigate("calculator")
                    }
                )
            }
        }

        composable(Screen.Column.route){
            ScreenColumn()
        }

        composable(Screen.Row.route){
            ScreenRow()
        }

        composable(Screen.Box.route){
            ScreenBox()
        }

        composable(Screen.Image.route){
            ScreenImage()
        }

        composable(Screen.Calculator.route){
            ScreenCalculator()
        }
    }
}

@Preview(
    device = Devices.PIXEL,
    showSystemUi = true
)
@Composable
fun HomePreview() {
    ScreenHome()
}