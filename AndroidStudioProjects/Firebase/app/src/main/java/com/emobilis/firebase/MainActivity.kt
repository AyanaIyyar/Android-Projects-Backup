package com.emobilis.firebase

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.google.firebase.database.DatabaseReference
import com.google.firebase.database.FirebaseDatabase
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {
    lateinit var database: FirebaseDatabase


   // val database = FirebaseDatabase.getInstance()

//    val myDataBase = database.getReference("UserDetails")


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        //btn_save.setOnclickListener{
        // }

        database = FirebaseDatabase.getInstance()
        btn_save.setOnClickListener {

            var FirstName = edt_name.text.toString()
            var SecondName: String = edt_SecondName.text.toString()
            var emailAddress: String = edt_email.text.toString()
            var phoneNumber: String = edt_phoneNumber.text.toString()
           // myDataBase.setValue(name)

            saveuserDetails(
                userDetails.userDetails(FirstName, SecondName, emailAddress, phoneNumber)
            )
        }
    }
   fun saveuserDetails(userDetails: userDetails.userDetails){
       var databaseReference:DatabaseReference=database.getReference("userdetails")

       databaseReference.child("users").setValue(userDetails)
   }

    }



