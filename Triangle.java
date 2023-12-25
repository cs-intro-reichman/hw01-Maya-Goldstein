/*
 * Three sides can form a triangle if the sum of the lengths of any two sides is greater than the length of the remaining side. 
 * This is known as the Triangle Inequality Theorem. 
 * Write a program that tests if three given integers form a triangle.
 */ 
public class Triangle {
	public static void main(String[] args) {
		// Gets and parses a, b and c from the command-line
		int a = Integer.parseInt(args[0]);
        int b = Integer.parseInt(args[1]);
        int c = Integer.parseInt(args[2]);
        // Computes the summation of each two inputs
        int sumab = a + b;
        int sumac = a + c;
        int sumbc = b + c;
        // Checks the Inequality Theorem
        boolean isTriangle = ((sumab > c) && (sumac > b) && (sumbc > a));

        System.out.println(a + ", " + b + ", " + c + ": " + isTriangle);	
	}
}
