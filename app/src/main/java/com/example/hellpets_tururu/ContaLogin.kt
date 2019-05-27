package com.example.hellpets_tururu

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import kotlinx.android.synthetic.main.activity_conta_login.*
import kotlinx.android.synthetic.main.activity_main.*

class ContaLogin : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_conta_login)

        loginbutton2.setOnClickListener {
            val email = EmaileditText3.text.toString()
            val password = SenhaeditText4.text.toString()
            Log.d("Login", "Attempt login with email/pw $email/***")
        }

        retornar.setOnClickListener{
            finish()
        }
    }
}
