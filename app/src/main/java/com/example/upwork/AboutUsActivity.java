package com.example.upwork;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;
import androidx.appcompat.app.AppCompatActivity;

public class AboutUsActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.about_us);

        Button contactButton = findViewById(R.id.contact_button);
        contactButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(AboutUsActivity.this, ContactUs.class);  // Replace with your actual home activity
                startActivity(intent);
                Toast.makeText(AboutUsActivity.this, "Contact Us Clicked!", Toast.LENGTH_SHORT).show();
            }
        });

    }

    public void onBackClick(View view) {
        Intent intent = new Intent(AboutUsActivity.this, Home.class);  // Replace with your actual home activity
        startActivity(intent);
        finish();  // Close current activity after navigating
    }
}
