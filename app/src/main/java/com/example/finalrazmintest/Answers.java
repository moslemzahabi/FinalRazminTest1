package com.example.finalrazmintest;

public class Answers {
    private  String name;
    private  String lastname;
    private String ID;
    private String score;

    public Answers(String ID,String name, String lastname,  String score) {
        this.name = name;
        this.lastname = lastname;
        this.ID = ID;
        this.score = score;
    }

    public String getScore() {
        return score;
    }

    public void setScore(String score) {
        this.score = score;
    }

    public String getID() {
        return ID;
    }

    public void setID(String ID) {
        this.ID = ID;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getLastname() {
        return lastname;
    }

    public void setLastname(String lastname) {
        this.lastname = lastname;
    }


}
