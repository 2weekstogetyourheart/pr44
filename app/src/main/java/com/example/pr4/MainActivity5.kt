package com.example.pr4

import android.content.Intent
import android.os.Bundle
import android.util.Patterns
import android.widget.Button
import android.widget.EditText
import androidx.activity.enableEdgeToEdge
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat

class MainActivity5 : AppCompatActivity() {
    private lateinit var emailEditText: EditText
    private lateinit var continueButton: Button

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main5)

        emailEditText = findViewById(R.id.editTextTextEmailAddress)
        continueButton = findViewById(R.id.con)


        continueButton.setOnClickListener {
            val email = emailEditText.text.toString().trim()

            if (isValidEmail(email)) {

                val intent = Intent(this, MainActivity6::class.java)
                startActivity(intent)
            } else {

                Toast.makeText(this, "Invalid email address", Toast.LENGTH_SHORT).show()
            }
        }
    }


    private fun isValidEmail(email: String): Boolean {
        return Patterns.EMAIL_ADDRESS.matcher(email).matches()
    }
}