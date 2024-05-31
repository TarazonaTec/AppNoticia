package com.universidad.appnoticias.data.network

import com.universidad.appnoticias.data.model.News
import retrofit2.Response
import retrofit2.http.GET

interface NewsApiClient {
    @GET("questions")
   suspend fun getDataNews():Response<List<News>>

}