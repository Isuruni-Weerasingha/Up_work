package com.example.upwork;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;
import androidx.appcompat.app.AppCompatActivity;

import com.example.upwork.R;

public class Details_Info extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_details_info);

        TextView jobTitle = findViewById(R.id.job_title);
        TextView jobLocation = findViewById(R.id.job_location);
        TextView jobType = findViewById(R.id.job_type);
        TextView jobSalary = findViewById(R.id.job_salary);
        TextView jobDetails = findViewById(R.id.job_details);
        TextView jobRequirements = findViewById(R.id.job_requirements);
        Button applyButton = findViewById(R.id.apply_button);

        // Set sample data
        jobTitle.setText("Helper");
        jobLocation.setText("📍 Colombo-Kaduwela");
        jobType.setText("Full-time");
        jobSalary.setText("$80 per month");
        jobDetails.setText("A helper assists workers with tasks like cleaning, organizing, and carrying materials in offices, kitchens, warehouses, or construction sites.");
        jobRequirements.setText(" Communication Skills/Customer Service/Time Management/Teamwork ");

        // Apply button click event
        applyButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(Details_Info.this, "Resume Sent!", Toast.LENGTH_SHORT).show();
            }


        });
    }
}
