package com.emobilis.calculator

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.TextView
import android.widget.Toast
import android.widget.EditText as EditText1

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        //get Num1 from edit text
        var num1 =findViewById<EditText1>(R.id.txtNum1)
        var num2: EditText1 =findViewById(R.id.txtNum2)


        var btnAdd:Button =findViewById<Button>(R.id.add)



        var results = findViewById<TextView>(R.id.results)


        btnAdd.setOnClickListener {
            if(num1.text.isNotEmpty() && num2.text.isNotEmpty()){
                //get values from UI views
                var x:Int =num1.text.toString().toInt()
                var y: Int = num2.text.toString().toInt()


                //USE THE ABOVE OR THE BELOW TO CONVERT EDIT TEXT TO STRING THEN TO INTEGER
                // var sum:Int =num1.text.toString().toInt()+num2.text.toString().toInt()

                var sum:Int =x + y

                //THE BELOW IS THE OPTION FOR RESULT
                //result.text =sum.toString()
                //OR
                results.text = " The sum is $sum"
                //FOR USER FEEDBACK USE THE FOLLOWING BELOW

            }else{
                Toast.makeText(this,"Input num 1 and num2",
                   Toast.LENGTH_SHORT).show()
                num1.error="Input num1"
                num2.error="Input num2"
            }

        }
        var btnSubtract :Button =findViewById<Button>(R.id.subtract)

        var result:TextView = findViewById(R.id.results)

        btnSubtract.setOnClickListener {
            if(!num1.text.isEmpty() && !num2.text.isEmpty()){
                var x:Int =num1.text.toString().toInt()
                var y:Int = num2.text.toString().toInt()

                var diff:Int = x-y

                results.text = "The difference is $diff"
            }

        }
        var btndivide :Button =findViewById<Button>(R.id.divide)

        var result2 :TextView = findViewById(R.id.results)

        btndivide.setOnClickListener {
            if(!num1.text.isEmpty() && !num2.text.isEmpty()){
                var x:Int =num1.text.toString().toInt()
                var y:Int =num2.text.toString().toInt()

                var divide:Int = x/y

                results.text ="The quotient is $divide"
            }


        }

         var btnmultiply :Button =findViewById<Button>(R.id.multiply)

         var result3 :TextView =findViewById(R.id.results)

         btnmultiply.setOnClickListener {
             if(!num1.text.isEmpty() && !num2.text.isEmpty()){
                 var x:Int =num1.text.toString().toInt()
                 var y:Int =num2.text.toString().toInt()

                 var multiply :Int =x*y

                 results.text ="The product is $multiply"

             }

         }


    }
}
