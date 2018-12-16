/** A program to compute the square of a number 
* without using Math.sqrt
*/
import java.util.Scanner;

public class SquareRootCh07 {
	public static double squareRoot(double n) {
		double p;
		double m = n / 2;
		do { p = m;
		m = (m + (n / m)) / 2;
		} while (Math.abs(p - m) > 0.0001);
		return m;
	}
	public static void main(String[] args) {
		double a, x;
		Scanner in = new Scanner(System.in);
		System.out.print("Enter the number a: ");
		a = in.nextDouble();
		x = a / 2;
		System.out.print("\nLet's start with the first guess (" + a + " / 2), which is: " + x);
		squareRoot(a);
		System.out.print("\n");
		System.out.print("\nThe closest square value of " + a + " is: ");
		System.out.printf("%.3f",squareRoot(a));
		in.close();
}
}	
