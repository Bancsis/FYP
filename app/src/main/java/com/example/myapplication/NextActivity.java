package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;

public class NextActivity extends AppCompatActivity {

    public ImageViewController ctrl;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        ctrl = new ImageViewController();

        setContentView(R.layout.activity_next);
    }
}