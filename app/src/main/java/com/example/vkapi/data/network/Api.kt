package com.example.vkapi.data.network

import com.example.vkapi.data.response.PostResponse
import com.example.vkapi.data.response.ProfileResponse
import io.reactivex.Observable
import io.reactivex.Single
import retrofit2.http.*

interface Api {

    @FormUrlEncoded
    @POST("login")
    fun login(@Field("email") email: String, @Field("password") password: String): Single<ProfileResponse>

 //  @GET("{userId}/profile")
 //  fun getProfile(@Path("userId") userId: Int): Single<ProfileResponse>

    @GET("posts")
    fun getPosts(): Single<List<PostResponse>>
}