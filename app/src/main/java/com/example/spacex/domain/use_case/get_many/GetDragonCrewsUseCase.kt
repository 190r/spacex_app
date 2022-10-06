package com.example.spacex.domain.use_case.get_many

import com.example.spacex.common.SpacexApiResult
import com.example.spacex.domain.model.Crew
import com.example.spacex.domain.repository.DragonCrew
import kotlinx.coroutines.flow.Flow
import kotlinx.coroutines.flow.flow
import retrofit2.HttpException
import java.io.IOException
import javax.inject.Inject

class GetDragonCrewsUseCase @Inject constructor(
    private val repo: DragonCrew
){
    operator fun invoke(): Flow<SpacexApiResult<List<Crew>>> = flow {
        try {
            emit(SpacexApiResult.Loading<List<Crew>>(data = null))
            val histories = repo.getAllCrews()
            emit(SpacexApiResult.Success<List<Crew>>(histories))
        } catch (e: HttpException) {
            emit(SpacexApiResult.Error<List<Crew>>(e.localizedMessage ?: "Unexpected error"))
        } catch (e: IOException) {
            emit(SpacexApiResult.Error<List<Crew>>("Connection Error"))
        } catch (e: Exception) {
            emit(SpacexApiResult.Error<List<Crew>>(e.localizedMessage ?: "Unrecoverable Error"))
        }
    }

}