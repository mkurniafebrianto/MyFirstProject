package com.example.myfirstapp

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.ImageView
import android.widget.TextView

class DetailUnivActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_detail_univ)

        supportActionBar?.setDisplayHomeAsUpEnabled(true)

        val univ = intent.getParcelableExtra<Univ>(MainActivity.INTENT_PARCELABLE)

        val name = findViewById<TextView>(R.id.tv_detail_name)
        val detail = findViewById<TextView>(R.id.tv_detail_desc)
        val photo = findViewById<ImageView>(R.id.img_detail_photo)

        name.text = univ?.name
        detail.text = univ?.detail
        photo.setImageResource(univ?.photo!!)
    }

    // Menampilkan Back Button
    override fun onSupportNavigateUp(): Boolean {
        onBackPressed()
        return true
    }
}