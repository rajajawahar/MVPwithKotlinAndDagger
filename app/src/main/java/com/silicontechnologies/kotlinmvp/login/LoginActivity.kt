package com.silicontechnologies.kotlinmvp.login

import android.os.Bundle
import android.widget.Toast
import android.widget.Toast.*
import com.silicontechnologies.kotlinmvp.R
import com.silicontechnologies.kotlinmvp.base.BaseActivity
import java.io.UnsupportedEncodingException
import java.nio.charset.Charset

/**
 * Created by rajajawahar on 10/01/18.
 */
class LoginActivity :
        BaseActivity<LoginView, LoginPresenter>(),
        LoginView {

    override var mPresenter: LoginPresenter = LoginPresenter()

    override fun navigateToHome() {
        makeText(this, "Login View Successfully", LENGTH_SHORT).show()
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        mPresenter.attach(this as LoginView)
        mPresenter.showToast()
    }

}