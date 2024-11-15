package com.example.assignmentapp
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity
import com.example.assignmentapp.R

class MainActivity : AppCompatActivity() {

    // Declare your EditText and Button variables
    private lateinit var nameEditText: EditText
    private lateinit var emailEditText: EditText
    private lateinit var phoneEditText: EditText
    private lateinit var passwordEditText: EditText
    private lateinit var submitButton: Button

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        // Initialize the views
        nameEditText = findViewById(R.id.editTextText)
        emailEditText = findViewById(R.id.editTextTextEmailAddress)
        phoneEditText = findViewById(R.id.editTextPhone)
        passwordEditText = findViewById(R.id.editTextNumberPassword)
        submitButton = findViewById(R.id.button)

        // Set up a click listener for the submit button
        submitButton.setOnClickListener {
            // Call the function to validate the fields
            if (isValidInput()) {
                // If valid, you can proceed with your logic, e.g., submitting the form
                Toast.makeText(this, "Form Submitted Successfully!", Toast.LENGTH_SHORT).show()
            }
        }
    }

    // Function to check if all input fields are filled
    private fun isValidInput(): Boolean {
        var isValid = true

        // Validate Name field
        if (nameEditText.text.toString().isEmpty()) {
            nameEditText.error = "Name is required"
            isValid = false
        }

        // Validate Email field
        if (emailEditText.text.toString().isEmpty()) {
            emailEditText.error = "Email is required"
            isValid = false
        }

        // Validate Phone field
        if (phoneEditText.text.toString().isEmpty()) {
            phoneEditText.error = "Phone number is required"
            isValid = false
        }

        // Validate Password field
        if (passwordEditText.text.toString().isEmpty()) {
            passwordEditText.error = "Password is required"
            isValid = false
        }

        return isValid
    }
}
