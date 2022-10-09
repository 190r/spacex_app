package com.example.spacex.domain.use_case.get_many

import com.example.spacex.common.SpacexApiResult
import com.example.spacex.domain.model.Launch
import com.example.spacex.domain.model.LaunchPad
import com.example.spacex.domain.repository.LaunchPads
import kotlinx.coroutines.flow.Flow
import kotlinx.coroutines.flow.flow
import retrofit2.HttpException
import java.io.IOException
import javax.inject.Inject

class GetLaunchPadsUseCase @Inject constructor(
    private val repo: LaunchPads
){
    operator fun invoke(): Flow<SpacexApiResult<List<LaunchPad>>> = flow {
        try {
            emit(SpacexApiResult.Loading<List<LaunchPad>>(data = null))
            val launchPadsList = repo.getLaunchPads()
            emit(SpacexApiResult.Success<List<LaunchPad>>(launchPadsList))
        } catch (e: HttpException) {
            emit(SpacexApiResult.Error<List<LaunchPad>>(e.localizedMessage ?: "Unexpected error"))
        } catch (e: IOException) {
            emit(SpacexApiResult.Error<List<LaunchPad>>("Connection Error"))
        } catch (e: Exception) {
            emit(SpacexApiResult.Error<List<LaunchPad>>(e.localizedMessage ?: "Unrecoverable Error"))
        }
    }

}