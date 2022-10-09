package com.example.spacex.domain.repository

import com.example.spacex.domain.model.Query
import com.example.spacex.domain.model.Payload
import retrofit2.http.Body
import retrofit2.http.GET
import retrofit2.http.POST
import retrofit2.http.Path

interface Payloads {

    @GET("v4/payloads")
    suspend fun getPayloads(): List<Payload>

    @GET("v4/payloads/{id}")
    suspend fun getPayloadsById(@Path("id") id: String): Payload

    @POST("v4/payloads/query")
    suspend fun queryPayloads(@Body query: Query): List<Payload>

}