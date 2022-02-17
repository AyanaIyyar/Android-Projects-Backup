package com.emobilis.contactsapp

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import kotlinx.android.synthetic.main.activity_details.*
import kotlinx.android.synthetic.main.contacts_list.*
import kotlinx.android.synthetic.main.contacts_list.name

class Details:AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_details)

        val names=intent.getStringExtra("name")
        val phone=intent.getStringExtra("phone")
        val email=intent.getStringExtra("email")
        val address=intent.getStringExtra("address")
        val image=intent.getStringExtra("image").toInt()

        name.text=names
        phoneOne.text=phone
        emailOne.text=email
        addressOne.text=address
        imageOne.setImageResource(image)
    }
   // val name = intent.getStringExtra("name")

    //txtname.text = name






}


