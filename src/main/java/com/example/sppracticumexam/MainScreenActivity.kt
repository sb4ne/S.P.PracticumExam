package com.example.sppracticumexam

import android.annotation.SuppressLint
import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.TableLayout
import android.widget.TextView

class MainScreenActivity : AppCompatActivity() {
    @SuppressLint("MissingInflatedId")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main_screen)

     //declare the items on the Main Screen UI

        var AppName = findViewById<TextView>(R.id.AppName)
        var weatherTable = findViewById<TableLayout>(R.id.weatherTable)
        var SecondScreenButton = findViewById<Button>(R.id.SecondScreenButton)
        var ExitButton2 = findViewById<Button>(R.id.ExitButton2)

        //code for the button leading to the 3rd screen

        SecondScreenButton.setOnClickListener {
            val intent = Intent(this, SecondScreenActivity::class.java)
            this.startActivity(intent)
        }

        ExitButton2.setOnClickListener {
            finishAffinity()
        }

        //create a class,and an array to store the weather data

        data class WeatherData(
            val Day: String,
            val Min: Int,
            val Max: Int,
            val WeatherCondition: String
        )

        //input the required data into the array

        fun main() {
            val dataArray = Array(8) { Array(4) { WeatherData("", 0, 0, "") } }
            dataArray[0][0] = WeatherData("Monday", 12, 25, "Sunny")
            dataArray[0][1] = WeatherData("Tuesday", 15, 29, "Sunny")
            dataArray[0][3] = WeatherData("Wednesday", 8, 22, "Party Cloudy")
            dataArray[0][4] = WeatherData("Thursday", 9, 23, "Windy")
            dataArray[0][5] = WeatherData("Friday", 20, 31, " Very Sunny")
            dataArray[0][7] = WeatherData("Saturday", 10, 18, "Raining")
            dataArray[0][8] = WeatherData("Sunday", 10, 16, "Cold")

            println("Day: ${dataArray[0][0].Day}, Min:: ${dataArray[0][0].Min}, Max: ${dataArray[0][0].Max}, Weather Conditions: ${dataArray[0][0].WeatherCondition}")
        }
    }
}