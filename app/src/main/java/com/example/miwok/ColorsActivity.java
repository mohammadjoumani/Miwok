package com.example.miwok;

import androidx.appcompat.app.AppCompatActivity;

import android.media.MediaPlayer;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ListView;

import java.util.ArrayList;

public class ColorsActivity extends AppCompatActivity {

    private MediaPlayer mediaPlayer;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_colors);


        final ArrayList<Word> words = new ArrayList<Word>();
        /*
        * Word w=new Word("one", "lutti");
        word.add(w);*/

        words.add(new Word("red", "weṭeṭṭi", R.drawable.color_red, R.raw.color_red));  // resource id is of integer type
        words.add(new Word("green", "chokokki", R.drawable.color_green, R.raw.color_green));
        words.add(new Word("brown", "ṭakaakki", R.drawable.color_brown, R.raw.color_brown));
        words.add(new Word("gray", "ṭopoppi", R.drawable.color_gray, R.raw.color_gray));
        words.add(new Word("black","kululli", R.drawable.color_black, R.raw.color_black));
        words.add(new Word("white", "kelelli", R.drawable.color_white, R.raw.color_white));
        words.add(new Word("dusty yellow", "ṭopiisә", R.drawable.color_dusty_yellow, R.raw.color_dusty_yellow));
        words.add(new Word("mustard yellow", "chiwiiṭә", R.drawable.color_mustard_yellow, R.raw.color_mustard_yellow));
        words.add(new Word("red", "weṭeṭṭi", R.drawable.color_red, R.raw.color_red));

        WordAdapter adapter = new WordAdapter(this, words,R.color.category_colors);
        ListView listveiw = (ListView) findViewById(R.id.list_view_color);
        listveiw.setAdapter(adapter);
        listveiw.setOnItemClickListener(new AdapterView.OnItemClickListener() {

            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                Word o=words.get(position);
                mediaPlayer=MediaPlayer.create(ColorsActivity.this,o.getMmusic());
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
