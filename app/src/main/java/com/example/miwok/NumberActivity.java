package com.example.miwok;

import androidx.appcompat.app.AppCompatActivity;

import android.media.MediaPlayer;
import android.os.Bundle;
import android.provider.UserDictionary;
import android.util.SparseArray;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.LinearLayout;
import android.widget.ListView;
import android.widget.TextView;

import java.util.ArrayList;

public class NumberActivity extends AppCompatActivity {

    private MediaPlayer mediaPlayer;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_number);


        final ArrayList<Word> words = new ArrayList<Word>();
        /*
        * Word w=new Word("one", "lutti");
        word.add(w);*/

        words.add(new Word("one", "lutti",R.drawable.number_one , R.raw.number_one));
        words.add(new Word("two", "otiiko",R.drawable.number_two, R.raw.number_two));
        words.add(new Word("three", "tolookosu",R.drawable.number_three, R.raw.number_three));
        words.add(new Word("four", "oyyisa",R.drawable.number_four, R.raw.number_four));
        words.add(new Word("five", "massokka",R.drawable.number_five, R.raw.number_five));
        words.add(new Word("six", "temmokka",R.drawable.number_six, R.raw.number_six));
        words.add(new Word("seven", "kenekatuu",R.drawable.number_seven, R.raw.number_seven));
        words.add(new Word("eight", "kawinta",R.drawable.number_eight, R.raw.number_eight));
        words.add(new Word("nine", "wo'e",R.drawable.number_nine, R.raw.number_nine));
        words.add(new Word("ten", "na'aacua",R.drawable.number_ten, R.raw.number_ten));


        WordAdapter adapter = new WordAdapter(this, words , R.color.category_numbers);
        final ListView listveiw = (ListView) findViewById(R.id.list_view_number);
        listveiw.setAdapter(adapter);
        listveiw.setOnItemClickListener(new AdapterView.OnItemClickListener() {

            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                Word o=words.get(position);
             mediaPlayer=MediaPlayer.create(NumberActivity.this,o.getMmusic());
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
