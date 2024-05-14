package com.example.wastebusks

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class OnBoard2 : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_on_board2)

        val secondActButton = findViewById<Button>(R.id.button3)
        secondActButton.setOnClickListener {
            val intent = Intent(this, Mainscreen::class.java)
            startActivity(intent)
        }
    }
}