package com.example.myapplication;

import android.view.View;
import android.widget.ImageView;
import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;
import java.util.*;

public class MainActivity extends AppCompatActivity {

    private ImageView src1;
    private ImageView trg1;
    private ImageView src2;
    private ImageView trg2;
    private ImageView src3;
    private ImageView trg3;
    private ImageView src4;
    private ImageView trg4;
    private ImageView src5;
    private ImageView trg5;

    int srcID = 0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        src1 = findViewById(R.id.src1);
        trg1 = findViewById(R.id.trg1);
        src2 = findViewById(R.id.src2);
        trg2 = findViewById(R.id.trg2);
        src3 = findViewById(R.id.src3);
        trg3 = findViewById(R.id.trg3);
        src4 = findViewById(R.id.src4);
        trg4 = findViewById(R.id.trg4);
        src5 = findViewById(R.id.src5);
        trg5 = findViewById(R.id.trg5);

//        ArrayList<Integer> japChars = new ArrayList<>();
//        japChars.add(R.drawable.jap_a);
//        japChars.add(R.drawable.jap_i);
//        japChars.add(R.drawable.jap_u);
//        japChars.add(R.drawable.jap_e);
//        japChars.add(R.drawable.jap_o);

        ArrayList<ImageMap> sourceImages = new ArrayList<>();
        ImageMap char1 = new ImageMap(1, src1);
        ImageMap char2 = new ImageMap(2, src2);
        ImageMap char3 = new ImageMap(3, src3);
        ImageMap char4 = new ImageMap(4, src4);
        ImageMap char5 = new ImageMap(5, src5);
        sourceImages.add(char1);
        sourceImages.add(char2);
        sourceImages.add(char3);
        sourceImages.add(char4);
        sourceImages.add(char5);

        Collections.shuffle(sourceImages);
        for (int i = 0; i <= 4; i++) {
            System.out.println(sourceImages.get(i).getID());
        }
    }

//    public void onClickSRC1(View view) {
//        ImageMap char1 = sourceImages.get(0);
//        srcID = char1.getID();
//    }

    public void onClickSRC1(View view) {srcID = 1;}
    public void onClickSRC2(View view) {srcID = 2;}
    public void onClickSRC3(View view) {srcID = 3;}
    public void onClickSRC4(View view) {srcID = 4;}
    public void onClickSRC5(View view) {srcID = 5;}

    public void onClickTRG1(View view) {
        switch (srcID) {
            case 1:
                trg1.setImageResource(R.drawable.jap_a);
                src1.setImageResource(R.drawable.empty_box);
                break;
            case 2:
                trg1.setImageResource(R.drawable.jap_i);
                src2.setImageResource(R.drawable.empty_box);
                break;
            case 3:
                trg1.setImageResource(R.drawable.jap_u);
                src3.setImageResource(R.drawable.empty_box);
                break;
            case 4:
                trg1.setImageResource(R.drawable.jap_e);
                src4.setImageResource(R.drawable.empty_box);
                break;
            case 5:
                trg1.setImageResource(R.drawable.jap_o);
                src5.setImageResource(R.drawable.empty_box);
                break;
        }
    }
    public void onClickTRG2(View view) {

        switch (srcID) {
            case 1:
                trg2.setImageResource(R.drawable.jap_a);
                src1.setImageResource(R.drawable.empty_box);
                break;
            case 2:
                trg2.setImageResource(R.drawable.jap_i);
                src2.setImageResource(R.drawable.empty_box);
                break;
            case 3:
                trg2.setImageResource(R.drawable.jap_u);
                src3.setImageResource(R.drawable.empty_box);
                break;
            case 4:
                trg2.setImageResource(R.drawable.jap_e);
                src4.setImageResource(R.drawable.empty_box);
                break;
            case 5:
                trg2.setImageResource(R.drawable.jap_o);
                src5.setImageResource(R.drawable.empty_box);
                break;
        }
    }
    public void onClickTRG3(View view) {

        switch (srcID) {
            case 1:
                trg3.setImageResource(R.drawable.jap_a);
                src1.setImageResource(R.drawable.empty_box);
                break;
            case 2:
                trg3.setImageResource(R.drawable.jap_i);
                src2.setImageResource(R.drawable.empty_box);
                break;
            case 3:
                trg3.setImageResource(R.drawable.jap_u);
                src3.setImageResource(R.drawable.empty_box);
                break;
            case 4:
                trg3.setImageResource(R.drawable.jap_e);
                src4.setImageResource(R.drawable.empty_box);
                break;
            case 5:
                trg3.setImageResource(R.drawable.jap_o);
                src5.setImageResource(R.drawable.empty_box);
                break;
        }
    }
    public void onClickTRG4(View view) {

        switch (srcID) {
            case 1:
                trg4.setImageResource(R.drawable.jap_a);
                src1.setImageResource(R.drawable.empty_box);
                break;
            case 2:
                trg4.setImageResource(R.drawable.jap_i);
                src2.setImageResource(R.drawable.empty_box);
                break;
            case 3:
                trg4.setImageResource(R.drawable.jap_u);
                src3.setImageResource(R.drawable.empty_box);
                break;
            case 4:
                trg4.setImageResource(R.drawable.jap_e);
                src4.setImageResource(R.drawable.empty_box);
                break;
            case 5:
                trg4.setImageResource(R.drawable.jap_o);
                src5.setImageResource(R.drawable.empty_box);
                break;
        }
    }
    public void onClickTRG5(View view) {
        switch (srcID) {
            case 1:
                trg5.setImageResource(R.drawable.jap_a);
                src1.setImageResource(R.drawable.empty_box);
                break;
            case 2:
                trg5.setImageResource(R.drawable.jap_i);
                src2.setImageResource(R.drawable.empty_box);
                break;
            case 3:
                trg5.setImageResource(R.drawable.jap_u);
                src3.setImageResource(R.drawable.empty_box);
                break;
            case 4:
                trg5.setImageResource(R.drawable.jap_e);
                src4.setImageResource(R.drawable.empty_box);
                break;
            case 5:
                trg5.setImageResource(R.drawable.jap_o);
                src5.setImageResource(R.drawable.empty_box);
                break;
        }
    }
}