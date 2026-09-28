package com.shareplate.myapplicationexp_7;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;

public class CustomAdapter extends ArrayAdapter<String> {

    private final Context context;
    private final String[] titles;
    private final String[] subtitles;
    private final int[] imageIds;

    public CustomAdapter(Context context, String[] titles, String[] subtitles, int[] imageIds) {
        super(context, R.layout.list_item, titles);
        this.context = context;
        this.titles = titles;
        this.subtitles = subtitles;
        this.imageIds = imageIds;
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        LayoutInflater inflater = (LayoutInflater) context.getSystemService(Context.LAYOUT_INFLATER_SERVICE);
        View rowView = inflater.inflate(R.layout.list_item, parent, false);

        ImageView imageView = rowView.findViewById(R.id.item_image);
        TextView titleTextView = rowView.findViewById(R.id.item_title);
        TextView subtitleTextView = rowView.findViewById(R.id.item_subtitle);

        imageView.setImageResource(imageIds[position]);
        titleTextView.setText(titles[position]);
        subtitleTextView.setText(subtitles[position]);

        return rowView;
    }
}