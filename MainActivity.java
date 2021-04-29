package com.example.currencyconverter;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {

    EditText number;
    Button usdBt;
    Button euroBt;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        number = findViewById(R.id.editTextNumberDecimal);
        usdBt = findViewById(R.id.usdButton);
        euroBt = findViewById(R.id.euroButton);
    }

    public void doConvert(Double convertNum, String type) {

        Double currency = Double.parseDouble(number.getText().toString());
        Double answer = convertNum * currency;
        String result = "CAD " + currency + " is " + type + " " + answer;

        Intent intent = new Intent(this, SecondActivity.class);
        intent.putExtra("result", result);
        startActivity(intent);

    }

    public void usdClick(View view) {
        doConvert(0.8, "$USD");

    }

    public void euroClick(View view) {
        doConvert(0.64, "Euro");
    }
}