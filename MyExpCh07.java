/** This program computes the exponential value
 *  of a given number using Math.pow & Factorial
 */
import java.util.Scanner;

public class MyExpCh07 {
	public static double myExp(int x, int n) {
		int i;
		double ex = 1;
		int f = 1;
		if (n == 0) {
			return 1;
		}
		for (i = 1; i <= n; i++) {
			f = f * i;
			ex = ex + (Math.pow(x, i)) / (f);
		}
		return ex;
	}
	
	public static void main(String[] args) {
		int a, m;
		Scanner in = new Scanner(System.in);
		System.out.print("Enter the number a: ");
		a = in.nextInt();
		System.out.print("Enter the number of the terms m: ");
		m = in.nextInt();
		myExp(a, m);
		System.out.print("The exponential value of " + a + " is : ");
		System.out.printf("%.3f", myExp(a, m));
		in.close();
	}
}
