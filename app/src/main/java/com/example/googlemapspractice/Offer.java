package com.example.googlemapspractice;

import java.util.ArrayList;

public class Offer {
    public static ArrayList<Offer> offerList = new ArrayList<>();

    private String company;
    private String city;
    private String state;

    private int annualSalary;
    private double netSalary;

    private double lat;
    private double lon;

    public Offer(String company, String city, String state, int salary, double lat, double lon)
    {
        this.company = company;
        this.city = city;
        this.state = state;
        this.annualSalary = salary;
        this.lat = lat;
        this.lon = lon;

        calculateNetSalary();
    }

    private void calculateNetSalary(){
        Data stateData = new Data();
        State stateOne = stateData.states.get(this.state);

        double taxes = 0.0;

        // federal income tax
        if (this.annualSalary >= 523601){
            taxes += 157804.25 + 0.37*(this.annualSalary-523600);
        }
        else if (this.annualSalary >= 209426){
            taxes += 47843 + 0.35*(this.annualSalary-209425);
        }
        else if (this.annualSalary >= 164926){
            taxes += 33603 + 0.32*(this.annualSalary-164925);
        }
        else if (this.annualSalary >= 86376){
            taxes += 14751 + 0.24*(this.annualSalary-86375);
        }
        else if (this.annualSalary >= 40526){
            taxes += 4664 + 0.22*(this.annualSalary-40525);
        }
        else if (this.annualSalary >= 9951){
            taxes += 995 + 0.12*(this.annualSalary-9950);
        }
        else {
            taxes += 0.1*(this.annualSalary);
        }

        // social security and medicare taxes
        taxes += 0.0765*(this.annualSalary);

        // state income tax
        taxes += stateOne.incomeTax*(this.annualSalary);

        this.netSalary = this.annualSalary - taxes;

    }

    public String getCompany() {
        return company;
    }

    public String getCity(){
        return city;
    }

    public int getAnnualSalary() {
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