package com.emobilis.simplebmiapp

import android.content.Context
import android.content.Intent
import android.content.SharedPreferences
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_summary.*

class Summary : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_summary)

        //get the values from ou shared preference
        val pref:SharedPreferences=getSharedPreferences("bmifile",Context.MODE_PRIVATE)
        val name:String?=pref.getString("name","No Name provided")
        val weight:Float=pref.getFloat("weight",0.0f)
        val height:Float=pref.getFloat("height",0.0f)
        val bmi:Float=pref.getFloat("bmi",0.0f)


        txtName.text=name
        txtWeight.text=weight.toString()
        txtHeight.text=height.toString()
        txtBMI.text=bmi.toString()
        if (bmi==0.0f){
            val intent= Intent(this,MainActivity::class.java)
            startActivity(intent)
        }

    }
}
