package dev.quizmanagment.quizManagement;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/v1/questions")
public class QuestionController {

    @Autowired
    private QuestionService questionService;
    @GetMapping
    public ResponseEntity<List<Question>> getAllQuestions() {
        return new ResponseEntity<List<Question>>(questionService.allQuestions(), HttpStatus.OK);
    }
}
