package com.example.upwork;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;

import com.google.android.gms.ads.MobileAds;

public class job_item extends AppCompatActivity {

    // Declare views
    private TextView jobTitle1, jobLocation1, jobType1, jobSalary1, jobDetails1, jobRequirements1;
    private Button applyButton1;

    private TextView jobTitle2, jobLocation2, jobType2, jobSalary2, jobDetails2, jobRequirements2;
    private Button applyButton2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.job_item); // Ensure job_item.xml exists

        // Initialize all views
        initializeViews();

        // Initialize Mobile Ads
        MobileAds.initialize(this, initializationStatus -> {});

        // Set job data for Job 1
        setJobData(jobTitle1, jobLocation1, jobType1, jobSalary1, jobDetails1, jobRequirements1,
                "MAN-POWER", "📍 Pita Kotte", "Part-Time", "2,000 LKR/Day",
                "Manpower jobs include lifting, loading, construction, and factory work, requiring physical strength and stamina.",
                "Work Experience");

        // Set apply button listener for Job 1
        applyButton1.setOnClickListener(v ->
                Toast.makeText(job_item.this, "Resume Sent for Job 1!", Toast.LENGTH_SHORT).show()
        );

        // Set job data for Job 2
        setJobData(jobTitle2, jobLocation2, jobType2, jobSalary2, jobDetails2, jobRequirements2,
                "Cashier - Pvt Ltd.", "📍 Athul Kotte", "Part-time", "3,000 LKR/Day + Food",
                "Involves handling payments, assisting customers, operating registers, and maintaining accurate transaction records.",
                "Basic math skills, Customer Service Skills");

        // Set apply button listener for Job 2
        applyButton2.setOnClickListener(v ->
                Toast.makeText(job_item.this, "Resume Sent for Job 2!", Toast.LENGTH_SHORT).show()
        );
    }

    // Method to initialize views
    private void initializeViews() {
        jobTitle1 = findViewById(R.id.job_title_1);
        jobLocation1 = findViewById(R.id.job_location_1);
        jobType1 = findViewById(R.id.job_type_1);
        jobSalary1 = findViewById(R.id.job_salary_1);
        jobDetails1 = findViewById(R.id.job_details_1);
        jobRequirements1 = findViewById(R.id.job_requirements_1);
        applyButton1 = findViewById(R.id.apply_button_1);

        jobTitle2 = findViewById(R.id.job_title_2);
        jobLocation2 = findViewById(R.id.job_location_2);
        jobType2 = findViewById(R.id.job_type_2);
        jobSalary2 = findViewById(R.id.job_salary_2);
        jobDetails2 = findViewById(R.id.job_details_2);
        jobRequirements2 = findViewById(R.id.job_requirements_2);
        applyButton2 = findViewById(R.id.apply_button_2);
    }

    // Method to set job data dynamically
    private void setJobData(TextView title, TextView location, TextView type, TextView salary,
                            TextView details, TextView requirements, String titleText,
                            String locationText, String typeText, String salaryText,
                            String detailsText, String requirementsText) {
        title.setText(titleText);
        location.setText(locationText);
        type.setText(typeText);
        salary.setText(salaryText);
        details.setText(detailsText);
        requirements.setText(requirementsText);
    }

    public void onHomeClick(View view) {
        // Implement navigation logic if needed
        Toast.makeText(this, "Home Clicked", Toast.LENGTH_SHORT).show();
    }
}
