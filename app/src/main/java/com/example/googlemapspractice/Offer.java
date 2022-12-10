package com.example.googlemapspractice;

import java.util.ArrayList;

public class Offer {
    public static ArrayList<Offer> offerList = new ArrayList<>();

    private String company;
    private String location;
    private double annualSalary;
    private double netSalary;

    private double lat;
    private double lon;

    public Offer(String company, String location, double salary, double netSalary, double lat, double lon)
    {
        this.company = company;
        this.location = location;
        this.annualSalary = salary;
        this.netSalary = netSalary;
        this.lat = lat;
        this.lon = lon;
    }

    public String getCompany() {
        return company;
    }

    public String getLocation(){
        return location;
    }

    public double getAnnualSalary() {
        return annualSalary;
    }

    public double getLat(){
        return lat;
    }

    public double getLon(){
        return lon;
    }

    public double getNetSalary() { return netSalary; }
}