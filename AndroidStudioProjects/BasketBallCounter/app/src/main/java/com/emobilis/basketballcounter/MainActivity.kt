package com.emobilis.basketballcounter

import android.content.Intent
import android.net.Uri
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        var teamsAscores:Int=0
        var teamBscores:Int=0

        countA.setOnClickListener {
            teamsAscores=teamsAscores+1
            num1.setText(teamsAscores.toString())
        }
        countB.setOnClickListener {
            teamBscores=teamBscores+1
            num2.setText(teamBscores.toString())
        }
//explicit Intent:tell it what to do(AN ACTIVITY is opened/accessed DIRECTLY)
        btnsummary.setOnClickListener {
            val intent = Intent(this,Results::class.java)
            intent.putExtra("TeamA",teamsAscores.toString())
            startActivity(intent)
            //Put extra:allows only 2 parameters:i)Key(AN IDENTIFIER ie:ID in layout) &ii) VALUE

            intent.putExtra("TeamA",teamBscores.toString())
           startActivity(intent)
//implicit Intent:everyone that has a way to send a certain message offers their services

       // val implicitIntent = Intent(Intent.ACTION_VIEW, Uri.parse("https://google.com"))
        //startActivity(implicitIntent)

        // val sendIntent = Intent(Intent.ACTION_SEND)
          //  sendIntent.putExtra(Intent.EXTRA_TEXT,"Hello World")
            //sendIntent.type ="text/plain"
            //startActivity(sendIntent)
            val intent2 = Intent(this,Results::class.java)
            intent.putExtra("TeamB",teamBscores.toString())
            startActivity(intent)

        }
    }
}
