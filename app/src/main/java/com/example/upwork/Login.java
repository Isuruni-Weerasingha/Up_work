package com.example.upwork;

import android.content.Intent;
import android.os.Bundle;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;
import androidx.appcompat.app.AppCompatActivity;


public class Login extends AppCompatActivity {

    private EditText etEmail, etPassword; // Changed to EditText
    private Button btnLogin;
    private TextView tvForgotPassword, tvRegister;
    private ImageView btnGoogle, btnFacebook, btnInstagram;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);

        // Initialize UI Elements
        etEmail = findViewById(R.id.etEmail);
        etPassword = findViewById(R.id.etPassword);
        btnLogin = findViewById(R.id.btnLogin);
        tvForgotPassword = findViewById(R.id.tvForgotPassword);
        tvRegister = findViewById(R.id.tvRegister);
        btnGoogle = findViewById(R.id.btnGoogle);
        btnFacebook = findViewById(R.id.btnFacebook);
        btnInstagram = findViewById(R.id.btnInstagram);

        // Login Button Click
        btnLogin.setOnClickListener(v -> {
            String email = etEmail.getText().toString().trim();
            String password = etPassword.getText().toString().trim();

            if (email.isEmpty() || password.isEmpty()) {
                Toast.makeText(Login.this, "Please enter email and password", Toast.LENGTH_SHORT).show();
            } else {
                Toast.makeText(Login.this, "Login Successful", Toast.LENGTH_SHORT).show();
            }
        });

        // Forgot Password Click
        tvForgotPassword.setOnClickListener(v -> {
            Toast.makeText(Login.this, "Forgot Password Clicked", Toast.LENGTH_SHORT).show();
        });

        // Register Click
        tvRegister.setOnClickListener(v -> {
            Intent intent = new Intent(Login.this, signup.class);
            startActivity(intent);
        });

        // Google Login Click
        btnGoogle.setOnClickListener(v -> {
            Toast.makeText(Login.this, "Google Login Clicked", Toast.LENGTH_SHORT).show();
        });

        // Facebook Login Click
        btnFacebook.setOnClickListener(v -> {
            Toast.makeText(Login.this, "Facebook Login Clicked", Toast.LENGTH_SHORT).show();
        });

        btnInstagram.setOnClickListener(v -> {
            Toast.makeText(Login.this, "Istagram Login Clicked", Toast.LENGTH_SHORT).show();
        });
    }

}
