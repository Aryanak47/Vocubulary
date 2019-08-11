package com.example.vocubulary;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ListView;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;


public class Eating_fragment extends Fragment {

    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        View rootView = LayoutInflater.from(getContext()).inflate(R.layout.activity_eating_fragment, container, false);
        ListView mlist = (ListView) rootView.findViewById(R.id.eating_list);
        ArrayList<Word> eatingVocabs = new ArrayList<>();
        eatingVocabs.add(new Word("Nibble", "take small bites out of."));
        eatingVocabs.add(new Word("bite", "to use your teeth to cut into something or someone."));
        eatingVocabs.add(new Word("Chew", "a repeated biting or gnawing of something."));
        eatingVocabs.add(new Word("Swallow", "cause or allow (something, especially food or drink) to pass down the throat."));
        eatingVocabs.add(new Word("Gulp", "swallow (drink or food) quickly or in large mouthfuls, often audibly.."));
        eatingVocabs.add(new Word("Sip", "drink (something) by taking small mouthfuls."));
        eatingVocabs.add(new Word("Drink", "take (a liquid) into the mouth and swallow."));
        eatingVocabs.add(new Word("Starving", "suffering or dying from hunger."));
        eatingVocabs.add(new Word("Stuffed", " to be fulled with large amounts of food."));
        Collections.sort(eatingVocabs, new Comparator<Word>() {
            public int compare(Word word, Word t1) {
                return word.getVocabularyWord().compareTo(t1.getVocabularyWord());
            }
        });
        WordAdapter adapter = new WordAdapter(getContext(), android.R.layout.simple_list_item_1, eatingVocabs);
        mlist.setAdapter(adapter);
        return rootView;
    }


}
