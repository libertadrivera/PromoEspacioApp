package com.example.promoespacioapp.data.remoto.service.coordinator

import android.util.Log
import com.example.promoespacioapp.R
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.withContext
import java.lang.Exception
import java.net.UnknownHostException

suspend fun <T> callServiceCoordinator(
    call: suspend () -> T
): ApiResponseStatus<T>
        = withContext(Dispatchers.IO){
    try {
        ApiResponseStatus.Success(call())
    } catch (e: Exception){
        ApiResponseStatus.Error("Download Error")

    } catch (e: UnknownHostException){
        ApiResponseStatus.Error("There is no Internet")
    }
}