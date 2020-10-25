package com.example.latihanpraktikum3

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.ImageButton
import android.widget.Toast

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        val inputBtn = findViewById<Button>(R.id.button)
        inputBtn.setOnClickListener {
            Toast.makeText(this@MainActivity, "Input Berhasil", Toast.LENGTH_LONG).show()
        }
        val cancelBtn = findViewById<Button>(R.id.button2)
        cancelBtn.setOnClickListener{
            Toast.makeText(this@MainActivity, "Input Dibatalkan", Toast.LENGTH_LONG).show()
        }
    }
}