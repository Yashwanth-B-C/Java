// Program Name: Increment and Decrement Operations
package IncrementandDecrement;

public class IncrementandDecrement {

    public static void main(String[] args) {
        // Declare and initialize variables
        int m = 5; // m is initially 5
        int n = 6; // n is initially 6

        // Perform increment and decrement operations
        m = ++n + --n + n++ + n--; // Pre-increment, pre-decrement, post-increment, post-decrement
        n = ++m + --m + m++ + m--; // Pre-increment, pre-decrement, post-increment, post-decrement

        // Display the results of m and n
        System.out.println("m=" + m); // Print the final value of m
        System.out.println("n=" + n); // Print the final value of n
    }
}
