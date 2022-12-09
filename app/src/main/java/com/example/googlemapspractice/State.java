package com.example.googlemapspractice;

import org.parceler.Parcel;

import java.util.HashMap;
import java.util.Map;

@Parcel
public class State {
    public String name;
    public double stateTax;
    public double incomeTax;
    public double takeHomePay;
    public double costOfLivingIndex;
    public double housingIndex;
    public double groceriesIndex;
    public double utilitiesIndex;
    public double transportationIndex;
    public double healthIndex;
    public double miscellaneousIndex;
    public int averageSalary;
    double[] stateTaxRates;
    double[] stateTaxBrackets;
    //public Map<Double, Double> stateTaxes = new HashMap<Double, Double>();

    public State() {}

    public State(String name, double stateTax, double costOfLivingIndex, double housingIndex,
                 double groceriesIndex, double utilitiesIndex, double transportationIndex,
                 double healthIndex, double miscellaneousIndex, int averageSalary) {
        this.name = name;
        this.stateTax = stateTax;
        this.costOfLivingIndex = costOfLivingIndex;
        this.housingIndex = housingIndex;
        this.groceriesIndex = groceriesIndex;
        this.utilitiesIndex = utilitiesIndex;
        this.transportationIndex = transportationIndex;
        this.healthIndex = healthIndex;
        this.miscellaneousIndex = miscellaneousIndex;
        this.averageSalary = averageSalary;
    }

}
