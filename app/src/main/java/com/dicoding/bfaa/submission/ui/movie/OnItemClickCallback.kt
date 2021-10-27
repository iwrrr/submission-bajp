package com.dicoding.bfaa.submission.ui.movie

import android.widget.ImageView
import android.widget.RatingBar
import android.widget.TextView
import com.dicoding.bfaa.submission.data.Movie

interface OnItemClickCallback {

    fun onItemClick(
        movie: Movie,
        container: ImageView,
        tvTitle: TextView,
        tvReleaseDate: TextView,
        tvGenre: TextView,
        tvScore: TextView,
        ivPoster: ImageView,
        rbMovie: RatingBar,
    )
}