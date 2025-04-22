package com.example.upwork;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;

import androidx.appcompat.app.AppCompatActivity;

import com.example.upwork.R;

public class feedback1 extends AppCompatActivity { // Renamed to follow Java conventions

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_feedback1); // Ensure this layout file exists
    }

    // Navigate back to the main/home activity
    public void onHomeClick(View view) {
        Intent intent = new Intent(this, feedback1.class); // Replace with the actual home activity
        startActivity(intent);
        finish(); // Close the current activity to prevent multiple instances
    }


    // Open Facebook
    public void onFacebookClick(View view) {
        openUrl("https://www.facebook.com/");
    }

    // Open Twitter
    public void onTwitterClick(View view) {
        openUrl("https://www.twitter.com/");
    }

    // Open Instagram
    public void onInstagramClick(View view) {
        openUrl("https://www.instagram.com/");
    }

    // Open LinkedIn
    public void onLinkedInClick(View view) {
        openUrl("https://www.linkedin.com/");
    }

    // Open a URL in a browser
    private void openUrl(String url) {
        Intent intent = new Intent(Intent.ACTION_VIEW, Uri.parse(url));
        startActivity(intent);
    }

    public void onBackClick(View view) {
        Intent intent = new Intent(feedback1.this, Home.class);  // Replace with your actual home activity
        startActivity(intent);
        finish();  // Close current activity after navigating
    }
}
