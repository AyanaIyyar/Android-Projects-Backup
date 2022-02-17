package com.emobilis.myshoppingapp

import android.content.Context
import androidx.lifecycle.LiveData
import androidx.room.*
//How to create a a table:
//A table is the same as an ENTITY
//Therefore:UPGRADE AN ENTITY TO BE A TABLE by adding :@Entity (before data class)
@Entity
//HOW DO YOU CREATE A PRIMARY KEY
//DONE BY: introducing a
data class FoodItems(@PrimaryKey(autoGenerate = true)var id:Int=0, var name:String, var cost:Int, var desc:String) {
}

//create Database Access Object
@Dao
interface FoodItemsDao {
    @Insert(onConflict = OnConflictStrategy.IGNORE)
    fun insertFoodItems(contacts:  FoodItems)

    @Query("SELECT * FROM  FoodItems WHERE id LIKE:id")
    fun getContactId(id:Int): LiveData< FoodItems>

    @Query("SELECT * FROM  FoodItems ")
    fun getAllContacts(): LiveData<List<FoodItems>>

    @Query("DELETE FROM  FoodItems WHERE id LIKE:id")
    fun deleteContact(id:Int)
}

//create database
@Database(entities = [FoodItems::class],
    version = 1)
abstract class AppDatabase: RoomDatabase() {
    abstract fun foodDao(): FoodItemsDao

    companion object {
        @Volatile
        private var instance: AppDatabase? = null
        private val LOCK = Any()

        operator fun invoke(context: Context) = instance
            ?: synchronized(LOCK) {
                instance
                    ?: buildDatabase(context).also { instance = it }
            }

        private fun buildDatabase(context: Context) = Room.databaseBuilder(context,
            AppDatabase::class.java, "mystore.db")
            .build()
    }
}

//dependencies
/*
apply plugin: 'kotlin-kapt'
* //room
    implementation "androidx.room:room-runtime:2.1.0-alpha01"
    annotationProcessor 'androidx.room:room-compiler:2.0.0'
    kapt 'androidx.room:room-compiler:2.0.0'
    *

*
*
* */