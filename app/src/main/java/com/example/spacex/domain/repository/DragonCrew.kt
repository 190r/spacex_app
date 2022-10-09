package com.example.spacex.domain.repository

import com.example.spacex.domain.model.Crew
import com.example.spacex.domain.model.Query
import retrofit2.http.Body
import retrofit2.http.GET
import retrofit2.http.POST
import retrofit2.http.Path

interface DragonCrew {

    @GET("v4/crew")
    suspend fun getAllCrews(): List<Crew>

    @GET("v4/crew/{id}")
    suspend fun getCrewById(@Path("id") id: String): Crew

    @POST("v4/crew/query")
    suspend fun queryCrew(@Body query: Query): List<Crew>

}