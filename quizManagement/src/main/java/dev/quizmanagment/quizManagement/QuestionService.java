package dev.quizmanagment.quizManagement;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class QuestionService {

    @Autowired
    private QuestionRepo questionRepo;

    public List<Question> allQuestions() {
        return questionRepo.findAll();
    }

}

