package com.universidad.appnoticias.data.network

import com.universidad.appnoticias.core.RetrofitHelper
import com.universidad.appnoticias.data.model.News
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.withContext

class NewsService {

    private val retrofit= RetrofitHelper.getRetrofit()

    suspend fun getNews():List<News>{
       return withContext(Dispatchers.IO){
           val response=retrofit.create(NewsApiClient::class.java).getDataNews()
           response.body()?: emptyList()
       }

    }


}