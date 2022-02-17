package com.emobilis.simplebmiapp
//STORAGE
import android.content.Context
import android.content.Intent
import android.content.SharedPreferences
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        btnBMI.setOnClickListener {
            //get name,height,weight
            val name: String = txtName.text.toString()
            val weight: Float = edtWeight.text.toString().toFloat()
            val height: Float = edtHeight.text.toString().toFloat()

            //Calculate BMI

            val bmi: Float = (weight / (height * height))

            //(I)save details in a shared preference

            //.....................................
            //editor is where to begin insering values

            val pref:SharedPreferences=getSharedPreferences("bmifile",Context.MODE_PRIVATE)
            val editor:SharedPreferences.Editor=pref.edit()
            editor.putString("name",name)
            editor.putFloat("weight",weight)
            editor.putFloat("height",height)
            editor.putFloat("bmi",bmi)
            editor.apply()


            //start activity
           startActivity(Intent(this,Summary::class.java))

        }
    }
}
