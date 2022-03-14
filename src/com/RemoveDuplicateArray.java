package com;

import java.util.ArrayList;
import java.util.List;

public class RemoveDuplicateArray {
    public static void main(String[] args) {
        List<String> empList = new ArrayList<>();
        empList.add("Palash");
        empList.add("Rahul");
        empList.add("Sagar");
        empList.add("Rahul");
        empList.add("Sarthak");

        System.out.println(empList);
        // create new arraylist object
        List<String> newList = new ArrayList<>();

        for (String emp : empList) {
            if (!newList.contains(emp)) {
                newList.add(emp);
            }
        }
        //retreive data/elements from obj
        for (String empName : newList)
            System.out.println("Employee names: " + empName);
    }
  }



