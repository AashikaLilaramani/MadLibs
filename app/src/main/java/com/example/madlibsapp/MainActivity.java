package com.example.madlibsapp;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
    public void newScreen(View v)
    {
        Intent intent  = new Intent(this, enterWords.class);
        startActivity(intent);
    }
    public void instructions(View v)
    {
        String theIntro = "Once you click the continue button, you will be taken " +
                "to a screen where you can enter in words as directed. " +
                "Once you are done with that, you will see a story with " +
                "the words you inputted.";
        TextView intro = findViewById(R.id.introTextView);
        intro.setText(theIntro);
        intro.setVisibility(View.VISIBLE);

    }
}