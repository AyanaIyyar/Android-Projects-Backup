package com.emobilis.myshoppingapp

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_add_food_item.*

class AddFoodItemActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_add_food_item)

        btnSave.setOnClickListener {


            //get name,desc,cost
            var name:String=edtName.text.toString()
            var cost:String=edtCost.text.toString()
            var desc:String=edtDesc.text.toString()



            //save on sql
            Thread({
                //get instance of the databse
                AppDatabase.invoke(this)
                    .foodDao()
                    .insertFoodItems(
                        FoodItems(name=name,cost=cost.toInt(),desc=desc))




        }).start()

            finish()


    }
}}
