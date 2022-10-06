package com.example.spacex.domain.repository

import com.example.spacex.domain.model.Company
import retrofit2.http.GET

interface CompanyInfo {

    @GET("v4/company")
    suspend fun getCompanyInfo(): Company
}