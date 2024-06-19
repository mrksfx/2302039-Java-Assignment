/* 
This program helps us to display the multiples of 2,3 and 7 
within a range of numbers 71-150
*/
public class Multiples {
  public static void main(String[] args) {
    // Print a header to indicate what the program is displaying
    System.out.println("Multiples of 2, 3, and 7 between 71 and 150:");

    // Loop through the numbers from 71 to 150
    for (int i = 71; i <= 150; i++) {

      // Check if the current number is a multiple of 2

      if (i % 2 == 0) {

        //If it is a multiple of 2 print a number and a message showing so


        System.out.print(i + " (multiple of 2) ");
      }
      // Check if the current number is a multiple of 3

      if (i % 3 == 0) {

        // If it is a multiple of 3 print a number and a message showing so

        System.out.print(i + " (multiple of 3) ");
      }

      // Check if the current number is a multiple of 7

      if (i % 7 == 0) {

        // If it is a multiple of 7 print a number and a message showing so


        System.out.print(i + " (multiple of 7) ");
      }
      // Print a newline character to separate the output for each number
      System.out.println();
    }
  }
}