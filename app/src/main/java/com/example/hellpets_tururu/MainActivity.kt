package com.example.hellpets_tururu


import android.content.Intent
import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        RegistrarButton.setOnClickListener {

            val email = EmaileditText3.text.toString()
            val password = SenhaeditText4.text.toString()
            Log.d("MainActivity", "Email is:" + email)
            Log.d("MainActivity", "Senha: ${password}")
        }

            PerguntaConatextView2.setOnClickListener {
            Log.d("MainActivity", "Try to showm login activity")

                // launch the login activity somehow
                val intent = Intent (this, ContaLogin::class.java)
                startActivity(intent)
        }
    }
}