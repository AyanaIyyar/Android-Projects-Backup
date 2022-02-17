package com.emobilis.myshoppingapp

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import kotlinx.android.synthetic.main.activity_description.*


class Description:AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
       setContentView(R.layout.activity_description)
//TO CREATE AN ACTIVITY XML FILE: PRESS 'ALT' + ''ENTER'

        val names=intent.getStringExtra("name")
        val cost=intent.getStringExtra("cost").toInt()
        val description=intent.getStringExtra("description")
        val image=intent.getStringExtra("image").toInt()

        textName.text=names
        textCost.text= cost.toString()
        textDescription.text=description
        //imageOne.setImageResource(image)
    }
   // val name = intent.getStringExtra("name")

    //txtname.text = name






}


