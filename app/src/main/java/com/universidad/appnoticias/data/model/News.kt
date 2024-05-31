package com.universidad.appnoticias.data.model

import com.google.gson.annotations.SerializedName
import java.io.Serializable

data class News(val id:Int, val title:String, @SerializedName("description") val description:String, val information:String, val image:String):Serializable