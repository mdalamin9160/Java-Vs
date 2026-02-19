package com.example;

import java.util.Scanner;

public class Program6 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        double value = 10.7;
        int x = (int) value;  // type casting

        System.out.println("Enter number:");
        int input = sc.nextInt();

        System.out.println("Cast value: " + x);
        System.out.println("Input: " + input);
    }
}
