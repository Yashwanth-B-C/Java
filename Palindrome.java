// Program Name: Palindrome Pattern Generator
package Palindrome;

public class Palindrome {

    public static void main(String[] args) {
        // Loop to iterate through rows
        for (int i = 1; i <= 5; i++) {
            // Printing leading spaces for the pyramid structure
            for (int j = 1; j <= 5 - i + 1; j++) {
                System.out.print(" ");
            }
            // Printing the decreasing sequence of numbers
            for (int j = i; j >= 1; j--) {
                System.out.print(j);
            }
            // Printing the increasing sequence of numbers
            for (int j = 2; j <= i; j++) {
                System.out.print(j);
            }
            // Moving to the next line after each row
            System.out.println();
        }
    }
}
