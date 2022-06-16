package com.co.eve.Navigation.Ui.viewModel

import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.setValue
import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import com.co.eve.Navigation.Ui.model.ConfigApi
import com.co.eve.Navigation.Ui.model.Eve
import com.co.eve.Navigation.Ui.network.ApiService
import kotlinx.coroutines.launch

open class EveViewModel : ViewModel() {
    var genderListResponse:List<ConfigApi> by mutableStateOf(listOf())
    var errorMessage: String by mutableStateOf("")
    fun getGenderList() {
        viewModelScope.launch {
            val apiService = ApiService.getInstance()
            try {
                val configList = apiService.getEve()
                genderListResponse = configList
            }
            catch (e: Exception) {
                errorMessage = e.message.toString()
            }
        }
    }
}