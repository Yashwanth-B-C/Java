// Program Name: Number Pyramid Generator
package NumberPyramid;

public class NumberPyramid {
    public static void main(String[] args) {
        // Outer loop for rows (1 to 5)
        for (int i = 1; i <= 5; i++) {
            // First inner loop for spaces to align numbers as a pyramid
            for (int j = 1; j <= 4 - i + 1; j++) {
                System.out.print(" ");
            }
            // Second inner loop for printing the row number (i) with a space
            for (int k = 1; k <= i; k++) {
                System.out.print(i + " ");
            }
            // Move to the next line after completing a row
            System.out.println();
        }
    }
}
