package com.example.upwork;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.Toast;
import androidx.appcompat.app.AppCompatActivity;

public class post_job extends AppCompatActivity {

    private EditText etJobTitle, etLocation, etBudget, etDescription, etRequirements;
    private RadioGroup rgJobType;
    private RadioButton rbFullTime, rbPartTime;
    private Button btnPostJob;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.post_job);

        // Initialize Views
        etJobTitle = findViewById(R.id.etJobTitle);
        etLocation = findViewById(R.id.etLocation);
        etBudget = findViewById(R.id.etBudget);
        etDescription = findViewById(R.id.etDescription);
        etRequirements = findViewById(R.id.etRequirements);
        rgJobType = findViewById(R.id.rgJobType);
        rbFullTime = findViewById(R.id.rbFullTime);
        rbPartTime = findViewById(R.id.rbPartTime);
        btnPostJob = findViewById(R.id.btnPostJob);

        // Handle Button Click
        btnPostJob.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                postJob();
            }
        });
    }

    private void postJob() {
        String jobTitle = etJobTitle.getText().toString().trim();
        String location = etLocation.getText().toString().trim();
        String budget = etBudget.getText().toString().trim();
        String description = etDescription.getText().toString().trim();
        String requirements = etRequirements.getText().toString().trim();

        String jobType = rbFullTime.isChecked() ? "Full Time" : rbPartTime.isChecked() ? "Part Time" : "";

        if (jobTitle.isEmpty() || location.isEmpty() || jobType.isEmpty() || budget.isEmpty() || description.isEmpty() || requirements.isEmpty()) {
            Toast.makeText(this, "Please fill all fields!", Toast.LENGTH_SHORT).show();
            return;
        }

        // Simulate job posting (you can replace this with database/API logic)
        Toast.makeText(this, "Job Posted Successfully!", Toast.LENGTH_LONG).show();
    }
}
