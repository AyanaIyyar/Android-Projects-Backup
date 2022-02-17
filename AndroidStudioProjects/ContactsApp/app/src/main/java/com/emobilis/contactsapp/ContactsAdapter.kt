package com.emobilis.contactsapp
//INHERITANCE TAKES PLACE HERE:we inherit the RECYCLER VIEW ADAPTER

import android.content.Context
import android.content.Intent
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import kotlinx.android.synthetic.main.contacts_list.view.*

//on createViewHolder:is a
class ContactsAdapter(var contacts:ArrayList<MyContact>,var context:Context): RecyclerView.Adapter<ContactsAdapter.ViewHolder>() {
    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolder {
        //layout inflater:show me the view and i'll feed in the data
        return ViewHolder(
            LayoutInflater.from(context)
                .inflate(
                    R.layout.contacts_list,
                    parent,
                    false
                )

            )

    }

    override fun getItemCount(): Int {
        return contacts.size
    }

    override fun onBindViewHolder(holder: ViewHolder, position: Int) {
     holder.name.text =contacts.get(position).name
     holder.phone.text =contacts.get(position).phone
     holder.myImage.setImageResource(contacts.get(position).image)

       // holder.myphoto.setImageResource(R.drawable.ic_launcher_background)
        holder.itemView.setOnClickListener {
            //Toast.makeText(context,
              //  "you clicked $(contacts.get(position))"
                //    .Toast.LENGTH_LONG())

            val intent2 = Intent(context,Details::class.java)

            intent2.putExtra("name",contacts.get(position).name)
            intent2.putExtra("phone",contacts.get(position).phone)
            intent2.putExtra("email",contacts.get(position).email)
            intent2.putExtra("address",contacts.get(position).address)
            intent2.putExtra("image",contacts.get(position).image.toString())
            context.startActivity(intent2)

            holder.name.text =contacts.get(position).phone
            holder.myImage.setImageResource(R.drawable.ic_launcher_foreground)

        }
    }

    class ViewHolder(view:View):RecyclerView.ViewHolder(view){
      val name= view.name
        val phone = view.phone
        val myImage =view.photoOne
    }
}