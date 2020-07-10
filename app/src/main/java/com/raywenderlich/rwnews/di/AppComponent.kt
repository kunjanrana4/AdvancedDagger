package com.raywenderlich.rwnews.di

import com.raywenderlich.news.android.ui.list.NewsListFragment
import com.raywenderlich.rwnews.ui.detail.NewsDetailFragment
import dagger.Component
import javax.inject.Singleton

@Component(modules = [AppModule::class])
interface AppComponent {

  fun inject1(frag: NewsListFragment)

  fun inject(frag: NewsDetailFragment)
}