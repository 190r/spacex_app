package com.example.spacex.domain.use_case.get_many

import com.example.spacex.common.SpacexApiResult
import com.example.spacex.domain.model.Capsule
import com.example.spacex.domain.repository.Capsules
import kotlinx.coroutines.flow.Flow
import kotlinx.coroutines.flow.flow
import retrofit2.HttpException
import java.io.IOException
import javax.inject.Inject

class GetCapsulesUseCase @Inject constructor(
    private val repo: Capsules
){
    operator fun invoke(): Flow<SpacexApiResult<List<Capsule>>> = flow {
        try {
            emit(SpacexApiResult.Loading<List<Capsule>>(data = null))
            val histories = repo.getAllCapsules()
            emit(SpacexApiResult.Success<List<Capsule>>(histories))
        } catch (e: HttpException) {
            emit(SpacexApiResult.Error<List<Capsule>>(e.localizedMessage ?: "Unexpected error"))
        } catch (e: IOException) {
            emit(SpacexApiResult.Error<List<Capsule>>("Connection Error"))
        } catch (e: Exception) {
            emit(SpacexApiResult.Error<List<Capsule>>(e.localizedMessage ?: "Unrecoverable Error"))
        }
    }

}