package com;

import java.util.Scanner;

public class LineComparison {
    public static void main(String args[]) {
        LineComparison GeoLine = new LineComparison();
        GeoLine.GeometryUsingSwitchCase();
    }

    public double length(double x1, double y1, double x2, double y2) {
        return Math.sqrt(Math.pow((x2 - x1), 2) + Math.pow((y2 - y1), 2));
    }

    public void equalLines(Double l1, Double l2) {
        boolean e = l1.equals(l2);
        if (e)
            System.out.println("Both lines are equals");
        else
            System.out.println("Lines are not equal");
    }

    public void compareLines(Double l3, Double l4) {
        if (l3.compareTo(l4) == 0)
            System.out.println("Lines are equal");
        else if (l3.compareTo(l4) > 0)
            System.out.println(l3 + " is larger than " + l4);
        else if (l3.compareTo(l4) < 0)
            System.out.println(l3 + " is  smaller than " + 14);
    }

    public void GeometryUsingSwitchCase() {
        System.out.println("Please select the options");
        System.out.println("1 for Length of Line");
        System.out.println("2 for Equal Lines");
        System.out.println("3 Compare Lines");
        Scanner i_input = new Scanner(System.in);
        int option = i_input.nextInt();
        switch (option) {
            case 1:
                double result=length(20, 10, 10, 5);
                System.out.println("Length of Line" +result);
                break;
            case 2:
                equalLines(10.0, 20.0);
                break;
            case 3:
                compareLines(20.0, 30.0);
                break;
        }
    }
}
