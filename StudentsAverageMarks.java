/*
     This program will help users to input their unit marks
      and get their average mark
 */

import java.util.Scanner;
//The line above is used to add the scanner class to get user input


public class StudentsAverageMarks { 

  public static void main(String[] args) {
    // Create a Scanner object to read input from the user
    Scanner scanner = new Scanner(System.in);

    // Prompt the user to enter the marks of the five units they did last semester
    System.out.println("Enter the marks of the five units you did last semester:");

    // Declare variables to store the marks for each unit
    double unit1, unit2, unit3, unit4, unit5;

    // Read the mark for Unit 1
    System.out.print("Unit 1: ");
    unit1 = scanner.nextDouble();

    // Read the mark for Unit 2
    System.out.print("Unit 2: ");
    unit2 = scanner.nextDouble();

    // Read the mark for Unit 3
    System.out.print("Unit 3: ");
    unit3 = scanner.nextDouble();

    // Read the mark for Unit 4
    System.out.print("Unit 4: ");
    unit4 = scanner.nextDouble();

    // Read the mark for Unit 5
    System.out.print("Unit 5: ");
    unit5 = scanner.nextDouble();

    // Calculate the average mark by adding up all the marks and dividing by 5
    double average = (unit1 + unit2 + unit3 + unit4 + unit5) / 5;

    // Use printf to display the average mark with two decimal places
    System.out.printf("Your average mark is: %.2f%n", average);
  }
}