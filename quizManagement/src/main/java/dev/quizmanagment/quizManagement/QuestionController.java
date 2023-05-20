package dev.quizmanagment.quizManagement;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/v1/questions")
public class QuestionController {

    @GetMapping
    public ResponseEntity<String> getAllQuestions() {
        return new ResponseEntity<String>("All Questions", HttpStatus.OK);
    }
}
