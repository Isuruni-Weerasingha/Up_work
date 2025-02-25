package com.example.upwork;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

import androidx.appcompat.app.AppCompatActivity;

public class Home extends AppCompatActivity {  // Class names should start with uppercase letters for convention


    private Button homeButton , contentButton ,profileButton ,aboutButton ,feedbackButton;


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
        Intent intent = new Intent(this, job_item.class);  // Ensure AboutUsActivity exists
        startActivity(intent);
        finish();
    }

    public void onProfileClick(View view) {
        Intent intent = new Intent(this, profile.class);  // Ensure AboutUsActivity exists
        startActivity(intent);
        finish();
    }


    public void onAboutClick(View view) {
        Intent intent = new Intent(this, AboutUsActivity.class);  // Ensure AboutUsActivity exists
        startActivity(intent);
        finish();
    }
    public void onFeedbackClick(View view) {
        Intent intent = new Intent(this, feedback1.class);  // Ensure AboutUsActivity exists
        startActivity(intent);
        finish();
    }



}
