package com.cacttuseducation.remotedatashowinginrecycleview.api

import com.cacttuseducation.remotedatashowinginrecycleview.model.UserResponse
import retrofit2.Call
import retrofit2.http.GET

interface APIService {

    @GET("users")
    fun getAllUsers() : Call<UserResponse>
}