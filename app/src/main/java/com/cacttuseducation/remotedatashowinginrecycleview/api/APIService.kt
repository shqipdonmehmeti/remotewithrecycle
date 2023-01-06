package com.cacttuseducation.remotedatashowinginrecycleview.api

import com.cacttuseducation.remotedatashowinginrecycleview.model.Product
import com.cacttuseducation.remotedatashowinginrecycleview.model.UserResponse
import retrofit2.Call
import retrofit2.http.Body
import retrofit2.http.GET
import retrofit2.http.POST

interface APIService {

    @GET("users")
    fun getAllUsers() : Call<UserResponse>

    @POST("products/add")
    fun addNewProduct(
        @Body product: Product
    ) : Call<Product>

}