package com.mangdewa.gdscunikom.ui.data

import java.text.NumberFormat

fun calculateTip(amount: Double, tipPercent: Double = 15.0): String {
    val tip = tipPercent / 100 * amount
    return NumberFormat.getCurrencyInstance().format(tip)
}
