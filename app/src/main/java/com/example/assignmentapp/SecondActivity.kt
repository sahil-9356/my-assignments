package com.example.assignmentapp

import android.content.Intent
import android.os.Bundle
import android.util.Log
import android.widget.Button
import android.widget.TextView
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat

class SecondActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_second)
        val textViewReceivedData: TextView = findViewById(R.id.textViewReceivedData)
        val buttonSendToThirdActivity: Button = findViewById(R.id.buttonSendToThirdActivity)

        val intent = intent
        val text1 = intent.getStringExtra("text1")
        val text2 = intent.getStringExtra("text2")
        val text3 = intent.getStringExtra("text3")
        val text4 = intent.getStringExtra("text4")
        val text5 = intent.getStringExtra("text5")
        val booleanValue = intent.getBooleanExtra("booleanValue", false)
        val intValue = intent.getIntExtra("intValue", 0)
        val floatValue = intent.getFloatExtra("floatValue", 0f)

        textViewReceivedData.text = "$text1\n$text2\n$text3\n$text4\n$text5\nBoolean: $booleanValue\nInt: $intValue\nFloat: $floatValue"

        Log.d("SecondActivity", "Received data: $text1, $text2, $text3, $text4, $text5, $booleanValue, $intValue, $floatValue")

        buttonSendToThirdActivity.setOnClickListener {
            val finalString = "$text1 $text2 $text3 $text4 $text5"
            val thirdIntent = Intent(this, ThirdActivity::class.java)
            thirdIntent.putExtra("finalString", finalString)
            startActivity(thirdIntent)
        }
    }
        }
