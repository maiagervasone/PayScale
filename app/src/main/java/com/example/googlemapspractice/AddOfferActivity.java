package com.example.googlemapspractice;

import android.content.Intent;
import android.location.Address;
import android.location.Geocoder;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

import java.io.IOException;
import java.util.List;

public class AddOfferActivity extends AppCompatActivity {

    private EditText companyET, locationET, salaryET;

    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_add_offer);
        initWidgets();
    }

    private void initWidgets()
    {
        companyET = findViewById(R.id.companyET);
        locationET = findViewById(R.id.locationET);
        salaryET = findViewById(R.id.salaryET);
    }

    public void saveOfferAction(View view) throws IOException {
        String company = companyET.getText().toString();
        String location = locationET.getText().toString();
        double salary = Double.parseDouble(salaryET.getText().toString());

        Geocoder geocoder = new Geocoder(this);

        List<Address> coords = geocoder.getFromLocationName(location, 1);
        List<Address> addresses = null;
        try {
            addresses = geocoder.getFromLocation(coords.get(0).getLatitude(), coords.get(0).getLongitude(), 1);
        } catch (IOException e) {
            e.printStackTrace();
        }
        String cityName = addresses.get(0).getLocality();
        //String state = addresses.get(0).getAdminArea();

        // Get state from location string
        int stateIndex = location.indexOf(",") + 2;
        String stateString = location.substring(stateIndex);
        stateString = stateString.toLowerCase();
        State state = Data.states.get(stateString);
        Log.d("state", "saveOfferAction: State name = " + stateString);
        Log.d("state", "saveOfferAction: Average salary = " +String.valueOf(state.averageSalary));

        // Calculate state income tax
        ComparisonActivity.calculateIncomeTax(state, salary);
        Log.d("state", "saveOfferAction: State income tax = " + state.incomeTax*100 + "%");

        // Government taxes
        TaxesActivity.salary = salary;
        TaxesActivity.setTaxRate();
        TaxesActivity.calculateTaxes();

        // Calculate net salary
        ComparisonActivity.calculateTakeHomePay(state, salary);

        Log.d("state", "saveOfferAction: Take home pay = " + state.takeHomePay);

        // Make offer
        Offer newOffer = new Offer(company, cityName, salary, state.takeHomePay, coords.get(0).getLatitude(), coords.get(0).getLongitude());

        Offer.offerList.add(newOffer);
        Intent myIntent = new Intent(getBaseContext(), ViewByListActivity.class);
        startActivity(myIntent);
        finish();
    }

}
