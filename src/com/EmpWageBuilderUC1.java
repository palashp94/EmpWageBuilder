package com;

public class EmpWageBuilderUC1 {
    public static void main(String[] args) {
        // Constants
        int Is_PART_TIME = 2;
        int Is_FULL_TIME = 1;
        int WAGE_PER_HOUR = 20;
        int workHour = 0;
        // Variables
        int empWage = 0;
        // Computation
        double empCheck = Math.floor(Math.random() * 10) % 3;
        if (empCheck == Is_FULL_TIME) {
            System.out.println("Employee is Present" + Math.random());
            workHour=8;
            empWage = WAGE_PER_HOUR * workHour;
        }
        else if (empCheck == Is_PART_TIME ) {
            System.out.println("Employee is Present" + Math.random());
            workHour=4;
            empWage = WAGE_PER_HOUR * workHour;
        }
        else
            System.out.println("Employee is Absent");
        System.out.println("Employee wage: "+empWage);
    }
}