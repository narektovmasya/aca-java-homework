package com.aca;
import java.awt.*;
import java.sql.SQLOutput;
import java.util.Random;
import java.util.Scanner;

public class my2 {
    public static void main(String[] args) {
        /*Scanner sc = new Scanner(System.in);
        System.out.println("please enter first number");
        float first = sc.nextFloat();
        System.out.println("please enter second number");
        float second = sc.nextFloat();
        System.out.println("please enter third number");
        float third = sc.nextFloat();
        float Sum = (first + second + third);
        System.out.println(Sum);*/

        /*int a=10, b=20;
        if (a<b){
            System.out.println("a < b");
        }else if (a>b){
            System.out.println("a > b");
        }*/

        /*Scanner sc = new Scanner(System.in);
        System.out.println("please enter first number");
        int a = sc.nextInt();
        System.out.println("please enter second number");
        int b = sc.nextInt();
        if (a < b) {
            System.out.println(a + "<" + b);
        } else if (a > b) {
            System.out.println(a + ">" + b);
        } else if (a == b) {
            System.out.println(a + "=" + b);
        }*/

        //   Random_int   //
        /*Random rand = new Random();
        int rand_int1 = rand.nextInt(1000);
        int rand_int2 = rand.nextInt(1000);
        System.out.println("random integers"+ rand_int1);
        System.out.println("random integers"+ rand_int2);*/

        //  Random_double  //
        /*Random rand = new Random();
        double rand_dub1 = rand.nextDouble();
        double rand_dub2 = rand.nextDouble();
        System.out.println("Random doubles"+ rand_dub1);
        System.out.println("Random doubles"+ rand_dub2);*/

        /*int a = 5;
        int b = 6;
        System.out.println("max of a and b"+Math.max(a,b));*/

        /*int i = 1, j=1;
        while ( i<=3){
            System.out.println("O "+i);
            while (j <=3){
                if (j ==2){
                    j++;
                    continue;
                }
                System.out.println("I "+j);
                j++;
            }
            i++;
        }*/

        /*int a []= new int[5];
        a [0]=1;
        a [1]=-25;
        a [2]=0;
        a [3]=14;
        a [4]=-1;
        int min = a[0];
        for (int j = 0; j < 5; j++) {
            if ((a[j] < min)&(a[j]>0)) {
                min = a[j];
                System.out.println(min);
            }
        }*/

       /* Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int ar[] = new int[a];
        Random rand = new Random();
        int min = ar[0];
        int sum = 0;
        for (int i = 0; i < a; i++) {
            ar[i] = -50 + rand.nextInt(100);
            System.out.print(ar[i] + " ");
        }
        System.out.println();
        for (int i = 0; i < a; i++) {
            sum = sum + ar[i];
        }
        if (sum < 1000) {
            for (int j = 1; j < a; j++) {
                if ((ar[j] < min)&&(ar[j]>0)) {
                    min = ar[j];
                    System.out.println(min);
                }
            }
        }*/

        Scanner sc = new Scanner (System.in);
        System.out.println("enter number");
        int a = sc.nextInt();
        switch (a%2){
            case 1:
                System.out.println("odd");
            default:
            case 0:
                System.out.println("even");
        }


    }
}
