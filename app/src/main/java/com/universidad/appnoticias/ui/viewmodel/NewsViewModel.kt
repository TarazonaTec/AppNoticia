package com.universidad.appnoticias.ui.viewmodel

import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import com.universidad.appnoticias.data.model.News
import com.universidad.appnoticias.domain.GetPosts
import kotlinx.coroutines.launch

class NewsViewModel: ViewModel() {

    val news= MutableLiveData<List<News>>()
    val progressBar=MutableLiveData<Boolean>()

    private val postUseCase= GetPosts()

    fun getNews(){
        viewModelScope.launch {
            progressBar.value=true
            val result =postUseCase.getNews()

            if(!result.isNullOrEmpty()){

                news.postValue(result)
                progressBar.value=false
            }

        }
    }







}