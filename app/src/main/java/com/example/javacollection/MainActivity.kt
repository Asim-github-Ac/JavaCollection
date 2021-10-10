package com.example.javacollection

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import com.google.firebase.database.*
import com.google.firebase.database.ktx.database
import com.google.firebase.ktx.Firebase

class MainActivity : AppCompatActivity() {

    private lateinit var database: DatabaseReference

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        database = Firebase.database.reference
        fun writeNewUser(userId: String, name: String, email: String) {
            val user = User(name, email)

            database.child("users").child(userId).setValue(user)
            database.child("users").child(userId).child("username").setValue(name)
            
        }

    }
}