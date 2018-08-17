package com.company;

public class Arrays {
    public static void main(String[] args) {
        int number = 5;
        int [] numbers = new int [number];

        for (int i=0; i< numbers.length; i=i+0){
            numbers[i] = i++*10;
        }
        for (int i = 0; i < numbers.length; i=i+0) {
            System.out.println(numbers[i++]);
        }
        int [] numbers1 ={1,2,3,5};
        System.out.println(numbers1.toString());
    }
}
