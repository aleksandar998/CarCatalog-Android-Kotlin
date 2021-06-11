package com.eng.taskcars

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.widget.Toast
import kotlinx.android.synthetic.main.activity_login.*

class LoginActivity : AppCompatActivity() {

    val username = "admin"
    val password = "123"

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_login)

        btnLogin.setOnClickListener {
            val editUsername: String = usernameEditText.text.toString()
            val editPassword: String = passwordEditText.text.toString()
            if (editUsername == username && editPassword == password){
                Toast.makeText(applicationContext, "Uspesno logovanje", Toast.LENGTH_SHORT).show()
                startActivity(Intent(this, MainActivity::class.java))
                finish()
            } else {
                Toast.makeText(applicationContext, "Neispravni podaci", Toast.LENGTH_SHORT).show()
            }
        }
    }
}