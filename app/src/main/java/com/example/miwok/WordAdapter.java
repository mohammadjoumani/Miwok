package com.example.miwok;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.core.content.ContextCompat;

import java.util.ArrayList;
import java.util.List;

public class WordAdapter extends ArrayAdapter<Word> {
    private int mcolors;

    public WordAdapter(Context context, ArrayList<Word> resource, int colors) {
        super(context, 0, (List<Word>) resource);
        mcolors = colors;

    }


    /*public RestaurantAdapter(Context context, ArrayList<User_D> res)
    {
        super(context,0, (List<User_D>) res);
        mBackupList=res;
        mBackupList1=res;
    }*/
    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        // Gets the AndroidFlavor object from the ArrayAdapter at the appropriate position
        Word currentWord = getItem(position);

        //Adapters recycle views to AdapterViews.
        // If this is a new View object we're getting, then inflate the layout.
        // If not, this view already has the layout inflated from a previous call to getView,
        // and we modify the View widgets as usual.
        View listIteamView = convertView;
        if (listIteamView == null) {
            listIteamView = LayoutInflater.from(getContext()).inflate(R.layout.activity_list_iteam, parent, false);
        }
        TextView DefaultTranslation = (TextView) listIteamView.findViewById(R.id.default_text_view);

        DefaultTranslation.setText(currentWord.getDefaultTranslation());


        TextView MiwokTranslation = (TextView) listIteamView.findViewById(R.id.miwok_text_view);

        MiwokTranslation.setText(currentWord.getMiwokTranslation());
        ImageView imge = (ImageView) listIteamView.findViewById(R.id.item_image);
        if (currentWord.hasImage()) {
            imge.setImageResource(currentWord.getImage());
        } else {
            imge.setVisibility(View.GONE);
        }


        //for colors background
        View textContainer = listIteamView.findViewById(R.id.text_container);
        textContainer.setBackgroundColor(ContextCompat.getColor(getContext(), mcolors));

        return listIteamView;
    }
}
