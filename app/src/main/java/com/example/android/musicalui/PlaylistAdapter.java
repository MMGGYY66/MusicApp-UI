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

public class PlaylistAdapter extends BaseAdapter {
    private Context mContext;

    // Gets the context so it can be used later
    public PlaylistAdapter(Context c) {
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
            btn.setLayoutParams(new GridView.LayoutParams(200, 150));
            btn.setPadding(10, 10, 10, 10);
        }
        else {
            btn = (Button) convertView;
        }

        btn.setText(btnnames[position]);
        // btnnames is an array of strings
        btn.setTextSize(20);
        btn.setTextColor(Color.WHITE);
        GradientDrawable gd = new GradientDrawable(GradientDrawable.Orientation.TR_BL,
                new int[] {0xFF81D4FA,0xFF69F0AE,0xFFAA00FF});
        gd.setCornerRadius(8.0f);
        btn.setBackground(gd);
        btn.setId(position);

        return btn;
    }
    // references to our buttons
    public String[] btnnames = {
            "Running", "Cycling","Moto",
            "Study", "Classics","Folk",
            "Japan", "Soundtrack","Blues",
            "Goldies"

    };
}
