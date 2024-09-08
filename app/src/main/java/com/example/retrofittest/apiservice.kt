package com.example.retrofittest

import retrofit2.http.GET

interface apiservice {
    @GET("albums")
    suspend fun getalbum():List<album>
}