package com.example.android.miwok;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ListView;

import java.util.ArrayList;

public class PhrasesActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_phrases);

        //ArrayList of words
        ArrayList<Word> words = new ArrayList<Word>();
        words.add(new Word("Where are you going?", "Ou vas tu"));
        words.add(new Word("What is your name?", "Comment tu t'appelles"));
        words.add(new Word("My name is...", "Mon nom est ..."));
        words.add(new Word("How are you feeling?", "Comment ca va?"));
        words.add(new Word("I’m feeling good.", "Ca va tres bien"));
        words.add(new Word("Are you coming?", "Est ce que tu viens"));
        words.add(new Word("Yes, I’m coming.", "Oui je viens"));
        words.add(new Word("I’m coming.", "Je viens"));
        words.add(new Word("Let’s go.", "Allons y"));
        words.add(new Word("Come here.", "Viens la"));
        //https://developer.android.com/guide/topics/ui/declaring-layout.html#AdapterViews
        WordAdapter adapter = new WordAdapter(this, words);
        ListView listView = (ListView) findViewById(R.id.list_phrases);
        listView.setAdapter(adapter);
    }
}
