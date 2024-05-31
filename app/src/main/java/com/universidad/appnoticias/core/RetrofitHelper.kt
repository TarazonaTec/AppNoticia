package com.universidad.appnoticias.core

import retrofit2.Retrofit
import retrofit2.converter.gson.GsonConverterFactory

object RetrofitHelper {

    fun getRetrofit():Retrofit{
       return Retrofit.Builder().
       baseUrl("https://private-3dcc0-apinoticias.apiary-mock.com/").
       addConverterFactory(GsonConverterFactory.create()).build()
    }


}