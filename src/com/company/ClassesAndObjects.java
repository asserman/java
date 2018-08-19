package com.company;

public class ClassesAndObjects {
    public static void main(String[] args) {
        Person person1 = new Person();
        person1.SetNameAndAge("Роман", 50);
        person1.Speek();


    }
}
class Person{
    private String name;
    private int age;

    public void setAge(int age) {
        this.age = age;
    }
    public void SetNameAndAge(String name, int age) {
        this.age = age;
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public void setName(String name) {
        this.name = name;
    }

    void Speek(){
        System.out.println("Меня зовут "+ name + " мне " + age + " лет");
    }


}