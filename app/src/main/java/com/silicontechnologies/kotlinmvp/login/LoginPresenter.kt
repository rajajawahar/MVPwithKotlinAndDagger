package com.silicontechnologies.kotlinmvp.login

import com.silicontechnologies.kotlinmvp.base.BasePresenter

/**
 * Created by rajajawahar on 10/01/18.
 */
class LoginPresenter : BasePresenter<LoginView> {

    var loginView: LoginView? = null

    override fun attach(v: LoginView) {
        this.loginView = v
    }

    override fun detach() {

    }

    fun showToast() {
        this.loginView?.navigateToHome()
    }
}