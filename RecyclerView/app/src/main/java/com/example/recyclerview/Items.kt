package com.example.recyclerview

import androidx.annotation.DrawableRes

data class Items(
    val id: Int,
    val title: String,
    val description: String,
    @DrawableRes
    val image: Int
) {

}