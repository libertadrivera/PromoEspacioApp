package com.example.promoespacioapp.data.repository

import com.example.promoespacioapp.data.mapper.UserDtoMapper
import com.example.promoespacioapp.data.remoto.dto.TokenRequestDto
import com.example.promoespacioapp.data.remoto.dto.UserRequestDto
import com.example.promoespacioapp.data.remoto.service.LoginApi
import com.example.promoespacioapp.data.remoto.service.coordinator.ApiResponseStatus
import com.example.promoespacioapp.data.remoto.service.coordinator.callServiceCoordinator
import javax.inject.Inject

class LoginRepositoryImpl @Inject constructor(){
    suspend fun doLogin(
        username: String,
        password: String
    ) : ApiResponseStatus<Any> = callServiceCoordinator {
        val userRequestDto = UserRequestDto(username,password)
        val loginApiResponse = LoginApi.retrofitService.doLogin(userRequestDto)
        val userResponseDtoMapper = UserDtoMapper()
        userResponseDtoMapper.fromUserResponseDtoToUserTokenDomain(loginApiResponse)
    }



}
