package com.emobilis.firebase

import android.os.Bundle
import android.util.Log
import androidx.appcompat.app.AppCompatActivity
import com.google.firebase.database.DataSnapshot
import com.google.firebase.database.DatabaseError
import com.google.firebase.database.FirebaseDatabase
import com.google.firebase.database.ValueEventListener
import userDetails

class DisplayUserDetailsActivity : AppCompatActivity() {
    var mydatabase=FirebaseDatabase.getInstance()
    var databaseReference=mydatabase.getReference("Oreo")

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_display_user_details)

        //get data from firebase

       val dataListener=object :ValueEventListener{
           override fun onCancelled(data: DatabaseError) {

           }

           override fun onDataChange(data: DataSnapshot) {
              val userDetails=data.getValue(userDetails::class.java)
               Log.e("User Details","$mydatabase")

           }

       }
        databaseReference.addValueEventListener(dataListener)

    }
}
