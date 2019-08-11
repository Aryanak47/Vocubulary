package com.example.vocubulary;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ListView;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class Relationship_fragment extends Fragment {
    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        View rootView = LayoutInflater.from(getContext()).inflate(R.layout.activity_relationship_fragment, container, false);
        ListView mlist = (ListView) rootView.findViewById(R.id.relationship_list);
        List<Word> relationshipVocabsArray = new ArrayList<>();
        relationshipVocabsArray.add(new Word("to drift apart", "to become less close to someone."));
        relationshipVocabsArray.add(new Word("To enjoy someone's company", "to like spending time with someone."));
        relationshipVocabsArray.add(new Word("To fall out with", "to have a disagreement and stop being friends."));
        relationshipVocabsArray.add(new Word("To get to know", "to begin to know someone."));
        relationshipVocabsArray.add(new Word("To tie the knot", "To get married."));
        relationshipVocabsArray.add(new Word("To look up to", "to admire or respect."));
        relationshipVocabsArray.add(new Word("To lose touch with", "to not see or hear from someone any longer."));
        relationshipVocabsArray.add(new Word("To be on nodding terms", "to know each other only slightly."));
        relationshipVocabsArray.add(new Word("To strike up a relationship", "to begin a friendship."));
        Collections.sort(relationshipVocabsArray, new Comparator<Word>() {
            public int compare(Word word, Word t1) {
                return word.getVocabularyWord().compareTo(t1.getVocabularyWord());
            }
        });
        WordAdapter adapter = new WordAdapter(getContext(), android.R.layout.simple_list_item_1, relationshipVocabsArray);
        mlist.setAdapter(adapter);
        return rootView;
    }

}
