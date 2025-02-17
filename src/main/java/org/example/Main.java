package org.example;

import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {

    //    IF Blocks
//    Grade Calculator: Write a Java program that takes a score (e.g., 87) as input and assigns a grade based on the score (A for 90 and above, B for 80-89, C for 70-79, D for 60-69, and F for below 60) using if-else blocks. Print the grade.
    public static void gradeCalculator() {
        int score = 85;
        if (score > 90) {
            System.out.println("You took grade A! Congrats!");
        } else if ((score >= 80) && (score <= 89)) {
            System.out.println("You took grade B! Thats Decent!");
        } else if ((score >= 70) && (score <= 79)) {
            System.out.println("You took grade C!");
        } else if ((score >= 60) && (score <= 69)) {
            System.out.println("You took grade D! :(");
        } else if (score < 60) {
            System.out.println("You took grade F! :(( ");
        }

    }

    //    Switch
//    Traffic Light Simulator: Simulate a traffic light using a switch statement.
//    The user inputs one of three colors (red, yellow, green), and the program prints out what a driver should do (e.g., "Stop" for red).
    public static void trafficLight() {
        String color = "green";
        Scanner colorObject = new Scanner(System.in);
        System.out.println("Enter Traffic light color(red, yellow, green): ");
        color = colorObject.next();

        switch (color) {
            case "green":
                System.out.println("Go go go");
                break;
            case "red":
                System.out.println("Stop!");
                break;
            case "yellow":
                System.out.println("Speeed");
                break;
        }
    }

//    Break and Continue
//    Skip Negative Numbers: Create a program that sums up numbers entered by the user until the user enters 0.
//    Use a continue statement to skip any negative numbers and print the final sum.

    public static void skipNegativeNumbers() {
        int sum = 0;
        int x;
        Scanner inputObject = new Scanner(System.in);
        System.out.println("Enter number to sum(enter 0 to stop): ");

        while (true) {
            x = inputObject.nextInt();

            if (x < 0) {
                System.out.println("Negative number skipped: " + x);
                continue;
            }
            if (x == 0) {
                break;
            }
            sum += x;
        }

        System.out.println("Total sum is: " + sum);

    }

//    For-Each Loop
//    Find the Maximum: Write a Java program that finds the maximum value in an array of integers.
//    Use a for-each loop to iterate through the array. You can initialize the array with some values or take the input from the user.

    public static void theMaximum() {
        int myIntegersArray[] = {10, 20, 30, 40, 50, 60, 70, 100, 90};
        int length = myIntegersArray.length;

        int maxValue = myIntegersArray[0];

        for (int i : myIntegersArray) {

            if (maxValue < i) {
                maxValue = i;
            }
        }
        System.out.println("The maximum value of the array is: " + maxValue);
    }

    public static void main(String[] args) {
        //TIP Press <shortcut actionId="ShowIntentionActions"/> with your caret at the highlighted text
        // to see how IntelliJ IDEA suggests fixing it.
        System.out.printf("Hello and welcome!");

        for (int i = 1; i <= 5; i++) {
            //TIP Press <shortcut actionId="Debug"/> to start debugging your code. We have set one <icon src="AllIcons.Debugger.Db_set_breakpoint"/> breakpoint
            // for you, but you can always add more by pressing <shortcut actionId="ToggleLineBreakpoint"/>.
            System.out.println("i = " + i);
        }

        gradeCalculator();
        trafficLight();
       skipNegativeNumbers();
    }
}