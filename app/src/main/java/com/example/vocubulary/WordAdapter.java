package com.example.vocubulary;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.LinearLayout;
import android.widget.TextView;
import android.widget.Toast;
import java.util.List;

public class WordAdapter extends ArrayAdapter {
    public WordAdapter(Context context, int resource, List objects) {
        super(context, resource, objects);
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        View ListView = convertView;
        if (ListView == null) {
            ListView = LayoutInflater.from(getContext()).inflate(R.layout.list_layout, parent, false);
        }
        Word mWord = (Word) getItem(position);
        LinearLayout mLinear = ListView.findViewById(R.id.parentlayout);
        TextView mWords = ListView.findViewById(R.id.first_txt);
        TextView mMeaning = ListView.findViewById(R.id.second_txt);
        //setting text
        mWords.setText(mWord.getVocabularyWord());
        mMeaning.setText(mWord.getVocabularyMeaning());
        mLinear.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Toast.makeText(getContext(), "Sorry no audio resources!", Toast.LENGTH_SHORT).show();
            }
        });
        return ListView;
    }


}
