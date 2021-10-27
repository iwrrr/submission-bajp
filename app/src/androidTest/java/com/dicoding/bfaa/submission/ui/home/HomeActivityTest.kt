package com.dicoding.bfaa.submission.ui.home

import androidx.recyclerview.widget.RecyclerView
import androidx.test.espresso.Espresso.onView
import androidx.test.espresso.action.ViewActions.click
import androidx.test.espresso.action.ViewActions.swipeLeft
import androidx.test.espresso.assertion.ViewAssertions.matches
import androidx.test.espresso.contrib.RecyclerViewActions
import androidx.test.espresso.matcher.ViewMatchers.*
import androidx.test.ext.junit.rules.ActivityScenarioRule
import com.dicoding.bfaa.submission.R
import com.dicoding.bfaa.submission.utils.DataDummy
import com.dicoding.bfaa.submission.utils.dateFormat
import org.junit.FixMethodOrder
import org.junit.Rule
import org.junit.Test
import org.junit.runners.MethodSorters

@FixMethodOrder(MethodSorters.NAME_ASCENDING)
class HomeActivityTest {

    private val dummyMovie = DataDummy.generateDummyMovies()
    private val dummyTvShow = DataDummy.generateDummyTvShows()

    @get:Rule
    var activityRule = ActivityScenarioRule(HomeActivity::class.java)

    @Test
    fun testALoadMovies() {
        onView(withId(R.id.rvMovies)).check(matches(isDisplayed()))
        onView(withId(R.id.rvMovies)).perform(RecyclerViewActions.scrollToPosition<RecyclerView.ViewHolder>(dummyMovie.size))
    }

    @Test
    fun testBLoadDetailMovie() {
        onView(withId(R.id.rvMovies)).perform(RecyclerViewActions.actionOnItemAtPosition<RecyclerView.ViewHolder>(0, click()))
        onView(withId(R.id.tvTitle)).check(matches(isDisplayed()))
        onView(withId(R.id.tvTitle)).check(matches(withText(dummyMovie[0].title)))
        onView(withId(R.id.tvReleaseDate)).check(matches(isDisplayed()))
        onView(withId(R.id.tvReleaseDate)).check(matches(withText(dateFormat(dummyMovie[0].releaseDate))))
        onView(withId(R.id.tvGenre)).check(matches(isDisplayed()))
        onView(withId(R.id.tvGenre)).check(matches(withText(dummyMovie[0].genre)))
        onView(withId(R.id.tvScore)).check(matches(isDisplayed()))
        onView(withId(R.id.tvScore)).check(matches(withText(dummyMovie[0].score)))
        onView(withId(R.id.tvDuration)).check(matches(isDisplayed()))
        onView(withId(R.id.tvDuration)).check(matches(withText(dummyMovie[0].duration)))
        onView(withId(R.id.tvOverview)).check(matches(isDisplayed()))
        onView(withId(R.id.tvOverview)).check(matches(withText(dummyMovie[0].overview)))
        onView(withId(R.id.ivPoster)).check(matches(isDisplayed()))
    }

    @Test
    fun testCLoadTvShows() {
        onView(withId(R.id.viewPager)).perform(swipeLeft())
        onView(withId(R.id.rvTvShows)).check(matches(isDisplayed()))
        onView(withId(R.id.rvTvShows)).perform(RecyclerViewActions.scrollToPosition<RecyclerView.ViewHolder>(dummyTvShow.size))
    }

    @Test
    fun testDLoadDetailTvShow() {
        onView(withId(R.id.viewPager)).perform(swipeLeft()).check(matches(isDisplayed()))
        onView(withId(R.id.rvTvShows)).perform(RecyclerViewActions.actionOnItemAtPosition<RecyclerView.ViewHolder>(0, click()))
        onView(withId(R.id.tvTitle)).check(matches(isDisplayed()))
        onView(withId(R.id.tvTitle)).check(matches(withText(dummyTvShow[0].title)))
        onView(withId(R.id.tvReleaseDate)).check(matches(isDisplayed()))
        onView(withId(R.id.tvReleaseDate)).check(matches(withText(dummyTvShow[0].releaseDate)))
        onView(withId(R.id.tvGenre)).check(matches(isDisplayed()))
        onView(withId(R.id.tvGenre)).check(matches(withText(dummyTvShow[0].genre)))
        onView(withId(R.id.tvScore)).check(matches(isDisplayed()))
        onView(withId(R.id.tvScore)).check(matches(withText(dummyTvShow[0].score)))
        onView(withId(R.id.tvDuration)).check(matches(isDisplayed()))
        onView(withId(R.id.tvDuration)).check(matches(withText(dummyTvShow[0].duration)))
        onView(withId(R.id.tvOverview)).check(matches(isDisplayed()))
        onView(withId(R.id.tvOverview)).check(matches(withText(dummyTvShow[0].overview)))
        onView(withId(R.id.ivPoster)).check(matches(isDisplayed()))
    }
}