package com.example.promoespacioapp.data.remoto.service

import com.example.promoespacioapp.core.Constants.BASE_URL
import com.example.promoespacioapp.core.Constants.GET_ALL_MENU
import com.example.promoespacioapp.core.Constants.LOGIN
import com.example.promoespacioapp.data.remoto.dto.NodeDto
import com.example.promoespacioapp.data.remoto.dto.TokenRequestDto
import com.example.promoespacioapp.data.remoto.dto.UserRequestDto
import com.example.promoespacioapp.data.remoto.dto.UserResponseDto
import com.example.promoespacioapp.data.remoto.service.coordinator.ApiServiceInterceptor
import com.squareup.moshi.Moshi
import okhttp3.OkHttpClient
import retrofit2.Retrofit
import retrofit2.converter.moshi.MoshiConverterFactory
import retrofit2.http.*

private val okHttpClient =  OkHttpClient
    .Builder()
    .addInterceptor(ApiServiceInterceptor)
    .build()


private val retrofit = Retrofit.Builder()
    .client(okHttpClient)
    .baseUrl(BASE_URL)
    .addConverterFactory(MoshiConverterFactory.create())//GsonConverterFactory.create()
    .build()

interface ApiService {

    @POST(LOGIN)
    suspend fun doLogin( @Body userRequest: UserRequestDto): UserResponseDto

    @Headers("${ApiServiceInterceptor.NEEDS_AUTH_HEADER_KEY}: true")
    @GET(GET_ALL_MENU)
    suspend fun getAllMenu(
        @Path("idUser") idUser: String
        //,@Header("Authorization") authHeader : String
    ): NodeDto  //Response<NodeDto>

}

object LoginApi{
    val retrofitService: ApiService by lazy {
        retrofit.create(ApiService::class.java)
    }
}