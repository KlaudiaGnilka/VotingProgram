package com.votingProgram.program.questionnaire;

public class QuestionnaireNotFoundException extends RuntimeException{
    public QuestionnaireNotFoundException(String questionnaireId) {
        super("Questionnaire with id: " + questionnaireId + " not found.");
    }
}
