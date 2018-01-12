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
        words.add(new Word("one", "un"));
        words.add(new Word("Two", "deux"));
        words.add(new Word("Three", "trois"));
        words.add(new Word("Four", "quatre"));
        words.add(new Word("Five", "cinq"));
        words.add(new Word("Six", "six"));
        words.add(new Word("Seven", "sept"));
        words.add(new Word("Eight", "huit"));
        words.add(new Word("Nine", "neuf"));
        words.add(new Word("Ten", "dix"));

        //https://developer.android.com/guide/topics/ui/declaring-layout.html#AdapterViews
        WordAdapter adapter = new WordAdapter(this, words);
        ListView listView = (ListView) findViewById(R.id.list_numbers);
        listView.setAdapter(adapter);
    }
}
