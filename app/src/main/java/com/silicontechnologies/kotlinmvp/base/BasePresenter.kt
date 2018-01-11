package com.silicontechnologies.kotlinmvp.base

import android.view.View

/**
 * Created by rajajawahar on 10/01/18.
 */
interface BasePresenter<in V : BaseView> {

    fun attach(v: V)

    fun detach()

}