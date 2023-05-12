package com.example.promoespacioapp.di

import com.example.promoespacioapp.core.Constants
import com.example.promoespacioapp.data.remoto.service.ApiService
import dagger.Module
import dagger.Provides
import dagger.hilt.InstallIn
import dagger.hilt.components.SingletonComponent
import retrofit2.Retrofit
import retrofit2.converter.moshi.MoshiConverterFactory
import javax.inject.Singleton

@Module
@InstallIn(SingletonComponent::class)
object AppModule {
    @Provides
    fun providesBaseUrl ()= Constants.BASE_URL

    @Provides
    fun providesApiService(retrofit: Retrofit) = retrofit.create(ApiService::class.java)

    @Provides
    @Singleton
    fun  providesRetrofit (BASE_URL: String) = Retrofit.Builder()
        .baseUrl(BASE_URL)
        .addConverterFactory(MoshiConverterFactory.create())//GsonConverterFactory.create()
        .build()
}