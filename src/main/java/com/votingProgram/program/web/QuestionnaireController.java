package com.votingProgram.program.web;


import com.votingProgram.program.questionnaire.Question;
import com.votingProgram.program.questionnaire.Questionnaire;
import com.votingProgram.program.questionnaire.QuestionnaireService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("questionnaire")
public class QuestionnaireController {
    private final QuestionnaireService questionnaireService;


    public QuestionnaireController(QuestionnaireService questionnaireService) {
        this.questionnaireService = questionnaireService;
    }

    @GetMapping
    public Iterable<Questionnaire> getAll() {
        return questionnaireService.viewAllQuestionnaire();
    }

    @GetMapping("{questionnaireId}")
    public Questionnaire getQuestionnaire(@PathVariable int questionnaireId) {
        return questionnaireService.viewQuestionnaireById(questionnaireId);
    }

    @GetMapping("{questionnaireId}/question/{numberOfQuestion}")
    public Question getQuestion(@PathVariable int questionnaireId, @PathVariable int numberOfQuestion) {
        return questionnaireService.viewQuestion(questionnaireId, numberOfQuestion);
    }


}
