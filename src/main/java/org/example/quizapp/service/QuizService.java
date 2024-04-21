package org.example.quizapp.service;

import org.example.quizapp.DAO.QestionRepo;
import org.example.quizapp.Model.Question;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cache.annotation.CacheEvict;
import org.springframework.cache.annotation.CachePut;
import org.springframework.cache.annotation.Cacheable;
import org.springframework.cache.annotation.EnableCaching;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.web.bind.annotation.DeleteMapping;

import java.util.List;

@Service
public class QuizService {


     private QestionRepo qestionRepo ;

    @Autowired
    public QuizService(QestionRepo theQestionRepo) {
       qestionRepo = theQestionRepo;
    }

    @Cacheable(cacheNames = "questions", key = "#root.method.name" )
   public List<Question> getAllQuestions() {
       return  qestionRepo.findAll();
    }

    @Cacheable(cacheNames = "questions" , key ="#root.method.name")
    public List<Question> getQuestionByCategory(String category) {
  return qestionRepo.getQuestionByCategory(category);

    }

@Transactional
@CachePut(cacheNames = "questions", key = "#root.method.name")
    public void addQuestion(Question question) {
        qestionRepo.save(question);
    }

    @Transactional
    @CacheEvict(cacheNames ="questions" , allEntries = true )
    public void deleteQuestion (int id) {
        qestionRepo.deleteById(id);
    }

}

