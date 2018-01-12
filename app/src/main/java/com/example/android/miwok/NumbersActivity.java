package com.example.android.miwok;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.widget.ArrayAdapter;
import android.widget.LinearLayout;
import android.widget.ListView;
import android.widget.TextView;

import java.util.ArrayList;

public class NumbersActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_numbers);

        //ArrayList of words
        ArrayList<Word> words = new ArrayList<Word>();
        words.add(new Word("one", "Un"));
        words.add(new Word("Two", "Deux"));
        words.add(new Word("Three", "Trois"));
        words.add(new Word("Four", "Quatre"));
        words.add(new Word("Five", "Cinq"));
        words.add(new Word("Six", "Six"));
        words.add(new Word("Seven", "Sept"));
        words.add(new Word("Eight", "Huit"));
        words.add(new Word("Nine", "Neuf"));
        words.add(new Word("Ten", "Dix"));

        //https://developer.android.com/guide/topics/ui/declaring-layout.html#AdapterViews
        WordAdapter adapter = new WordAdapter(this, words);
        ListView listView = (ListView) findViewById(R.id.list);
        listView.setAdapter(adapter);
    }
}
