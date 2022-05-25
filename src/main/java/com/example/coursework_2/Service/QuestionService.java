package com.example.coursework_2.Service;

import com.example.coursework_2.Entities.Question;

import java.util.Collection;

public interface QuestionService {
    boolean add(String question, String answer);

    boolean remove(String question, String answer);

    Collection<Question> getAll();

    Question getRandomQuestion();

    int getSize();
}