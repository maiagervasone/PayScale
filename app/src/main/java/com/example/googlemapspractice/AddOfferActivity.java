package com.example.googlemapspractice;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

public class AddOfferActivity extends AppCompatActivity {

    private EditText companyET, locationET, salaryET, bonusET, notesET;
    private TextView companyTV, locationTV, salaryTV, bonusTV, notesTV;

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
        bonusET = findViewById(R.id.bonusET);
        notesET = findViewById(R.id.notesET);

        companyTV = findViewById(R.id.companyTV);
        locationTV = findViewById(R.id.locationTV);
        salaryTV = findViewById(R.id.salaryTV);
        bonusTV = findViewById(R.id.bonusTV);
        notesTV = findViewById(R.id.notesTV);
    }

    public void saveOfferAction(View view)
    {
        String company = companyET.getText().toString();
        String location = locationET.getText().toString();
        int salary = Integer.parseInt(salaryET.getText().toString());
        int bonus = Integer.parseInt(bonusET.getText().toString());
        String notes = notesET.getText().toString();

        Offer newOffer = new Offer(company, location, salary, bonus, notes, -82.4, 71);
        Offer.offerList.add(newOffer);
        Intent myIntent = new Intent(getBaseContext(), ViewByListActivity.class);
        startActivity(myIntent);
    }
}
