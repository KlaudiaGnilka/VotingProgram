package com.votingProgram.program.questionnaire;

public class QuestionnaireNotFoundException extends RuntimeException{
    public QuestionnaireNotFoundException(int questionnaireId) {
        super("Questionnaire with id: " + questionnaireId + " not found.");
    }
}
