package com.example.myweatherapp

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.os.Handler

class MainActivity : AppCompatActivity() {
    // Splash screen timer
    private val SPLASH_TIME_OUT = 3000L
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        Handler().postDelayed(
            {
                val i = Intent(this@MainActivity, HomeActivity::class.java)
                startActivity(i)
                finish()
            }, SPLASH_TIME_OUT)
    }
}