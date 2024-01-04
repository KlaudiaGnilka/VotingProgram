package com.votingProgram.program.questionnaire;

import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;

import java.util.ArrayList;
import java.util.List;

@NoArgsConstructor
@AllArgsConstructor
public class Questionnaire {
    private final int questionnaireId;
    private final List<Question> questions = new ArrayList<>();

    public Questionnaire(List<List<String>> questionsAndOptions, int questionnaireId) {
        for(int i = 1; i <= questionsAndOptions.size(); i++){
            List<String> workerList = questionsAndOptions.get(i-1);
            questions.add(new Question(workerList.getFirst(), workerList.subList(1, workerList.size()), i, questionnaireId));
        }
        this.questionnaireId = questionnaireId;
    }

    public List<Question> showQuestionnaire(){
        return questions;
    }

    public Question getQuestion(int numberOfQuestion) {
        return questions.get(numberOfQuestion-1);
    }
}
