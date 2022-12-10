package com.example.googlemapspractice;

import java.util.ArrayList;

public class Offer {
    public static ArrayList<Offer> offerList = new ArrayList<>();

    private String company;
    private String city;
    private double annualSalary;
    private double netSalary;

    private double lat;
    private double lon;

    public Offer(String company, String city, double salary, double netSalary, double lat, double lon)

    {
        this.company = company;
        this.city = city;
        this.annualSalary = salary;
        this.netSalary = netSalary;
        this.lat = lat;
        this.lon = lon;
    }

    public String getCompany() {
        return company;
    }

    public String getCity(){
        return city;
    }

    public double getAnnualSalary() {
        return annualSalary;
    }

    public double getNetSalary() {
        return netSalary;
    }

    public double getLat(){
        return lat;
    }

    public double getLon(){
        return lon;
    }
}