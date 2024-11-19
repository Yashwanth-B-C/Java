// Program Name: Incremental Number Triangle Pattern
// Description: This program prints a triangular number pattern with incrementing numbers.

package NumberPattern;

public class NumberPattern {
    public static void main(String[] args) {
        int m = 1; // Initialize the number to be printed
        
        // Outer loop to handle the number of rows
        for (int i = 1; i <= 5; i++) {
            // Inner loop to handle the numbers in each row
            for (int j = 1; j <= i; j++) {
                System.out.print(" " + m); // Print the current number with a space
                m++; // Increment the number after printing
            }
            System.out.println(); // Move to the next line after each row
        }
    }
}
