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
        jobList.add(new Job("Amazon", "Customer Service Agent", "New York, USA", "$60/Hour"));
        jobList.add(new Job("Total Ltd", "Office Assistance", "New York, USA", "$20/Hour"));
        jobList.add(new Job("Amazon", "Customer Service Agent", "New York, USA", "$60/Hour"));
        jobList.add(new Job("Total Ltd", "Office Assistance", "New York, USA", "$20/Hour"));
        jobList.add(new Job("Amazon", "Customer Service Agent", "New York, USA", "$60/Hour"));
        jobList.add(new Job("Total Ltd", "Office Assistance", "New York, USA", "$20/Hour"));
        jobList.add(new Job("Amazon", "Customer Service Agent", "New York, USA", "$60/Hour"));
        jobList.add(new Job("Total Ltd", "Office Assistance", "New York, USA", "$20/Hour"));
        jobList.add(new Job("Amazon", "Customer Service Agent", "New York, USA", "$60/Hour"));
        jobList.add(new Job("Total Ltd", "Office Assistance", "New York, USA", "$20/Hour"));
        JobAdapter jobAdapter = new JobAdapter(jobList);
        recyclerView.setAdapter(jobAdapter);
    }
}
