package com.example.spacex.domain.repository

import com.example.spacex.domain.model.Core
import com.example.spacex.domain.model.Query
import retrofit2.http.Body
import retrofit2.http.GET
import retrofit2.http.POST
import retrofit2.http.Path

interface StageCores {

    @GET("v4/cores")
    suspend fun getStageCores(): List<Core>

    @GET("v4/cores/{id}")
    suspend fun getStageCoreById(@Path("id") id: String): Core

    @POST("v4/cores/query")
    suspend fun queryStageCores(@Body query: Query): List<Core>
}