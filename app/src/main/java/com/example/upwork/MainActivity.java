package com.example.upwork;

import android.os.Bundle;
import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        RecyclerView recyclerView = findViewById(R.id.recyclerView);
        recyclerView.setLayoutManager(new LinearLayoutManager(this));

        List<Job> jobList = new ArrayList<>();
        jobList.add(new Job("MNS Associates", "Audit Trainee", "Pettha", "50LKR/Hour"));
        jobList.add(new Job("Bank of Ceylon", "Data entry", "Malabe", "100LKR/Hour"));
        jobList.add(new Job("Sri Lanka Telecom PLC", "Telecom Careers", "Rajagiriya", "80LKR/Hour"));
        jobList.add(new Job("Urban eats", "catering service", "Pitakotte", "50LKR/Hour"));
        jobList.add(new Job("IDL", "Delivery", "Kothalawala", "$80LKR/Hour"));
        jobList.add(new Job("Unilever", "Digital Commerce Projects Assistant", "Kaduwela", "20LKR/Hour"));

        JobAdapter jobAdapter = new JobAdapter(jobList);
        recyclerView.setAdapter(jobAdapter);
    }
}
