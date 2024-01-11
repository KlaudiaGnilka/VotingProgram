package com.votingProgram.program.questionnaire;

import java.util.*;

public class Question {

    private int numberOfQuestion;
    private String question;
    private List<String> options;


    public Question() {
    }

    public String getQuestion() {
        return question;
    }

    public List<String> getOptions() {
        return options;
    }

    public int getNumberOfQuestion() {
        return numberOfQuestion;
    }


    public void setQuestion(String question) {
        this.question = question;
    }

    public void setOptions(List<String> options) {
        this.options = options;
    }

    public void setNumberOfQuestion(int numberOfQuestion) {
        this.numberOfQuestion = numberOfQuestion;
    }


    @Override
    public String toString() {
        return numberOfQuestion + ". " + question + "\n" + String.join("\n", options);
    }
}
