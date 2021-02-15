package com.example.myapplication;

import android.view.View;
import android.widget.ImageView;
import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;
import java.util.*;

public class MainActivity extends AppCompatActivity {

//    private ArrayList<ImageMap> sourceImages;

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

//        sourceImages = new ArrayList<>();
//        ImageMap temp;
//        src1 = findViewById(R.id.src1);
//        temp = new ImageMap(1, src1);
//        sourceImages.add(temp);

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

//        Collections.shuffle(sourceImages);
    }

//    public void onClickSRC1(View view) {
//        ImageMap temp = sourceImages.get(0);
//        srcID = temp.getID();
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

    public void onClickRadomise(View view) {

        ArrayList<Integer> japChars = new ArrayList<>();
        japChars.add(R.drawable.jap_a);
        japChars.add(R.drawable.jap_i);
        japChars.add(R.drawable.jap_u);
        japChars.add(R.drawable.jap_e);
        japChars.add(R.drawable.jap_o);

        Collections.shuffle(japChars);

        src1.setImageResource(japChars.get(0));
        src2.setImageResource(japChars.get(1));
        src3.setImageResource(japChars.get(2));
        src4.setImageResource(japChars.get(3));
        src5.setImageResource(japChars.get(4));
        trg1.setImageResource(R.drawable.empty_box);
        trg2.setImageResource(R.drawable.empty_box);
        trg3.setImageResource(R.drawable.empty_box);
        trg4.setImageResource(R.drawable.empty_box);
        trg5.setImageResource(R.drawable.empty_box);
    }
}
//        src1.setImageResource(japChars.get(rand.nextInt(japChars.size())));
//        japChars.remove(rand.nextInt(japChars.size()));
//        src2.setImageResource(japChars.get(rand.nextInt(japChars.size())));
//        src3.setImageResource(japChars.get(rand.nextInt(japChars.size())));
//        src4.setImageResource(japChars.get(rand.nextInt(japChars.size())));
//        src5.setImageResource(japChars.get(rand.nextInt(japChars.size())));
//        trg1.setImageResource(R.drawable.empty_box);
//        trg2.setImageResource(R.drawable.empty_box);
//        trg3.setImageResource(R.drawable.empty_box);
//        trg4.setImageResource(R.drawable.empty_box);
//        trg5.setImageResource(R.drawable.empty_box);

//    Random rand = new Random();
//    int i = 5;
//        while (japChars.size() != 0) {
//                int randInt = rand.nextInt(i);
//                switch (randInt){
//                case 0:
//                src1.setImageResource(japChars.get(randInt));
//                japChars.remove(randInt);
//                break;
//                case 1:
//                src2.setImageResource(japChars.get(randInt));
//                japChars.remove(randInt);
//                break;
//                case 2:
//                src3.setImageResource(japChars.get(randInt));
//                japChars.remove(randInt);
//                break;
//                case 3:
//                src4.setImageResource(japChars.get(randInt));
//                japChars.remove(randInt);
//                break;
//                case 4:
//                src5.setImageResource(japChars.get(randInt));
//                japChars.remove(randInt);
//                break;
//                }
//                i = i - 1;
//                }

//        Random rand = new Random();
//        int i = 5;
//        while (japChars.size() != 0) {
//            int randInt = rand.nextInt(i);
//            if (randInt == 0) {
//                src1.setImageResource(japChars.get(randInt));
//                japChars.remove(randInt);
//            } else if (randInt == 1) {
//                src2.setImageResource(japChars.get(randInt));
//                japChars.remove(randInt);
//            } else if (randInt == 2) {
//                src3.setImageResource(japChars.get(randInt));
//                japChars.remove(randInt);
//            } else if (randInt == 3) {
//                src4.setImageResource(japChars.get(randInt));
//                japChars.remove(randInt);
//            } else if (randInt == 4) {
//                src5.setImageResource(japChars.get(randInt));
//                japChars.remove(randInt);
//            }
//            System.out.println(randInt);
//            i = i - 1;
//
//        }