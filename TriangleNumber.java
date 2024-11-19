// Program Name: Triangle Number Pattern
// Description: This program prints a triangular pattern of numbers.

package NumberPattern;

public class TriangleNumber {
    public static void main(String[] args) {
        // Outer loop to handle the number of rows
        for (int i = 1; i <= 4; i++) {
            // Inner loop to handle the numbers in each row
            for (int j = 1; j <= i; j++) {
                System.out.print(j); // Print numbers in sequence
            }
            System.out.println(); // Move to the next line after each row
        }
    }
}
