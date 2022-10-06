package com.example.spacex.domain.use_case.get_many

import com.example.spacex.common.SpacexApiResult
import com.example.spacex.domain.model.Dragon
import com.example.spacex.domain.repository.DragonCapsule
import kotlinx.coroutines.flow.Flow
import kotlinx.coroutines.flow.flow
import retrofit2.HttpException
import java.io.IOException
import javax.inject.Inject

class GetDragonsUseCase @Inject constructor(
    private val repo: DragonCapsule
){
    operator fun invoke(): Flow<SpacexApiResult<List<Dragon>>> = flow {
        try {
            emit(SpacexApiResult.Loading<List<Dragon>>(data = null))
            val histories = repo.getDragonCapsules()
            emit(SpacexApiResult.Success<List<Dragon>>(histories))
        } catch (e: HttpException) {
            emit(SpacexApiResult.Error<List<Dragon>>(e.localizedMessage ?: "Unexpected error"))
        } catch (e: IOException) {
            emit(SpacexApiResult.Error<List<Dragon>>("Connection Error"))
        } catch (e: Exception) {
            emit(SpacexApiResult.Error<List<Dragon>>(e.localizedMessage ?: "Unrecoverable Error"))
        }
    }

}