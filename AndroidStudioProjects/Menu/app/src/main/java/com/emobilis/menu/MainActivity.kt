package com.emobilis.menu

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.Menu
import android.view.MenuInflater
import android.view.MenuItem
import android.widget.Toast
import androidx.appcompat.app.AlertDialog
import org.jetbrains.anko.alert
import org.jetbrains.anko.browse
import org.jetbrains.anko.makeCall
import org.jetbrains.anko.toast

//OPTION MENU
class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
    }

    override fun onCreateOptionsMenu(menu: Menu?): Boolean {
        val inflate:MenuInflater=menuInflater
        inflate.inflate(R.menu.mymenu,menu)
        return super.onCreateOptionsMenu(menu)
    }
//USE THE FOLLOWING : "IF, ELSE IF, OR ELSE" TO GIVE THE SAME AS WHEN STATEMENT
    override fun onOptionsItemSelected(item: MenuItem): Boolean {
      /*  if (item.itemId==R.id.home){
            Toast.makeText(this,"Hello you clicked Settings",
                Toast.LENGTH_SHORT).show()
                toast("hello you clicked settings)
                alert(message:"Hello from home"){
                tittle="home"
                positiveButton()"okay"{
                toast("okay clicked")
                }
                negativeButton("cancel"){
                toast("cancel clicked)
                }
                neutralPressed("maybe"){
                toast("neutral clicked")
                }
                }.show()
            return true

        }else if (item.itemId==R.id.profile){
            Toast.makeText(this,"Hello you clicked Profile",
                Toast.LENGTH_SHORT).show()
            return true
        }else{
            Toast.makeText(this,"Hello you clicked Contact us",
                Toast.LENGTH_SHORT).show()
            return true
        }*/
        when(item.itemId){
            R.id.home->{
              // Toast.makeText(this,"Hello you clicked settings",
                  // Toast.LENGTH_SHORT).show()
            val alertDialog = AlertDialog.Builder(this)
               // alertDialog.setTitle("Home")
               // alertDialog.setMessage("you chose home")
              //  alertDialog.setNeutralButton("okay",null)
        //alertDialog.show()
                toast("Hello from settings")
                alert ("Hey it's settings"){
                    title="Settings"
                    positiveButton("okay"){
                        toast("okay clicked")
                    }
                    negativeButton("cancel"){
                        toast("cancel clicked")
                    }
                    neutralPressed("Maybe"){
                        toast("Neutral clicked")
                    }
                }.show()
            }

                R.id.profile->{
                Toast.makeText(this,"Hello you clicked profile",
                    Toast.LENGTH_SHORT).show()

                    alert ("Hey it's profile"){
                        title="Settings"
                        positiveButton("okay"){
                            toast("okay clicked")
                        }
                        negativeButton("cancel"){
                            toast("cancel clicked")
                        }
                        neutralPressed("Maybe"){
                            toast("Neutral clicked")
                        }
                    }.show()
            }
            R.id.contactUs->{
                Toast.makeText(this,"Hello you clicked contact us",
                    Toast.LENGTH_SHORT).show()

                alert ("Hey it's contact us"){
                    title="Settings"
                    positiveButton("okay"){
                        toast("okay clicked")
                    }
                    negativeButton("cancel"){
                        toast("cancel clicked")
                    }
                    neutralPressed("Maybe"){
                        toast("Neutral clicked")
                    }
                }.show()
            }
            R.id.call->{
                makeCall("100")

                alert ("Hey it's call"){
                    title="Settings"
                    positiveButton("okay"){
                        toast("okay clicked")
                    }
                    negativeButton("cancel"){
                        toast("cancel clicked")
                    }
                    neutralPressed("Maybe"){
                        toast("Neutral clicked")
                    }
                }.show()
                return true
            }
            R.id.google->{
                browse("https://google.com")

                alert ("Hey it's google"){
                    title="Settings"
                    positiveButton("okay"){
                        toast("okay clicked")
                    }
                    negativeButton("cancel"){
                        toast("cancel clicked")
                    }
                    neutralPressed("Maybe"){
                        toast("Neutral clicked")
                    }
                }.show()
                return true
            }

        }
        return super.onOptionsItemSelected(item)
    }
}











//CONTEXTUAL MENU:Shows a floating view