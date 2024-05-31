package com.universidad.appnoticias.adapter

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.universidad.appnoticias.R
import com.universidad.appnoticias.data.model.News

class NewsAdapter(private val posts:List<News>, private val onClickListener:(News)->Unit):RecyclerView.Adapter<NewsViewHolder>() {

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): NewsViewHolder {
        val layoutInflater=LayoutInflater.from(parent.context)
        return NewsViewHolder(layoutInflater.inflate(R.layout.item_noticia,parent,false))
    }

    override fun onBindViewHolder(holder: NewsViewHolder, position: Int) {
        var item=posts[position]
        holder.render(item,onClickListener)
    }

    override fun getItemCount(): Int {
        return posts.size
    }




}
