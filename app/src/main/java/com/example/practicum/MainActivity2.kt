package com.example.practicum

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.TextView

class MainActivity2 : AppCompatActivity() {

    private lateinit var btnDetails: Button
    private lateinit var txtResults : TextView
    private lateinit var btnBack : Button


    private val weatherData = arrayOf(
        DayWeather("Monday",12,25,"Sunny"),     //This is the declaring of the array variables of the days of the week's forcast
        DayWeather("Tuesday",11,20,"Partly Cloudy"),
        DayWeather("Wednesday",12,19,"Cloudy"),
        DayWeather("Thursday",13,27,"Sunny"),
        DayWeather("Friday",9,17,"Light Rain"),
        DayWeather("Saturday",8,19,"Light Rain"),
        DayWeather("Sunday",10,19,"Cloudy")
    )
    data class DayWeather(val day: String, val minTemp: Int, val maxTemp: Int, val condition: String)  //This ensures that arrays display the relevent information in the relevent places

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main2)
        val avgTemp = calculateAverageTemp()    //This Method is to calculate the average Temp
        txtResults.text = "Average Temperature in degrees C: $avgTemp"

        btnDetails.setOnClickListener {
            val intent2 = Intent(this, MainActivity3::class.java)  //This is to allow the button to switch to the third screen and display that information
            startActivity(intent2)
        }
        btnBack.setOnClickListener {
            val intent3 = Intent(this,MainActivity::class.java)  //This allows the back button to switch backwards to the Welcome screen (The first screen)
            startActivity(intent3)
        }
    }
    private fun calculateAverageTemp(): Double {
        var totalTemp = 0
        weatherData.forEach {    //This ensures that it checks each digit to find the min and the max
            totalTemp += (it.minTemp + it.maxTemp) /2   
        }
        return totalTemp / weatherData.size.toDouble()
    }
}
