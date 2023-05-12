package com.example.promoespacioapp.data.repository

import com.example.promoespacioapp.data.remoto.service.LoginApi
import com.example.promoespacioapp.data.remoto.service.coordinator.ApiResponseStatus
import com.example.promoespacioapp.data.remoto.service.coordinator.callServiceCoordinator

class MenuRepositoryImpl {
    suspend fun getAllMenu(
        username: String
    ) : ApiResponseStatus<Any> = callServiceCoordinator {
        val menuApiResponse = LoginApi.retrofitService.getAllMenu(username)
        menuApiResponse


    }
}