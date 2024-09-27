package com.rehan.myapplication

import android.annotation.SuppressLint
import android.os.Bundle
import android.widget.ImageView
import android.widget.TextView
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat

class DetailMovie : AppCompatActivity() {

    private lateinit var txtDetailMovie: TextView
    private lateinit var imageDetailMovie : ImageView

    @SuppressLint("MissingInflatedId")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_detail_movie)

        txtDetailMovie = findViewById(R.id.txtDetailMovie)
        imageDetailMovie = findViewById(R.id.imageDetailMovie)

        val detailTeks = intent.getStringExtra("judul")
        val detailImg = intent.getIntExtra("gambar",0)

        txtDetailMovie.setText(detailTeks)
        imageDetailMovie.setImageResource(detailImg)

        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main)) { v, insets ->
            val systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars())
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom)
            insets
        }
    }
}