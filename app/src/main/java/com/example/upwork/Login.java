package com.example.upwork;

import android.content.Intent;
import android.os.Bundle;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;
import androidx.appcompat.app.AppCompatActivity;

public class Login extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);

        // Initialize UI components
        EditText email = findViewById(R.id.email);
        EditText password = findViewById(R.id.password);
        CheckBox rememberMe = findViewById(R.id.rememberMe);
        Button loginButton = findViewById(R.id.loginButton);
        TextView registerText = findViewById(R.id.registerText);

        // Login button click listener
        loginButton.setOnClickListener(v -> {
            String emailInput = email.getText().toString().trim();
            String passwordInput = password.getText().toString().trim();

            if (emailInput.isEmpty() || passwordInput.isEmpty()) {
                Toast.makeText(Login.this, "Please enter email and password", Toast.LENGTH_SHORT).show();
            } else {
                // Dummy validation (replace with real authentication logic)
                if (emailInput.equals("admin@example.com") && passwordInput.equals("123456")) {
                    Toast.makeText(Login.this, "Login Successful!", Toast.LENGTH_SHORT).show();
                } else {
                    Toast.makeText(Login.this, "Invalid email or password", Toast.LENGTH_SHORT).show();
                }
            }
        });

        // Navigate to Sign-up Activity when clicking "Don't have an account? Register"
        registerText.setOnClickListener(v -> {
            Intent intent = new Intent(Login.this, signup.class);
            startActivity(intent);
        });
    }
}
