package com.example.fbpro

import android.content.Intent
import android.os.Bundle
import android.widget.ImageView
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat

class FavoritesActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_favorites)

        val favoritesBtn = findViewById<ImageView>(R.id.btn_arrow3)

        favoritesBtn.setOnClickListener {
            val intent = Intent(this, MainActivity::class.java) // 'FavoritesActivity'로 수정
            startActivity(intent)
        }

    }

}

