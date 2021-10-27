package com.dicoding.bfaa.submission.ui.detail.movie

import android.os.Bundle
import androidx.activity.viewModels
import androidx.appcompat.app.AppCompatActivity
import com.dicoding.bfaa.submission.data.Movie
import com.dicoding.bfaa.submission.databinding.ActivityDetailMovieBinding
import com.dicoding.bfaa.submission.utils.dateFormat
import com.dicoding.bfaa.submission.utils.loadImage

class DetailMovieActivity : AppCompatActivity() {

    private lateinit var binding: ActivityDetailMovieBinding
    private val viewModel: DetailMovieViewModel by viewModels()

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityDetailMovieBinding.inflate(layoutInflater)
        setContentView(binding.root)

        val extras = intent.extras
        val movieId = extras?.getString(EXTRA_MOVIE)
        movieId?.let { viewModel.setSelectedMovie(it) }
        getDetailMovie(viewModel.getMovie())
    }

    private fun getDetailMovie(movie: Movie) {
        binding.apply {
            tvTitle.text = movie.title
            tvGenre.text = movie.genre
            tvDuration.text = movie.duration
            tvReleaseDate.text = dateFormat(movie.releaseDate)
            tvScore.text = movie.score
            tvOverview.text = movie.overview
            rbMovie.rating = movie.score.toFloat()
            ivPoster.loadImage(movie.poster)
        }
    }

    companion object {
        const val EXTRA_MOVIE = "extra_movie"
    }
}