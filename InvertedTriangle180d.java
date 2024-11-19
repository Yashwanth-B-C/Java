// Program Name: Inverted Triangle Rotated by 180 Degrees
package InvertedTriangle180d;

public class InvertedTriangle180d {
    public static void main(String[] args) {
        // Outer loop for rows
        for (int i = 0; i <= 4; i++) {
            // Inner loop for spaces
            for (int j = 0; j < 3 - i + 1; j++) {
                System.out.print(" "); // Print a space
            }
            // Inner loop for stars
            for (int k = 0; k <= i; k++) {
                System.out.print("*"); // Print a star
            }
            System.out.println(); // Move to the next line after each row
        }
    }
}
