package com;

class MyMainEmployee{
    private int id;
    private String name;

    public MyMainEmployee(){
        id = 45;
        name = "Your-Name-Here";
    }
    public String getName() { return name;}
    public void setName(String n) { this.name = n; }
    public void setId(int i) { this.id = i; }
    public int getId() { return id; }
    }
    public class constructors {
        public static void main(String[] args) {
         MyMainEmployee palash = new MyMainEmployee();
         // palash.setName("codewithpalash");
         // palash.setId(34);
            System.out.println(palash.getId());
            System.out.println(palash.getName());
        }

}
