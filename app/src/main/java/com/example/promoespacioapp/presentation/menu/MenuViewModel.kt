package com.example.promoespacioapp.presentation.menu

import android.util.Log
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.setValue
import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import com.example.promoespacioapp.data.remoto.dto.NodeDto
import com.example.promoespacioapp.data.remoto.service.coordinator.ApiResponseStatus
import com.example.promoespacioapp.data.repository.MenuRepositoryImpl
import com.example.promoespacioapp.domain.model.ItemDashboard
import dagger.hilt.android.lifecycle.HiltViewModel
import kotlinx.coroutines.launch
import javax.inject.Inject

@HiltViewModel
class MenuViewModel  @Inject constructor(
): ViewModel() {
    private val _status = MutableLiveData<ApiResponseStatus<Any>>()
    val status: LiveData<ApiResponseStatus<Any>>
        get() = _status

    private val menuRepository = MenuRepositoryImpl()

    var state by mutableStateOf(MenuState())
        private set

    private val _itemsDashboards : MutableList<ItemDashboard> = arrayListOf()


 init {
     getAllMenu("administrator")
 }
    fun getAllMenu(user_email: String) {
        viewModelScope.launch {
            _status.value = ApiResponseStatus.Loading()
            handleResponseMenuStatus(menuRepository.getAllMenu("administrator"))
        }
    }

    private fun handleResponseMenuStatus(apiResponseStatus: ApiResponseStatus<Any>) {
        _status.value = apiResponseStatus

        when (_status.value) {
            is ApiResponseStatus.Success -> {
                val menuList = apiResponseStatus.data
                state = state.copy(menuList = menuList as NodeDto?)
                inspectMenuList()
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

    private fun inspectMenuList(){
        val result=state.menuList?.categories?.toList()?.groupBy { it.section}?.count()

    }

    enum class TargetCategoriesMenu {
        HEADER,
        SERVICE,
        OTHER
    }
}

