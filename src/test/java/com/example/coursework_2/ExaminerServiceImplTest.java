package com.example.coursework_2;

import com.example.coursework_2.Service.ExaminerServiceImpl;
import com.example.coursework_2.Service.QuestionService;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.junit.jupiter.MockitoExtension;

import static org.junit.jupiter.api.Assertions.*;
import static com.example.coursework_2.Constants.*;

import static org.mockito.Mockito.when;

@ExtendWith(MockitoExtension.class)
class ExaminerServiceImplTest {

    @Mock
    QuestionService mock;

    @InjectMocks
    ExaminerServiceImpl out;

    @Test
    public void getQuestionTest() {
        when(mock.getSize()).thenReturn(1);
        when(mock.getRandomQuestion()).thenReturn(FULL_QUESTION1);
        assertEquals(TEST_QUESTIONS_SET_2, out.getQuestions(1));
    }
}