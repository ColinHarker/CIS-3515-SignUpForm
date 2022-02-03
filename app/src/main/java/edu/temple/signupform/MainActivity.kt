package edu.temple.signupform

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.widget.Button
import android.widget.EditText
import android.widget.Toast

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val nameInput = findViewById<EditText>(R.id.NameInput)
        val emailInput = findViewById<EditText>(R.id.EmailInput)
        val passwordInput = findViewById<EditText>(R.id.PasswordInput)
        val passwordInputConfirm = findViewById<EditText>(R.id.PasswordInputConfirm)


        val saveButton = findViewById<Button>(R.id.SaveButton)

        saveButton.setOnClickListener {
            if(nameInput.text.toString() == ""){
                nameInput.error = "Input a name"
            }else if (emailInput.text.toString() == ""){
                emailInput.error = "Input an email"
            }else if(passwordInput.text.toString() == ""){
                passwordInput.error = "Input a password"
            }else if(passwordInputConfirm.text.toString() != passwordInput.text.toString()){
                passwordInputConfirm.error = "Passwords do not match"
            }else{
                Toast.makeText(this, "Welcome, ${nameInput.text}, to the SignUpForm App", Toast.LENGTH_LONG).show()
            }
        }

    }
}