package com.example.sppracticumexam

import android.annotation.SuppressLint
import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.TableLayout
import android.widget.TextView

class SecondScreenActivity : AppCompatActivity() {
    @SuppressLint("MissingInflatedId")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_second_screen)

//declare everything in the UI

        var AppName = findViewById<TextView>(R.id.AppName)
        var detailedWeatherTable = findViewById<TableLayout>(R.id.detailedWeatherTable)
        var backButton = findViewById<Button>(R.id.backButton)
        var ExitButton3 = findViewById<Button>(R.id.ExitButton3)

//code an exit button to stop the app

        ExitButton3.setOnClickListener {
            finishAffinity()
        }

//create a r

        backButton.setOnClickListener {
            val intent = Intent(this, MainScreenActivity::class.java)
            this.startActivity(intent)
        }
    }
}