package com.example.tipcalculator_mancheno;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    public static final String EXTRA_NUMBER = "com.example.application.example.EXTRA_NUMBER";
    public static final String EXTRA_PERCENTAGE = "com.example.application.example.EXTRA_PERCENTAGE";


        RadioGroup radioGroup;
        RadioButton radioButton;
        EditText peopleInput;
        Button calculateButton;




    String TAG = "myMessage";


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        radioGroup = findViewById(R.id.radioGroup);
        calculateButton = findViewById(R.id.calculateButton);


       Button calculateButton= findViewById(R.id.calculateButton);

        calculateButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Log.i(TAG, " the calculate tip button was clicked");

                openActivity2(v);

            }
        });

    }

    public void openActivity2(View v){

        EditText numberOfPeople = (EditText) findViewById(R.id.peopleInput);
        int number = Integer.parseInt(numberOfPeople.getText().toString());
        Intent intent = new Intent(this, Activity2.class);


        intent.putExtra(EXTRA_NUMBER,number);
        intent.putExtra(EXTRA_PERCENTAGE, selectedButton(v));

        startActivity(intent);
    }

    public  int selectedButton(View v){
        int radioButtonid = radioGroup.getCheckedRadioButtonId();
        radioButton = findViewById(radioButtonid);
        int buttonValue = Integer.parseInt(radioButton.getText().toString());

        return buttonValue;












    }

}