// Program Name: Butterfly Pattern Generator
package ButterFly;

public class ButterFly {

    public static void main(String[] args) {
        // Upper part of the butterfly pattern
        for (int i = 0; i <= 4; i++) {
            // Printing the left wing of the butterfly
            for (int j = 0; j <= i; j++) {
                System.out.print("*");
            }
            // Printing spaces between the wings
            for (int k = 0; k < 2 * (3 - i + 1); k++) {
                System.out.print(" ");
            }
            // Printing the right wing of the butterfly
            for (int j = 0; j <= i; j++) {
                System.out.print("*");
            }
            // Moving to the next line
            System.out.println();
        }

        // Lower part of the butterfly pattern
        for (int m = 0; m <= 4; m++) {
            // Printing the left wing of the butterfly
            for (int n = 0; n < 4 - m + 1; n++) {
                System.out.print("*");
            }
            // Printing spaces between the wings
            for (int o = 0; o < 2 * m; o++) {
                System.out.print(" ");
            }
            // Printing the right wing of the butterfly
            for (int n = 0; n < 4 - m + 1; n++) {
                System.out.print("*");
            }
            // Moving to the next line
            System.out.println();
        }
    }
}
