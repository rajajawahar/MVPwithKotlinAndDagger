package com.silicontechnologies.kotlinmvp.di

import android.app.Application
import android.content.Context
import com.silicontechnologies.kotlinmvp.base.BaseView
import dagger.Module
import dagger.Provides

/**
 * Created by rajajawahar on 21/03/18.
 */
@Module
object ContextModule {

    @Provides
    @JvmStatic
    internal fun provideContext(baseView: BaseView): Context {
        return baseView.getContext()
    }

    /**
     * Provides the Application Context
     * @param context Context in which the application is running
     * @return the Application Context to be provided
     */
    @Provides
    @JvmStatic
    internal fun provideApplication(context: Context): Application {
        return context.applicationContext as Application
    }
}