package com.aca;

public class Main {

    public static void main(String[] args) {

        //Widening Primitive Conversion

        /*byte a = 5;
        System.out.println("the byte value" + a);
        short b = a;
        System.out.println("the short value" + b);*/

        /*short a = 25;
        System.out.println("the short value" + a);
        int b = a;
        System.out.println("the integer value" + b);*/

        /*int a = 625;
        System.out.println("the int value" + a);
        long b = a;
        System.out.println("the long value" + b);*/

        /*long a = 3125;
        System.out.println("the long value" + a);
        float b = a;
        System.out.println("the float value" + b);*/

        /*float a = 15.625F;
        System.out.println("the byte value" + a);
        double b = a;
        System.out.println("the short value" + b);*/


        //Widening Primitive Conversion

        /*double a = 15.625;
        System.out.println("the double value" + a);
        float b = (float) a;
        System.out.println("the float value" + b);*/

        /*float a = 3125;
        System.out.println("the float value" + a);
        long b = (long) a;
        System.out.println("the long value" + b);*/

        /*long a = 625;
        System.out.println("the long value" + a);
        int b = (int) a;
        System.out.println("the integer value" + b);*/

        /*int a = 25;
        System.out.println("the int value" + a);
        short b = (short) a;
        System.out.println("the short value" + b);*/

        /*short a = 5;
        System.out.println("the short value" + a);
        byte b = (byte) a;
        System.out.println("the byte value" + b);*/


        //°F to °C
       /* Scanner sc = new Scanner(System.in);
        System.out.println("Please enter temperature in Fahrenheit.");
        float a = sc.nextFloat();
        System.out.println(a +"°F");
        System.out.println("Temperature in Celsius.");
        float sum = (a - 32) * 5 / 9;
        System.out.println(sum + "°C");*/

        //Perimeter and Area of circle
        /*Scanner sc = new Scanner(System.in);
        System.out.println("Please enter radius.");
        double r = sc.nextDouble();
        System.out.println("Perimeter of circle.");
        double perSum = (2 * r) * 3.14159;
        System.out.println(perSum);
        System.out.println(" ");
        System.out.println("Area of circle.");
        double arSum = (r * r) * 3.14159;
        System.out.println(arSum);*/

        //  1/3
        /*System.out.println("1/3");
        double a = 1, b = 3;
        double div = (a / b);
        System.out.println(div);*/

        /*System.out.println("Name");
        char name =
        System.out.println("year of birth");
        int year = 2004;
        System.out.println(year);*/

        // Vote
        /*Scanner sc = new Scanner(System.in);
        System.out.println("Please enter your age.");
        int a =sc.nextInt();
        if (a<18){
            System.out.println("You are not eligible to vote.");
        }else if (a>= 10){
            System.out.println("You are eligible to vote.");
        }*/

        // odd and even numbers
        /*Scanner sc = new Scanner(System.in);
        System.out.println("enter a number");
        int a = sc.nextInt();
        if (a % 2 == 0) {
            System.out.println("This number is an even number.");
        }else System.out.println("This number is an odd number.");*/

        //  multiple of a 5.
        /*Scanner sc = new Scanner(System.in);
        System.out.println("enter a number");
        int a = sc.nextInt();
        if (a % 5 == 0) {
            System.out.println("This number is a multiple of a 5.");
        }else System.out.println("This number isn't a multiple of a 5.");*/

        /*Scanner sc = new Scanner(System.in);
        System.out.println("Enter the first number.");
        int a = sc.nextInt();
        System.out.println("Enter the second number.");
        int b =sc.nextInt();
        System.out.println("Enter the third number.");
        int c =sc.nextInt();
        System.out.println("The greatest number is...");
        if ((a>b)&(a>c)){
            System.out.println(a);
        }else if((b>a)&(b>c)){
            System.out.println(b);
        }else System.out.println(c);*/

        //  Leap Year
        /*Scanner sc = new Scanner(System.in);
        System.out.println("Enter a Year");
        int year = sc.nextInt();
        if (((year % 4 ==0)&& (year % 100 !=0)) || (year % 400==0)){
            System.out.println("This Year is  a leap year.");
        }else System.out.println("This Year is not a leap year");*/

        /*Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        System.out.println((a > 10) || (b != 10));*/

        // output
        /*Scanner sc = new Scanner(System.in);
        System.out.println("Input numbers`");
        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();
        System.out.println("Output`");
        if ((a == b) & (c == a)) {
            System.out.println("3");
        }
        if ((a == c) & (a != b)) {
            System.out.println("2");
        }
        if ((a == b) & (a != c)) {
            System.out.println("2");
        }
        if ((b == c) & (b != a)) {
            System.out.println("2");
        } else System.out.println(" ");*/

        //triangle
        /*Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();
        if ((a + b > c) & (b + c > a) & (c + a > b)) {
            System.out.println("true");
        } else System.out.println("false");*/

        /*Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        System.out.println("(" + a + ";" + b + ")");
        if ((a > 0) & (b > 0)) {
            System.out.println("This coordinate is in the first quarter.");
        }
        if ((a < 0) & (b > 0)) {
            System.out.println("This coordinate is in the second quarter.");
        }
        if ((a > 0) & (b < 0)) {
            System.out.println("This coordinate is in the third quarter.");
        }
        if ((a < 0) & (b < 0)) {
            System.out.println("This coordinate is in the fourth quarter.");
        }
        int c = sc.nextInt();
        int d = sc.nextInt();
        System.out.println("(" + c + ";" + d + ")");
        if ((c > 0) & (d > 0)) {
            System.out.println("This coordinate is in the first quarter.");
        }
        if ((c < 0) & (d > 0)) {
            System.out.println("This coordinate is in the second quarter.");
        }
        if ((c > 0) & (d < 0)) {
            System.out.println("This coordinate is in the third quarter.");
        }
        if ((c < 0) & (d < 0)) {
            System.out.println("This coordinate is in the fourth quarter.");
        }
        System.out.println(" ");
        if ((a > 0) & (b > 0) & (c > 0) & (d > 0)) {
            System.out.println("This points are in the same quarter.");
        }
        else if ((a < 0) & (b > 0) & (c < 0) & (d > 0)) {
            System.out.println("This points are in the same quarter.");
        }
        else if ((a > 0) & (b < 0) & (c > 0) & (d < 0)) {
            System.out.println("This points are in the same quarter.");
        }
        else if ((a < 0) & (b < 0) & (c < 0) & (d < 0)) {
            System.out.println("This points are in the same quarter.");
        } else {
        System.out.println("This points are not in the same quarter.");
        }*/

        //legal
        /*Scanner sc = new Scanner(System.in);
        System.out.println("Input first number.");
        int a = sc.nextInt();
        System.out.println("Inout second number.");
        int b = sc.nextInt();
        if((a>10)&(b!=10)){
            System.out.println("Both a and b legal.");
        }else if((a<=10)&(b!=10)){
            System.out.println("a is illegal b is legal.");
        }else if((a>10)&(b==10)){
            System.out.println("a is legal b is illegal.");
        }else System.out.println("Both a and b illegal.");*/

        /*Scanner sc = new Scanner(System.in);
        System.out.println("Input first number.");
        int a = sc.nextInt();
        System.out.println("Inout second number.");
        int b = sc.nextInt();
        if((a>0)&(b>0)){
            System.out.println("Both a and b legal.");
        }else if((a<=0)&(b>0)){
            System.out.println("a is illegal b is legal.");
        }else if((a>0)&(b<=0)){
            System.out.println("a is legal b is illegal.");
        }else System.out.println("Both a and b illegal.");*/

        /*Scanner sc = new Scanner(System.in);
        System.out.println("Input first number.");
        int a = sc.nextInt();
        System.out.println("Inout second number.");
        int b = sc.nextInt();
        if((a<0)&(b<0)){
            System.out.println("Both a and b legal.");
        }else if((a>=0)&(b<0)){
            System.out.println("a is illegal b is legal.");
        }else if((a<0)&(b>=0)){
            System.out.println("a is legal b is illegal.");
        }else System.out.println("Both a and b illegal.");*/

        /*Scanner sc = new Scanner(System.in);
        System.out.println("Input first number.");
        int a = sc.nextInt();
        System.out.println("Inout second number.");
        int b = sc.nextInt();
        if((a>10)&(b<1)&(a%2!=0)&(b%2!=0)){
            System.out.println("Both a and b legal.");
        }else if((a<=10)&(b>1)&(b%2!=0)){
            System.out.println("a is illegal b is legal.");
        }else if((a>10)&(b<=1)&(a%2!=0)){
            System.out.println("a is legal b is illegal.");
        }else System.out.println("Both a and b illegal.");*/

        /*int a =3, b=4;
        a=a+b;
        b=a-b;
        a=a-b;
        System.out.println(a);
        System.out.println(b);*/






    }


}
