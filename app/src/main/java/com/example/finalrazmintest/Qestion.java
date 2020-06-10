package com.example.finalrazmintest;

public class Qestion {
    private  String qestion;
    private String questioncode;

    public Qestion(String qestion, String questioncode) {
        this.qestion = qestion;
        this.questioncode = questioncode;
    }

    public String getQuestioncode() {
        return questioncode;
    }

    public void setQuestioncode(String questioncode) {
        this.questioncode = questioncode;
    }

    public String getQestion() {
        return qestion;
    }

    public void setQestion(String qestion) {
        this.qestion = qestion;
    }
}
