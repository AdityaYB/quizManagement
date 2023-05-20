package dev.quizmanagment.quizManagement;

import org.bson.types.ObjectId;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

@Document
@Data
@AllArgsConstructor
@NoArgsConstructor
public class Question{

    @Id
    private ObjectId id;
    
    private String ques;
    private List<String> options;
    private String anwser;
}