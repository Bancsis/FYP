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
    ArrayList<Integer> japChars = new ArrayList<>();
    ArrayList<ImageMap> sourceImages = new ArrayList<>();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        src1 = findViewById(R.id.src1);
        src2 = findViewById(R.id.src2);
        src3 = findViewById(R.id.src3);
        src4 = findViewById(R.id.src4);
        src5 = findViewById(R.id.src5);
        trg1 = findViewById(R.id.trg1);
        trg2 = findViewById(R.id.trg2);
        trg3 = findViewById(R.id.trg3);
        trg4 = findViewById(R.id.trg4);
        trg5 = findViewById(R.id.trg5);

        japChars.add(R.drawable.jap_a);
        japChars.add(R.drawable.jap_i);
        japChars.add(R.drawable.jap_u);
        japChars.add(R.drawable.jap_e);
        japChars.add(R.drawable.jap_o);

        ImageMap char1 = new ImageMap(1, japChars.get(0));
        ImageMap char2 = new ImageMap(2, japChars.get(1));
        ImageMap char3 = new ImageMap(3, japChars.get(2));
        ImageMap char4 = new ImageMap(4, japChars.get(3));
        ImageMap char5 = new ImageMap(5, japChars.get(4));
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

    public void onClickSRC1(View view) {srcID = sourceImages.get(0).getID();}
    public void onClickSRC2(View view) {srcID = sourceImages.get(1).getID();}
    public void onClickSRC3(View view) {srcID = sourceImages.get(2).getID();}
    public void onClickSRC4(View view) {srcID = sourceImages.get(3).getID();}
    public void onClickSRC5(View view) {srcID = sourceImages.get(4).getID();}

    public void onClickTRG1(View view) {
        switch (srcID) {
            case 1:
                trg1.setImageResource(sourceImages.get(0).getObject());
                src1.setImageResource(R.drawable.empty_box);
                break;
            case 2:
                trg1.setImageResource(sourceImages.get(1).getObject());
                src2.setImageResource(R.drawable.empty_box);
                break;
            case 3:
                trg1.setImageResource(sourceImages.get(2).getObject());
                src3.setImageResource(R.drawable.empty_box);
                break;
            case 4:
                trg1.setImageResource(sourceImages.get(3).getObject());
                src4.setImageResource(R.drawable.empty_box);
                break;
            case 5:
                trg1.setImageResource(sourceImages.get(4).getObject());
                src5.setImageResource(R.drawable.empty_box);
                break;
        }
    }
//    public void onClickTRG2(View view) {
//
//        switch (srcID) {
//            case 1:
//                trg2.setImageResource(R.drawable.jap_a);
//                src1.setImageResource(R.drawable.empty_box);
//                break;
//            case 2:
//                trg2.setImageResource(R.drawable.jap_i);
//                src2.setImageResource(R.drawable.empty_box);
//                break;
//            case 3:
//                trg2.setImageResource(R.drawable.jap_u);
//                src3.setImageResource(R.drawable.empty_box);
//                break;
//            case 4:
//                trg2.setImageResource(R.drawable.jap_e);
//                src4.setImageResource(R.drawable.empty_box);
//                break;
//            case 5:
//                trg2.setImageResource(R.drawable.jap_o);
//                src5.setImageResource(R.drawable.empty_box);
//                break;
//        }
//    }
//    public void onClickTRG3(View view) {
//
//        switch (srcID) {
//            case 1:
//                trg3.setImageResource(R.drawable.jap_a);
//                src1.setImageResource(R.drawable.empty_box);
//                break;
//            case 2:
//                trg3.setImageResource(R.drawable.jap_i);
//                src2.setImageResource(R.drawable.empty_box);
//                break;
//            case 3:
//                trg3.setImageResource(R.drawable.jap_u);
//                src3.setImageResource(R.drawable.empty_box);
//                break;
//            case 4:
//                trg3.setImageResource(R.drawable.jap_e);
//                src4.setImageResource(R.drawable.empty_box);
//                break;
//            case 5:
//                trg3.setImageResource(R.drawable.jap_o);
//                src5.setImageResource(R.drawable.empty_box);
//                break;
//        }
//    }
//    public void onClickTRG4(View view) {
//
//        switch (srcID) {
//            case 1:
//                trg4.setImageResource(R.drawable.jap_a);
//                src1.setImageResource(R.drawable.empty_box);
//                break;
//            case 2:
//                trg4.setImageResource(R.drawable.jap_i);
//                src2.setImageResource(R.drawable.empty_box);
//                break;
//            case 3:
//                trg4.setImageResource(R.drawable.jap_u);
//                src3.setImageResource(R.drawable.empty_box);
//                break;
//            case 4:
//                trg4.setImageResource(R.drawable.jap_e);
//                src4.setImageResource(R.drawable.empty_box);
//                break;
//            case 5:
//                trg4.setImageResource(R.drawable.jap_o);
//                src5.setImageResource(R.drawable.empty_box);
//                break;
//        }
//    }
//    public void onClickTRG5(View view) {
//        switch (srcID) {
//            case 1:
//                trg5.setImageResource(R.drawable.jap_a);
//                src1.setImageResource(R.drawable.empty_box);
//                break;
//            case 2:
//                trg5.setImageResource(R.drawable.jap_i);
//                src2.setImageResource(R.drawable.empty_box);
//                break;
//            case 3:
//                trg5.setImageResource(R.drawable.jap_u);
//                src3.setImageResource(R.drawable.empty_box);
//                break;
//            case 4:
//                trg5.setImageResource(R.drawable.jap_e);
//                src4.setImageResource(R.drawable.empty_box);
//                break;
//            case 5:
//                trg5.setImageResource(R.drawable.jap_o);
//                src5.setImageResource(R.drawable.empty_box);
//                break;
//        }
//    }
}