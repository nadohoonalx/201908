package com.lee.kioskour

import retrofit2.Call
import retrofit2.http.GET

interface CustomerApi {

    @GET("/cam/deter")
    fun getCustomer(): Call<Customer>

    @GET("/cam/signup")
    fun setCustomer(): Call<Customer>
}