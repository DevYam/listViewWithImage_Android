package com.ncertguruji.listviewwithimage;

import android.app.Activity;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;


public class CustomChapterList extends ArrayAdapter {
    private final String[] chapterName;
    private final String[] chapterDescription;
    private final Integer[] imageId;
    private final Activity context;

    public CustomChapterList(Activity context, String[] chapterName, String[] chapterDescription, Integer[] imageId) {
        super(context, R.layout.row_item, chapterName);
        this.context = context;
        this.chapterName = chapterName;
        this.chapterDescription = chapterDescription;
        this.imageId = imageId;
    }
    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        View row=convertView;
        LayoutInflater inflater = context.getLayoutInflater();
        if(convertView==null)
            row = inflater.inflate(R.layout.row_item, null, true);
        TextView textViewChapter = (TextView) row.findViewById(R.id.chapterName);
        TextView textViewDescription = (TextView) row.findViewById(R.id.chapterDescription);
        ImageView imageFlag = (ImageView) row.findViewById(R.id.chapterImage);

        textViewChapter.setText(chapterName[position]);
        textViewDescription.setText(chapterDescription[position]);
        imageFlag.setImageResource(imageId[position]);
        return  row;
    }
}
