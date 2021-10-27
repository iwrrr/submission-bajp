package com.dicoding.bfaa.submission.ui.tvshow

import androidx.lifecycle.ViewModel
import com.dicoding.bfaa.submission.data.TvShow
import com.dicoding.bfaa.submission.utils.DataDummy

class TvShowViewModel : ViewModel() {

    fun getTvShows(): List<TvShow> = DataDummy.generateDummyTvShows()
}