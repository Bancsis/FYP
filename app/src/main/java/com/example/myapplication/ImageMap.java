package com.example.myapplication;

import android.widget.ImageView;

public class ImageMap {

    int ID;
    Integer object;

    public ImageMap(int ID, Integer object) {
        this.ID = ID;
        this.object = object;
    }

    public int getID() {return ID;}

    public Integer getObject() {return object;}
}
