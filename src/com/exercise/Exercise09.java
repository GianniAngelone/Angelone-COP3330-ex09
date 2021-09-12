/*
 *  UCF COP3330 Fall 2021 Assignment 8 Solution
 *  Copyright 2021 Gianni Angelone
 */
package com.exercise;
import java.util.Scanner;
public class Exercise09 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        //Here we take in the input from a user
        System.out.print("Enter a length: ");
        String length = input.nextLine();
        System.out.print("Enter a width: ");
        String width = input.nextLine();
        int Length = Integer.parseInt(length);
        int Width = Integer.parseInt(width);
        int squareFeet= Length * Width;
        double gallon = 350;
        double amount = squareFeet/gallon;
        double rounded = Math.ceil(amount);

        System.out.print(String.format("You will need to purchase %.0f gallons of paint to cover %d square feet", rounded, squareFeet));
    }
}
