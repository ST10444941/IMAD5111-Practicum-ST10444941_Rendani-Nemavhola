package com.example.practicum

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.TextView

class MainActivity3 : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main3)

        val btnExt = findViewById<Button>(R.id.btnExt)
        val textView7 = findViewById<TextView>(R.id.textView7)
        val btnBck = findViewById<Button>(R.id.btnBck)
        val btnAvg = findViewById<Button>(R.id.btnAvg)

        btnAvg.setOnClickListener {   //This is to display the average Tempurature
            val weather = 8 + 27
            textView7.text = "$weather / 2"
        }
        btnBck.setOnClickListener {
            val intent3 = Intent(this, MainActivity::class.java)  //This allows the back button to switch backwards to the Welcome screen (The first screen)
            startActivity(intent3)
        }

        btnExt.setOnClickListener {
            finish()   //This is to end the program

        }
    }
}