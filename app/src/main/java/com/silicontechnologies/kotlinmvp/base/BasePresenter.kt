package com.silicontechnologies.kotlinmvp.base

/**
 * Created by rajajawahar on 10/01/18.
 */
interface BasePresenter<in V : BaseView> {

    fun attachView(view: V)

    fun detachView()
}