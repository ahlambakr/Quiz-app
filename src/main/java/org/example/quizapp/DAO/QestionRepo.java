package org.example.quizapp.DAO;

import org.example.quizapp.Model.Question;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface QestionRepo extends JpaRepository <Question,Integer> {
    List<Question> getQuestionByCategory(String category) ;
}

