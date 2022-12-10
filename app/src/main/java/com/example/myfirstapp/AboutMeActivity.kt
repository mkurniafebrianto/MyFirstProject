package com.example.myfirstapp

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import de.hdodenhof.circleimageview.CircleImageView

class AboutMeActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_about_me)

        supportActionBar?.setDisplayHomeAsUpEnabled(true)

        val imgAboutMe = findViewById<CircleImageView>(R.id.img_aboutme_photo)

        imgAboutMe.setImageResource(R.drawable.profile_picture)
    }

    override fun onSupportNavigateUp(): Boolean {
        onBackPressed()
        return true
    }
}