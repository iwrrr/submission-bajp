package com.dicoding.bfaa.submission.ui.tvshow

import android.app.Activity
import android.content.Intent
import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.RatingBar
import android.widget.TextView
import androidx.core.app.ActivityOptionsCompat
import androidx.core.util.Pair
import androidx.fragment.app.Fragment
import androidx.fragment.app.viewModels
import androidx.recyclerview.widget.LinearLayoutManager
import com.dicoding.bfaa.submission.data.TvShow
import com.dicoding.bfaa.submission.databinding.FragmentTvShowBinding
import com.dicoding.bfaa.submission.ui.detail.tvshow.DetailTvShowActivity

class TvShowFragment : Fragment(), OnItemClickCallback {

    private lateinit var binding: FragmentTvShowBinding
    private val viewModel: TvShowViewModel by viewModels()

    private lateinit var tvShows: List<TvShow>

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?,
    ): View {
        binding = FragmentTvShowBinding.inflate(inflater, container, false)
        return binding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        tvShows = viewModel.getTvShows()

        val tvShowAdapter = TvShowAdapter(this)
        tvShowAdapter.setTvShows(tvShows)

        binding.rvTvShows.apply {
            layoutManager = LinearLayoutManager(context)
            setHasFixedSize(true)
            adapter = tvShowAdapter
        }
    }

    override fun onItemClick(
        tvShow: TvShow,
        container: ImageView,
        tvTitle: TextView,
        tvReleaseDate: TextView,
        tvGenre: TextView,
        tvScore: TextView,
        ivPoster: ImageView,
        rbTvShow: RatingBar,
    ) {
        val intent = Intent(activity, DetailTvShowActivity::class.java)
        intent.putExtra(DetailTvShowActivity.EXTRA_TVSHOW, tvShow.id)

        val pair1 = Pair.create(container as View, "containerTN")
        val pair2 = Pair.create(ivPoster as View, "posterTN")
        val pair3 = Pair.create(tvTitle as View, "titleTN")
        val pair4 = Pair.create(tvGenre as View, "genreTN")
        val pair5 = Pair.create(tvReleaseDate as View, "releaseTN")
        val pair6 = Pair.create(tvScore as View, "ratingTN")
        val pair7 = Pair.create(rbTvShow as View, "rbTN")

        val optionsCompat = ActivityOptionsCompat.makeSceneTransitionAnimation(
            activity as Activity,
            pair1,
            pair2,
            pair3,
            pair4,
            pair5,
            pair6,
            pair7
        )

        startActivity(intent, optionsCompat.toBundle())
    }
}