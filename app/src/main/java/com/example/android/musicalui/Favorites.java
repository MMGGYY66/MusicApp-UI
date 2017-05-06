package com.example.android.musicalui;

import android.os.Bundle;
import android.widget.FrameLayout;

public class Favorites extends MainActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
      //  setContentView(R.layout.activity_favorites);
        FrameLayout contentFrameLayout = (FrameLayout) findViewById(R.id.content_frame); //Remember this is the FrameLayout area within your activity_main.xml
        getLayoutInflater().inflate(R.layout.activity_favorites, contentFrameLayout);
    }
}
