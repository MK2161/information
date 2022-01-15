package com.example.personalinformation

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.EditText
import android.widget.TextView

class MainActivity : AppCompatActivity() {


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

         val uiEtName = findViewById<EditText>(R.id.uiEtName)
         val uiEtEmail = findViewById<EditText>(R.id. uiEtEmail )
         val uiEtPhoneNumber = findViewById<EditText>(R.id.uiEtPhoneNumber)
         val uiEtPassWord = findViewById<EditText>(R.id.uiEtPassWord)
         val uiBtnLogin = findViewById<Button>(R.id.uiBtnLogin)
         val uiTv = findViewById<TextView>(R.id.uiTv)


        uiBtnLogin.setOnClickListener {
            val name = uiEtName.text
            val email = uiEtEmail.text
            val phoneNumber = uiEtPhoneNumber.text
            val password = uiEtPassWord.text

            uiTv.text =
                "Name: " + name + "\nEmail: " + email + "\nPhoneNumber: " + phoneNumber + "\nPassword: " + password
        }



    }


}