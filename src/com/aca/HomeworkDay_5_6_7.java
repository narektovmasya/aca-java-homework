package com.aca;
import java.awt.*;
import java.sql.SQLOutput;
import java.util.Random;
import java.util.Scanner;

public class HomeworkDay_5_6_7 {
    public static void main(String[] args) {
        // Day 5

        // 1
        /*Scanner sc = new Scanner(System.in);
        System.out.println("first number");
        int a = sc.nextInt();
        System.out.println("second number;");
        int b = sc.nextInt();
        String c = a==b? "they are equal.":"they are not equal.";
        System.out.println(c);*/

        // 3
        /*Scanner sc= new Scanner (System.in);
        System.out.println("please enter a number");
        int n =sc.nextInt();
        String a = n>0?"positive":n==0?"0":"negative";
        System.out.println(a);*/

        // 4
        /*Scanner sc = new Scanner(System.in);
        System.out.println("Print first number.");
        int a =sc.nextInt();
        System.out.println("Print second number.");
        int b =sc.nextInt();
        String c = a>b ? "The first number is bigger.":a==b? "They are equal":"The second number is bigger.";
        System.out.println(c);*/

        // 9
        /*Scanner sc = new Scanner(System.in);
        System.out.println("What is the correct way to declare a variable to store an integer value in Java?\n" +
                "   a. int 1x=10;\n" +
                "   b. int x=10;\n" +
                "   c. float x=10.0f;\n" +
                "   d. string x=\"10\";\n");
        char a = sc.nextLine().charAt(0);
        switch (a) {
            case 'a':
                System.out.println("Invalide choice");
                break;
            case 'b':
                System.out.println("Congratulation");
                break;
            case 'c':
                System.out.println("Invalide choice");
                break;
            case 'd':
                System.out.println("Invalide choice");
                break;
            default:
                System.out.println("Wrong");
                break;
        }*/

        // 10
        /*Scanner sc = new Scanner(System.in);
        char a = sc.nextLine().charAt(0);
        switch (a){
            case 'e':
                System.out.println(" Vowel");
                break;
            case'u':
                System.out.println("vowel");
                break;
            case 'i':
                System.out.println("vowel");
                break;
            case'o':
                System.out.println("vowel");
                break;
            case'a':
                System.out.println("vowel");
                break;
                default:
                    System.out.println("Consonant");
                    break;
        }*/

        // 10
        /*Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        switch (a) {
            case 0:
                System.out.println("number is pressed");
                break;
            case 1:
                System.out.println("number is pressed");
                break;
            case 2:
                System.out.println("number is pressed");
                break;
            case 3:
                System.out.println("number is pressed");
                break;
            case 4:
                System.out.println("number is pressed");
                break;
            case 5:
                System.out.println("number is pressed");
                break;
            case 6:
                System.out.println("number is pressed");
                break;
            case 7:
                System.out.println("number is pressed");
                break;
            case 8:
                System.out.println("number is pressed");
                break;
            case 9:
                System.out.println("number is pressed");
                break;
            default:
                System.out.println("number is not allowed");
                break;
        }*/


        // Day 6

        // 1
        /*for (int i=1; i<=10;i++){
            System.out.println(i);
        }*/

        // 2
        /*int i = 0;
        while (i <= 20) {
            System.out.println(i);
            i = i + 2;
        }*/

        // 4
        /*Scanner sc= new Scanner(System.in);
        System.out.println("please enter the number");
        int i =sc.nextInt();
        for (int n = 2; i>2;n++){
            if (i%n==0){
                System.out.println(n);
                break;
            }
        }*/

        // 6
        /*Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        for (int i = 1; i < n; i++) {
            System.out.println(n - i);
        }*/

        // 7
        /*Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        for (int i = 0; i <= n; i++) {
            if (i % 2 == 0) {
                System.out.println(n - i);
            }
        }*/

        // 8
        /*Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        for (int i = 0; i < n; i++) {
            if (Math.pow(2, i) == n) {
                System.out.println(i);
            }
        }*/

        // 11
        /*Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        for (int i = 1; i <= n; i++) {
            if (i % 3 == 0) {
                continue;
            }
            System.out.println(i);
        }*/

        // 16
        /*Scanner sc =new Scanner(System.in);          // WRONG
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

        // Day 7

        // 1
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

        // 2
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

        // 3
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

        // 6
        /*Scanner sc = new Scanner(System.in);
        System.out.println("Print a number.");
        int x = sc.nextInt();
        for (int i = 2; i <= 30000; i++) {
            if (x % i == 0) {
                System.out.println(i);
                break;
            }
        }*/

        // 7
        /*Scanner sc = new Scanner(System.in);
        System.out.println("Please print a number.");
        int x = sc.nextInt();
        for (int i = 1; i <= 30000; i++) {
            if (x % i == 0) {
                System.out.println(i);
            }
        }*/

        // inverted triangle
        /*Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        for (int j = 1; j <= a; j++) {
            for (int i = j; i <= a; i++) {
                System.out.print(a + "  ");
            }
            System.out.println();
        }*/

        // triangle
        /*Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        for (int i = 1; i <= a; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print(a + "  ");
            }
            System.out.println();
        }*/
    }
}
