package com.example.upwork;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

public class profile extends AppCompatActivity {  // Fixed class name

    private Button btnEdit;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_profile); // Ensure this matches your actual XML file name

        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main), (v, insets) -> {
            Insets systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars());
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom);
            return insets;
        });
        btnEdit = findViewById(R.id.btnEdit);

        btnEdit.setOnClickListener(v ->{
                    Intent intent = new Intent(profile.this, setting.class);
                    startActivity(intent);
                    }

        );
    }

    public void onBackClick(View view) {
        Intent intent = new Intent(profile.this, Home.class);  // Replace with your actual home activity
        startActivity(intent);
        finish();  // Close current activity after navigating
    }

}
