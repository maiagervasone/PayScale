package com.example.googlemapspractice;

import java.util.ArrayList;

public class Offer {
    public static ArrayList<Offer> offerList = new ArrayList<>();

    private String company;
    private String location;
    private int annualSalary;

    private int bonus;
    private String additional;

    private double lat;
    private double lon;

    public Offer(String company, String location, int salary, int bonus, String notes, double lat, double lon)
    {
        this.company = company;
        this.location = location;
        this.annualSalary = salary;
        this.bonus = bonus;
        this.additional = notes;
        this.lat = lat;
        this.lon = lon;
    }

    public String getCompany() {
        return company;
    }

    public String getLocation(){
        return location;
    }

    public int getAnnualSalary() {
        return annualSalary;
    }

    public double getLat(){
        return lat;
    }

    public double getLon(){
        return lon;
    }
}