package com.example.googlemapspractice;

import android.content.Intent;
import android.location.Address;
import android.location.Geocoder;
import android.os.Bundle;
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
        int salary = Integer.parseInt(salaryET.getText().toString());

        Geocoder geocoder = new Geocoder(this);

        List<Address> coords = geocoder.getFromLocationName(location, 1);
        List<Address> addresses = null;
        try {
            addresses = geocoder.getFromLocation(coords.get(0).getLatitude(), coords.get(0).getLongitude(), 1);
        } catch (IOException e) {
            e.printStackTrace();
        }
        String cityName = addresses.get(0).getLocality();
        String state = addresses.get(0).getAdminArea();

        Offer newOffer = new Offer(company, cityName, state, salary, coords.get(0).getLatitude(), coords.get(0).getLongitude());
        Offer.offerList.add(newOffer);
        Intent myIntent = new Intent(getBaseContext(), ViewByListActivity.class);
        startActivity(myIntent);
    }

}
