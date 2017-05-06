package com.example.android.musicalui;

import android.content.Context;
import android.graphics.Color;
import android.graphics.drawable.GradientDrawable;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.Button;
import android.widget.GridView;

/**
 * Created by Trompetica on 5/5/2017.
 */

public class RadioAdapter extends BaseAdapter {
    private Context mContext;

    // Gets the context so it can be used later
    public RadioAdapter(Context c) {
        mContext = c;
    }

    // Total number of things contained within the adapter
    public int getCount() {
        return btnnames.length;
    }

    // Require for structure, not really used in my code.
    public Object getItem(int position) {
        return null;
    }

    // Require for structure, not really used in my code. Can
    // be used to get the id of an item in the adapter for
    // manual control.
    public long getItemId(int position) {
        return position;
    }

    public View getView(int position,
                        View convertView, ViewGroup parent) {
        Button btn;
        if (convertView == null) {
            // if it's not recycled, initialize some attributes
            btn = new Button(mContext);
            btn.setLayoutParams(new GridView.LayoutParams(130, 100));
            btn.setPadding(10, 10, 10, 10);
        }
        else {
            btn = (Button) convertView;
        }

        btn.setText(btnnames[position]);
        // btnnames is an array of strings
        btn.setTextSize(24);
        btn.setTextColor(Color.WHITE);
        GradientDrawable gd = new GradientDrawable(GradientDrawable.Orientation.TL_BR,
                new int[] {0xFFFB8C00,0xFFF50057,0xFFAA00FF});
        gd.setCornerRadius(8.0f);
        btn.setBackground(gd);
        btn.setId(position);

        // Set the onclicklistener so that pressing the button fires an event
        // We will need to implement this onclicklistner.
        btn.setOnClickListener(new RadioOnClickListener(mContext, position, btnnames[position]));

        return btn;
    }
    // references to our buttons
    public String[] btnnames = {
            "88.0", "88.5","89.0",
            "90.8", "91.7","92.1",
            "92.7", "93.5","94.2",
            "95.3", "96.1","97.6",
            "98.3", "99.3","100.2",
            "100.6", "101.3","101.9",
            "102.2", "102.8","103.4",
            "103.8", "104.1","104.8",
            "105.3", "105.8","106.7",
            "107.3", "108.0","108.5"
    };
}