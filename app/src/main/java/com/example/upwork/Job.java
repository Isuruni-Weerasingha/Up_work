package com.example.upwork;

public class Job {
    private final String companyName;
    private final String jobTitle;
    private final String jobLocation;
    private final String jobSalary;

    public Job(String companyName, String jobTitle, String jobLocation, String jobSalary) {
        this.companyName = companyName;
        this.jobTitle = jobTitle;
        this.jobLocation = jobLocation;
        this.jobSalary = jobSalary;
    }

    public String getCompanyName() { return companyName; }
    public String getJobTitle() { return jobTitle; }
    public String getJobLocation() { return jobLocation; }
    public String getJobSalary() { return jobSalary; }
}
