package com.example.spacex.common

sealed class SpacexApiResult<S>(val data: S? = null, val message: String? = null) {
    /**
     * API result on success
     */
    class Success<S>(data: S) : SpacexApiResult<S>(data)

    /**
     * Recoverable error
     */
    class Error<E>(message: String?, error: E? = null): SpacexApiResult<E>(error, message)

    /**
     * Unrecoverable error
     */
    class Exception<E>(message: String?, error: E? = null): SpacexApiResult<E>(error, message)

    /**
     * Data loading in progress
     */
    class Loading<S>(data: S? = null): SpacexApiResult<S>(data)
}
