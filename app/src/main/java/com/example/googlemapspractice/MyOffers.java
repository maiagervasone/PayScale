package com.example.googlemapspractice;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import androidx.appcompat.app.AppCompatActivity;

public class MyOffers extends AppCompatActivity implements View.OnClickListener{

    Button back;
    Button map;
    Button list;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.my_offers);

        assignId(back,R.id.back);
        assignId(map,R.id.map);
        assignId(list,R.id.list);
    }

    void assignId(Button btn,int id){
        btn = findViewById(id);
        btn.setOnClickListener(this);
    }

    @Override
    public void onClick(View view) {
        Button button = (Button) view;
        String buttonText = button.getText().toString();
        if (buttonText.equals("back")) {
            Intent myIntent = new Intent(getBaseContext(), MainActivity.class);
            startActivity(myIntent);
            return;
        }
        if (buttonText.equals("View by Map")) {
            Intent myIntent = new Intent(getBaseContext(), MapsActivity.class);
            startActivity(myIntent);
            return;
        }

        if (buttonText.equals("View by List")) {
            Intent myIntent = new Intent(getBaseContext(), ViewByListActivity.class);
            startActivity(myIntent);
            return;
        }

    }
}