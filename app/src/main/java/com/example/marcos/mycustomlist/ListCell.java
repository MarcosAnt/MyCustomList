/**
 * Created by Marcos on 10/04/2018.
 */

package com.example.marcos.mycustomlist;

import android.app.Activity;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;

public class ListCell extends ArrayAdapter<String> {
    private final Activity context;
    private final String[] refri;
    private final Integer[] imageId;

    public ListCell(Activity context, String[] refri, Integer[] imageId) {
        super(context, R.layout.list_cell, refri);
        this.context = context;
        this.refri = refri;
        this.imageId = imageId;
    }

    @Override
    public View getView(int position, View view, ViewGroup parent) {
        LayoutInflater inflater = context.getLayoutInflater();
        View rowView = inflater.inflate(R.layout.list_cell, null, true);
        TextView txtTitle = (TextView) rowView.findViewById(R.id.txtCell);
        ImageView imageView = (ImageView) rowView.findViewById(R.id.imgCell);
        txtTitle.setText(refri[position]);
        imageView.setImageResource(imageId[position]);
        return rowView;
    }
}
