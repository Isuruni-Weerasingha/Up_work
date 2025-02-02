package com.example.upwork;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;
import androidx.appcompat.app.AppCompatActivity;

public class signup extends AppCompatActivity {

    private EditText email, password, repeatPassword;
    private CheckBox rememberMe;
    private Button signUpButton;
    private TextView alreadyHaveAccount;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_signup);

        // Initialize UI components
        email = findViewById(R.id.email);
        password = findViewById(R.id.password);
        repeatPassword = findViewById(R.id.repeat_password);
        rememberMe = findViewById(R.id.remember_me);
        signUpButton = findViewById(R.id.signup_button);
        alreadyHaveAccount = findViewById(R.id.already_have_an_account_login);

        // Sign-up button logic
        signUpButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String emailText = email.getText().toString().trim();
                String passwordText = password.getText().toString().trim();
                String repeatPasswordText = repeatPassword.getText().toString().trim();

                if (emailText.isEmpty() || passwordText.isEmpty() || repeatPasswordText.isEmpty()) {
                    Toast.makeText(signup.this, "Please fill all fields", Toast.LENGTH_SHORT).show();
                } else if (!passwordText.equals(repeatPasswordText)) {
                    Toast.makeText(signup.this, "Passwords do not match", Toast.LENGTH_SHORT).show();
                } else {
                    Toast.makeText(signup.this, "Sign-up successful!", Toast.LENGTH_SHORT).show();
                    // TODO: Save user data or integrate with database
                }
            }
        });

        // Navigate to Login Activity when clicking "Already have an account? Login"
        alreadyHaveAccount.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(signup.this, Login.class);
                startActivity(intent);
            }
        });
    }
}
