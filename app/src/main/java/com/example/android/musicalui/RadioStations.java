package com.example.android.musicalui;

import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.FrameLayout;
import android.widget.GridView;
import android.widget.Toast;

public class RadioStations extends MainActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
     //  setContentView(R.layout.activity_radio_stations);
        FrameLayout contentFrameLayout = (FrameLayout) findViewById(R.id.content_frame); //Remember this is the FrameLayout area within your activity_main.xml
        getLayoutInflater().inflate(R.layout.activity_radio_stations, contentFrameLayout);

        GridView gridview = (GridView) findViewById(R.id.gridview_radio);
        gridview.setAdapter(new RadioAdapter(this));

        gridview.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            public void onItemClick(AdapterView<?> parent, View v,
                                    int position, long id) {
                Toast.makeText(RadioStations.this, "" + position,
                        Toast.LENGTH_SHORT).show();
            }
        });
    }
}
