package com.mangdewa.gdscunikom.ui

sealed class Screen(val route: String) {
    object Home: Screen("home")
    object Column: Screen("column")
    object Row: Screen("row")
    object Box: Screen("box")

    object Image: Screen("image")
    object Calculator: Screen("calculator")

}
