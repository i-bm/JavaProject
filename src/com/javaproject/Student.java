package com.javaproject;

import java.util.ArrayList;
import java.util.List;

public class Student {
    protected List<Double> grades = new ArrayList<>();


    public Student(List<Double> grades){
        this.grades = grades;

    }



    public double getAverageGrade(){
        double sum = 0;
        for(double grade : grades){
            sum = sum + grade;
        }
        return sum / grades.size();
    }




    public List<Double> getGrades() {
        return grades;
    }

    public void setGrades(List<Double> grades) {
        this.grades = grades;
    }
}
