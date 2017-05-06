package com.example.android.musicalui;

import android.content.Context;
import android.view.View;
import android.widget.Toast;

/**
 * Created by Trompetica on 5/5/2017.
 */

public class RadioOnClickListener implements View.OnClickListener {
    private final int position;
    private final Context mContext;
    private final String stationName;

    public RadioOnClickListener(Context mContext, int position, String stationName){
        this.stationName = stationName;
        this.mContext = mContext;
        this.position = position;
    }

    public void onClick(View v) {
        Toast.makeText(mContext, "You're tuned in to " + stationName, Toast.LENGTH_SHORT).show();

    }
}
