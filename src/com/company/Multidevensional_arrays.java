package com.company;

public class Multidevensional_arrays {
    public static void main(String[] args) {
//        int [] number = {1,2,3};
//        System.out.println(number[1]);
//        /**
//         * 1,2,3,4,5,0,-1,-2
//         *
//         * 156
//         * 375
//         * 268
//         *
//         */
//        int [][] numbers ={{1,2,3,4,5,0,-1,-2},  {156}, {375}, {268}};
//        for (int i = 0; i < numbers.length; i++) {
//            System.out.println();
//            for (int j = 0; j < numbers[i].length; j++) {
//                System.out.print(numbers[i][j]+ "  ");
//
//            }
//
//        }
        Srting[][] strings = new Srting[35];
        for (int i = 128; i <128+35 ; i++) {
            strings[i]= ((char) i);
            System.out.println(strings[i]);


        }

    }
}
