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
        ImageView imageView = (ImageView) findViewById(R.id.btn_question_1);
        LinearLayout cardView = (LinearLayout) findViewById(R.id.body_question_1);

        this.showHideQuestion(imageView, cardView);
    }

    public void question2(View view){
        ImageView imageView = (ImageView) findViewById(R.id.btn_question_2);
        LinearLayout cardView = (LinearLayout) findViewById(R.id.body_question_2);

        this.showHideQuestion(imageView, cardView);
    }


    public void question3(View view){
        ImageView imageView = (ImageView) findViewById(R.id.btn_question_3);
        LinearLayout cardView = (LinearLayout) findViewById(R.id.body_question_3);

        this.showHideQuestion(imageView, cardView);
    }


    public void question4(View view){
        ImageView imageView = (ImageView) findViewById(R.id.btn_question_4);
        LinearLayout cardView = (LinearLayout) findViewById(R.id.body_question_4);

        this.showHideQuestion(imageView, cardView);
    }

    public void question5(View view){
        ImageView imageView = (ImageView) findViewById(R.id.btn_question_5);
        LinearLayout cardView = (LinearLayout) findViewById(R.id.body_question_5);

        this.showHideQuestion(imageView, cardView);
    }

    public void question6(View view){
        ImageView imageView = (ImageView) findViewById(R.id.btn_question_6);
        LinearLayout cardView = (LinearLayout) findViewById(R.id.body_question_6);

        this.showHideQuestion(imageView, cardView);
    }

    public void question7(View view){
        ImageView imageView = (ImageView) findViewById(R.id.btn_question_7);
        LinearLayout cardView = (LinearLayout) findViewById(R.id.body_question_7);

        this.showHideQuestion(imageView, cardView);
    }

    public void question8(View view){
        ImageView imageView = (ImageView) findViewById(R.id.btn_question_8);
        LinearLayout cardView = (LinearLayout) findViewById(R.id.body_question_8);

        this.showHideQuestion(imageView, cardView);
    }

    public void question9(View view){
        ImageView imageView = (ImageView) findViewById(R.id.btn_question_9);
        LinearLayout cardView = (LinearLayout) findViewById(R.id.body_question_9);

        this.showHideQuestion(imageView, cardView);
    }

    public void question10(View view){
        ImageView imageView = (ImageView) findViewById(R.id.btn_question_10);
        LinearLayout cardView = (LinearLayout) findViewById(R.id.body_question_10);

        this.showHideQuestion(imageView, cardView);
    }

    private void showHideQuestion(ImageView image, LinearLayout cardView){
        ViewGroup.LayoutParams params =  cardView.getLayoutParams();

        if (params.height == ViewGroup.LayoutParams.WRAP_CONTENT){
            params.height =  0;
            image.setImageResource(R.drawable.ic_keyboard_arrow_down_black_24dp);

        } else {
            params.height = ViewGroup.LayoutParams.WRAP_CONTENT;
            image.setImageResource(R.drawable.ic_keyboard_arrow_up_black_24dp);
        }

        cardView.setLayoutParams(params);





    }
}
