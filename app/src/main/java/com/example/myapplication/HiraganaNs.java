package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;

public class HiraganaNs extends AppCompatActivity {

    HiraganaVowels hv = new HiraganaVowels();
    public ImageViewController ctrl;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        ctrl = new ImageViewController();
        setContentView(R.layout.activity_hiragana_vowels);

//        hv.imageViewLinkToResource();
//        hv.japCharConnection();
//        hv.addCharToArray();
//        hv.initArray();
//        hv.displayShuffledItems();
        ctrl.char1 = new ImageMap(1, R.drawable.hiragana_na);
        ctrl.char2 = new ImageMap(2, R.drawable.hiragana_ni);
        ctrl.char3 = new ImageMap(3, R.drawable.hiragana_nu);
        ctrl.char4 = new ImageMap(4, R.drawable.hiragana_ne);
        ctrl.char5 = new ImageMap(5, R.drawable.hiragana_no);
    }

}