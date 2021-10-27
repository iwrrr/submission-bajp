package com.dicoding.bfaa.submission.ui.detail.tvshow

import android.app.Application
import androidx.lifecycle.AndroidViewModel
import com.dicoding.bfaa.submission.data.TvShow
import com.dicoding.bfaa.submission.utils.DataDummy

class DetailTvShowViewModel(application: Application) : AndroidViewModel(application) {

    private lateinit var tvShowId: String
    private lateinit var tvShow: TvShow

    fun setSelectedTvShow(tvShowId: String) {
        this.tvShowId = tvShowId
    }

    fun getTvShow(): TvShow {
        val tvShowEntities = DataDummy.generateDummyTvShows()
        for (tvShowEntity in tvShowEntities) {
            if (tvShowEntity.id == tvShowId) {
                tvShow = tvShowEntity
            }
        }
        return tvShow
    }
}