package com.emobilis.simplebmiapp

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_bmichecker.*

class BmiChecker : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_bmichecker)

        btnCalc.setOnClickListener {
            val intent=Intent(this,MainActivity::class.java)
            startActivity(intent)
        }
        btnCheck.setOnClickListener {
            startActivity(Intent(this,Summary::class.java))
        }
    }
}
