package com.votingProgram.program.questionnaire;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.data.repository.CrudRepository;

public interface QuestionnaireRepository extends MongoRepository<Questionnaire, String> {
//    Question getQuestion(String questionnaireId, int numberOfQuestion);
}
