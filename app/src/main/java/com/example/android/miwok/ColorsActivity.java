package com.example.android.miwok;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ListView;

import java.util.ArrayList;

public class ColorsActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_colors);

        //ArrayList of words
        ArrayList<Word> words = new ArrayList<Word>();
        words.add(new Word("red", "rouge"));
        words.add(new Word("green", "vert"));
        words.add(new Word("brown", "marron"));
        words.add(new Word("gray", "gris"));
        words.add(new Word("black", "noir"));
        words.add(new Word("white", "blanc"));
        words.add(new Word("dusty yellow", "jaune tache"));
        words.add(new Word("mustard yellow", "jaune moutarde"));

        //https://developer.android.com/guide/topics/ui/declaring-layout.html#AdapterViews
        WordAdapter adapter = new WordAdapter(this, words);
        ListView listView = (ListView) findViewById(R.id.list_colors);
        listView.setAdapter(adapter);
    }
}
