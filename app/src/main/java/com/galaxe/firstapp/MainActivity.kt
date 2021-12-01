package com.galaxe.firstapp

import android.content.Context
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.EditText
import android.widget.TextView
import android.widget.Toast

class MainActivity : AppCompatActivity() {

    lateinit var tv : TextView
    lateinit var userName : EditText
    lateinit var password : EditText

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        tv = findViewById(R.id.t1)
        userName = findViewById(R.id.user)
        password = findViewById(R.id.pass)

    }
    fun login(v: View){
        if(userName.text.toString() == "admin" && password.text.toString() == "admin123"){
            Toast.makeText(this, "Login Success", Toast.LENGTH_LONG).show()
        }
        else{
            Toast.makeText(this, "Login Failed", Toast.LENGTH_LONG).show()
        }



    }


}
