package com.example.hello

import android.content.Intent
import android.os.Bundle
import android.widget.ImageView
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import com.example.hello.databinding.ActivityThirdBirdBinding
import com.squareup.picasso.Picasso

class ThirdBirdActivity : AppCompatActivity() {
    lateinit var binding: ActivityThirdBirdBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityThirdBirdBinding.inflate(layoutInflater)
        setContentView(binding.root)

        binding.btnPrev2.setOnClickListener { finish() }
        binding.btnNext3.setOnClickListener {
            val intent = Intent(this, FourthBirdActivity::class.java)
            startActivity(intent)
        }

        Picasso
            .get()
            .load("https://images.pexels.com/photos/2629373/pexels-photo-2629373.jpeg?auto=compress&cs=tinysrgb&w=600")
            .into(binding.imageView3)
    }
}