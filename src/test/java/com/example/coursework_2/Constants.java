package com.example.coursework_2;

import com.example.coursework_2.Entities.Question;

import java.util.Set;

public class Constants {

    public static final String QUESTION1 = "One?";
    public static final String QUESTION2 = "Two?";
    public static final String QUESTION3 = "Three?";

    public static final String ANSWER1 = "Answer1";
    public static final String ANSWER2 = "Answer2";
    public static final String ANSWER3 = "Answer3";

    public static final Question FULL_QUESTION1 = new Question(QUESTION1, ANSWER1);
    public static final Question FULL_QUESTION2 = new Question(QUESTION2, ANSWER2);
    public static final Question FULL_QUESTION3 = new Question(QUESTION3, ANSWER3);

    public static final Set<Question> TEST_QUESTIONS_SET_1 = Set.of(FULL_QUESTION1, FULL_QUESTION2, FULL_QUESTION3);
    public static final Set<Question> TEST_QUESTIONS_SET_2 = Set.of(FULL_QUESTION1);

    public static final String EMPTY_ANSWER = null;
}