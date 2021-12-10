package com.aca;

import java.awt.*;
import java.sql.SQLOutput;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        //lesson 1//
   /*     Scanner scanner = new Scanner (System.in);
      System.out.println("Please input first number");
        int firstElement = scanner.nextInt();
        System.out.println ("Please input second number");
        int secondElement =scanner.nextInt();
        int Sum = firstElement + secondElement;
        System.out.println("sum " + Sum);*/

        //lesson 2//
        /*Scanner scanner = new Scanner(System.in);
        System.out.println("first number");
        int first = scanner.nextInt();
        System.out.println("second number");
        int second = scanner.nextInt();
        System.out.println(first + ">" + second);*/

        //lesson 3//
        /*Scanner scanner = new Scanner(System.in);
        System.out.println("first number");
        int firstEl = scanner.nextInt();
        System.out.println("second number");
        int secondEl = scanner.nextInt();*/

        //lesson 4//
        Scanner scanner = new Scanner(System.in);
        System.out.println("first number");
        byte first = scanner.nextInt();
        System.out.println("second number");
        short second = scanner.nextInt();
        System.out.println("theard number");
        int theard = scanner.nextInt();
        int Sum = (first + second + theard)/3;
        System.out.println();


    }
}