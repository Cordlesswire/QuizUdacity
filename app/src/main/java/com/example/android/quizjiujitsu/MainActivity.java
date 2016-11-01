package com.example.android.quizjiujitsu;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.text.Editable;
import android.text.TextWatcher;
import android.util.Log;
import android.view.View;
import android.view.ViewGroup;
import android.widget.CheckBox;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.RadioButton;
import android.widget.Toast;

import java.util.HashMap;

import static android.R.attr.duration;

public class MainActivity extends AppCompatActivity {

    HashMap<String,String> answers = new HashMap<String, String>();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        EditText answerQ1 = (EditText) findViewById(R.id.edit_question_1);
        answerQ1.addTextChangedListener(new TextWatcher() {
            @Override
            public void beforeTextChanged(CharSequence s, int start, int count, int after) {

            }

            @Override
            public void onTextChanged(CharSequence s, int start, int before, int count) {

            }

            @Override
            public void afterTextChanged(Editable s) {
                answers.put("q1", s.toString());
                checkAllAnswer();
            }
        });

        EditText answerQ2 = (EditText) findViewById(R.id.edit_question_2);
        answerQ2.addTextChangedListener(new TextWatcher() {
            @Override
            public void beforeTextChanged(CharSequence s, int start, int count, int after) {

            }

            @Override
            public void onTextChanged(CharSequence s, int start, int before, int count) {

            }

            @Override
            public void afterTextChanged(Editable s) {
                answers.put("q2", s.toString());
                checkAllAnswer();
            }
        });


    }


    @Override
    public void onSaveInstanceState(Bundle savedInstanceState) {
        super.onSaveInstanceState(savedInstanceState);
        savedInstanceState.putSerializable("answers", answers);
    }


    @Override
    public void onRestoreInstanceState(Bundle savedInstanceState) {
        super.onRestoreInstanceState(savedInstanceState);
        answers = (HashMap<String,String>) savedInstanceState.getSerializable("answers");
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

    public void radioButtonClickedQ3(View view){
        this.saveRadioButtonAnswer(((RadioButton) view), "q3");
    }

    public void radioButtonClickedQ4(View view){
        this.saveRadioButtonAnswer(((RadioButton) view), "q4");
    }

    public void radioButtonClickedQ5(View view){
        this.saveRadioButtonAnswer(((RadioButton) view), "q5");
    }

    public void radioButtonClickedQ6(View view){
        this.saveRadioButtonAnswer(((RadioButton) view), "q6");
    }

    public void radioButtonClickedQ7(View view){
        this.saveRadioButtonAnswer(((RadioButton) view), "q7");
    }

    public void radioButtonClickedQ9(View view){
        this.saveRadioButtonAnswer(((RadioButton) view), "q9");
    }

    private void saveRadioButtonAnswer(RadioButton radioButton, String mapId){
        if(radioButton.isChecked()) {
            answers.put(mapId, radioButton.getText().toString());
        }

        this.checkAllAnswer();
    }

    public void checkBoxClickedQ8(View view){
        boolean checked = ((CheckBox) view).isChecked();

        if(view.getId() == R.id.checkbox_q8_1) {
            answers.put("q8_01",String.valueOf(checked));
        }

        if(view.getId() == R.id.checkbox_q8_2) {
            answers.put("q8_02",String.valueOf(checked));
        }

        this.checkAllAnswer();

    }

    public void checkBoxClicked10(View view){

        boolean checked = ((CheckBox) view).isChecked();

        if(view.getId() == R.id.checkbox_q10_1) {
            answers.put("q10_01",String.valueOf(checked));
        }

        if(view.getId() == R.id.checkbox_q10_2) {
            answers.put("q10_02",String.valueOf(checked));
        }

        if(view.getId() == R.id.checkbox_q10_3) {
            answers.put("q10_03",String.valueOf(checked));
        }

        if(view.getId() == R.id.checkbox_q10_4) {
            answers.put("q10_04",String.valueOf(checked));
        }



        this.checkAllAnswer();

    }

    /**
     * Method to log the answers
     */
    private void checkAllAnswer(){
        Log.i("Q01", answers.get("q1") != null ? answers.get("q1") : " - " );
        Log.i("Q02", answers.get("q2") != null ? answers.get("q2") : " - ");
        Log.i("Q03", answers.get("q3") != null ? answers.get("q3") : " - ");
        Log.i("Q04", answers.get("q4") != null ? answers.get("q4") : " - ");
        Log.i("Q05", answers.get("q5") != null ? answers.get("q5") : " - ");
        Log.i("Q06", answers.get("q6") != null ? answers.get("q6") : " - ");
        Log.i("Q07", answers.get("q7") != null ? answers.get("q7") : " - ");
        Log.i("Q08_01", answers.get("q8_01") != null ? answers.get("q8_01") : " - ");
        Log.i("Q08_02", answers.get("q8_02") != null ? answers.get("q8_02") : " - ");
        Log.i("Q09", answers.get("q9") != null ? answers.get("q9") : " - ");
        Log.i("Q10_01", answers.get("q10_01") != null ? answers.get("q10_01") : " - ");
        Log.i("Q10_02", answers.get("q10_02") != null ? answers.get("q10_02") : " - ");
        Log.i("Q10_03", answers.get("q10_03") != null ? answers.get("q10_03") : " - ");
        Log.i("Q10_04", answers.get("q10_04") != null ? answers.get("q10_04") : " - ");
    }

    /**
     * Method that execute the submit and process the score.
     *
     * @param view view elemnt
     */
    public void submit(View view){
        double result = 0;

        if (getString(R.string.answer3points).equals(answers.get("q3"))) {
            result ++;
        }

        if (getString(R.string.answer2points).equals(answers.get("q4"))) {
            result ++;
        }

        if (getString(R.string.answer4points).equals(answers.get("q5"))) {
            result ++;
        }

        if ( getString(R.string.answer2points).equals(answers.get("q6"))) {
            result ++;
        }

        if ( getString(R.string.answer2points).equals(answers.get("q7"))){
            result ++;
        }

        if (getString(R.string.answer10minutes).equals(answers.get("q9"))) {
            result ++;
        }

        if ("true".equals(answers.get("q8_01")) && "true".equals(answers.get("q8_02"))){
            result ++;
        }

        if ("false".equals(answers.get("q10_01"))  || answers.get("q10_01") == null ){
            if ("true".equals(answers.get("q10_02")) && "true".equals(answers.get("q10_03")) &&  "true".equals(answers.get("q10_04"))){
                result ++;
            }
        }

        result = result / 8;

        Log.i("RESULT", String.valueOf(result));

        Toast toast = Toast.makeText(getApplicationContext(), getString(R.string.total, String.format("%.2f", result * 100)  ) , Toast.LENGTH_SHORT);
        toast.show();

    }
}
