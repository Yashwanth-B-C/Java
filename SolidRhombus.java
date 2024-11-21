// Program Name: Solid Rhombus Pattern Generator
package SolidRhombus;

public class SolidRhombus {

    public static void main(String[] args) {
        // Outer loop for rows (0 to 5)
        for (int i = 0; i <= 5; i++) {
            // First inner loop for leading spaces to align the rhombus
            for (int j = 0; j < 4 - i + 1; j++) {
                System.out.print(" ");
            }
            // Second inner loop to print '*' characters for the rhombus
            for (int k = 0; k < 5; k++) {
                System.out.print("*");
            }
            // Move to the next line after each row
            System.out.println();
        }
    }
}
