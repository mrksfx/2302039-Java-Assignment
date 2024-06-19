/*
     This program will help kids with divisibility tests of
certain numbers.We will implement the use of if else in the code
 */

import java.util.Scanner;
//The line above is used to add the scanner class to get user input


public class DivisibilityTests {
  public static void main(String[] args) {
/*
     This program will help kids with divisibility tests of
certain numbers.We will implement the use of if else in the code
 */

    // Create a Scanner object to read input from the user
    Scanner scanner = new Scanner(System.in);

    // Prompt the user to enter an integer
    System.out.print("Please enter an integer: ");
    int number = scanner.nextInt();

    // Print a header for the divisibility tests
    System.out.println("Divisibility tests for " + number + ":");

    // Check divisibility by 2
 // A number is divisible by 2 if its last digit is even (0, 2, 4, 6, or 8)

    if (number % 2 == 0) {
      System.out.println(number + " is divisible by 2 because it ends with an even digit (" + (number % 10) + ").");
    } else {
      System.out.println(number + " is not divisible by 2.");
    }

    // Check divisibility by 3
    // A number is divisible by 3 if the sum of its digits is divisible by 3

    if ((number / 10 + number % 10) % 3 == 0) {
      System.out.println(number + " is divisible by 3 because the sum of its digits is divisible by 3.");
    } else {
      System.out.println(number + " is not divisible by 3.");
    }

    // Check divisibility by 4
    // A number is divisible by 4 if its last two digits form a multiple of 4

    if ((number / 10) % 2 == 0 && (number % 10) % 2 == 0) {
      System.out.println(number + " is divisible by 4 because its last two digits form a multiple of 4.");
    } else {
      System.out.println(number + " is not divisible by 4.");
    }

    // Check divisibility by 5
    // A number is divisible by 5 if it ends with a 0 or 5

    if (number % 10 == 0 || number % 10 == 5) {
      System.out.println(number + " is divisible by 5 because it ends with a 0 or 5.");
    } else {
      System.out.println(number + " is not divisible by 5.");
    }

    // Check divisibility by 6
    // A number is divisible by 6 if it is divisible by both 2 and 3

    if (number % 2 == 0 && (number / 10 + number % 10) % 3 == 0) {
      System.out.println(number + " is divisible by 6 because it is divisible by both 2 and 3.");
    } else {
      System.out.println(number + " is not divisible by 6.");
    }

    // Check divisibility by 7, 8, and 9
    // No simple rule, so we'll just use the modulo operator

    for (int i = 7; i <= 9; i++) {
      if (number % i == 0) {
        System.out.println(number + " is divisible by " + i + ".");
      } else {
        System.out.println(number + " is not divisible by " + i + ".");
      }
    }
  }
}