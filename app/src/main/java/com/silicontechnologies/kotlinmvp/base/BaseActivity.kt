package com.silicontechnologies.kotlinmvp.base

import android.content.Context
import android.os.Bundle
import android.support.v7.app.AppCompatActivity
import android.widget.Toast

/**
 * Created by rajajawahar on 10/01/18.
 */
abstract class BaseActivity<in V : BaseView, in T : BasePresenter<V>> : AppCompatActivity(),
        BaseView {


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        mPresenter.attachView(this as V)

    }

    override fun getContext(): Context = this

    override fun showError(error: String?) {
        Toast.makeText(this, error, Toast.LENGTH_LONG).show()
    }

    override fun showError(stringResId: Int) {
        Toast.makeText(this, stringResId, Toast.LENGTH_LONG).show()
    }

    override fun showMessage(srtResId: Int) {
        Toast.makeText(this, srtResId, Toast.LENGTH_LONG).show()
    }

    override fun showMessage(message: String) {
        Toast.makeText(this, message, Toast.LENGTH_LONG).show()
    }

    override fun onDestroy() {
        super.onDestroy()
    }

    abstract fun instantiatePresenter()

}