/*
  This program is designed to calculate the number of characters in ones surname
and determine whether their current age is even or odd
 */

import java.util.Scanner;
//The line above is used to add the scanner class to get user input

public class SurnameAndAge {
  public static void main(String[] args) {

//Create a scanner object to get the users input
    Scanner scanner = new Scanner(System.in);
//Get the users surname

    System.out.print("Please enter your surname: ");
    String surname = scanner.nextLine();
//Get the users current age

    System.out.print("Please enter your current age: ");
    int age = scanner.nextInt();
    scanner.nextLine();
 // Add this line to consume the newline character

    int charCount = surname.length();
//Print our results
    System.out.println("Then the number of characters is " + charCount + ".");
    System.out.println("Your current age is " + (age % 2 == 0 ? "an even" : "an odd") + " number.");
  }
}