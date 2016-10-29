package com.example.android.quizjiujitsu;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.ActionMenuView;
import android.support.v7.widget.CardView;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageButton;
import android.widget.ImageView;
import android.widget.LinearLayout;

public class MainActivity extends AppCompatActivity {

    boolean isQuestion1Open = true;



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void question1(View view){
        ImageView imageView = (ImageView) findViewById(R.id.btn_question);



        LinearLayout cardView = (LinearLayout) findViewById(R.id.body_question_1);
        ViewGroup.LayoutParams params =  cardView.getLayoutParams();


        if(isQuestion1Open) {
            params.height = ViewGroup.LayoutParams.WRAP_CONTENT;
            imageView.setImageResource(R.drawable.ic_keyboard_arrow_up_black_24dp);

        } else {
            //params.height = ViewGroup.LayoutParams.MATCH_PARENT;
            params.height =  0;
            imageView.setImageResource(R.drawable.ic_keyboard_arrow_down_black_24dp);

        }

        isQuestion1Open = !isQuestion1Open;

        cardView.setLayoutParams(params);




    }
}
