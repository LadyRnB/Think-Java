/** This program computes the exponential value
 *  of a given number using Math.pow & Factorial / Check MyExp1Ch07
 */
import java.util.Scanner;

public class MyExpCh07 {
	public static double myExp(double x, int n) {
		int i;
		double exp = 1;
		int f = 1;
		if (n == 0) {
			return 1;
		}
		for (i = 1; i <= n; i++) {
			f = f * i;
			exp = exp + ((Math.pow(x, i)) / f);
		}
		return exp;
	}
	
	/**A method to display the number, its exponential value 
	using Math.exp & then without using it 
	*/
	public static void check (double y, int k) {
		System.out.println("The exponential value of " + y + " is: \r");
		System.out.print(y +":\t");
		System.out.printf("%.3f\t", myExp(y, k));
		System.out.print(Math.exp(y));
		System.out.print("\t");
	}
	
	/**A method to calculate and adjust the estimated exponential value 
	 * with the correct value which uses
	 * Math.exp
	*/
	public static int accurate(double y, int k) {
			while (Math.exp(y)- myExp(y, k) >= 0.0001) {
		k = k + 1;
	}
			return k;	
	}
	
	public static void main(String[] args) {
		double a;
		int m;
		Scanner in = new Scanner(System.in);
		System.out.print("Enter the number a: ");
		a = in.nextDouble();
		System.out.print("Enter the number of the terms m: ");
		m = in.nextInt();
		
		/**A loop that display exponential values of a in case the variable a takes 
		 * 0.1, 1.0, 10.0 or 100.0
		 * It's an optional loop
		*/
	if (a == 0.001 || a == -0.001) {
			while (a < 100.0 && a > (-100.0)) {
				a = a * 10;
				System.out.println();
				check(a,m);
				System.out.print("\nThe number the most accurate of the terms for the exponential of " + a +" is: ");
				accurate(a, m);
				System.out.print(accurate(a, m));
				}
		}// You can add the same loop for negative numbers separately, by removing this condition (|| a == -0.001)
		//& you invoke check with a negative number, like this: check(-a, m)
			else {
				myExp(a, m);
				check(a, m);
				System.out.print("\nThe number the most accurate of the terms for the exponential of " + a +" is: ");
				accurate(a, m);
				System.out.print(accurate(a, m));
			}
		in.close();
	}
}
