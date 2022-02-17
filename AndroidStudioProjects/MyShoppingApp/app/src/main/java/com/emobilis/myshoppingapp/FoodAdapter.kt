package com.emobilis.myshoppingapp
//INHERITANCE TAKES PLACE HERE:we inherit the RECYCLER VIEW ADAPTER

import android.content.Context
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import kotlinx.android.synthetic.main.food_list.view.*

//on createViewHolder:is a
class FoodAdapter(var fooditem:List<FoodItems>, var context:Context): RecyclerView.Adapter<FoodAdapter.ViewHolder>() {
    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolder {
        //layout inflater:show me the view and i'll feed in the data
        return ViewHolder(
            LayoutInflater.from(context)
                .inflate(
                    R.layout.food_list,
                    parent,
                    false
                )

            )

    }

    override fun getItemCount(): Int {
        return fooditem.size
    }

    override fun onBindViewHolder(holder: ViewHolder, position: Int) {
     holder.name.text =fooditem.get(position).name
     holder.cost.text =fooditem.get(position).cost.toString()

    // holder.description.text =fooditem.get(position).description


    }

    class ViewHolder(view:View):RecyclerView.ViewHolder(view){
      val name= view.txtName
        val cost = view.txtCost
        //val description =view.description
    }
}