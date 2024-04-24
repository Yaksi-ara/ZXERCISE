package com.example.zxer

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.EditText
import android.widget.Button
import android.util.Log
import android.widget.Toast

class Login : AppCompatActivity() {

    private lateinit var usernameInput : EditText
    private lateinit var passwordInput : EditText
    private lateinit var loginBTN : Button


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_login)

        usernameInput = findViewById(R.id.username_input)
        passwordInput = findViewById(R.id.password_input)
        loginBTN = findViewById(R.id.login_button)

        loginBTN.setOnClickListener {
            val username = usernameInput.text.toString()
            val password = passwordInput.text.toString()


            // Verificar si los campos están vacíos
            if (username.isEmpty() || password.isEmpty()) {

                Toast.makeText(this, "Por favor, ingrese nombre de usuario y contraseña", Toast.LENGTH_SHORT).show()
            } else {
                val intent = Intent(this, HomeScreen::class.java)
                startActivity(intent)
                Log.i("Test Credentials", "Username : $username and Password : $password")
            }
        }

    }
}