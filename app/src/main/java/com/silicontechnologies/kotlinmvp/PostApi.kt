package com.silicontechnologies.kotlinmvp

import io.reactivex.Observable
import retrofit2.http.GET

/**
 * Created by rajajawahar on 20/03/18.
 */
interface PostApi {
    @GET("/posts")
    fun getPosts(): Observable<List<Post>>
}