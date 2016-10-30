package com.example.android.quizjiujitsu.to;

import java.util.List;

/**
 * Created by kneto on 10/29/16.
 */

public class Question {

    private boolean isOpen = false;
    private boolean isAnsered = false;
    private QuestionType type;
    private String question;
    private String answer;
    private List<String> options;

    public Question() {
    }


    public Question(boolean isOpen, boolean isAnsered, QuestionType type, String question) {
        this.isOpen = isOpen;
        this.isAnsered = isAnsered;
        this.type = type;
        this.question = question;
    }

    public Question(boolean isOpen, boolean isAnsered, QuestionType type, String question, String answer, List<String> options) {
        this.isOpen = isOpen;
        this.isAnsered = isAnsered;
        this.type = type;
        this.question = question;
        this.answer = answer;
        this.options = options;
    }

    public boolean isOpen() {
        return isOpen;
    }

    public void setOpen(boolean open) {
        isOpen = open;
    }

    public boolean isAnsered() {
        return isAnsered;
    }

    public void setAnsered(boolean ansered) {
        isAnsered = ansered;
    }

    public QuestionType getType() {
        return type;
    }

    public void setType(QuestionType type) {
        this.type = type;
    }

    public String getQuestion() {
        return question;
    }

    public void setQuestion(String question) {
        this.question = question;
    }

    public String getAnswer() {
        return answer;
    }

    public void setAnswer(String answer) {
        this.answer = answer;
    }

    public List<String> getOptions() {
        return options;
    }

    public void setOptions(List<String> options) {
        this.options = options;
    }

    public boolean checkAnswer(){
        return false;
    }
}
