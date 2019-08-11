package com.example.vocubulary;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ListView;

import java.nio.file.Watchable;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;


public class Bed_fragment extends Fragment {
    public Bed_fragment() {
    }

    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {

        View rootView = LayoutInflater.from(getContext()).inflate(R.layout.activity_bed_fragment, container, false);
        ListView mlist = rootView.findViewById(R.id.bed_list);
        List<Word> bedList = new ArrayList<>();

        bedList.add(new Word("Mattress", "a fabric case filled with soft, firm material, used for sleeping on."));
        bedList.add(new Word("Sheet", "a large rectangular piece of cotton or other fabric, used on a bed to cover the mattress and as a layer beneath blankets when these are used."));
        bedList.add(new Word("Bed sheet", "a sheet for a bed."));
        bedList.add(new Word("Fitted sheet", "a fabric sheet with elasticated corners designed to fit tightly over a mattress."));
        bedList.add(new Word("Blanket", "a large piece of woollen or similar material used as a covering on a bed or elsewhere for warmth."));
        bedList.add(new Word("Quilt", "a warm bed covering made of padding enclosed between layers of fabric and kept in place by lines of stitching, typically applied in a decorative design."));
        bedList.add(new Word("Bedding", "bedclothes such as bed sheet,pillow sheet and so on."));
        bedList.add(new Word("Wardrobe", "a wardrobe is a tall cupboard or cabinet in which you can hang your clothes."));
        bedList.add(new Word("Bookcase", "A song that is easy to remember."));
        bedList.add(new Word("Drawer(s)", "A person who writes music,especially classical music."));
        bedList.add(new Word("Carpet/rug", "A strong, regular repeated pattern of movement or sound."));
        bedList.add(new Word("Desk", "To sing the wrong tune."));
        bedList.add(new Word("Shelf", "a flat length of wood or rigid material, attached to a wall or forming part of a piece of furniture, that provides a surface for the storage or display of objects."));
        Collections.sort(bedList, new Comparator<Word>() {
            @Override
            public int compare(Word word, Word t1) {
                return word.getVocabularyWord().compareTo(t1.getVocabularyWord());
            }
        });
        WordAdapter wordAdapter=new WordAdapter(getContext(),android.R.layout.simple_list_item_1,bedList);
        mlist.setAdapter(wordAdapter);
        return rootView;
    }
}
