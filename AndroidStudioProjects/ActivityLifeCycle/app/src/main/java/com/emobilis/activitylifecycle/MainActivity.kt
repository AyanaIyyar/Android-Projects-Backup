package com.emobilis.activitylifecycle

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        Log.e("My App","OnCreate")

    }

    override fun onStart() {
        super.onStart()
        Log.e("My App","OnStart Called")
    }

    override fun onResume() {
        super.onResume()
        Log.e("My App","OnResume Called")
    }

    override fun onPause() {
        super.onPause()
        Log.e("My App","OnPause Called")
    }

    override fun onStop() {
        super.onStop()
        Log.e("My App","OnStop Called")
    }

    override fun onDestroy() {
        super.onDestroy()
        Log.e("My App","OnDestroy Called")
    }
}
