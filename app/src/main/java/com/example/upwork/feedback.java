package com.example.upwork;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import androidx.appcompat.app.AppCompatActivity;

public class feedback extends AppCompatActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    // Home Button Click
    public void onHomeClick(View view) {
        Intent intent = new Intent(this, feedback.class);
        startActivity(intent);
    }


    // Feedback Button Click
    public void onFeedback(View view) {
        Intent intent = new Intent(this, feedback1.class);
        startActivity(intent);
    }
}
