package com.universidad.appnoticias.ui

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.bumptech.glide.Glide
import com.universidad.appnoticias.data.model.News
import com.universidad.appnoticias.databinding.ActivityDetalleNoticiaBinding

class DetalleNoticiaActivity : AppCompatActivity() {
    private lateinit var binding: ActivityDetalleNoticiaBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding=ActivityDetalleNoticiaBinding.inflate(layoutInflater)
        setContentView(binding.root)
            val news = intent.getSerializableExtra("news") as? News

        news?.let {
            binding.txtTitle.text=news.title
            binding.txtDescription.text=news.information
            Glide.with(this)
                .load(it.image)
                .into(binding.imgView)

        }

    }

}