package com.dicoding.bfaa.submission.ui.home

import android.os.Bundle
import androidx.annotation.StringRes
import androidx.appcompat.app.AppCompatActivity
import com.dicoding.bfaa.submission.R
import com.dicoding.bfaa.submission.databinding.ActivityHomeBinding
import com.google.android.material.tabs.TabLayoutMediator

class HomeActivity : AppCompatActivity() {

    private lateinit var binding: ActivityHomeBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityHomeBinding.inflate(layoutInflater)
        setContentView(binding.root)

        setViewPager()
    }

    private fun setViewPager() {
        val sectionsPagerAdapter = SectionsPagerAdapter(supportFragmentManager, lifecycle)

        val viewPager = binding.viewPager
        viewPager.adapter = sectionsPagerAdapter

        val tabs = binding.tabs
        TabLayoutMediator(tabs, viewPager) { tab, position ->
            tab.text = resources.getString(TAB_TITLES[position])
        }.attach()
    }

    companion object {
        @StringRes
        private val TAB_TITLES = intArrayOf(
            R.string.tab_movies,
            R.string.tab_tv_shows
        )
    }
}