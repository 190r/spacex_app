package com.example.spacex.domain.use_case.get_many

import com.example.spacex.common.SpacexApiResult
import com.example.spacex.domain.model.Ship
import com.example.spacex.domain.repository.Ships
import kotlinx.coroutines.flow.Flow
import kotlinx.coroutines.flow.flow
import retrofit2.HttpException
import java.io.IOException
import javax.inject.Inject

class GetShipsUseCase @Inject constructor(
    private val repo: Ships
){
    operator fun invoke(): Flow<SpacexApiResult<List<Ship>>> = flow {
        try {
            emit(SpacexApiResult.Loading<List<Ship>>(data = null))
            val shipsList = repo.getShipsList()
            emit(SpacexApiResult.Success<List<Ship>>(shipsList))
        } catch (e: HttpException) {
            emit(SpacexApiResult.Error<List<Ship>>(e.localizedMessage ?: "Unexpected error"))
        } catch (e: IOException) {
            emit(SpacexApiResult.Error<List<Ship>>("Connection Error"))
        } catch (e: Exception) {
            emit(SpacexApiResult.Error<List<Ship>>(e.localizedMessage ?: "Unrecoverable Error"))
        }
    }

}