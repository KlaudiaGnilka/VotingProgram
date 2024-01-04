package com.votingProgram.program.questionnaire;

import org.springframework.stereotype.Service;

@Service
public class QuestionnaireService {
    private final QuestionnaireRepository questionnaireRepository;

    public QuestionnaireService(QuestionnaireRepository questionnaireRepository) {
        this.questionnaireRepository = questionnaireRepository;
    }

    public Iterable<Questionnaire> viewAllQuestionnaire() {
        return questionnaireRepository.findAll();
    }

    public Questionnaire viewQuestionnaireById(int questionnaireId) {
        return questionnaireRepository.findById(questionnaireId).orElseThrow(() -> new QuestionnaireNotFoundException(questionnaireId) );
    }

    public Question viewQuestion(int questionnaireId, int numberOfQuestion) {
        return questionnaireRepository.findById(questionnaireId).orElseThrow(() ->
                new QuestionnaireNotFoundException(questionnaireId)).getQuestion(numberOfQuestion);
    }

}
