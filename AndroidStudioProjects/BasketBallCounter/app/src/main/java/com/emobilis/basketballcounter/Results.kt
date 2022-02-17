package com.emobilis.basketballcounter

import android.content.DialogInterface
import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.widget.Toast
import androidx.appcompat.app.AlertDialog
import kotlinx.android.synthetic.main.activity_main.*
import kotlinx.android.synthetic.main.activity_results.*

class Results : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_results)


       // btnsummary.setOnClickListener {
         //   val intent = Intent(this, Results::class.java)
           // var TeamA = intent.getStringExtra("TeamA")
            //Log.e("Results", TeamA)

           // val intent2 = Intent(this, Results::class.java)
            //var TeamB = intent.getStringExtra("TeamB")
            //Log.e("Results", TeamB)
        var teamA=intent.getStringExtra("TeamA")
        Toast.makeText(
            this,teamA,
            Toast.LENGTH_LONG
        ).show()

        var teamB=intent.getStringExtra("TeamB")
        Toast.makeText(
            this,teamB,
            Toast.LENGTH_LONG
        ).show()

        if (teamA.toInt()>teamB.toInt()){
            txtMessage.text="Team A won with $teamA"
            alertDialog("Team A won with $teamA")
            //team A is the WINNER
        }else{ teamB.toInt()>teamA.toInt()
            txtMessage.text="Team B won with $teamB"
            alertDialog("Team B won with $teamB")

        }
        }
//DIALOGUE BOX(MESSAGE/ALERT TEXT)
    fun alertDialog(msg:String){

        val builder = AlertDialog.Builder(this)
        builder.setTitle("RESULTS")
        builder.setMessage(msg)
        builder.setPositiveButton("Okay", DialogInterface.OnClickListener { dialog, which ->
            finish()
        })
    builder.setNegativeButton("No",null)
    builder.setNeutralButton("Maybe",null)
        builder.show()

    }
    }

//Contextual Menu: apply an action on a particular item
//Pop-up:manipulation with all activities