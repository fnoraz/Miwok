package com.example.android.miwok;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.TextView;

import java.util.ArrayList;

public class WordAdapter extends ArrayAdapter<Word> {
    public WordAdapter (Context context, ArrayList<Word> words){
        super(context, 0, words);
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        // Get the data item for this position
        Word myword = super.getItem(position);
        // Check if an existing view is being reused, otherwise inflate the view
        if (convertView == null) {
            convertView = LayoutInflater.from(getContext()).inflate(R.layout.list_item, parent, false);
        }
        // Lookup view for data population
        TextView miwok_t = (TextView) convertView.findViewById(R.id.miwok_text_view);
        TextView default_t = (TextView) convertView.findViewById(R.id.default_text_view);
        // Populate the data into the template view using the data object
        miwok_t.setText(myword.mMiwokTranslation);
        default_t.setText(myword.mDefaultTranslation);
        // Return the completed view to render on screen
        return convertView;

    }
}
