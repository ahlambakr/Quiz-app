package org.example.quizapp.controller;

import org.example.quizapp.Model.Question;
import org.example.quizapp.service.QuizService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("api")
public class QuizController {

    @Autowired
    QuizService quizService ;
    @GetMapping("AllQuestions")
    public List<Question> getllQestion () {
        return quizService.getAllQuestions() ;
    }
    @GetMapping("category/{category}")
    public List<Question> getQestionByCategory(@PathVariable  String category){
        return quizService.getQuestionByCategory(category) ;

    }
    @PostMapping ("addQuestion")
    public void addQuestion (@RequestBody Question question ){
        quizService.addQuestion(question) ;
    }
    @DeleteMapping("deleteQuestion/{id}")
    public void deleteQuestion(@PathVariable int id){
        quizService.deleteQuestion(id);
    }
}
