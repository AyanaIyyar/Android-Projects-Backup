package com.emobilis.contactsapp

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView

class MainActivity : AppCompatActivity() {
    //initialize the recycler view,LATER (2)Create an ADAPTER:to transform aa list to a particular way it will be shown from the data source to the
    lateinit var recyclerView: RecyclerView
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        recyclerView = findViewById(R.id.recyclerView)

        //Create a LIST OF NAMES(THIS IS THE DATA SOURCE)
      var names:ArrayList<MyContact> = arrayListOf<MyContact>()
        names.add(MyContact("Kefa","0729604560",R.mipmap.kefa,"Poland","kefaombongi07@gmail.com"))
        names.add(MyContact("Ayana","0723058255",R.mipmap.ayana,"India","ayanaiyyar@gmail.com"))
        names.add(MyContact("Lenah","0720989893",R.mipmap.lenah,"England","lenah54@yahoo.com"))
        names.add(MyContact("Challo","0759302393",R.mipmap.charlo,"USA","charles4@gmail.com"))
        names.add(MyContact("Zack","07323595921",R.mipmap.zack,"Rome","zachariah20@yahoo.com"))

        //LINK THE MAIN ACTIVITY WITH THE ADAPTER
        //TO SHOW ITEMS IN A Recycler Viewer 1)USE Linear format 2)Horizontal viewer

        recyclerView.layoutManager =LinearLayoutManager(this)
        recyclerView.adapter =ContactsAdapter(context = this,contacts = names)
    }
}
