package exercise05;

import java.util.Scanner;

//Write a program that prompts for two numbers.
// Print the sum, difference, product, and quotient of those numbers.
//Values coming from users will be strings.
// Ensure that you convert these values to numbers before doing the math.
public class Solution05 {
    /*
     *  UCF COP3330 Fall 2021 Assignment 1 Solution
     *  Copyright 2021 James Jaro
     */
    public static void main(String[] args){
        /*
        take in two strings that are numbers.
        convert the strings into a numerical value.
        perform addition, subtraction, multiplication, and division.
         */
        Scanner input1 = new Scanner(System.in);
        Scanner input2 = new Scanner(System.in);
        //ask for the two strings
        System.out.print("What is the first number?");
        String number1 = input1.nextLine();
        System.out.print("What is the second number?");
        String number2 = input2.nextLine();
        //convert the two strings into numerical values.
        int num1 = Integer.parseInt(number1);
        int num2 = Integer.parseInt(number2);
        //perform addition, subtraction, multiplication, and division.
        int sum = num1 + num2;
        int difference = num1 - num2;
        int product = num1 * num2;
        int quotient = num1 / num2;
        //print output
        System.out.printf("%s + %s = %d %n %s - %s = %d %n %s * %s = %d %n %s / %s = %d%n", number1, number2, sum, number1, number2, difference, number1, number2, product, number1, number2, quotient);
    }
}
