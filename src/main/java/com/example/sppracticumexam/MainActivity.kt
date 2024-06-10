package com.example.sppracticumexam

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.TextView

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        var AppName = findViewById<TextView>(R.id.AppName)
        var myName = findViewById<TextView>(R.id.myName)
        var STNumber = findViewById<TextView>(R.id.STNumberView)
        var MainScreenButton = findViewById<Button>(R.id.MainScreenButton)
        var ExitButton = findViewById<Button>(R.id.ExitButton)

        MainScreenButton.setOnClickListener {
            val intent = Intent(this, MainScreenActivity::class.java)
            this.startActivity(intent)

        ExitButton.setOnClickListener {
            finishAffinity()
        }
    data class WeatherData (
        val Day: String,
        val Min: Int,
        val Max: Int,
        val WeatherCondition: String
    )
    fun main() {
        val dataArray = Array(8){Array(4){WeatherData("",0,0,"")} }
            dataArray[0][0] = WeatherData("Monday",12,25,"Sunny")
            dataArray[0][1] = WeatherData("Tuesday", 15, 29, "Sunny")
            dataArray[0][3] = WeatherData("Wednesday", 8, 22, "Party Cloudy")
            dataArray[0][4] = WeatherData("Thursday", 9, 23, "Windy")
            dataArray[0][5] = WeatherData("Friday", 15, 29, "Sunny")
            dataArray[0][6] = WeatherData("Tuesday", 15, 29, "Sunny")
    }
    }
    }
}