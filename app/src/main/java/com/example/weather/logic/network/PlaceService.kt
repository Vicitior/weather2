package com.example.weather.logic.network

import com.example.weather.logic.model.PlaceResponse
import com.example.weather.weatherApplication
import retrofit2.Call
import retrofit2.http.GET
import retrofit2.http.Query

interface PlaceService {
    @GET("v2/place?token=${weatherApplication.TOKEN}&lang=zh_CN")
    fun searchPlaces(@Query("query")query:String): Call<PlaceResponse.PlaceResponse>
}