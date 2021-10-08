package com.javaproject;

import java.util.ArrayList;
import java.util.List;

public class Lecture {

    public void enter(Student student){

    }

    public double getHighestAverageGrade(List<Double> grades){
         double highestAverageGrade = 0.00;

        for(double avgGrade : grades){
            if(avgGrade > highestAverageGrade){
                highestAverageGrade = avgGrade;
            }
        }

        return highestAverageGrade;
    }

}
