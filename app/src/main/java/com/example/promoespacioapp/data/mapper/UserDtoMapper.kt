package com.example.promoespacioapp.data.mapper

import com.example.promoespacioapp.data.remoto.dto.UserResponseDto
import com.example.promoespacioapp.domain.model.UserToken

class UserDtoMapper {
    fun fromUserResponseDtoToUserTokenDomain(userResponseDto: UserResponseDto) =
        UserToken(userResponseDto.token)
}