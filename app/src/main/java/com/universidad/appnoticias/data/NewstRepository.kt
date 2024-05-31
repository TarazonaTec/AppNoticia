package com.universidad.appnoticias.data

import com.universidad.appnoticias.data.model.News
import com.universidad.appnoticias.data.network.NewsService

class NewstRepository {

    private val newsServicer=NewsService()

    suspend fun getNews():List<News>{
          return newsServicer.getNews()

    }


}