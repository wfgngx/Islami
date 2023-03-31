package com.example.islami

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.os.Handler
import android.os.Looper

class Splash : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.splash)
        Handler(Looper.getMainLooper()).postDelayed({startHomeActivity()},2000)
    }
    private fun startHomeActivity(){
        val intent = Intent(this,HomeScreen::class.java)
        startActivity(intent)
    }
}