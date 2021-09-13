package com.example.madlibsapp;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.text.Html;
import android.view.View;
import android.widget.TextView;

public class displayMadLibs extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_display_mad_libs);

        Intent intent = getIntent();

        //extract the data using the constant name we created as its label
        //since this constant lives in MainActivity.java, that is why we need
        //to refer to it in this way

        String theAdj = intent.getStringExtra(enterWords.EXTRA_ADJECTIVE);

        //get a reference to view on screen we want to display text in
        TextView theAdjTV = findViewById(R.id.fullAdjString);

        //extract the data using the constant name we created as its label
        //since this constant lives in MainActivity.java, that is why we need
        //to refer to it in this way

        String theOcc = intent.getStringExtra(enterWords.EXTRA_OCCUPATION);

        //get a reference to view on screen we want to display text in
        TextView theOccTV = findViewById(R.id.fullOccString);

        //extract the data using the constant name we created as its label
        //since this constant lives in MainActivity.java, that is why we need
        //to refer to it in this way

        String thePla = intent.getStringExtra(enterWords.EXTRA_PLACE);

        //get a reference to view on screen we want to display text in
        TextView thePlaTV = findViewById(R.id.fullPlaceString);

        //extract the data using the constant name we created as its label
        //since this constant lives in MainActivity.java, that is why we need
        //to refer to it in this way

        String theNum = intent.getStringExtra(enterWords.EXTRA_NUMBER);

        //get a reference to view on screen we want to display text in
        TextView theNumTV = findViewById(R.id.fullNumberString);

        //extract the data using the constant name we created as its label
        //since this constant lives in MainActivity.java, that is why we need
        //to refer to it in this way

        String theAdj2 = intent.getStringExtra(enterWords.EXTRA_ADJECTIVE2);

        //get a reference to view on screen we want to display text in
        TextView theAdj2TV = findViewById(R.id.fullAdj2String);

        theAdjTV.setText(Html.fromHtml(theAdj));
        theOccTV.setText(Html.fromHtml(theOcc));
        thePlaTV.setText(Html.fromHtml(thePla));
        theNumTV.setText(Html.fromHtml(theNum));
        theAdj2TV.setText(Html.fromHtml(theAdj2));

    }
    public void newScreen(View v)
    {
        Intent intent  = new Intent(this, new_madlibs.class);
        startActivity(intent);
    }
}