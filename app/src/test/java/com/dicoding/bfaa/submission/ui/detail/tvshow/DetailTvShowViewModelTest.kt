package com.dicoding.bfaa.submission.ui.detail.tvshow

import android.app.Application
import com.dicoding.bfaa.submission.utils.DataDummy
import org.junit.Assert.assertEquals
import org.junit.Assert.assertNotNull
import org.junit.Before
import org.junit.Test

class DetailTvShowViewModelTest {

    private lateinit var viewModel: DetailTvShowViewModel

    private val dummyTvShow = DataDummy.generateDummyTvShows()[0]
    private val tvShowId = dummyTvShow.id

    @Before
    fun setup() {
        viewModel = DetailTvShowViewModel(Application())
        viewModel.setSelectedTvShow(tvShowId)
    }

    @Test
    fun getTvShow() {
        viewModel.setSelectedTvShow(dummyTvShow.id)
        val tvShow = viewModel.getTvShow()
        assertNotNull(tvShow)
        assertEquals(dummyTvShow.id, tvShow.id)
        assertEquals(dummyTvShow.title, tvShow.title)
        assertEquals(dummyTvShow.releaseDate, tvShow.releaseDate)
        assertEquals(dummyTvShow.genre, tvShow.genre)
        assertEquals(dummyTvShow.score, tvShow.score)
        assertEquals(dummyTvShow.duration, tvShow.duration)
        assertEquals(dummyTvShow.overview, tvShow.overview)
        assertEquals(dummyTvShow.poster, tvShow.poster)
    }
}