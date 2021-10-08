package com.javaproject;

import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class LectureTest {

    @Test
    void testGetHighestAverageGrade() {

        Lecture lecture = new Lecture();
        List<Double> isaac = new ArrayList<Double>();
        List<Double> emma = new ArrayList<Double>();
        List<Double> jane = new ArrayList<Double>();
        isaac.add(70.20);
        isaac.add(89.55);
        isaac.add(90.33);

        emma.add(80.20);
        emma.add(98.55);
        emma.add(69.53);

        jane.add(100.0);
        jane.add(100.0);
        jane.add(100.0);

        Student student1 = new Student(isaac);
        double isaacAvgGrade = student1.getAverageGrade();

        Student student2 = new Student(isaac);
        double emmaAvgGrade = student2.getAverageGrade();

        Student student3 = new Student(isaac);
        double janeAvgGrade = student3.getAverageGrade();

        List<Double> avgGrades = new ArrayList<>();

        avgGrades.add(isaacAvgGrade);
        avgGrades.add(emmaAvgGrade);
        avgGrades.add(janeAvgGrade);



        assertEquals(83.36, lecture.getHighestAverageGrade(avgGrades));


    }
}