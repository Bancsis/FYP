package com.example.myapplication;

import android.view.View;
import android.content.Intent;
import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;
import java.util.*;

public class HiraganaKs extends AppCompatActivity {

    public ImageViewController ctrl;

    @Override
    protected void onCreate(Bundle savedInstanceState) {

        super.onCreate(savedInstanceState);

        ctrl = new ImageViewController();

        setContentView(R.layout.activity_hiragana_ks);

//        MainActivity.getInstance().imageViewLinkToResource();
        imageViewLinkToResource();

        japCharConnection();

        addCharToArray();

        initArray();

        displayShuffledItems();
    }

    public void onClickSRC1(View view) {ctrl.srcID = 1;}
    public void onClickSRC2(View view) {ctrl.srcID = 2;}
    public void onClickSRC3(View view) {ctrl.srcID = 3;}
    public void onClickSRC4(View view) {ctrl.srcID = 4;}
    public void onClickSRC5(View view) {ctrl.srcID = 5;}

    public void onClickTRG1(View view) {
        switch (ctrl.srcID) {
            case 1:
                ctrl.trg1.setImageResource(ctrl.sourceImages.get(0).getObject());
                ctrl.src1.setImageResource(R.drawable.empty_box);
                ctrl.correctOrder.set(0, ctrl.sourceImages.get(0).getID());
                System.out.println(ctrl.correctOrder);
                break;
            case 2:
                ctrl.trg1.setImageResource(ctrl.sourceImages.get(1).getObject());
                ctrl.src2.setImageResource(R.drawable.empty_box);
                ctrl.correctOrder.set(0, ctrl.sourceImages.get(1).getID());
                System.out.println(ctrl.correctOrder);
                break;
            case 3:
                ctrl.trg1.setImageResource(ctrl.sourceImages.get(2).getObject());
                ctrl.src3.setImageResource(R.drawable.empty_box);
                ctrl.correctOrder.set(0, ctrl.sourceImages.get(2).getID());
                System.out.println(ctrl.correctOrder);
                break;
            case 4:
                ctrl.trg1.setImageResource(ctrl.sourceImages.get(3).getObject());
                ctrl.src4.setImageResource(R.drawable.empty_box);
                ctrl.correctOrder.set(0, ctrl.sourceImages.get(3).getID());
                System.out.println(ctrl.correctOrder);
                break;
            case 5:
                ctrl.trg1.setImageResource(ctrl.sourceImages.get(4).getObject());
                ctrl.src5.setImageResource(R.drawable.empty_box);
                ctrl.correctOrder.set(0, ctrl.sourceImages.get(4).getID());
                System.out.println(ctrl.correctOrder);
                break;
        }
    }
    public void onClickTRG2(View view) {
        switch (ctrl.srcID) {
            case 1:
                ctrl.trg2.setImageResource(ctrl.sourceImages.get(0).getObject());
                ctrl.src1.setImageResource(R.drawable.empty_box);
                ctrl.correctOrder.set(1, ctrl.sourceImages.get(0).getID());
                System.out.println(ctrl.correctOrder);
                break;
            case 2:
                ctrl.trg2.setImageResource(ctrl.sourceImages.get(1).getObject());
                ctrl.src2.setImageResource(R.drawable.empty_box);
                ctrl.correctOrder.set(1, ctrl.sourceImages.get(1).getID());
                System.out.println(ctrl.correctOrder);
                break;
            case 3:
                ctrl.trg2.setImageResource(ctrl.sourceImages.get(2).getObject());
                ctrl.src3.setImageResource(R.drawable.empty_box);
                ctrl.correctOrder.set(1, ctrl.sourceImages.get(2).getID());
                System.out.println(ctrl.correctOrder);
                break;
            case 4:
                ctrl.trg2.setImageResource(ctrl.sourceImages.get(3).getObject());
                ctrl.src4.setImageResource(R.drawable.empty_box);
                ctrl.correctOrder.set(1, ctrl.sourceImages.get(3).getID());
                System.out.println(ctrl.correctOrder);
                break;
            case 5:
                ctrl.trg2.setImageResource(ctrl.sourceImages.get(4).getObject());
                ctrl.src5.setImageResource(R.drawable.empty_box);
                ctrl.correctOrder.set(1, ctrl.sourceImages.get(4).getID());
                System.out.println(ctrl.correctOrder);
                break;
        }
    }
    public void onClickTRG3(View view) {
        switch (ctrl.srcID) {
            case 1:
                ctrl.trg3.setImageResource(ctrl.sourceImages.get(0).getObject());
                ctrl.src1.setImageResource(R.drawable.empty_box);
                ctrl.correctOrder.set(2, ctrl.sourceImages.get(0).getID());
                System.out.println(ctrl.correctOrder);
                break;
            case 2:
                ctrl.trg3.setImageResource(ctrl.sourceImages.get(1).getObject());
                ctrl.src2.setImageResource(R.drawable.empty_box);
                ctrl.correctOrder.set(2, ctrl.sourceImages.get(1).getID());
                System.out.println(ctrl.correctOrder);
                break;
            case 3:
                ctrl.trg3.setImageResource(ctrl.sourceImages.get(2).getObject());
                ctrl.src3.setImageResource(R.drawable.empty_box);
                ctrl.correctOrder.set(2, ctrl.sourceImages.get(2).getID());
                System.out.println(ctrl.correctOrder);
                break;
            case 4:
                ctrl.trg3.setImageResource(ctrl.sourceImages.get(3).getObject());
                ctrl.src4.setImageResource(R.drawable.empty_box);
                ctrl.correctOrder.set(2, ctrl.sourceImages.get(3).getID());
                System.out.println(ctrl.correctOrder);
                break;
            case 5:
                ctrl.trg3.setImageResource(ctrl.sourceImages.get(4).getObject());
                ctrl.src5.setImageResource(R.drawable.empty_box);
                ctrl.correctOrder.set(2, ctrl.sourceImages.get(4).getID());
                System.out.println(ctrl.correctOrder);
                break;
        }
    }
    public void onClickTRG4(View view) {
        switch (ctrl.srcID) {
            case 1:
                ctrl.trg4.setImageResource(ctrl.sourceImages.get(0).getObject());
                ctrl.src1.setImageResource(R.drawable.empty_box);
                ctrl.correctOrder.set(3, ctrl.sourceImages.get(0).getID());
                System.out.println(ctrl.correctOrder);
                break;
            case 2:
                ctrl.trg4.setImageResource(ctrl.sourceImages.get(1).getObject());
                ctrl.src2.setImageResource(R.drawable.empty_box);
                ctrl.correctOrder.set(3, ctrl.sourceImages.get(1).getID());
                System.out.println(ctrl.correctOrder);
                break;
            case 3:
                ctrl.trg4.setImageResource(ctrl.sourceImages.get(2).getObject());
                ctrl.src3.setImageResource(R.drawable.empty_box);
                ctrl.correctOrder.set(3, ctrl.sourceImages.get(2).getID());
                System.out.println(ctrl.correctOrder);
                break;
            case 4:
                ctrl.trg4.setImageResource(ctrl.sourceImages.get(3).getObject());
                ctrl.src4.setImageResource(R.drawable.empty_box);
                ctrl.correctOrder.set(3, ctrl.sourceImages.get(3).getID());
                System.out.println(ctrl.correctOrder);
                break;
            case 5:
                ctrl.trg4.setImageResource(ctrl.sourceImages.get(4).getObject());
                ctrl.src5.setImageResource(R.drawable.empty_box);
                ctrl.correctOrder.set(3, ctrl.sourceImages.get(4).getID());
                System.out.println(ctrl.correctOrder);
                break;
        }
    }
    public void onClickTRG5(View view) {
        switch (ctrl.srcID) {
            case 1:
                ctrl.trg5.setImageResource(ctrl.sourceImages.get(0).getObject());
                ctrl.src1.setImageResource(R.drawable.empty_box);
                ctrl.correctOrder.set(4, ctrl.sourceImages.get(0).getID());
                System.out.println(ctrl.correctOrder);
                break;
            case 2:
                ctrl.trg5.setImageResource(ctrl.sourceImages.get(1).getObject());
                ctrl.src2.setImageResource(R.drawable.empty_box);
                ctrl.correctOrder.set(4, ctrl.sourceImages.get(1).getID());
                System.out.println(ctrl.correctOrder);
                break;
            case 3:
                ctrl.trg5.setImageResource(ctrl.sourceImages.get(2).getObject());
                ctrl.src3.setImageResource(R.drawable.empty_box);
                ctrl.correctOrder.set(4, ctrl.sourceImages.get(2).getID());
                System.out.println(ctrl.correctOrder);
                break;
            case 4:
                ctrl.trg5.setImageResource(ctrl.sourceImages.get(3).getObject());
                ctrl.src4.setImageResource(R.drawable.empty_box);
                ctrl.correctOrder.set(4, ctrl.sourceImages.get(3).getID());
                System.out.println(ctrl.correctOrder);
                break;
            case 5:
                ctrl.trg5.setImageResource(ctrl.sourceImages.get(4).getObject());
                ctrl.src5.setImageResource(R.drawable.empty_box);
                ctrl.correctOrder.set(4, ctrl.sourceImages.get(4).getID());
                System.out.println(ctrl.correctOrder);
                break;
        }
    }

    public void onClickCheck(View view) {
        System.out.println(ctrl.correctOrder);
        if (ctrl.correctOrder.get(0) != 1) { ctrl.src1.setImageResource(R.drawable.jap_a_red); }
        if (ctrl.correctOrder.get(0) == 1) { ctrl.src1.setImageResource(R.drawable.jap_a_green); }
        if (ctrl.correctOrder.get(1) != 2) { ctrl.src2.setImageResource(R.drawable.jap_i_red); }
        if (ctrl.correctOrder.get(1) == 2) { ctrl.src2.setImageResource(R.drawable.jap_i_green); }
        if (ctrl.correctOrder.get(2) != 3) { ctrl.src3.setImageResource(R.drawable.jap_u_red); }
        if (ctrl.correctOrder.get(2) == 3) { ctrl.src3.setImageResource(R.drawable.jap_u_green); }
        if (ctrl.correctOrder.get(3) != 4) { ctrl.src4.setImageResource(R.drawable.jap_e_red); }
        if (ctrl.correctOrder.get(3) == 4) { ctrl.src4.setImageResource(R.drawable.jap_e_green); }
        if (ctrl.correctOrder.get(4) != 5) { ctrl.src5.setImageResource(R.drawable.jap_o_red); }
        if (ctrl.correctOrder.get(4) == 5) { ctrl.src5.setImageResource(R.drawable.jap_o_green); }
    }

    public void onClickTryAgain(View view) {
        Collections.shuffle(ctrl.sourceImages);
        displayShuffledItems();
        ctrl.trg1.setImageResource(R.drawable.empty_box);
        ctrl.trg2.setImageResource(R.drawable.empty_box);
        ctrl.trg3.setImageResource(R.drawable.empty_box);
        ctrl.trg4.setImageResource(R.drawable.empty_box);
        ctrl.trg5.setImageResource(R.drawable.empty_box);
    }

    public void onClickBackArrow(View view) {
        Intent myIntent = new Intent(HiraganaKs.this, NextActivity.class);
        HiraganaKs.this.startActivity(myIntent);
    }

    public void imageViewLinkToResource(){
        ctrl.src1 = findViewById(R.id.src1);
        ctrl.src2 = findViewById(R.id.src2);
        ctrl.src3 = findViewById(R.id.src3);
        ctrl.src4 = findViewById(R.id.src4);
        ctrl.src5 = findViewById(R.id.src5);
        ctrl.trg1 = findViewById(R.id.trg1);
        ctrl.trg2 = findViewById(R.id.trg2);
        ctrl.trg3 = findViewById(R.id.trg3);
        ctrl.trg4 = findViewById(R.id.trg4);
        ctrl.trg5 = findViewById(R.id.trg5);
    }

    public void japCharConnection(){
        ctrl.char1 = new ImageMap(1, R.drawable.hiragana_ka);
        ctrl.char2 = new ImageMap(2, R.drawable.hiragana_ki);
        ctrl.char3 = new ImageMap(3, R.drawable.hiragana_ku);
        ctrl.char4 = new ImageMap(4, R.drawable.hiragana_ke);
        ctrl.char5 = new ImageMap(5, R.drawable.hiragana_ko);
    }

    public void addCharToArray(){
        ctrl.sourceImages.add(ctrl.char1);
        ctrl.sourceImages.add(ctrl.char2);
        ctrl.sourceImages.add(ctrl.char3);
        ctrl.sourceImages.add(ctrl.char4);
        ctrl.sourceImages.add(ctrl.char5);
        Collections.shuffle(ctrl.sourceImages);
    }

    public void initArray(){
        ctrl.correctOrder.add(0);
        ctrl.correctOrder.add(0);
        ctrl.correctOrder.add(0);
        ctrl.correctOrder.add(0);
        ctrl.correctOrder.add(0);
    }

    public void displayShuffledItems(){
        ctrl.src1.setImageResource(ctrl.sourceImages.get(0).getObject());
        ctrl.src2.setImageResource(ctrl.sourceImages.get(1).getObject());
        ctrl.src3.setImageResource(ctrl.sourceImages.get(2).getObject());
        ctrl.src4.setImageResource(ctrl.sourceImages.get(3).getObject());
        ctrl.src5.setImageResource(ctrl.sourceImages.get(4).getObject());
    }
}