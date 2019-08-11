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

public class ExtraWords_fragment extends Fragment {

    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        View rootView = LayoutInflater.from(getContext()).inflate(R.layout.activity_extra_words_fragment, container, false);
        ListView mlist = (ListView) rootView.findViewById(R.id.extrawords_list);
        ArrayList<Word> extraVocabs = new ArrayList<>();
        extraVocabs.add(new Word("hicups", "a loud noise that you make in the throat without wanting to."));
        extraVocabs.add(new Word("burp", "noisily release air from the stomach through the mouth."));
        extraVocabs.add(new Word("bruise", "an injury appearing as an area of discoloured skin on the body."));
        extraVocabs.add(new Word("spill", "cause or allow (liquid) to flow over the edge of its container."));
        extraVocabs.add(new Word("sup", "What's up."));
        extraVocabs.add(new Word("lit", "Fun, exciting."));
        extraVocabs.add(new Word("slay", "Slay is defined as to kill or destroy in a violent way, or is slang meaning to impress or amuse."));
        extraVocabs.add(new Word("dope", "cool, excellent or very good."));
        extraVocabs.add(new Word("hastag", "a label or tag for content."));
        extraVocabs.add(new Word("root for", "support or hope for the success of (a person or group entering a contest or undertaking a challenge)."));
        extraVocabs.add(new Word("contemplating", "think about."));
        extraVocabs.add(new Word("contemporary", "modern."));
        String str = "at the same time.";
        extraVocabs.add(new Word("At once", str));
        extraVocabs.add(new Word("in a while", "in a short time."));
        extraVocabs.add(new Word("for a while", "for a short time."));
        extraVocabs.add(new Word("quite often", "many times or frequently."));
        extraVocabs.add(new Word("quite", "completely,fully."));
        extraVocabs.add(new Word("similaryly", "in the same way or likewise."));
        extraVocabs.add(new Word("simultaneously", str));
        extraVocabs.add(new Word("needless", " not necessary or unnecessary."));
        extraVocabs.add(new Word("continuously", "repeatedly without gaps or interruption."));
        extraVocabs.add(new Word("continually", "frequent intervals not continously."));
        extraVocabs.add(new Word("pass by", "to go or move."));
        extraVocabs.add(new Word("avail", "use or benefit."));
        extraVocabs.add(new Word("worthwhile", "worth the time, money, or effort spent."));
        extraVocabs.add(new Word("after a long", "after long time."));
        extraVocabs.add(new Word("all the while", "for all of a period of time or during the entire time."));
        extraVocabs.add(new Word("Rip off", "an act of cheating someone by charging too much or not giving anything of value for money."));
        extraVocabs.add(new Word("shirk", "avoid or neglect (a duty or responsibility)."));
        extraVocabs.add(new Word("at large", "escaped or not yet captured."));
        extraVocabs.add(new Word("imposing", " to force someone to accept something."));
        extraVocabs.add(new Word("offhand", "Without preparation."));
        extraVocabs.add(new Word("overcast", "cloud covering a large part of the sky."));
        extraVocabs.add(new Word("sigh of relief", "a feeling of comfort after worrying about something."));
        extraVocabs.add(new Word("fond off", "to like someone or something very much."));
        extraVocabs.add(new Word("negligence", "failure to take proper care over something."));
        extraVocabs.add(new Word("altogether", "completely,totally."));
        extraVocabs.add(new Word("put out", "to make something such as a fire or cigarette stop burning."));
        extraVocabs.add(new Word("get off", "to get out of something."));
        extraVocabs.add(new Word("stand by", "support or remain loyal to (someone)."));
        extraVocabs.add(new Word("bring up", "to bring (a person) to maturity through nurturing care and education."));
        extraVocabs.add(new Word("materialize", " to make happen or appear in the way that you expected."));
        extraVocabs.add(new Word("ascribe", "regard something as being due to (a cause)."));
        extraVocabs.add(new Word("pass away", "die."));
        extraVocabs.add(new Word("chill out", "to relax instead of worrying or feeling anxious."));
        extraVocabs.add(new Word("lisp", "a speech defect in which s is pronounced like th."));
        extraVocabs.add(new Word("stammer", "to speak or say something with unusual pauses or repeated sounds, either because of speech problems or because of fear or nervousness."));
        extraVocabs.add(new Word("whisper", "peak very softly using one's breath."));
        extraVocabs.add(new Word("totter/stumble", "to walk in a way that does not seem controlled."));
        extraVocabs.add(new Word("fumble/grope", "search blindly or uncertainly by feeling with the hands."));
        extraVocabs.add(new Word("clumsily", "in an awkward and careless way."));
        extraVocabs.add(new Word("peel off", " to pull or strip off the natural external covering or protection of something."));
        extraVocabs.add(new Word("like anything", "very much , very forcefully."));
        extraVocabs.add(new Word("remedy", " a way of solving a problem."));
        Collections.sort(extraVocabs, new Comparator<Word>() {
            public int compare(Word word, Word t1) {
                return word.getVocabularyWord().compareTo(t1.getVocabularyWord());
            }
        });
        mlist.setAdapter(new WordAdapter(getContext(), android.R.layout.simple_list_item_1, extraVocabs));
        return rootView;
    }
}




