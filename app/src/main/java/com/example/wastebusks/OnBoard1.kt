package com.example.wastebusks

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class OnBoard1 : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_on_board1)

        val secondActButton = findViewById<Button>(R.id.button2)
        secondActButton.setOnClickListener {
            val intent = Intent(this, OnBoard2::class.java)
            startActivity(intent)
        }
    }
}