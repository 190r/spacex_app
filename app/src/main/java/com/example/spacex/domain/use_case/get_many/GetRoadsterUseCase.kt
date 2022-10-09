package com.example.spacex.domain.use_case.get_many

import com.example.spacex.common.SpacexApiResult
import com.example.spacex.domain.model.Roadster
import com.example.spacex.domain.repository.RoadsterTracking
import kotlinx.coroutines.flow.Flow
import kotlinx.coroutines.flow.flow
import retrofit2.HttpException
import java.io.IOException
import javax.inject.Inject

class GetRoadsterUseCase @Inject constructor(
    private val repo: RoadsterTracking
){
    operator fun invoke(): Flow<SpacexApiResult<Roadster>> = flow {
        try {
            emit(SpacexApiResult.Loading<Roadster>(data = null))
            val roadsterLocation = repo.getRoadster()
            emit(SpacexApiResult.Success<Roadster>(roadsterLocation))
        } catch (e: HttpException) {
            emit(SpacexApiResult.Error<Roadster>(e.localizedMessage ?: "Unexpected error"))
        } catch (e: IOException) {
            emit(SpacexApiResult.Error<Roadster>("Connection Error"))
        } catch (e: Exception) {
            emit(SpacexApiResult.Error<Roadster>(e.localizedMessage ?: "Unrecoverable Error"))
        }
    }

}