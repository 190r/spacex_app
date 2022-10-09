package com.example.spacex.domain.use_case.get_one

import com.example.spacex.common.SpacexApiResult
import com.example.spacex.domain.model.Company
import com.example.spacex.domain.model.History
import com.example.spacex.domain.repository.CompanyInfo
import com.example.spacex.domain.repository.SpaceXHistory
import kotlinx.coroutines.flow.Flow
import kotlinx.coroutines.flow.flow
import retrofit2.HttpException
import java.io.IOException
import javax.inject.Inject

class GetCompanyInfoUseCase @Inject constructor(
    private val repo: CompanyInfo
){

    operator fun invoke(): Flow<SpacexApiResult<Company>> = flow {
        try {
            emit(SpacexApiResult.Loading<Company>(data = null))
            val histories = repo.getCompanyInfo()
            emit(SpacexApiResult.Success<Company>(histories))
        } catch (e: HttpException) {
            emit(SpacexApiResult.Error<Company>(e.localizedMessage ?: "Unexpected error"))
        } catch (e: IOException) {
            emit(SpacexApiResult.Error<Company>("Connection Error"))
        } catch (e: Exception) {
            emit(SpacexApiResult.Error<Company>(e.localizedMessage ?: "Unrecoverable Error"))
        }
    }

}