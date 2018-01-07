package com.example.android.miwok;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;

public class NumbersActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_numbers);

        //Array of words
        String [] words = {"One", "Two", "Three", "Four", "Five",
                "Six", "Seven", "Eight", "Nine", "Ten"};

        //Log tag example
        for(int i=0; i<10; i++) {
            Log.v("NumbersActivity", "word at index[" + i + "]: " + words[i]);
        }
    }
}
