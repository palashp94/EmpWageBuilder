package com;

public class EmpWageBuilderUC1 {
    public static void main(String[] args) {
        // Constants
        int Is_PART_TIME = 1;
        int Is_FULL_TIME = 2;
        int NUM_WORKING_DAYS = 20;
        int WAGE_PER_HOUR = 20;
        int Full_Time_WorkHour = 8;
        int PART_TIME_WorkHour = 4;
        // variables
        int workingDay=0;
        int totalSalary = 0;
        while (workingDay< NUM_WORKING_DAYS){
            int empWage = 0;
            // Computation
            double empCheck = Math.floor(Math.random() * 10) % 3;
            if (empCheck == Is_FULL_TIME) {
                System.out.println("Employee is Present" + Math.random());
                empWage = Full_Time_WorkHour * WAGE_PER_HOUR;
            } else if (empCheck == Is_PART_TIME) {
                System.out.println("Employee is Present" + Math.random());
                empWage = PART_TIME_WorkHour * WAGE_PER_HOUR;
            } else
                System.out.println("Employee is Absent");
            System.out.println("Employee wage: " + empWage);
            totalSalary = empWage;
            workingDay++;
        }
    }
}