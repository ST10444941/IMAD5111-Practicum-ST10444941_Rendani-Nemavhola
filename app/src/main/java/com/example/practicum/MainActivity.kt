package com.example.practicum

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.ImageView

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)


        val btnExit = findViewById<Button>(R.id.btnExit)
        val btnMain = findViewById<Button>(R.id.btnMain)


        btnMain.setOnClickListener {
            val intent = Intent( this, MainActivity2::class.java)
            startActivity(intent)    //This is to allow to go to the next screen
        }
        btnExit.setOnClickListener {
            finish()  //This is to end the program
        }
    }
}