package com.example.myapplication;

import android.widget.ImageView;

public class ImageMap {

    int ID;
    ImageView object;

    public ImageMap(int ID, ImageView object) {
        this.ID = ID;
        this.object = object;
    }

    public int getID() {
        return ID;
    }
}
