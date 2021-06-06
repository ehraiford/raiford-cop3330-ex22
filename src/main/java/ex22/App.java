/*
 *  UCF COP3330 Summer 2021 Assignment 1 Solution
 *  Copyright 2021 Evan Raiford
 */
package ex22;

import java.util.Scanner;

public class App {
    public static void main(String[] args){
        Scanner in = new Scanner(System.in);

        System.out.print("Enter the first number: ");
        double first = in.nextDouble();

        System.out.print("Enter the second number: ");
        double second = in.nextDouble();

        System.out.print("Enter the third number: ");
        double third = in.nextDouble();

        if(first == second || first == third || second == third) {
            System.out.println("Error. Numbers must all have different values.");
            System.exit(0);
        }

        double largest;
        if(first > second && first > third) {
            largest = first;
        }else if(second > first && second > third){
            largest = second;
        }else
            largest = third;

        System.out.println("The largest number is " + largest + ".");
    }
}
