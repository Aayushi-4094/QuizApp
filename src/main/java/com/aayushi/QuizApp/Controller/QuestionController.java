package com.aayushi.QuizApp.Controller;

import com.aayushi.QuizApp.Question;
import com.aayushi.QuizApp.Service.QuestionService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("question")
public class QuestionController {
    @Autowired
    QuestionService questionService;
    @GetMapping("allQuestions")
    public ResponseEntity<List<Question>> getAllQuestions() {
        return questionService.getAllQuestions();
    }

@GetMapping("category/{category}")
    public ResponseEntity<List<Question>> getQuestionsByCategory(@PathVariable("category") String category){
        return questionService.getQuestionsByCategory(category);
    }

    @PostMapping("add")
    public ResponseEntity<String> addQuestion(@RequestBody Question question){
        return questionService.addQuestion(question);
    }

    @PutMapping("update")
    public ResponseEntity<String> updateQuestion(@RequestBody Question question){
        return questionService.updateQuestion(question);
    }

    @DeleteMapping("delete")
    public ResponseEntity<String> deleteQuestion(@RequestBody Question question){
        return questionService.deleteQuestion(question);
    }

}
