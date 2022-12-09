package com.example.googlemapspractice;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.TextView;

public class TaxesActivity extends AppCompatActivity {
    private static double baseFederalTax = 0;
    private static double taxRate = 0.0;
    public static double salary = 0.0;
    private static double salaryTaxCutoff = 0;
    private static double medicareTaxRate = 0.0145;
    private static double socialSecurityTaxRate = 0.062;
    TextView federalTaxView;
    TextView medicareTaxView;
    TextView socialSecurityTaxView;

    public static double federalTax = 0;
    public static double medicareTax = 0;
    public static double socialSecurityTax = 0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_taxes);

        // Components
        federalTaxView = findViewById(R.id.federalTextView);
        medicareTaxView = findViewById(R.id.medicareTextView);
        socialSecurityTaxView = findViewById(R.id.socialSecurityTextView);

        // Get extras
        Bundle extras = getIntent().getExtras();
        salary = extras.getDouble("salary", 0);

        // Set tax rate
        setTaxRate();

        // Calculate taxes
        calculateTaxes();

        // Set text
        setText();
    }

    public static void calculateTaxes() {
        federalTax = baseFederalTax + (taxRate * (salary - salaryTaxCutoff));
        medicareTax = salary * medicareTaxRate;
        socialSecurityTax = salary * socialSecurityTaxRate;
        //System.out.println(federalTax + medicareTax + socialSecurityTax);
    }

    public static void setTaxRate() {
        if (salary < 11001) {
            baseFederalTax = 0;
            taxRate = 0.1;
        } else if (salary < 44726) {
            baseFederalTax = 1100;
            salaryTaxCutoff = 11000;
            taxRate = 0.12;
        } else if (salary < 95376) {
            baseFederalTax = 5147;
            salaryTaxCutoff = 44725;
            taxRate = 0.22;
        } else if (salary < 182101) {
            baseFederalTax = 16290;
            salaryTaxCutoff = 95375;
            taxRate = 0.24;
        } else if (salary < 231251) {
            baseFederalTax = 37104;
            salaryTaxCutoff = 182100;
            taxRate = 0.32;
        } else if (salary < 578126) {
            baseFederalTax = 52832;
            salaryTaxCutoff = 321251;
            taxRate = 0.35;
        } else {
            baseFederalTax = 174238.25;
            salaryTaxCutoff = 578125;
            taxRate = 0.37;
        }
    }

    private void setText() {
        String tax = "$" + String.valueOf(federalTax);
        federalTaxView.setText(tax);

        tax = "$" + String.valueOf(medicareTax);
        medicareTaxView.setText(tax);

        tax = "$" + String.valueOf(socialSecurityTax);
        socialSecurityTaxView.setText(tax);

    }
}