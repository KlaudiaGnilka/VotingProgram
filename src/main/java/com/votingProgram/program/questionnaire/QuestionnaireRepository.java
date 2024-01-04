package com.votingProgram.program.questionnaire;

import org.springframework.data.repository.CrudRepository;

public interface QuestionnaireRepository extends CrudRepository<Questionnaire, Integer> {
    boolean existByQuestionnaireId(int questionnaireId);

    boolean existByQuestion(int question);
}
