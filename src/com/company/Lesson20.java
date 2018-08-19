package com.company;

public class Lesson20 {
    public static void main(String[] args) {
        Human.getdescription();
        Human h1 = new Human("Bob", 30);
        h1.printNumberOfPeople();
        Human h2 = new Human("Ron", 18);
        Human.printNumberOfPeople();
        Human h3 = new Human("Rob", 22);
        Human.printNumberOfPeople();
        h1.seek();
        h1.setName("Tom");
        h1.seek();
        h1.getAllFields();
        h1.description = "Bad";
        h1.getAllFields();
        h2.getAllFields();
//        System.out.println(Math.pow(2, 4));;
//        System.out.println(Math.PI);;

    }
}
class Human{
    private String name;
    private int age;
    private static int countPeople;


    public static String description;


    public Human(String name, int age){
        System.out.println("привет из конструктора");
        countPeople++;
        this.name = name;
        this.age = age;
    };

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setAge(int age) {
        this.age = age;
    }
    public void seek(){
        System.out.println("my name ="+name+ " my age="+age);
    }
    public static void getdescription(){
        System.out.println(description);
    }
    public void  getAllFields(){
        System.out.println("name "+name+" age " +age+" description "+description);
    }
    public static void printNumberOfPeople(){
        System.out.println(countPeople);
    }
}

