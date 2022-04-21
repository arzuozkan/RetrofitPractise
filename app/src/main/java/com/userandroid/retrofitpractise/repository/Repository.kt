package com.userandroid.retrofitpractise.repository

import com.userandroid.retrofitpractise.network.ActivityModel
import com.userandroid.retrofitpractise.network.BoredApi
import retrofit2.Call

class Repository {

    suspend fun getActivity(): ActivityModel {
        return BoredApi.retrofitService.getActivity()
    }
}