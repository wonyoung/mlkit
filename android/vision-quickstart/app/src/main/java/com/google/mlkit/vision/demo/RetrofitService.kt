package com.google.mlkit.vision.demo

import retrofit2.Call
import retrofit2.http.Field
import retrofit2.http.FormUrlEncoded
import retrofit2.http.POST

interface RetrofitService {

    @FormUrlEncoded
    @POST("/hello")
    fun hello(
            @Field("text") text: String
    ): Call<Response1>
}