package com.example.spacex.domain.use_case.get_many

import com.example.spacex.common.SpacexApiResult
import com.example.spacex.domain.model.Capsule
import com.example.spacex.domain.model.LandPad
import com.example.spacex.domain.repository.Capsules
import com.example.spacex.domain.repository.LandPads
import kotlinx.coroutines.flow.Flow
import kotlinx.coroutines.flow.flow
import retrofit2.HttpException
import java.io.IOException
import javax.inject.Inject

class GetLandPadsUseCase @Inject constructor(
    private val repo: LandPads
){
    operator fun invoke(): Flow<SpacexApiResult<List<LandPad>>> = flow {
        try {
            emit(SpacexApiResult.Loading<List<LandPad>>(data = null))
            val histories = repo.getLandPads()
            emit(SpacexApiResult.Success<List<LandPad>>(histories))
        } catch (e: HttpException) {
            emit(SpacexApiResult.Error<List<LandPad>>(e.localizedMessage ?: "Unexpected error"))
        } catch (e: IOException) {
            emit(SpacexApiResult.Error<List<LandPad>>("Connection Error"))
        } catch (e: Exception) {
            emit(SpacexApiResult.Error<List<LandPad>>(e.localizedMessage ?: "Unrecoverable Error"))
        }
    }

}