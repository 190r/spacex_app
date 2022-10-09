package com.example.spacex.domain.repository

import com.example.spacex.domain.model.Capsule
import retrofit2.http.GET
import retrofit2.http.POST
import retrofit2.http.Path
import com.example.spacex.domain.model.Query
import retrofit2.http.Body

interface Capsules {

    @GET("v4/capsules")
    suspend fun getAllCapsules(): List<Capsule>

    @GET("v4/capsules/{id}")
    suspend fun getCapsuleById(@Path("id") id: String): Capsule

    @POST("v4/capsules/query")
    suspend fun queryCapsules(@Body query: Query): List<Capsule>

}