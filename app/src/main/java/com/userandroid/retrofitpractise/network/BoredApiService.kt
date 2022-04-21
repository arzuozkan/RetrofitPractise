package com.userandroid.retrofitpractise.network

import com.google.gson.GsonBuilder
import retrofit2.Call
import retrofit2.Response
import retrofit2.Retrofit
import retrofit2.converter.gson.GsonConverterFactory
import retrofit2.http.GET

private const val BASE_URL =
    "https://www.boredapi.com/api/"

private val retrofit =Retrofit.Builder()
    .addConverterFactory(GsonConverterFactory.create())
    .baseUrl(BASE_URL)
    .build()

interface BoredApiDAO {
    @GET("activity")
    suspend fun getActivity():ActivityModel
}

object BoredApi{
    val retrofitService : BoredApiDAO by lazy {
        retrofit.create(BoredApiDAO::class.java)
    }
}