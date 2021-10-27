package com.dicoding.bfaa.submission.ui.movie

import org.junit.Assert.*
import org.junit.Before

import org.junit.Test

class MovieViewModelTest {

    private lateinit var viewModel: MovieViewModel

    @Before
    fun setup() {
        viewModel = MovieViewModel()
    }

    @Test
    fun getMovies() {
        val movies = viewModel.getMovies()
        assertNotNull(movies)
        assertEquals(10, movies.size)
    }

    @Test
    fun getFakeMovies() {
        val fakeMovies = viewModel.getFakeMovies()
        assertNull(fakeMovies)
    }
}