package com.example.android.miwok;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ListView;

import java.util.ArrayList;

public class FamilyActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_family);

        ArrayList <Word> words = new ArrayList<Word>();
        words.add(new Word("father","pere"));
        words.add(new Word("mother","mere"));
        words.add(new Word("son","fils"));
        words.add(new Word("daughter","fille"));
        words.add(new Word("old brother","vieux pere"));
        words.add(new Word("young brother","vieille mere"));
        words.add(new Word("old sister","vieille soeur"));
        words.add(new Word("young sister","jeune soeur"));
        words.add(new Word("grandmother","grand mere"));
        words.add(new Word("grandfather","grand pere"));

        //https://developer.android.com/guide/topics/ui/declaring-layout.html#AdapterViews
        WordAdapter adapter = new WordAdapter(this, words);
        ListView listView = (ListView) findViewById(R.id.list_family);
        listView.setAdapter(adapter);

    }
}


