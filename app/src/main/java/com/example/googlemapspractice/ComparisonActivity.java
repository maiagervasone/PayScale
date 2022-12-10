package com.example.googlemapspractice;

import android.graphics.Color;
import android.os.Bundle;
import android.util.Log;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

import org.parceler.Parcels;

public class ComparisonActivity extends AppCompatActivity {
    State stateOne;
    State stateTwo;
    public static double salary = 0;
    double federalTax = 0;
    double medicareTax = 0;
    double socialSecurityTax = 0;

    int s1Color, s2Color;

    TextView stateOneName, stateTwoName;
    TextView stateOneStateTax, stateTwoStateTax;
    TextView stateOneIncomeTax, stateTwoIncomeTax;
    TextView stateOneTakeHomePay, stateTwoTakeHomePay;
    TextView stateOneCOLIndex, stateTwoCOLIndex;
    TextView stateOneHousingIndex, stateTwoHousingIndex;
    TextView stateOneGroceriesIndex, stateTwoGroceriesIndex;
    TextView stateOneUtilitiesIndex, stateTwoUtilitiesIndex;
    TextView stateOneTransportationIndex, stateTwoTransportationIndex;
    TextView stateOneHealthIndex, stateTwoHealthIndex;
    TextView stateOneMiscellaneousIndex, stateTwoMiscellaneousIndex;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_comparison);

        // Components
        stateOneName = findViewById(R.id.stateOneNameTextView);
        stateTwoName = findViewById(R.id.stateTwoNameTextView);
        stateOneStateTax = findViewById(R.id.stateOneStateTaxTextView);
        stateTwoStateTax = findViewById(R.id.stateTwoStateTaxTextView);
        stateOneIncomeTax = findViewById(R.id.stateOneIncomeTaxTextView);
        stateTwoIncomeTax = findViewById(R.id.stateTwoIncomeTaxTextView);
        stateOneTakeHomePay = findViewById(R.id.stateOneTakeHomePayTextView);
        stateTwoTakeHomePay = findViewById(R.id.stateTwoTakeHomePayTextView);
        stateOneCOLIndex = findViewById(R.id.stateOneCostOfLivingTextView);
        stateTwoCOLIndex = findViewById(R.id.stateTwoCostOfLivingTextView);
        stateOneHousingIndex = findViewById(R.id.stateOneHousingIndexTextView);
        stateTwoHousingIndex = findViewById(R.id.stateTwoHousingIndexTextView);
        stateOneGroceriesIndex = findViewById(R.id.stateOneGroceriesIndexTextView);
        stateTwoGroceriesIndex = findViewById(R.id.stateTwoGroceriesIndexTextView);
        stateOneUtilitiesIndex = findViewById(R.id.stateOneUtilitiesIndexTextView);
        stateTwoUtilitiesIndex = findViewById(R.id.stateTwoUtilitiesIndexTextView);
        stateOneTransportationIndex = findViewById(R.id.stateOneTransportationIndexTextView);
        stateTwoTransportationIndex = findViewById(R.id.stateTwoTransportationIndexTextView);
        stateOneHealthIndex = findViewById(R.id.stateOneHealthIndexTextView);
        stateTwoHealthIndex = findViewById(R.id.stateTwoHealthIndexTextView);
        stateOneMiscellaneousIndex = findViewById(R.id.stateOneMiscellaneousIndexTextView);
        stateTwoMiscellaneousIndex = findViewById(R.id.stateTwoMiscellaneousIndexTextView);

        // Passed in states
        stateOne = (State) Parcels.unwrap(getIntent().getParcelableExtra("stateOne"));
        stateTwo = (State) Parcels.unwrap(getIntent().getParcelableExtra("stateTwo"));
        Bundle extras = getIntent().getExtras();
        salary = extras.getDouble("salary", 0);

        // Income tax
        calculateIncomeTax(stateOne, salary);
        calculateIncomeTax(stateTwo, salary);

        // Government taxes
        TaxesActivity.salary = salary;
        TaxesActivity.setTaxRate();
        TaxesActivity.calculateTaxes();

        // Take Home Pay
        calculateTakeHomePay(stateOne, salary);
        calculateTakeHomePay(stateTwo, salary);
        showData();
    }

    public static void calculateIncomeTax(State state, double salary) {
        double incomeTaxRate = 0.0;

        // Get stateTaxBrackets
        double[] brackets = state.stateTaxBrackets;

        if (brackets != null) {
            Log.d("state", "calculateIncomeTax: Length = " + brackets.length);
            for (int i = brackets.length - 1; i >= 0; i--) {
                Log.d("state", "calculateIncomeTax: Salary = " + salary);
                if (salary > brackets[i]) {
                    incomeTaxRate = state.stateTaxRates[i];
                    Log.d("state", "calculateIncomeTax: State income tax rate = " + String.valueOf(incomeTaxRate));
                    break;
                }
            }
        }

        state.incomeTax = incomeTaxRate;
    }

    public static void calculateTakeHomePay(State state, double salary){
        Double incomeTaxDeduction = TaxesActivity.federalTax + TaxesActivity.medicareTax +
                TaxesActivity.socialSecurityTax + (state.incomeTax * salary);
        System.out.println(incomeTaxDeduction);
        Double takeHomePay = salary - incomeTaxDeduction;
        state.takeHomePay = takeHomePay;
    }

    public void showData() {
        // Name
        stateOneName.setText(stateOne.name);
        stateTwoName.setText(stateTwo.name);

        // State Tax
        String string = String.valueOf(stateOne.stateTax) + "%";
        stateOneStateTax.setText(string);
        string = String.valueOf(stateTwo.stateTax) + "%";
        stateTwoStateTax.setText(string);

        if (stateOne.stateTax != stateTwo.stateTax) {
            s1Color = stateOne.stateTax < stateTwo.stateTax ? R.color.green : R.color.red;
            s2Color = stateTwo.stateTax < stateOne.stateTax ? R.color.green : R.color.red;
            stateOneStateTax.setTextColor(getResources().getColor(s1Color));
            stateTwoStateTax.setTextColor(getResources().getColor(s2Color));
        }

        // Income Tax
        double incomeTaxRate = stateOne.incomeTax * 100;
        String incomeTax = String.format("%.2f", incomeTaxRate) + "%";
        stateOneIncomeTax.setText(incomeTax);
        incomeTaxRate = stateTwo.incomeTax * 100;
        incomeTax = String.format("%.2f", incomeTaxRate) + "%";
        stateTwoIncomeTax.setText(incomeTax);

        if (stateOne.incomeTax != stateTwo.incomeTax) {
            s1Color = stateOne.incomeTax < stateTwo.incomeTax ? R.color.green : R.color.red;
            s2Color = stateTwo.incomeTax < stateOne.incomeTax ? R.color.green : R.color.red;
            stateOneIncomeTax.setTextColor(getResources().getColor(s1Color));
            stateTwoIncomeTax.setTextColor(getResources().getColor(s2Color));
        }

        // Take Home Pay
        double takeHomePay = stateOne.takeHomePay;
        String takeHomePayString = "$" + String.format("%.2f", takeHomePay);
        stateOneTakeHomePay.setText(takeHomePayString);
        takeHomePay = stateTwo.takeHomePay;
        takeHomePayString = "$" + String.format("%.2f", takeHomePay);
        stateTwoTakeHomePay.setText(takeHomePayString);

        if (stateOne.takeHomePay != stateTwo.takeHomePay) {
            s1Color = stateOne.takeHomePay > stateTwo.takeHomePay ? R.color.green : R.color.red;
            s2Color = stateTwo.takeHomePay > stateOne.takeHomePay ? R.color.green : R.color.red;
            stateOneTakeHomePay.setTextColor(getResources().getColor(s1Color));
            stateTwoTakeHomePay.setTextColor(getResources().getColor(s2Color));
        }

        // Cost of Living Index
        if (stateOne.costOfLivingIndex != stateTwo.costOfLivingIndex) {
            s1Color = stateOne.costOfLivingIndex < stateTwo.costOfLivingIndex ? R.color.green : R.color.red;
            s2Color = stateTwo.costOfLivingIndex < stateOne.costOfLivingIndex ? R.color.green : R.color.red;
            stateOneCOLIndex.setTextColor(getResources().getColor(s1Color));
            stateTwoCOLIndex.setTextColor(getResources().getColor(s2Color));
        }

        string = String.valueOf(stateOne.costOfLivingIndex);
        stateOneCOLIndex.setText(string);
        string = String.valueOf(stateTwo.costOfLivingIndex);
        stateTwoCOLIndex.setText(string);

        // Housing index
        if (stateOne.housingIndex != stateTwo.housingIndex) {
            s1Color = stateOne.housingIndex < stateTwo.housingIndex ? R.color.green : R.color.red;
            s2Color = stateTwo.housingIndex < stateOne.housingIndex ? R.color.green : R.color.red;
            stateOneHousingIndex.setTextColor(getResources().getColor(s1Color));
            stateTwoHousingIndex.setTextColor(getResources().getColor(s2Color));
        }

        string = String.valueOf(stateOne.housingIndex);
        stateOneHousingIndex.setText(string);
        string = String.valueOf(stateTwo.housingIndex);
        stateTwoHousingIndex.setText(string);

        // Groceries index
        if (stateOne.groceriesIndex != stateTwo.groceriesIndex) {
            s1Color = stateOne.groceriesIndex < stateTwo.groceriesIndex ? R.color.green : R.color.red;
            s2Color = stateTwo.groceriesIndex < stateOne.groceriesIndex ? R.color.green : R.color.red;
            stateOneGroceriesIndex.setTextColor(getResources().getColor(s1Color));
            stateTwoGroceriesIndex.setTextColor(getResources().getColor(s2Color));
        }

        string = String.valueOf(stateOne.groceriesIndex);
        stateOneGroceriesIndex.setText(string);
        string = String.valueOf(stateTwo.groceriesIndex);
        stateTwoGroceriesIndex.setText(string);

        // Utilities index
        if (stateOne.utilitiesIndex != stateTwo.utilitiesIndex) {
            s1Color = stateOne.utilitiesIndex < stateTwo.utilitiesIndex ? R.color.green : R.color.red;
            s2Color = stateTwo.utilitiesIndex < stateOne.utilitiesIndex ? R.color.green : R.color.red;
            stateOneUtilitiesIndex.setTextColor(getResources().getColor(s1Color));
            stateTwoUtilitiesIndex.setTextColor(getResources().getColor(s2Color));
        }

        string = String.valueOf(stateOne.utilitiesIndex);
        stateOneUtilitiesIndex.setText(string);
        string = String.valueOf(stateTwo.utilitiesIndex);
        stateTwoUtilitiesIndex.setText(string);

        // Transportation index
        if (stateOne.transportationIndex != stateTwo.transportationIndex) {
            s1Color = stateOne.transportationIndex < stateTwo.transportationIndex ? R.color.green : R.color.red;
            s2Color = stateTwo.transportationIndex < stateOne.transportationIndex ? R.color.green : R.color.red;
            stateOneTransportationIndex.setTextColor(getResources().getColor(s1Color));
            stateTwoTransportationIndex.setTextColor(getResources().getColor(s2Color));
        }

        string = String.valueOf(stateOne.transportationIndex);
        stateOneTransportationIndex.setText(string);
        string = String.valueOf(stateTwo.transportationIndex);
        stateTwoTransportationIndex.setText(string);

        // Health index
        if (stateOne.healthIndex != stateTwo.healthIndex) {
            s1Color = stateOne.healthIndex < stateTwo.healthIndex ? R.color.green : R.color.red;
            s2Color = stateTwo.healthIndex < stateOne.healthIndex ? R.color.green : R.color.red;
            stateOneHealthIndex.setTextColor(getResources().getColor(s1Color));
            stateTwoHealthIndex.setTextColor(getResources().getColor(s2Color));
        }

        string = String.valueOf(stateOne.healthIndex);
        stateOneHealthIndex.setText(string);
        string = String.valueOf(stateTwo.healthIndex);
        stateTwoHealthIndex.setText(string);

        // Miscellaneous index
        if (stateOne.miscellaneousIndex != stateTwo.miscellaneousIndex) {
            s1Color = stateOne.miscellaneousIndex < stateTwo.miscellaneousIndex ? R.color.green : R.color.red;
            s2Color = stateTwo.miscellaneousIndex < stateOne.miscellaneousIndex ? R.color.green : R.color.red;
            stateOneMiscellaneousIndex.setTextColor(getResources().getColor(s1Color));
            stateTwoMiscellaneousIndex.setTextColor(getResources().getColor(s2Color));
        }

        string = String.valueOf(stateOne.miscellaneousIndex);
        stateOneMiscellaneousIndex.setText(string);
        string = String.valueOf(stateTwo.miscellaneousIndex);
        stateTwoMiscellaneousIndex.setText(string);
    }
}