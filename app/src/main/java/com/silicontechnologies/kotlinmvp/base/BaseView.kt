package com.silicontechnologies.kotlinmvp.base

import android.content.Context
import android.support.annotation.StringRes

/**
 * Created by rajajawahar on 10/01/18.
 */
interface BaseView {

    fun getContext(): Context

    fun showError(error: String?)

    fun showError(@StringRes stringResId: Int)

    fun showMessage(@StringRes srtResId: Int)

    fun showMessage(message: String)
}