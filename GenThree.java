/*
 * Generates three random integers, each in a given range [a,b),
 * prints them, and then prints the minimal number that was generated.
 */
public class GenThree {
	public static void main(String[] args) {
		// Gets and parses a and b from the command-line
        int a = Integer.parseInt(args[0]);
        int b = Integer.parseInt(args[1]);
        int min = Math.min(a, b); // Computes the minimal value of the inputs
        int range = Math.abs(a - b); // Computes the difference between a and b, in an absolute value
        //Generates 3 random numbers
        int num1 = (int)( (Math.random() * range) + min );
        int num2 = (int)( (Math.random() * range) + min );
        int num3 = (int)( (Math.random() * range) + min );
        // Prints them
        System.out.println(num1);
        System.out.println(num2);
        System.out.println(num3);
        // Computes and prints the minimum value of the generated numbers
        int minimum = Math.min(Math.min(num1, num2), num3);
        System.out.println("The minimal generated number was " + minimum);	
	}
}
