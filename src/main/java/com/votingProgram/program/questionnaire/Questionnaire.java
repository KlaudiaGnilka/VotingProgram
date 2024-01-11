package com.votingProgram.program.questionnaire;

import jakarta.validation.constraints.NotBlank;
import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import java.util.ArrayList;
import java.util.List;


@Document(collection = "Questionnaire")
public class Questionnaire {

    @NotBlank(message = "QuestionnaireId must be defined")
    @Id
    private String questionnaireId;


    @NotBlank(message = "Questions must be defined")
    private List<Question> questions = new ArrayList<>();


    public Questionnaire() {
    }

    public List<Question> showQuestionnaire(){
        return questions;
    }

    public Question getQuestion(int numberOfQuestion) {
        return questions.get(numberOfQuestion-1);
    }

    public String getQuestionnaireId() {
        return questionnaireId;
    }

    public void setQuestionnaireId(String questionnaireId) {
        this.questionnaireId = questionnaireId;
    }

    public List<Question> getQuestions() {
        return questions;
    }

    public void setQuestions(List<Question> questions) {
        this.questions = questions;
    }
}
