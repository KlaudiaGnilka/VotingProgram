package com.votingProgram.program.questionnaire;

import java.util.*;

public class Question {
    private final String question;
    private final List<String> options;
    private final int numberOfQuestion;
    private final int questionnaireId;

    public Question(String question, List<String> options, int numberOfQuestion, int questionnaireId) {
        this.question = question;
        this.options = options;
        this.numberOfQuestion = numberOfQuestion;
        this.questionnaireId = questionnaireId;
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

    public int getQuestionId() {
        return questionnaireId;
    }

    @Override
    public String toString() {
        return numberOfQuestion + ". " + question + "\n" + String.join("\n", options);
    }
}
