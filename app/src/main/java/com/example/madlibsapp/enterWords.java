package com.example.madlibsapp;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.graphics.Typeface;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

public class enterWords extends AppCompatActivity {
    public static final String EXTRA_ADJECTIVE = "com.example.MadLibs.ADJECTIVE";
    public static final String EXTRA_OCCUPATION = "com.example.MadLibs.OCCUPATION";
    public static final String EXTRA_PLACE = "com.example.MadLibs.PLACE";
    public static final String EXTRA_NUMBER = "com.example.MadLibs.NUMBER";
    public static final String EXTRA_ADJECTIVE2 = "com.example.MadLibs.ADJECTIVE2";
    public static final String ERROR_MESSAGE = "com.example.MadLibs.ERROR";


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_enter_words);

    }
    public void sendMessage(View v)
    {
        //this creates the intent that will go from this current Activity to
        //DisplayWelcomeActivity
        Intent intent  = new Intent(this, displayMadLibs.class);
        EditText adjectiveET = findViewById(R.id.adjectiveEditText);
        EditText occupationET = findViewById(R.id.occupationEditText);
        EditText placeET = findViewById(R.id.placeEditText);
        EditText numberET = findViewById(R.id.numberEditText);
        EditText adjective2ET = findViewById(R.id.adjective2EditText);

        TextView errorMessage1 = findViewById(R.id.errorMessageTV);

        String adjective = adjectiveET.getText().toString();
        String occupation = occupationET.getText().toString();
        String place = placeET.getText().toString();
        String number = numberET.getText().toString();
        String adjective2 = adjective2ET.getText().toString();

        String madAdj = "Hello, my fellow " + "<b>" + adjective + "</b>" + " citizens in 2020.";
        String madOcc = "It is me, George Washington, the first " + "<b>" + occupation + "</b>" + ".";
        String madPla = "I am writing from (the) " + "<b>" + place + "</b>" + " where I have been";
        String madNum = "secretly living for the past " + "<b>" + number + "</b>" + " year(s).";
        String madAdj2 = "I am concerned by the  " + "<b>" + adjective2 + "</b>" + "\n state of affairs in America these days.";
        String error = "You need to enter values for all of the words!";


        //attaching the full name String to the intent so we can send it alone to the new
        //Activity
        intent.putExtra(EXTRA_ADJECTIVE, madAdj);
        intent.putExtra(EXTRA_OCCUPATION, madOcc);
        intent.putExtra(EXTRA_PLACE, madPla);
        intent.putExtra(EXTRA_NUMBER, madNum);
        intent.putExtra(EXTRA_ADJECTIVE2, madAdj2);



        if(adjective.length()==0)
        {
            errorMessage1.setText(error);
            errorMessage1.setVisibility(View.VISIBLE);
        }
        else if(adjective.length()!=0)
        {
            startActivity(intent);
        }
        if(occupation.length()==0)
        {
            errorMessage1.setText(error);
            errorMessage1.setVisibility(View.VISIBLE);

        }
        else if(occupation.length()!=0)
        {
            startActivity(intent);
        }
        if(place.length()==0)
        {
            errorMessage1.setText(error);
            errorMessage1.setVisibility(View.VISIBLE);

        }
        else if(place.length()!=0)
        {
            startActivity(intent);
        }
        if(number.length()==0)
        {
            errorMessage1.setText(error);
            errorMessage1.setVisibility(View.VISIBLE);

        }
        else if(number.length()!=0)
        {
            startActivity(intent);
        }
        if(adjective2.length()==0)
        {
            errorMessage1.setText(error);
            errorMessage1.setVisibility(View.VISIBLE);

        }
        else if(adjective2.length()!=0)
        {
            startActivity(intent);
        }



        //this method will start the new Activity (shift the screens)

    }
    public void goHome(View v)
    {
        Intent intent2  = new Intent(this, MainActivity.class);
        startActivity(intent2);

    }
}