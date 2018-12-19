import java.util.Scanner;

public class GaussCh07 {
	
	public static double gauss(double a, int m) {
		
		int i;
		double exp = 1;
		int f = 1;
		double p = 1;
		int t = 1;
		
		if (m == 0) {
			return 1;
		}
		for (i = 1; i <= m; i++) {
			f = f * i;
			p = p * a * a;
			t = t * (-1);
			exp = exp + (t * (p / f));
			
		} return exp;
	}
	public static void main(String[] args) {
		double x;
		int n;
		Scanner in = new Scanner(System.in);
		System.out.print("Enter the number x: ");
		x = in.nextDouble();
		System.out.print("Enter the number of the terms n: ");
		n = in.nextInt();
		System.out.println();
		gauss(x, n);
		System.out.println("The exponential value of " + x + " is: \r");
		System.out.print(gauss(x, n) + "\t" + Math.exp(x));
		
		in.close();
	}
}
