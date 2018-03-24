package com.silicontechnologies.kotlinmvp.post

import android.os.Bundle
import com.silicontechnologies.kotlinmvp.Post
import com.silicontechnologies.kotlinmvp.base.BaseActivity

/**
 * Created by rajajawahar on 23/03/18.
 */
class PostActivity : BaseActivity<PostPresenter>(), PostView {

    override fun updatePosts(posts: List<Post>) {

    }

    override fun showLoading() {

    }

    override fun hideLoading() {

    }

    override fun instantiatePresenter() {

    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
    }

}