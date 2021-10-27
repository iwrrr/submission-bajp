package com.dicoding.bfaa.submission.ui.detail.movie

import android.app.Application
import com.dicoding.bfaa.submission.utils.DataDummy
import org.junit.Assert.assertEquals
import org.junit.Assert.assertNotNull
import org.junit.Before
import org.junit.Test

class DetailMovieViewModelTest {

    private lateinit var viewModel: DetailMovieViewModel

    private val dummyMovie = DataDummy.generateDummyMovies()[0]
    private val movieId = dummyMovie.id

    @Before
    fun setup() {
        viewModel = DetailMovieViewModel(Application())
        viewModel.setSelectedMovie(movieId)
    }

    @Test
    fun getMovie() {
        viewModel.setSelectedMovie(dummyMovie.id)
        val movie = viewModel.getMovie()
        assertNotNull(movie)
        assertEquals(dummyMovie.id, movie.id)
        assertEquals(dummyMovie.title, movie.title)
        assertEquals(dummyMovie.releaseDate, movie.releaseDate)
        assertEquals(dummyMovie.genre, movie.genre)
        assertEquals(dummyMovie.score, movie.score)
        assertEquals(dummyMovie.duration, movie.duration)
        assertEquals(dummyMovie.overview, movie.overview)
        assertEquals(dummyMovie.poster, movie.poster)
    }
}