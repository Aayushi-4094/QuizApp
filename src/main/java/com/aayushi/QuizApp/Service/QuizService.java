package com.aayushi.QuizApp.Service;

import com.aayushi.QuizApp.dao.QuestionDao;
import com.aayushi.QuizApp.dao.QuizDao;
import com.aayushi.QuizApp.model.Question;
import com.aayushi.QuizApp.model.Quiz;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class QuizService {
    @Autowired
    QuizDao quizDao;
    @Autowired
    QuestionDao questionDao;

    public ResponseEntity<String> createQuiz(String category, int numQ, String title) {
        List<Question> questions = questionDao.findRandomQuestionsByCategory(category, numQ);

        if (questions.isEmpty()) {
            return new ResponseEntity<>("No questions found for the given category", HttpStatus.BAD_REQUEST);
        }

        Quiz quiz = new Quiz();
        quiz.setTitle(title);
        quiz.setQuestions(questions);
        quizDao.save(quiz);

        return new ResponseEntity<>("Quiz created successfully", HttpStatus.OK);
    }

}
