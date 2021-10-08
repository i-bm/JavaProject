package com.javaproject;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {

        Lecture lecture = new Lecture();
//        lecture.studentGrades();
       List<Double> grades = new ArrayList<Double>();
       grades.add(23.5);
       grades.add(54.7);
       grades.add(93.3);
        Student student = new Student(grades);
       grades.forEach(s -> System.out.println(s));

//        student.setGrades(grades);
//        System.out.println(student.getGrades());
//        System.out.println(student.getAverageGrade());
    }
}
