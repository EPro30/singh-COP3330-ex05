/*
 *  UCF COP3330 Fall 2021 Assignment 1 Solution
 *  Copyright 2021 Riya Singh
 */

import java.util.Scanner;
public class exSimpleMath {

    public static void main(String[] args)
    {
        Scanner sc = new Scanner (System.in);

        System.out.println("What is the first number? ");
        String a = sc.next();
        System.out.println("What is the second number? ");
        String b = sc. next();

        int num1 = Integer.parseInt(a);
        int num2 = Integer.parseInt(b);

        int add = num1+num2; //addition of two numbers
        int sub = num1-num2; //subtraction of two numbers
        int prdct = num1*num2; //product of two numbers
        int div = num1/num2; //division of two numbers

        System.out.println(a + " + " + b + " = " + add);

        System.out.println(a + " - " + b + " = " + sub);

        System.out.println(a + " * " + b + " = " + prdct);

        System.out.println(a + " / " + b + " = " + div);
    }
}
