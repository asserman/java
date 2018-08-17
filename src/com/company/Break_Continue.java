package com.company;

public class Break_Continue {
    public static void main(String[] args) {
        int i=0;
        while (true){
            i++;
            if (i%2 ==1){continue;}
            if (i>15000){break;}
            System.out.println(i);

        }
    }
}
