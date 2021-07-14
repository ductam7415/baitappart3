package com.tam.myapplication.network

import com.squareup.moshi.Moshi
import com.squareup.moshi.kotlin.reflect.KotlinJsonAdapterFactory
import retrofit2.Retrofit
import retrofit2.converter.moshi.MoshiConverterFactory
import retrofit2.http.Body
import retrofit2.http.GET
import retrofit2.http.POST

private const val BASE_URL = "https://api.github.com/"
private val moshi = Moshi.Builder()
    .add(KotlinJsonAdapterFactory())
    .build()
private val retrofit = Retrofit.Builder()
    .addConverterFactory(MoshiConverterFactory.create())
    .baseUrl(BASE_URL)
    .build()

interface PostService {
    @GET("posts")
    suspend fun getPost(): List<Post>

    @POST("posts")
    suspend fun createPost(@Body post: Post)
}
object service{
    val retrofitService: PostService by lazy { retrofit.create(PostService::class.java) }
}