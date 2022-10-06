package com.example.spacex.domain.use_case.get_many

import com.example.spacex.domain.repository.Launches
import com.example.spacex.common.SpacexApiResult
import com.example.spacex.domain.model.Launch
import kotlinx.coroutines.flow.Flow
import kotlinx.coroutines.flow.flow
import retrofit2.HttpException
import java.io.IOException
import javax.inject.Inject

class GetLaunchesUseCase @Inject constructor(
    private val repo: Launches
){
    operator fun invoke(): Flow<SpacexApiResult<List<Launch>>> = flow {
        try {
            emit(SpacexApiResult.Loading<List<Launch>>(data = null))
            val histories = repo.getLaunchPads()
            emit(SpacexApiResult.Success<List<Launch>>(histories))
        } catch (e: HttpException) {
            emit(SpacexApiResult.Error<List<Launch>>(e.localizedMessage ?: "Unexpected error"))
        } catch (e: IOException) {
            emit(SpacexApiResult.Error<List<Launch>>("Connection Error"))
        } catch (e: Exception) {
            emit(SpacexApiResult.Error<List<Launch>>(e.localizedMessage ?: "Unrecoverable Error"))
        }
    }

}