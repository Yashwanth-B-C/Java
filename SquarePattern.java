// Program Name: Square Pattern Printing
package Square;

public class SquarePattern {
    public static void main(String[] args) {
        // Loop through the rows of the square
        for (int i = 1; i <= 4; i++) { 
            // Loop through the columns of the square
            for (int j = 1; j <= 4; j++) {
                System.out.print("*"); // Print a star without a newline
            }
            System.out.println(); // Move to the next line after each row
        }
    }
}
