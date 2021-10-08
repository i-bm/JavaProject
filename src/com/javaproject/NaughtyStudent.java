package com.javaproject;

import java.util.List;

public class NaughtyStudent extends Student {


    public NaughtyStudent(List<Double> grades) {
        super(grades);
    }
@Override
    public double getAverageGrade(){
        double sum = 0;
        for(double grade : grades){
            sum = sum + grade;
        }
        double avg = sum / grades.size();
        double tenPercent = (avg/100) *10;

        return tenPercent + avg;
    }

//    public double averageGradeByTenPercent(){
//        double naughtyStudentGrade = 0.00;
//
//        for(double avgGrade : grades){
//            double naughtyStudent = ((avgGrade/100) *10) + avgGrade;
//            if(naughtyStudent != avgGrade) {
//                naughtyStudentGrade = avgGrade;
//            }
//            }
//        return naughtyStudentGrade;
//        }
    }

