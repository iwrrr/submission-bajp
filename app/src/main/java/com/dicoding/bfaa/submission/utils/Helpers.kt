package com.dicoding.bfaa.submission.utils

import android.annotation.SuppressLint
import android.widget.ImageView
import com.bumptech.glide.Glide
import java.text.SimpleDateFormat

@SuppressLint("SimpleDateFormat")
fun dateFormat(releaseDate: String?): String? {
    val inputPattern = "dd/MM/yyyy"
    val outputPattern = "MMM dd, yyyy"

    val inputFormat = SimpleDateFormat(inputPattern)
    val outputFormat = SimpleDateFormat(outputPattern)

    val inputDate = inputFormat.parse(releaseDate!!)

    return outputFormat.format(inputDate ?: "")
}

fun ImageView.loadImage(image: Int) {
    Glide.with(this.context)
        .load(image)
        .into(this)
}