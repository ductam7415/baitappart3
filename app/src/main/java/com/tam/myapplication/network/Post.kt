package com.tam.myapplication.network

import com.squareup.moshi.Json

data class Post(
    val id : String,
    val login : String,
    val type : String,
    val url: String,
    @Json(name = "github") val infor : String
)