package com.universidad.appnoticias.adapter

import android.view.View
import androidx.recyclerview.widget.RecyclerView
import com.universidad.appnoticias.data.model.News
import com.universidad.appnoticias.databinding.ItemNoticiaBinding

class NewsViewHolder(item:View):RecyclerView.ViewHolder(item) {
    val binding=ItemNoticiaBinding.bind(item)

    fun render(post:News, onClickListener:(News)->Unit){
        binding.txtTitle.text=post.title
        binding.txtDescription.text=post.description

        itemView.setOnClickListener {
        onClickListener(post)}

    }

}