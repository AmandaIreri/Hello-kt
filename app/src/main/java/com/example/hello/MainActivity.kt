package com.example.hello

import android.content.Intent
import android.os.Bundle
import android.widget.ImageView
import androidx.appcompat.app.AppCompatActivity
import com.example.hello.databinding.ActivityMainBinding
import com.squareup.picasso.Picasso


class MainActivity : AppCompatActivity() {
    lateinit var binding: ActivityMainBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)
        val btnNext = findViewById<ImageView>(R.id.btnNext)
        binding.btnNext.setOnClickListener{
            val intent = Intent(this, SecondBirdActivity::class.java)
            startActivity(intent)
        }
        Picasso
            .get()
            .load("https://images.pexels.com/photos/2115984/pexels-photo-2115984.jpeg?auto=compress&cs=tinysrgb&w=600")
            .into(binding.imageView2)
    }
}