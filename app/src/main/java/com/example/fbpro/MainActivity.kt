package com.example.fbpro

import android.content.Intent
import android.os.Bundle
import android.widget.ImageView
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val favoritesBtn = findViewById<ImageView>(R.id.star1) //즐겨찾기 이동

        favoritesBtn.setOnClickListener {
            val intent = Intent(this, FavoritesActivity::class.java)
            startActivity(intent)
                }

        val fieldBtn = findViewById<ImageView>(R.id.btn_field)

        fieldBtn.setOnClickListener {
            val intent = Intent(this, fieldActivity::class.java)
            startActivity(intent)
                }

            }

        }


