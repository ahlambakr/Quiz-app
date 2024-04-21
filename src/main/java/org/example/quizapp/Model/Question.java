package org.example.quizapp.Model;

import jakarta.persistence.*;

import java.io.Serializable;



@Entity
@Table (name = "question")
public class Question  implements Serializable{
  @Id
  @GeneratedValue(strategy = GenerationType.IDENTITY)
@Column (name="id")
  private int id ;

  @Column(name="question_title")
  private String questionTitle ;

  @Column (name="option1")
  private String question1;

  @Column (name="option2")
  private String question2;

  @Column (name="option3")
  private String question3;

  @Column (name="option4")
  private String question4 ;

  @Column (name="right_answer")
  private String correctAnswer;

  @Column(name="difficulty_level")
  private String difficultyLevel;

  @Column (name ="category")
  private String category;


  public int getId() {
    return id;
  }

  public void setId(int id) {
    this.id = id;
  }

  public String getQuestionTitle() {
    return questionTitle;
  }

  public void setQuestionTitle(String questionTitle) {
    this.questionTitle = questionTitle;
  }

  public String getQuestion1() {
    return question1;
  }

  public void setQuestion1(String question1) {
    this.question1 = question1;
  }

  public String getQuestion2() {
    return question2;
  }

  public void setQuestion2(String question2) {
    this.question2 = question2;
  }

  public String getQuestion3() {
    return question3;
  }

  public void setQuestion3(String question3) {
    this.question3 = question3;
  }

  public String getQuestion4() {
    return question4;
  }

  public void setQuestion4(String question4) {
    this.question4 = question4;
  }

  public String getCorrectAnswer() {
    return correctAnswer;
  }

  public void setCorrectAnswer(String correctAnswer) {
    this.correctAnswer = correctAnswer;
  }

  public String getDifficultyLevel() {
    return difficultyLevel;
  }

  public void setDifficultyLevel(String difficultyLevel) {
    this.difficultyLevel = difficultyLevel;
  }

  public String getCategory() {
    return category;
  }

  public void setCategory(String category) {
    this.category = category;
  }



}
