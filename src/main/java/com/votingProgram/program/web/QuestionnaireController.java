package com.votingProgram.program.web;


import com.votingProgram.program.questionnaire.*;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

import java.util.Optional;

@RestController
@RequestMapping("questionnaire")
public class QuestionnaireController {


    @Autowired
    private QuestionnaireRepository questionnaireRepository;

    @PostMapping
    @ResponseStatus(HttpStatus.CREATED)
    public void addQuestionnaire(@RequestBody Questionnaire questionnaire){
        questionnaireRepository.save(questionnaire);
    }

    @GetMapping
    public Iterable<Questionnaire> getAll() {
        return questionnaireRepository.findAll();
    }

    @GetMapping("{questionnaireId}")
    public Questionnaire getQuestionnaire(@PathVariable String questionnaireId) {
        Optional<Questionnaire> questionnaire = questionnaireRepository.findById(questionnaireId);
        if(questionnaire.isEmpty()){
            throw new QuestionnaireNotFoundException(questionnaireId);
        } else {
            return questionnaire.get();
        }
    }


    @GetMapping("{questionnaireId}/question/{numberOfQuestion}")
    public Question getQuestion(@PathVariable String questionnaireId, @PathVariable int numberOfQuestion) {
        Optional<Questionnaire> questionnaire = questionnaireRepository.findById(questionnaireId);
        if(questionnaire.isEmpty()){
            throw new QuestionnaireNotFoundException(questionnaireId);
        }else {
            return questionnaire.get().getQuestion(numberOfQuestion);
        }
    }


    @DeleteMapping("delete/{questionnaireId}")
    public void deleteQuestionnaire(@PathVariable String questionnaireId){
        Optional<Questionnaire> questionnaire = questionnaireRepository.findById(questionnaireId);
        if(questionnaire.isEmpty()){
            throw new QuestionnaireNotFoundException(questionnaireId);
        } else {
            questionnaireRepository.deleteById(questionnaireId);
        }
    }


}
