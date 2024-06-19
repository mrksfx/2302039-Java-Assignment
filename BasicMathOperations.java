/* 
This program helps us to do basic arithmetic operations
such as addition, subtraction, multiplication and division.
*/


import java.util.Scanner;
//The line above is used to add the scanner class to get user input



public class BasicMathOperations {
  public static void main(String[] args) {

    // Create a Scanner object to read user input
    Scanner scanner = new Scanner(System.in);

    // Get the user to enter the first number to be used
    System.out.print("Enter the first number: ");
    double num1 = scanner.nextDouble();

    // Get the user to enter the operation (add, subtract, multiply, divide)
    System.out.print("Enter the operation (add, subtract, multiply, divide): ");
    String operation = scanner.next();

    // Get the user to enter the second number
    System.out.print("Enter the second number: ");
    double num2 = scanner.nextDouble();

    // Perform the operation based on the user's input
    double result = 0;
    if (operation.equalsIgnoreCase("add")) {
      result = num1 + num2;
    } else if (operation.equalsIgnoreCase("subtract")) {
      result = num1 - num2;
    } else if (operation.equalsIgnoreCase("multiply")) {
      result = num1 * num2;
    } else if (operation.equalsIgnoreCase("divide")) {
      if (num2 != 0) {
        result = num1 / num2;
      } else {
        System.out.println("Error: Division by zero!");
        return;
      }
    } else {
      System.out.println("Error: Invalid operation!");
      return;
    }

    // Display the result to the user
    System.out.println("Result: " + result);
  }
}