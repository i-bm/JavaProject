package com.javaproject;

import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class NaughtyStudentTest {

    @Test
    void averageGradeByTenPercent() {

        List<Double> grades = new ArrayList<>();
        grades.add(23.5);
        grades.add(54.7);
        grades.add(10.00);
        NaughtyStudent naughtyStudent = new NaughtyStudent(grades);
        assertEquals(57.166666666666664, naughtyStudent.getAverageGrade());
    }
}