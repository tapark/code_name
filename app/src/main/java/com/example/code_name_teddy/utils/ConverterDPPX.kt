package com.example.code_name_teddy.utils

import android.content.Context


fun dpToPx(context: Context, dp: Int): Int {
    val density = context.resources.displayMetrics.density
    return (dp * density).toInt()
}

fun pxToDp(context: Context, px: Int): Int {
    val density = context.resources.displayMetrics.density
    return (px / density).toInt()
}