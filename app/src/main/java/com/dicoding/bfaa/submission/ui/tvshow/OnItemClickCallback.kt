package com.dicoding.bfaa.submission.ui.tvshow

import android.widget.ImageView
import android.widget.RatingBar
import android.widget.TextView
import com.dicoding.bfaa.submission.data.TvShow

interface OnItemClickCallback {

    fun onItemClick(
        tvShow: TvShow,
        container: ImageView,
        tvTitle: TextView,
        tvReleaseDate: TextView,
        tvGenre: TextView,
        tvScore: TextView,
        ivPoster: ImageView,
        rbTvShow: RatingBar,
    )
}