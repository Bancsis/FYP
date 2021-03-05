package com.example.myapplication;

import android.content.Intent;
import android.view.View;
import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;

public class HiraganaHome extends AppCompatActivity {

    public ImageViewController ctrl;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        ctrl = new ImageViewController();
        setContentView(R.layout.activity_hiragana_homet);
    }

    public void onClickBackButton(View view) {    }

    public void onClickVowelsButton(View view) {
        Intent myIntent = new Intent(HiraganaHome.this, HiraganaVowels.class);
        HiraganaHome.this.startActivity(myIntent);
    }

    public void onClickKsButton(View view) {
        Intent myIntent = new Intent(HiraganaHome.this, HiraganaKs.class);
        HiraganaHome.this.startActivity(myIntent);
    }

    public void onClickSsButton(View view) {
        Intent myIntent = new Intent(HiraganaHome.this, HiraganaSs.class);
        HiraganaHome.this.startActivity(myIntent);
    }

    public void onClickTsButton(View view) {
        Intent myIntent = new Intent(HiraganaHome.this, HiraganaTs.class);
        HiraganaHome.this.startActivity(myIntent);
    }
}