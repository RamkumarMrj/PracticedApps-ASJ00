package com.example.firstapp

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        Log.e("lifecycle", "onCreate")
    }

    override fun onStart() {
        super.onStart()
        Log.e("lifecycle", "onStart")
    }

    override fun onPause() {
        super.onPause()
        Log.e("lifecycle", "onPause")
    }

    override fun onRestart() {
        super.onRestart()
        Log.e("lifecycle", "onRestart")
    }

    override fun onResume() {
        super.onResume()
        Log.e("lifecycle", "onResume")
    }

    override fun onStop() {
        super.onStop()
        Log.e("lifecycle", "onStop")
    }

    override fun onDestroy() {
        super.onDestroy()
        Log.e("lifecycle", "onDestroy")
    }

}