package com.example.myapplication;

import android.widget.ImageView;

public class ImageMap {

    int ID;
    int object;

    public ImageMap(int ID, int object) {
        this.ID = ID;
        this.object = object;
    }

    public int getID() {return ID;}

    public int getObject() {return object;}
}
