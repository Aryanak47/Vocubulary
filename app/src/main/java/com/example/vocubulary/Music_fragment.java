package com.example.vocubulary;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;;
import androidx.fragment.app.Fragment;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ListView;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;


public class Music_fragment extends Fragment {
    public Music_fragment() {
    }

    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        View rootView = LayoutInflater.from(getContext()).inflate(R.layout.activity_music_fragment, container, false);
        ListView mlist = (ListView) rootView.findViewById(R.id.music_list);
        ArrayList<Word> musicArray = new ArrayList<>();
        musicArray.add(new Word("A massive hit", "a record that sells lots of copies."));
        musicArray.add(new Word("To take up a musical instrument", "to begin learning a musical instrument."));
        musicArray.add(new Word("Concert", "a pubic performance of music."));
        musicArray.add(new Word("Adoring fan", "people who love a particular band or singer."));
        musicArray.add(new Word("To sing along to", "to sing a piece of music while someone else is singing or playing it."));
        musicArray.add(new Word("A catchy tune", "a song that is easy to remember."));
        musicArray.add(new Word("Composer", "a person who writes music,especially classical music."));
        musicArray.add(new Word("Rhythm", "a strong, regular repeated pattern of movement or sound."));
        musicArray.add(new Word("to sing out of tune", "To sing the wrong tune."));
        Collections.sort(musicArray, new Comparator<Word>() {
            public int compare(Word word, Word t1) {
                return word.getVocabularyWord().compareTo(t1.getVocabularyWord());
            }
        });
        mlist.setAdapter(new WordAdapter(getContext(), android.R.layout.simple_list_item_1, musicArray));
        return rootView;
    }
    }

