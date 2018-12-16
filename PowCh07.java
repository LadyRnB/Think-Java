/** This program computes the power of a number 
 * using iterative method
 */
import java.util.Scanner;

public class PowCh07 {

		public static double power(double x, int n) {
			if (n == 0) {
				return 1;
			}
			else { 
				if (n % 2 == 0) {
				return Math.pow(Math.pow(x, n/2),2);
				} else {
					for(int i = n; i <= 1; i--) {
						x = x * Math.pow(x, i-1);
						}
					return x;
					}
				}
			}
			
		public static void main(String[] args) {
			double a;
			int p;
			Scanner in = new Scanner(System.in);
			System.out.print("Enter the number a: ");
			a = in.nextDouble();
			System.out.print("Enter the power p: ");
			p = in.nextInt();
			power(a, p);
			System.out.print(a + " power " + p + " is: ");
			System.out.printf("%.3f", power(a,p));
			in.close();
		}
	}
