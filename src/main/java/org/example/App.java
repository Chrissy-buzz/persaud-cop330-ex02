package org.example;
import java.util.Scanner;  // Import the Scanner class
/*
 *  UCF COP3330 Fall 2021 Assignment 1 Solution
 *  Copyright 2021 Christina Persaud
 */
public class App 
{
    public static void main(String[] args) {
        Scanner myObj = new Scanner(System.in);  // Create a Scanner object
        System.out.println("What is the input string?");

        String userName = myObj.nextLine();  // Read user input
        int stringLength = userName.length();
        System.out.println(userName + " has " + stringLength + " characters.");  // Output user input
    }
}
