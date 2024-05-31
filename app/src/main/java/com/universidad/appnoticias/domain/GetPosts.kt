package com.universidad.appnoticias.domain

import com.universidad.appnoticias.data.NewstRepository
import com.universidad.appnoticias.data.model.News

class GetPosts {

    private val repository=NewstRepository()

    suspend fun getNews():List<News>?{
        return  repository.getNews()
    }

}
