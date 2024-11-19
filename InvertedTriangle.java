// Program Name: Inverted Triangle with Leading Spaces
package InvertedTriangle;

public class InvertedTriangle {
    public static void main(String[] args) {
        // Outer loop for rows
        for (int i = 1; i <= 4; i++) {
            // Inner loop for spaces
            for (int j = 1; j < i; j++) {
                System.out.print(" "); // Print a space
            }
            // Inner loop for stars
            for (int k = 1; k <= 4 - i + 1; k++) {
                System.out.print("*"); // Print a star
            }
            System.out.println(); // Move to the next line after each row
        }
    }
}
