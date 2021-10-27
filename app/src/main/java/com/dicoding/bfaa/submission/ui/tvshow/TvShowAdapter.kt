package com.dicoding.bfaa.submission.ui.tvshow

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.dicoding.bfaa.submission.data.TvShow
import com.dicoding.bfaa.submission.databinding.ItemMovieBinding
import com.dicoding.bfaa.submission.utils.loadImage

class TvShowAdapter(private val callback: OnItemClickCallback) :
    RecyclerView.Adapter<TvShowAdapter.TvShowViewHolder>() {

    private var listTvShows = ArrayList<TvShow>()

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): TvShowViewHolder {
        val binding = ItemMovieBinding.inflate(LayoutInflater.from(parent.context), parent, false)
        return TvShowViewHolder(binding)
    }

    override fun onBindViewHolder(holder: TvShowViewHolder, position: Int) {
        val tvShow = listTvShows[position]
        holder.bind(tvShow)
    }

    override fun getItemCount(): Int = listTvShows.size

    fun setTvShows(movies: List<TvShow>?) {
        if (movies == null) return
        this.listTvShows.clear()
        this.listTvShows.addAll(movies)
    }

    inner class TvShowViewHolder(private val binding: ItemMovieBinding) :
        RecyclerView.ViewHolder(binding.root) {
        fun bind(tvShow: TvShow) {
            with(binding) {
                tvTitle.text = tvShow.title
                tvReleaseDate.text = tvShow.releaseDate
                tvGenre.text = tvShow.genre
                tvScore.text = tvShow.score
                rbMovie.rating = tvShow.score.toFloat()
                ivPoster.loadImage(tvShow.poster)
                itemView.setOnClickListener {
                    callback.onItemClick(
                        tvShow,
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