package com.example.promoespacioapp.presentation.login


import android.util.Log
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.setValue
import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import com.example.promoespacioapp.data.remoto.service.coordinator.ApiResponseStatus
import com.example.promoespacioapp.data.remoto.service.coordinator.ApiServiceInterceptor
import com.example.promoespacioapp.data.repository.LoginRepositoryImpl
import com.example.promoespacioapp.domain.model.UserToken
import dagger.hilt.android.lifecycle.HiltViewModel
import kotlinx.coroutines.launch
import javax.inject.Inject

@HiltViewModel
class LoginViewModel @Inject constructor(
): ViewModel() {
    private val _user_email = MutableLiveData<String>()
    val user_email: LiveData<String> = _user_email


    private val _password = MutableLiveData<String>()
    val password: LiveData<String> = _password

    private val _usertoken = MutableLiveData<String>()
    val usertoken: LiveData<String> = _usertoken

    private val _isValidUserAndPassword = MutableLiveData<Boolean>()
    val isValidUserAndPassword: LiveData<Boolean> = _isValidUserAndPassword

    private val _status = MutableLiveData<ApiResponseStatus<Any>>()
    val status: LiveData<ApiResponseStatus<Any>>
        get() = _status


    private val loginRepository = LoginRepositoryImpl()

    var state by mutableStateOf(LoginState())
        private set

    init {
        doLogin("administrator", "qsTYF*Q@46YvqRkz")
    }

    fun onLoginChanged(user_email: String, password: String) {
        _user_email.value = user_email
        _password.value = password
        _isValidUserAndPassword.value = validateUserAndPassword(user_email, password)

    }

    fun validateUserAndPassword(user_email: String, password: String): Boolean =
        !user_email.isNullOrEmpty() && !password.isNullOrEmpty()






    fun doLogin(user_email: String, password: String) {
        viewModelScope.launch {
            _status.value = ApiResponseStatus.Loading()
            handleResponseLoginStatus(loginRepository.doLogin("administrator", "qsTYF*Q@46YvqRkz"))

        }
    }

    private fun handleResponseLoginStatus(apiResponseStatus: ApiResponseStatus<Any>) {
        _status.value = apiResponseStatus

        when (_status.value) {
            is ApiResponseStatus.Success -> {
                val token_data = apiResponseStatus.data
                state = state.copy(token_data = token_data as UserToken?)
                ApiServiceInterceptor.setSessionToken(token_data?.token!!)
            }
            is ApiResponseStatus.Error -> {
                state = state.copy(isError = apiResponseStatus.message)
            }
            is ApiResponseStatus.Loading -> {
                state = state.copy(isLoading = apiResponseStatus.loading)
            }
            else -> {

            }
        }
    }


}

