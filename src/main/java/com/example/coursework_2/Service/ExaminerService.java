package com.example.coursework_2.Service;

import com.example.coursework_2.Entities.Question;

import java.util.Collection;

public interface ExaminerService {
    Collection<Question> getQuestions(int amount);
}