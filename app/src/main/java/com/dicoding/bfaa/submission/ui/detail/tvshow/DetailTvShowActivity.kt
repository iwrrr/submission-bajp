package com.dicoding.bfaa.submission.ui.detail.tvshow

import android.os.Bundle
import androidx.activity.viewModels
import androidx.appcompat.app.AppCompatActivity
import com.dicoding.bfaa.submission.data.TvShow
import com.dicoding.bfaa.submission.databinding.ActivityDetailMovieBinding
import com.dicoding.bfaa.submission.utils.loadImage

class DetailTvShowActivity : AppCompatActivity() {

    private lateinit var binding: ActivityDetailMovieBinding
    private val viewModel: DetailTvShowViewModel by viewModels()

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityDetailMovieBinding.inflate(layoutInflater)
        setContentView(binding.root)

        val extras = intent.extras
        val tvShowId = extras?.getString(EXTRA_TVSHOW)
        tvShowId?.let { viewModel.setSelectedTvShow(it) }
        getDetailMovie(viewModel.getTvShow())
    }

    private fun getDetailMovie(tvShow: TvShow) {
        binding.apply {
            tvTitle.text = tvShow.title
            tvGenre.text = tvShow.genre
            tvDuration.text = tvShow.duration
            tvReleaseDate.text = tvShow.releaseDate
            tvScore.text = tvShow.score
            tvOverview.text = tvShow.overview
            rbMovie.rating = tvShow.score.toFloat()
            ivPoster.loadImage(tvShow.poster)
        }
    }

    companion object {
        const val EXTRA_TVSHOW = "extra_tv_show"
    }
}