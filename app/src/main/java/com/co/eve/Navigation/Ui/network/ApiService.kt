package com.co.eve.Navigation.Ui.network

import com.co.eve.Navigation.Ui.model.ConfigApi
import com.co.eve.Navigation.Ui.model.Eve
import retrofit2.Retrofit
import retrofit2.converter.gson.GsonConverterFactory
import retrofit2.http.GET

interface ApiService {

    @GET(ApiConstants.END_POINT)
    suspend fun getEve() : List<ConfigApi>


    companion object {
        var apiService: ApiService? = null
        fun getInstance() : ApiService {
            if (apiService == null) {
                apiService = Retrofit.Builder()
                    .baseUrl(ApiConstants.BASE_URL)
                    .addConverterFactory(GsonConverterFactory.create())
                    .build().create(ApiService::class.java)
            }
            return apiService!!
        }
    }
}