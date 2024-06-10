package com.example.hello

import android.content.Intent
import android.media.Image
import android.os.Bundle
import android.widget.ImageView
import androidx.appcompat.app.AppCompatActivity
import com.example.hello.databinding.ActivityFourthBirdBinding
import com.example.hello.databinding.ActivityThirdBirdBinding
import com.squareup.picasso.Picasso

class FourthBirdActivity : AppCompatActivity() {
    lateinit var binding: ActivityFourthBirdBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityFourthBirdBinding.inflate(layoutInflater)
        setContentView(binding.root)

        binding.btnPrev3.setOnClickListener { finish() }
        binding.btnNext4.setOnClickListener {
            val intent = Intent(this, FifthBirdActivity::class.java)
            startActivity(intent)
        }

        Picasso
            .get()
            .load("https://images.pexels.com/photos/22753260/pexels-photo-22753260/free-photo-of-a-kingfisher-sitting-on-a-branch.jpeg?auto=compress&cs=tinysrgb&w=600")
            .into(binding.imageView4)
    }
}