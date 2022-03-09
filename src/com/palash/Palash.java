package com.palash;

public class Palash {

    public static void main(String[] args) {
         MyEmployee palash = new MyEmployee();
         // palash.id = 45;
         // palash.name = "codewithpalash"; --> Throws an error due to private access modifier
         palash.setName("CodeWithPalash");
         System.out.println(palash.getName());
         palash.setId(234);
         System.out.println(palash.getId());
     }
 }