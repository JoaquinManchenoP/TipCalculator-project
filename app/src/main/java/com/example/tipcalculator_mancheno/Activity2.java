package com.example.tipcalculator_mancheno;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.TextView;

import org.w3c.dom.Text;

public class Activity2 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_2);

        Intent intent = getIntent();
        int number = intent.getIntExtra(MainActivity.EXTRA_NUMBER,0);
        int percentage = intent.getIntExtra(MainActivity.EXTRA_PERCENTAGE, 0);



        TextView numberOfPeople = findViewById(R.id.people);
        TextView tipPerPerson = findViewById(R.id.tipPerPerson);
        TextView totalTip = findViewById(R.id.totalCost);

        numberOfPeople.setText(  " "+ number + " people "  );
        tipPerPerson.setText( "" + percentage + "% tip selected" );










    }
}