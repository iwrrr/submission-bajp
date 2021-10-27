package com.dicoding.bfaa.submission.ui.movie

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.dicoding.bfaa.submission.data.Movie
import com.dicoding.bfaa.submission.databinding.ItemMovieBinding
import com.dicoding.bfaa.submission.utils.dateFormat
import com.dicoding.bfaa.submission.utils.loadImage

class MovieAdapter(private val callback: OnItemClickCallback) :
    RecyclerView.Adapter<MovieAdapter.MovieViewHolder>() {

    private var listMovies = ArrayList<Movie>()

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): MovieViewHolder {
        val binding = ItemMovieBinding.inflate(LayoutInflater.from(parent.context), parent, false)
        return MovieViewHolder(binding)
    }

    override fun onBindViewHolder(holder: MovieViewHolder, position: Int) {
        val movie = listMovies[position]
        holder.bind(movie)
    }

    override fun getItemCount(): Int = listMovies.size

    fun setMovies(movies: List<Movie>?) {
        if (movies == null) return
        this.listMovies.clear()
        this.listMovies.addAll(movies)
    }

    inner class MovieViewHolder(private val binding: ItemMovieBinding) :
        RecyclerView.ViewHolder(binding.root) {
        fun bind(movie: Movie) {
            with(binding) {
                tvTitle.text = movie.title
                tvReleaseDate.text = dateFormat(movie.releaseDate)
                tvGenre.text = movie.genre
                tvScore.text = movie.score
                rbMovie.rating = movie.score.toFloat()
                ivPoster.loadImage(movie.poster)
                itemView.setOnClickListener {
                    callback.onItemClick(
                        movie,
                        container,
                        tvTitle,
                        tvReleaseDate,
                        tvGenre,
                        tvScore,
                        ivPoster,
                        rbMovie)
                }
            }
        }
    }
}