package com.dicoding.bfaa.submission.ui.detail.movie

import android.app.Application
import androidx.lifecycle.AndroidViewModel
import com.dicoding.bfaa.submission.data.Movie
import com.dicoding.bfaa.submission.utils.DataDummy

class DetailMovieViewModel(application: Application) : AndroidViewModel(application) {

    private lateinit var movieId: String
    private lateinit var movie: Movie

    fun setSelectedMovie(movieId: String) {
        this.movieId = movieId
    }

    fun getMovie(): Movie {
        val movieEntities = DataDummy.generateDummyMovies()
        for (movieEntity in movieEntities) {
            if (movieEntity.id == movieId) {
                movie = movieEntity
            }
        }
        return movie
    }
}