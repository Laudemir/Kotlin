package com.example.relogionatela

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.TextClock

class MainActivity : AppCompatActivity() {

    var textClock: TextClock? = null
    var textClock2: TextClock? = null

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val textClock: TextClock = findViewById(R.id.textClock)
        textClock.format24Hour = "HH:mm"

        val textClock2: TextClock = findViewById(R.id.textClock2)
        textClock2.format12Hour = "HH:mm:ss"
    }
}