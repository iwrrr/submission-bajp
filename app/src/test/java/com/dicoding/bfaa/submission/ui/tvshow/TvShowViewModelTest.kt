package com.dicoding.bfaa.submission.ui.tvshow

import org.junit.Assert.*
import org.junit.Before
import org.junit.Test

class TvShowViewModelTest {

    private lateinit var viewModel: TvShowViewModel

    @Before
    fun setup() {
        viewModel = TvShowViewModel()
    }

    @Test
    fun getTvShows() {
        val tvShows = viewModel.getTvShows()
        assertNotNull(tvShows)
        assertEquals(10, tvShows.size)
    }

    @Test
    fun getFakeTvShows() {
        val fakeTvShows = viewModel.getFakeMovies()
        assertNull(fakeTvShows)
    }
}