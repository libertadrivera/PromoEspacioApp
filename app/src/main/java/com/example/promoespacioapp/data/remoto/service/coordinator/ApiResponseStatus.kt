package com.example.promoespacioapp.data.remoto.service.coordinator

sealed class ApiResponseStatus<T>(
    val data: T? = null,
    val message: String? = "",
    val loading: Boolean? = null
){
    class Success<T>(data: T? = null) : ApiResponseStatus<T>(data = data)
    class Error<T>( message: String? = "") : ApiResponseStatus<T>( message = message)
    class Loading<T>(loading: Boolean? = null) : ApiResponseStatus<T>(loading = loading)

}
