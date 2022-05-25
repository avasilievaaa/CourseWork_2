package com.example.coursework_2.Service;

import com.example.coursework_2.Entities.Question;
import com.example.coursework_2.Exception.InvalidQuestionRequestException;

import java.util.Collection;
import java.util.HashSet;
import java.util.Set;

public class ExaminerServiceImpl implements ExaminerService {
    private final QuestionService questionService;

    public ExaminerServiceImpl(QuestionService questionService) {
        this.questionService = questionService;
    }

    @Override
    public Collection<Question> getQuestions(int amount) {
        Set<Question> questions = new HashSet<>();
        int size = questionService.getSize();
        if (amount <= 0 || size < amount) {
            throw new InvalidQuestionRequestException(amount, size);
        }
        while (questions.size() < amount) {
            questions.add(questionService.getRandomQuestion());
        }
        return questions;
    }
}