package com.example.eventos

import android.graphics.Color
import android.os.Bundle
import android.view.View
import android.widget.Button
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_main)
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main)) { v, insets ->
            val systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars())
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom)
            insets
        }

        val btn = findViewById<Button>(R.id.btnColor)
        val back = findViewById<View>(R.id.fondo)
        val fondo = back.background.toString()
        println(fondo)
        btn.setOnClickListener {
            val red = (0..255).random()
            val blue = (0..255).random()
            val green = (0..255).random()
            back.setBackgroundColor(Color.rgb(red, green, blue))


        }
    }
}