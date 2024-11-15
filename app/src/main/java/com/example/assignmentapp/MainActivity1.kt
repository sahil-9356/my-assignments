package com.example.assignmentapp

import android.content.Intent
import android.os.Bundle
import android.widget.Button
import android.widget.TextView
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat

class MainActivity1 : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_main1)
        val textView1: TextView = findViewById(R.id.textView1)
        val textView2: TextView = findViewById(R.id.textView2)
        val textView3: TextView = findViewById(R.id.textView3)
        val textView4: TextView = findViewById(R.id.textView4)
        val textView5: TextView = findViewById(R.id.textView5)

        val buttonSendData: Button = findViewById(R.id.buttonSendData)

        buttonSendData.setOnClickListener {
            val intent = Intent(this, SecondActivity::class.java)
            intent.putExtra("text1", textView1.text.toString())
            intent.putExtra("text2", textView2.text.toString())
            intent.putExtra("text3", textView3.text.toString())
            intent.putExtra("text4", textView4.text.toString())
            intent.putExtra("text5", textView5.text.toString())
            intent.putExtra("booleanValue", true)
            intent.putExtra("intValue", 42)
            intent.putExtra("floatValue", 3.14f)
            startActivity(intent)
        }
    }
}
