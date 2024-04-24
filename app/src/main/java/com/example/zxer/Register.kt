package com.example.zxer

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.widget.Button
import android.widget.EditText
import android.widget.Toast


class Register : AppCompatActivity(){

     lateinit var usernameInput : EditText
     lateinit var passwordInput : EditText
     lateinit var mailInput: EditText
     lateinit var weightInput: EditText
     lateinit var heightInput: EditText
     lateinit var beginnerBTN : Button
     lateinit var intermediateBTN : Button
     lateinit var advancedBTN : Button
     lateinit var registerBTN : Button
     var selectedExperience: String = ""


     override fun onCreate(savedInstanceState: Bundle?) {
         super.onCreate(savedInstanceState)
         setContentView(R.layout.activity_register)

         usernameInput = findViewById(R.id.username_input)
         passwordInput = findViewById(R.id.password_input)
         mailInput = findViewById(R.id.mail_input)
         weightInput = findViewById(R.id.weight_input)
         heightInput = findViewById(R.id.height_input)
         beginnerBTN = findViewById(R.id.principiante_button)
         intermediateBTN = findViewById(R.id.intermedio_button)
         advancedBTN = findViewById(R.id.avanzado_button)
         registerBTN = findViewById(R.id.finRegistro_button)

         beginnerBTN.setOnClickListener {
             selectedExperience = "Principiante"
         }

         intermediateBTN.setOnClickListener {
             selectedExperience = "Intermedio"
         }

         advancedBTN.setOnClickListener {
             selectedExperience = "Avanzado"
         }

        registerBTN.setOnClickListener {
            val username = usernameInput.text.toString()
            val password = passwordInput.text.toString()
            val mail = mailInput.text.toString()
            val weight = weightInput.text.toString()
            val height = heightInput.text.toString()

            // Verificar si los campos están vacíos
            if (username.isEmpty() || password.isEmpty() || mail.isEmpty() || weight.isEmpty() || height.isEmpty()) {

                Toast.makeText(this, "Por favor, ingrese sus datos para crear una cuenta", Toast.LENGTH_SHORT).show()
            } else {
                val intent = Intent(this, HomeScreen::class.java)
                startActivity(intent)
                Log.i("Test Credentials", "Username : $username and Password : $password")
            }
            Log.d("Register", "Username: $username, Password: $password, Mail: $mail, Weight: $weight, Height: $height, Experience: $selectedExperience")


        }


    }
}


