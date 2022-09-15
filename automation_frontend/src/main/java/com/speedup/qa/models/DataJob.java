package com.speedup.qa.models;

public class DataJob {

    private String title;
    private String employmentType;
    private String companyName ;
    private String location;

    private String month;

    private String year;
    private String industry;
    private String description;


    public String getTitle() {return title;}

    public String getEmploymentType() {
        return employmentType;
    }

    public String getCompanyName() {
        return companyName;
    }

    public String getLocation() {
        return location;
    }

    public String getMonth() {return month;}

    public String getYear() {return year;}


    public String getIndustry() {
        return industry;
    }

    public String getDescription() {
        return description;
    }



    public DataJob(String title, String employmentType, String companyName, String location, String month, String year, String industry, String description) {

        this.title = title;
        this.employmentType = employmentType;
        this.companyName = companyName;
        this.location = location;
        this.month = month;
        this.year = year;
        this.industry = industry;
        this.description = description;
    }

}
