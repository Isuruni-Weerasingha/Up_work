package com.example.upwork;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

import androidx.appcompat.app.AppCompatActivity;

public class Home extends AppCompatActivity {  // Class names should start with uppercase letters for convention

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.home);  // Ensure this layout file exists in res/layout
    }

    // Method to navigate to the home screen or main activity
    public void onHomeClick(View view) {
        Intent intent = new Intent(this, Home.class);  // Replace with your actual home activity
        startActivity(intent);
        finish();  // Close current activity after navigating
    }
    public void onContentClick(View view) {
        Intent intent = new Intent(this, Home.class);  // Ensure AboutUsActivity exists
        startActivity(intent);
        finish();
    }

    public void onAboutClick(View view) {
        Intent intent = new Intent(this, Home.class);  // Ensure AboutUsActivity exists
        startActivity(intent);
        finish();
    }
    public void onFeedbackClick(View view) {
        Intent intent = new Intent(this, Home.class);  // Ensure AboutUsActivity exists
        startActivity(intent);
        finish();
    }



}
