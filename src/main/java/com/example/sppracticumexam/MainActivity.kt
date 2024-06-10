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

    //declare all items added onto the user interface

        var AppName = findViewById<TextView>(R.id.AppName)
        var myName = findViewById<TextView>(R.id.myName)
        var STNumber = findViewById<TextView>(R.id.STNumberView)
        var MainScreenButton = findViewById<Button>(R.id.MainScreenButton)
        var ExitButton = findViewById<Button>(R.id.ExitButton)

     //enable the buttons to be pressable and carry out intended function

        MainScreenButton.setOnClickListener {
            val intent = Intent(this, MainScreenActivity::class.java)
            this.startActivity(intent)

        ExitButton.setOnClickListener {
            finishAffinity()
        }
    }
    }
    }
