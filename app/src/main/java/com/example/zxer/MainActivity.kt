package com.example.zxer

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.content.Intent
import android.widget.Button



class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

      //  val videoView: VideoView = findViewById(R.id.video_view)
        val loginButton: Button = findViewById(R.id.loginScreen_button)
        val registerButton: Button = findViewById(R.id.registerScreen_button)

        // para la dirección del video y lo reproducimos
        //val uri = Uri.parse("android.resource://" + packageName + "/" + R.raw.your_video)
        //videoView.setVideoURI(uri)
        //videoView.start()

        // Pantalla de inicio de sesión
        loginButton.setOnClickListener {
            val intent = Intent(this, Login::class.java)
            startActivity(intent)
        }

        // Pantalla de registro
        registerButton.setOnClickListener {
            val intent = Intent(this, Register::class.java)
            startActivity(intent)
        }
    }
}
