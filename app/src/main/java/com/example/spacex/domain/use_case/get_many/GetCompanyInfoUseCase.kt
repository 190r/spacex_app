package com.example.spacex.domain.use_case.get_many

import com.example.spacex.common.SpacexApiResult
import com.example.spacex.domain.model.History
import com.example.spacex.domain.repository.SpaceXHistory
import kotlinx.coroutines.flow.Flow
import kotlinx.coroutines.flow.flow
import retrofit2.HttpException
import java.io.IOException
import javax.inject.Inject

class GetCompanyInfoUseCase @Inject constructor(
    private val repo: SpaceXHistory
){

    operator fun invoke(): Flow<SpacexApiResult<List<History>>> = flow {
        try {
            emit(SpacexApiResult.Loading<List<History>>(data = null))
            val histories = repo.getHistoryItems()
            emit(SpacexApiResult.Success<List<History>>(histories))
        } catch (e: HttpException) {
            emit(SpacexApiResult.Error<List<History>>(e.localizedMessage ?: "Unexpected error"))
        } catch (e: IOException) {
            emit(SpacexApiResult.Error<List<History>>("Connection Error"))
        } catch (e: Exception) {
            emit(SpacexApiResult.Error<List<History>>(e.localizedMessage ?: "Unrecoverable Error"))
        }
    }

}