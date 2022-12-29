package com.cacttuseducation.remotedatashowinginrecycleview.helpers

import com.cacttuseducation.remotedatashowinginrecycleview.api.APIService
import retrofit2.Retrofit
import retrofit2.converter.gson.GsonConverterFactory

object Singletons {
    private const val BASE_URL = "https://dummyjson.com/"

    fun provideRetrofitInstance() : APIService {
        return Retrofit.Builder()
            .addConverterFactory(GsonConverterFactory.create())
            .baseUrl(BASE_URL)
            .build()
            .create(APIService::class.java)
    }
}