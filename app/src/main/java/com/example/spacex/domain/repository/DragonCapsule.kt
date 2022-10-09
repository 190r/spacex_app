package com.example.spacex.domain.repository

import com.example.spacex.domain.model.Dragon
import com.example.spacex.domain.model.Query
import retrofit2.http.Body
import retrofit2.http.GET
import retrofit2.http.POST
import retrofit2.http.Path

interface DragonCapsule {

    @GET("v4/dragons")
    suspend fun getDragonCapsules(): List<Dragon>

    @GET("v4/dragons/{id}")
    suspend fun getDragonCapsuleById(@Path("id") id: String): Dragon

    @POST("v4/dragons/query")
    suspend fun queryCrew(@Body query: Query): List<Dragon>

}