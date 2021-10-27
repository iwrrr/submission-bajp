package com.dicoding.bfaa.submission.ui.movie

import androidx.lifecycle.ViewModel
import com.dicoding.bfaa.submission.data.Movie
import com.dicoding.bfaa.submission.utils.DataDummy

class MovieViewModel : ViewModel() {

    fun getMovies(): List<Movie> = DataDummy.generateDummyMovies()
}