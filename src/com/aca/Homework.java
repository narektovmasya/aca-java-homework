package com.aca;

import java.awt.*;
import java.sql.SQLOutput;
import java.util.Random;
import java.util.Scanner;

public class Homework {
    public static void main(String[] args) {
        //String
        /*Scanner sc = new Scanner(System.in);
        System.out.println("first number");
        int a = sc.nextInt();
        System.out.println("second number;");
        int b = sc.nextInt();
        String c = a==b? "they are equal.":"they are not equal.";
        System.out.println(c);*/

        /*Scanner sc= new Scanner (System.in);
        System.out.println("please enter a number");
        int n =sc.nextInt();
        String a = n>0?"positive":"negative";
        System.out.println(a);*/

        /*Scanner sc = new Scanner(System.in);
        System.out.println("please enter a number");
        int n = sc.nextInt();
        String a = n > 0 ? "positive" : n==0 ? "0" : "negative";
        System.out.println(a);*/

        /*Scanner sc = new Scanner(System.in);
        System.out.println("Please enter the first number");
        int a = sc.nextInt();
        System.out.println("Please enter the second number");
        int b = sc.nextInt();
        String c = a > b ? "first number is bigger" : a == b ? "they are equal" : "second number is bigger";
        System.out.println(c);*/

        /*for (int i=1; i<=10;i++){
            System.out.println(i);
        }*/

        /*int i = 0;
        while (i <= 20) {
            System.out.println(i);
            i = i + 2;
        }*/

     /*   Scanner sc= new Scanner(System.in);
        System.out.println("please enter the number");
        int i =sc.nextInt();
        for (int n = 2; i>2;n++){
            if (i%n==0){
                System.out.println(n);
                break;
            }
        }*/

        /*Scanner sc =new Scanner (System.in);
        int n=sc.nextInt();
        for (int i= 1; i<n;i++){
            System.out.println(n-i);
        }*/

        /*Scanner sc = new Scanner (System.in);
        int n =sc.nextInt();
        for (int i= 0;i<=n;i++){
            if(i%2==0){
                System.out.println(n-i);
            }
        }*/

        /*Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        for (int i = 0; i < n; i++) {
            if (Math.pow(2, i) == n) {
                System.out.println(i);
            }
        }*/

        //pttac erankyun
        /*Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        for (int j = 1; j <= a; j++) {
            for (int i = j; i <= a; i++) {
                System.out.print(a + "  ");
            }
            System.out.println();
        }*/

        //erankyun
        /*Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        for (int i = 1; i <= a; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print(a + "  ");
            }
            System.out.println();
        }*/

        /*Scanner sc = new Scanner(System.in);
        int n =sc.nextInt();
        for(int i=1;i<=n;i++){
            if(i%3==0){
                continue;
            }
            System.out.println(i);
        }*/

        /*Scanner sc =new Scanner(System.in);          //wrong
        Random rand =new Random();
        int i= rand.nextInt(2);
        for (int a= sc.nextInt();a==a;){
            for(int i = sc.nextInt();)
            if(a>i){
                System.out.println("Too high, try again.");
                continue;
            }
            if (a<i){
                System.out.println("Too low, try again.");
            continue;}
            break;
        }
        System.out.println("Yes, you guessed the number.");*/

        /*Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        if (b > a) {
            for (int i = a; i <= b; i++) {
                if (i % 2 == 0) {
                    System.out.println(i);
                }
            }
        }
        if (a > b) {
            for (int j = b; j <= a; j++) {
                if (j % 2 == 0) {
                    System.out.println(j);
                }
            }
        }*/

        /*Scanner sc = new Scanner(System.in);
        System.out.println("first number");
        int a = sc.nextInt();
        System.out.println("second number");
        int b = sc.nextInt();
        System.out.println("mnacord");
        int c = sc.nextInt();
        System.out.println("vorov bajanelu eq");
        int d = sc.nextInt();
        if (b > a) {
            for (int i = a; i <= b; i++) {
                if (i % d == c) {
                    System.out.println(i);
                }
            }
        }
        if (a > b) {
            for (int j = b; j <= a; j++) {
                if (j % d == c) {
                    System.out.println(j);
                }
            }
        }*/

        /*Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        if (a <= b) {
            for (int d = a; d <= b; d++) {
                for (int i = 0; i <= d; i++) {
                    if (d == i * i) {
                        System.out.println(d);
                    }
                }
            }
        }*/

        /*Scanner sc = new Scanner(System.in);
        System.out.println("Print a number.");
        int x = sc.nextInt();
        for (int i = 2; i <= 30000; i++) {
            if (x % i == 0) {
                System.out.println(i);
                break;
            }
        }*/

        /*Scanner sc = new Scanner(System.in);
        System.out.println("Please print a number.");
        int x = sc.nextInt();
        for (int i = 1; i <= 30000; i++) {
            if (x % i == 0) {
                System.out.println(i);
            }
        }*/

        /*Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        for (int i = 0; i < a; i++) {
            for (int b = 0; b < a; b++) {
                System.out.print(a + " " + a + " ");
            }
            System.out.println(" ");
        }*/

    }
}
