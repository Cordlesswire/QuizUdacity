package com.example.android.quizjiujitsu.to;

/**
 * Created by kneto on 10/29/16.
 */

public enum QuestionType {

    CHECKBOX("CheckBox"),
    RADIO("RadioBox"),
    TEXT("Text");

    private String type;

    QuestionType(String type){
        this.type = type;
    }

    public String getType(){
        return this.type;
    }
}
