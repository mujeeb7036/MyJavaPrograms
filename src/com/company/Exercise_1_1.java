package com.company;

import java.util.Scanner;

public class Exercise_1_1 {
    public static void main(String[] args) {
        System.out.println("Please Enter the marks of a Student : ");
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the marks of Subject 1 : ");
        float sub1 = sc.nextFloat();
        System.out.println("Enter the marks of Subject 2 : ");
        float sub2 = sc.nextFloat();
        System.out.println("Enter the marks of Subject 3 : ");
        float sub3 = sc.nextFloat();
        System.out.println("Enter the marks of Subject 4 : ");
        float sub4 = sc.nextFloat();
        System.out.println("Enter the marks of Subject 5 : ");
        float sub5 = sc.nextFloat();

        float sum = sub1 + sub2 + sub3 + sub4 + sub5;
        boolean sum1 = (sub1 + sub2 + sub3 + sub4 + sub5)<=100;

        if(sum<=100) {
            System.out.println("Total Marks = "+sum);
        }
        else {
            System.out.println("Condition is "+sum1);
            System.out.println("Total Marks exceeds limit");

        }


    }
}
