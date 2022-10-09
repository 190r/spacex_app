package com.example.spacex.domain.use_case.get_many

import com.example.spacex.common.SpacexApiResult
import com.example.spacex.domain.model.Launch
import com.example.spacex.domain.model.LaunchPad
import com.example.spacex.domain.model.Payload
import com.example.spacex.domain.repository.LaunchPads
import com.example.spacex.domain.repository.Payloads
import kotlinx.coroutines.flow.Flow
import kotlinx.coroutines.flow.flow
import retrofit2.HttpException
import java.io.IOException
import javax.inject.Inject

class GetPayloadsUseCase @Inject constructor(
    private val repo: Payloads
){
    operator fun invoke(): Flow<SpacexApiResult<List<Payload>>> = flow {
        try {
            emit(SpacexApiResult.Loading<List<Payload>>(data = null))
            val launchPadsList = repo.getPayloads()
            emit(SpacexApiResult.Success<List<Payload>>(launchPadsList))
        } catch (e: HttpException) {
            emit(SpacexApiResult.Error<List<Payload>>(e.localizedMessage ?: "Unexpected error"))
        } catch (e: IOException) {
            emit(SpacexApiResult.Error<List<Payload>>("Connection Error"))
        } catch (e: Exception) {
            emit(SpacexApiResult.Error<List<Payload>>(e.localizedMessage ?: "Unrecoverable Error"))
        }
    }

}