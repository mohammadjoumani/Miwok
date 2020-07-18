package com.example.miwok;

import androidx.appcompat.app.AppCompatActivity;

import android.media.MediaPlayer;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ListView;

import java.util.ArrayList;

public class FamilyActivity extends AppCompatActivity {


    private MediaPlayer mediaPlayer;
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_family);


        final ArrayList<Word> words = new ArrayList<Word>();
        /*
        * Word w=new Word("one", "lutti");
        word.add(w);*/

        words.add(new Word("father", "әpә", R.drawable.family_father, R.raw.family_father));
        words.add(new Word("mother", "әṭa", R.drawable.family_mother, R.raw.family_mother));
        words.add(new Word("son", "angsi", R.drawable.family_son, R.raw.family_son));
        words.add(new Word("daughter", "tune", R.drawable.family_daughter, R.raw.family_daughter));
        words.add(new Word("older brother", "taachi", R.drawable.family_older_brother, R.raw.family_older_brother));
        words.add(new Word("younger brother", "chalitti", R.drawable.family_younger_brother, R.raw.family_younger_brother));
        words.add(new Word("older sister", "teṭe", R.drawable.family_older_sister, R.raw.family_older_sister));
        words.add(new Word("younger sister", "kolliti", R.drawable.family_younger_sister, R.raw.family_younger_sister));
        words.add(new Word("grandmother ", "ama", R.drawable.family_grandmother, R.raw.family_grandfather));
        words.add(new Word("grandfather", "paapa", R.drawable.family_grandfather, R.raw.family_grandmother));


        WordAdapter adapter = new WordAdapter(this, words,R.color.category_family);
        ListView listveiw = (ListView) findViewById(R.id.list_view_family);
        listveiw.setAdapter(adapter);
        listveiw.setOnItemClickListener(new AdapterView.OnItemClickListener() {

            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                Word o=words.get(position);
                mediaPlayer=MediaPlayer.create(FamilyActivity.this,o.getMmusic());
                mediaPlayer.start();
            }
        });
//        // Add Textview to linearlayout
//        LinearLayout rootview=(LinearLayout)findViewById(R.id.rootView);
//        int index=0;
//        while (index < word.size()){
//        TextView wordView=new TextView(this);
//        wordView.setText(word.get(index));
//        rootview.addView(wordView);
//        index++;
//        }
    }
}
