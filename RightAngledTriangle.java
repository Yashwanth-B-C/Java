// Program Name: Right-Angled Triangle Pattern
package RightAngledTriangle;

public class RightAngledTriangle {
    public static void main(String[] args) {
        // Outer loop for rows
        for (int i = 1; i <= 4; i++) {
            // Inner loop for printing stars
            for (int j = 1; j <= i; j++) {
                System.out.print("*"); // Print a star
            }
            System.out.println(); // Move to the next line after each row
        }
    }
}
