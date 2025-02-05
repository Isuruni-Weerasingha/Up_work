package com.example.upwork;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import androidx.appcompat.app.AppCompatActivity;

import com.google.android.ads.mediationtestsuite.activities.HomeActivity;

class feedback1 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void onHomeClick(View view) {
        // Example: Navigate to another activity
        Intent intent = new Intent(this, HomeActivity.class);
        startActivity(intent);
    }

    public void onFacebookClick(View view) {
        openUrl("https://www.facebook.com/");
    }

    public void onTwitterClick(View view) {
        openUrl("https://www.twitter.com/");
    }

    public void onInstagramClick(View view) {
        openUrl("https://www.instagram.com/");
    }

    public void onLinkedInClick(View view) {
        openUrl("https://www.linkedin.com/");
    }

    private void openUrl(String url) {
        Intent intent = new Intent(Intent.ACTION_VIEW, Uri.parse(url));
        startActivity(intent);
    }
}
