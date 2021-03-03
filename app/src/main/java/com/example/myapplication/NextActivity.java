package com.example.myapplication;

import android.content.Intent;
import android.view.View;
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

    public void onClickBackButton(View view) {
        Intent myIntent = new Intent(NextActivity.this, MainActivity.class);
        NextActivity.this.startActivity(myIntent);
    }

    public void onClickVowelsButton(View view) {
        Intent myIntent = new Intent(NextActivity.this, MainActivity.class);
        NextActivity.this.startActivity(myIntent);
    }

    public void onClickKsButton(View view) {
        Intent myIntent = new Intent(NextActivity.this, HiraganaKs.class);
        NextActivity.this.startActivity(myIntent);
    }
}