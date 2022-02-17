package com.emobilis.contactsapp

import android.location.Address
import android.media.Image
import android.provider.ContactsContract

/*
*Name
* Phone
* Image
* Address
* Email
*

 */

data class MyContact(var name:String,var phone:String,
                      var image: Int,var address:String,
                       var email:String){

}