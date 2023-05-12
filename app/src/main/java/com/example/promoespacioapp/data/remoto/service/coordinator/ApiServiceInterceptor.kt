package com.example.promoespacioapp.data.remoto.service.coordinator

import android.util.Log
import okhttp3.Interceptor
import okhttp3.Response

object ApiServiceInterceptor  : Interceptor {


    const val NEEDS_AUTH_HEADER_KEY =   "needs_authentication"
    private var sessionToken :String? = null
    fun setSessionToken(sessionToken : String){
        if(sessionToken.isNullOrEmpty()) this.sessionToken=""
        else this.sessionToken = sessionToken
    }
    override fun intercept(chain: Interceptor.Chain): Response {
        val request = chain.request()
        val requestBuilder = request.newBuilder()
        if(request.header(NEEDS_AUTH_HEADER_KEY) != null){
            if (sessionToken == null){
                throw java.lang.RuntimeException("Need to be authenticated to perform")
            } else {
                requestBuilder.addHeader("Authorization", "Bearer " + sessionToken!!)
            }
        }
        return chain.proceed(requestBuilder.build())
    }
}