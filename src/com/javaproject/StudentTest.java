package com.javaproject;

import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class StudentTest {

    @Test
    void getAverageGrade() {
        List<Double> grades = new ArrayList<>();
        grades.add(100.00);
        grades.add(100.00);
        grades.add(15.00);
        Student student = new Student(grades);
        assertEquals(57.166666666666664, student.getAverageGrade());
    }
}