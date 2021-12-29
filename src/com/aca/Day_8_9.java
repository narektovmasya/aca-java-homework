package com.aca;

import java.awt.*;
import java.sql.SQLOutput;
import java.util.Random;
import java.util.Scanner;

public class Day_8_9 {
    public static void main(String[] args) {

        // DAY 8

        // 1
        /*Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] ar = new int[n];
        Random rand = new Random();
        for (int i = 0; i < n; i++) {
            ar[i] = rand.nextInt(100);
        }
        for (int j = 0; j < n; j++) {
            if (j % 2 == 0) {
                System.out.print(ar[j] + "   ");
            }
        }*/

        // 2
        /*Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] ar = new int[n];
        Random rand = new Random();
        for (int i = 0; i < n; i++) {
            ar[i] = rand.nextInt(100);
        }
        for (int j = 0; j < n; j++) {
            if (ar[j] % 2 == 0) {
                System.out.print(ar[j] + "   ");
            }
        }*/

        // 3
        /*Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] ar = new int[n];
        Random rand = new Random();
        for (int i = 0; i < n; i++) {
            ar[i] = -100+rand.nextInt(100);
        }
        for (int j = 0; j < n; j++) {
            if (ar[j] > 0) {
                System.out.print(ar[j] + "   ");
            }
        }*/

        // 4
        /*Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] ar = new int[n];
        Random rand = new Random();
        for (int i = 0; i < n; i++) {
            ar[i] = rand.nextInt(1000);
            System.out.print(ar[i] + " ");
        }
        System.out.println();
        for (int j = 0; j < n-1; j++) {
            if (ar[j+1] > ar[j]) {
                System.out.println(ar[j+1] + "   ");
            }
        }*/

        // 5
        /*Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] ar = new int[n];
        Random rand = new Random();
        for (int a = 0; a < n; a++) {
            ar[a] = -100 + rand.nextInt(200);
            System.out.print(ar[a] + " ");
        }
        for (int i = 0; i < n - 1; i++) {
            if ((ar[i] < 0) && (ar[i + 1] > 0)) {
                System.out.println(ar[i + 1]);
            }
        }*/

        // 6
        /*Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] ar = new int[n];
        Random rand = new Random();
        int max=ar[0];
        for (int a = 0; a < n; a++) {
            ar[a] = -100 + rand.nextInt(200);
            System.out.print(ar[a] + " ");
        }
        System.out.println();
        for (int i =1 ; i<n;i++){
            if (ar[i]>max){
              max=ar[i];
            }
        }
        System.out.println(max);*/

        // 8
        /*
        int ar []= new int [6];
        ar [0]=1;
        ar [1]=1;
        ar [2]=2;
        ar [3]=5;
        ar [4]=6;
        ar [5]=6;
        int sum = 1;
        for (int i = 0; i < a-1 ; i++ ){
            if (ar[i]!=ar[i+1]){
                    sum =sum+1 ;
            }
        }
        System.out.println(sum);*/

        // 9
        /*int ar[] = new int[6];
        ar[0] = 1;
        ar[1] = 2;
        ar[2] = 3;
        ar[3] = 4;
        ar[4] = 5;
        for (int i = 4; i > -1; i--) {
            System.out.println(ar[i]);
        }*/




    }
}
