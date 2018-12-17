/**This program computes the factorial of a number
 * using iterative method 
*/
import java.util.Scanner;

public class FactorialCh07 {
	public static int factorial(int n) {
		int i;
		int f = 1;
		if(n==0) {
			return 1;
		}
			for (i = 1; i <= n; i++) {
				f = f * i;
			}
		return f;
		}
	
	public static void main(String[] args) {
		int x;
		Scanner in = new Scanner(System.in);
		System.out.print("Enter the number x: ");
		x = in.nextInt();
		System.out.print("The factorial of " + x + " is: ");
		factorial(x);
		System.out.print(factorial(x));
		in.close();
	}
}
