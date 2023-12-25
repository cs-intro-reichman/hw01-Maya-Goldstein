/*
 * Solves linear equations of the form a⋅x + b = c.
 * The program gets a, b, and c as command-line arguments,
 * computes x, and prints the result.
 * Treats the three arguments as well as the computed value as double values
 */
public class LinearEq {
	 public static void main(String[] args) {
	 	// Gets and parses a, b and c from the command-line
        double a = Integer.parseInt(args[0]);
        double b = Integer.parseInt(args[1]);
        double c = Integer.parseInt(args[2]);
        double x = (c - b) / a; // computes the value of x

        System.out.println(a + " * x" + " + " + b + " = " + c);
        System.out.println("x" + " = " + x);
    }
}