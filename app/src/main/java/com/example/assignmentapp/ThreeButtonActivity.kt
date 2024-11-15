package com.example.assignmentapp

import android.annotation.SuppressLint
import android.os.Bundle
import android.widget.Button
import android.widget.TextView
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import com.example.assignmentapp.R.id.buttonIncrement

class ThreeButtonActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_three_button)

        lateinit var textView: TextView
        lateinit var buttonIncrement: Button
        lateinit var buttonChangeHeight: Button
        lateinit var buttonCenterText: Button

        var counter = 0

        @SuppressLint("MissingInflatedId")
        fun onCreate(savedInstanceState: Bundle?) {
            super.onCreate(savedInstanceState)
            setContentView(R.layout.activity_main)

            textView = findViewById(R.id.textView)
            buttonIncrement = findViewById(R.id.buttonIncrement)
            buttonChangeHeight = findViewById(R.id.buttonChangeHeight)
            buttonCenterText = findViewById(R.id.buttonCenterText)

            // Button 1: Increment counter and update TextView
            buttonIncrement.setOnClickListener {
                counter++
                textView.text = "Counter: $counter"
            }

            // Button 2: Change the height of TextView
            buttonChangeHeight.setOnClickListener {
                val layoutParams = textView.layoutParams
                layoutParams.height = 500 // Set a new height
                textView.layoutParams = layoutParams
            }

            // Button 3: Center the TextView on the screen
            buttonCenterText.setOnClickListener {
                val layoutParams = textView.layoutParams
                layoutParams.width = 500 // Set width to make it more visible
                textView.layoutParams = layoutParams
                textView.textAlignment = TextView.TEXT_ALIGNMENT_CENTER
            }
        }
    }
}

