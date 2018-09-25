package com.example.android.miwok;

import android.app.Activity;
import android.support.v4.content.ContextCompat;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.ArrayList;

public class WordAdapter extends ArrayAdapter<Word> {

    //    private static final String LOG_TAG = WordAdapter.class.getSimpleName();
    private int mColorId;
    private int mAudioResourceId;

    public WordAdapter(Activity context, ArrayList<Word> words, int colorId) {
        super(context, 0, words);
        mColorId = colorId;
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        View listItemView = convertView;
        if (listItemView == null) {
            listItemView = LayoutInflater.from(getContext()).inflate(
                    R.layout.list_item, parent, false);

            View myColoredGroup = listItemView.findViewById(R.id.my_colored_group);
            int color = ContextCompat.getColor(getContext(), mColorId);
            myColoredGroup.setBackgroundColor(color);
        }

        Word currentWord = getItem(position);

        TextView miwokTextView = (TextView) listItemView.findViewById(R.id.miwok_translation);
        miwokTextView.setText(currentWord.getMiwokTranslation());

        TextView defaultTextView = (TextView) listItemView.findViewById(R.id.default_translation);
        defaultTextView.setText(currentWord.getDefaultTranslation());

        ImageView wordImage = (ImageView) listItemView.findViewById(R.id.word_image);
        if (currentWord.hasImage()) {
            wordImage.setImageResource(currentWord.getmImageResourceId());
        } else {
            wordImage.setVisibility(View.GONE);
        }

        return listItemView;
    }
}
