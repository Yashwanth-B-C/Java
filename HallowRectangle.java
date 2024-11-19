// Program Name: Hollow Rectangle Pattern
package HallowRectangle;

public class HallowRectangle {

    public static void main(String[] args) {
        // Outer loop for rows
        for (int i = 1; i <= 4; i++) {
            // Inner loop for columns
            for (int j = 1; j <= 4; j++) {
                // Print '*' for border rows and columns
                if (i == 1 || j == 1 || i == 4 || j == 4) {
                    System.out.print("*");
                } else {
                    System.out.print(" "); // Print space for inner area
                }
            }
            System.out.println(); // Move to the next line after each row
        }
    }
}
