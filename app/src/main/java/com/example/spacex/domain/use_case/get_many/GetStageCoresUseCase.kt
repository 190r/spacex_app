package com.example.spacex.domain.use_case.get_many

import com.example.spacex.common.SpacexApiResult
import com.example.spacex.domain.model.Core
import com.example.spacex.domain.repository.StageCores
import kotlinx.coroutines.flow.Flow
import kotlinx.coroutines.flow.flow
import retrofit2.HttpException
import java.io.IOException
import javax.inject.Inject

class GetStageCoresUseCase @Inject constructor(
    private val repo: StageCores
){
    operator fun invoke(): Flow<SpacexApiResult<List<Core>>> = flow {
        try {
            emit(SpacexApiResult.Loading<List<Core>>(data = null))
            val histories = repo.getStageCores()
            emit(SpacexApiResult.Success<List<Core>>(histories))
        } catch (e: HttpException) {
            emit(SpacexApiResult.Error<List<Core>>(e.localizedMessage ?: "Unexpected error"))
        } catch (e: IOException) {
            emit(SpacexApiResult.Error<List<Core>>("Connection Error"))
        } catch (e: Exception) {
            emit(SpacexApiResult.Error<List<Core>>(e.localizedMessage ?: "Unrecoverable Error"))
        }
    }

}