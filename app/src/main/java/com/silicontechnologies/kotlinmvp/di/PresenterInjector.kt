package com.silicontechnologies.kotlinmvp.di

import com.silicontechnologies.kotlinmvp.post.PostPresenter
import dagger.Component
import javax.inject.Singleton

/**
 * Created by rajajawahar on 23/03/18.
 */
@Singleton
@Component(modules = [(ContextModule::class), (NetworkModule::class)])
interface PresenterInjector {

    fun inject(presenter: PostPresenter)

}