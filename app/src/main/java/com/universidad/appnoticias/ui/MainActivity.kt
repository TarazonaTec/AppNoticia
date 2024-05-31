package com.universidad.appnoticias.ui

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.core.view.isVisible
import androidx.lifecycle.Observer
import androidx.lifecycle.ViewModelProvider
import androidx.recyclerview.widget.LinearLayoutManager
import com.universidad.appnoticias.adapter.NewsAdapter
import com.universidad.appnoticias.data.model.News
import com.universidad.appnoticias.databinding.ActivityMainBinding
import com.universidad.appnoticias.ui.viewmodel.NewsViewModel

class MainActivity : AppCompatActivity() {
    private lateinit var binding: ActivityMainBinding
    private lateinit var postViewModel: NewsViewModel

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding= ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        postViewModel=ViewModelProvider(this).get(NewsViewModel::class.java)

        postViewModel.progressBar.observe(this, Observer {
            binding.progressBar.isVisible=it
        })

        postViewModel.news.observe(this, Observer {
            binding.rcView.layoutManager=LinearLayoutManager(this)
            binding.rcView.adapter=NewsAdapter(it){ post -> onItemSelect(post)}

        })



        postViewModel.getNews()

    }


   private fun onItemSelect(news:News){

        val intent=Intent(this, DetalleNoticiaActivity::class.java)
        intent.putExtra("news",news)

        startActivity(intent)
    }

}