package com.example.spacex.domain.use_case.get_many

import com.example.spacex.common.SpacexApiResult
import com.example.spacex.domain.model.Launch
import com.example.spacex.domain.model.LaunchPad
import com.example.spacex.domain.model.Payload
import com.example.spacex.domain.model.Rocket
import com.example.spacex.domain.repository.LaunchPads
import com.example.spacex.domain.repository.Payloads
import com.example.spacex.domain.repository.Rockets
import kotlinx.coroutines.flow.Flow
import kotlinx.coroutines.flow.flow
import retrofit2.HttpException
import java.io.IOException
import javax.inject.Inject

class GetRocketsUseCase @Inject constructor(
    private val repo: Rockets
){
    operator fun invoke(): Flow<SpacexApiResult<List<Rocket>>> = flow {
        try {
            emit(SpacexApiResult.Loading<List<Rocket>>(data = null))
            val launchPadsList = repo.getRockets()
            emit(SpacexApiResult.Success<List<Rocket>>(launchPadsList))
        } catch (e: HttpException) {
            emit(SpacexApiResult.Error<List<Rocket>>(e.localizedMessage ?: "Unexpected error"))
        } catch (e: IOException) {
            emit(SpacexApiResult.Error<List<Rocket>>("Connection Error"))
        } catch (e: Exception) {
            emit(SpacexApiResult.Error<List<Rocket>>(e.localizedMessage ?: "Unrecoverable Error"))
        }
    }

}