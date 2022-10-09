package com.example.spacex.domain.use_case.get_many

import com.example.spacex.common.SpacexApiResult
import com.example.spacex.domain.model.Ship
import com.example.spacex.domain.model.Starlink
import com.example.spacex.domain.repository.Ships
import com.example.spacex.domain.repository.Starlinks
import kotlinx.coroutines.flow.Flow
import kotlinx.coroutines.flow.flow
import retrofit2.HttpException
import java.io.IOException
import javax.inject.Inject

class GetStarlinkDataUseCase @Inject constructor(
    private val repo: Starlinks
){
    operator fun invoke(): Flow<SpacexApiResult<List<Starlink>>> = flow {
        try {
            emit(SpacexApiResult.Loading<List<Starlink>>(data = null))
            val shipsList = repo.getStarlinks()
            emit(SpacexApiResult.Success<List<Starlink>>(shipsList))
        } catch (e: HttpException) {
            emit(SpacexApiResult.Error<List<Starlink>>(e.localizedMessage ?: "Unexpected error"))
        } catch (e: IOException) {
            emit(SpacexApiResult.Error<List<Starlink>>("Connection Error"))
        } catch (e: Exception) {
            emit(SpacexApiResult.Error<List<Starlink>>(e.localizedMessage ?: "Unrecoverable Error"))
        }
    }

}