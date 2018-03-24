package com.silicontechnologies.kotlinmvp.post

import com.silicontechnologies.kotlinmvp.Post
import com.silicontechnologies.kotlinmvp.base.BaseView

/**
 * Created by rajajawahar on 23/03/18.
 */
interface PostView : BaseView {

    fun updatePosts(posts: List<Post>)

    /**
     * Displays the loading indicator of the view
     */
    fun showLoading()

    /**
     * Hides the loading indicator of the view
     */
    fun hideLoading()
}