import java.util.Scanner;

public class OddSumCh06 {
	
	public static boolean isPositive (int a) {
		boolean pos;
	if (a > 0 ) {
		return true;
	} else { return false;
	}
	}
  
	public static boolean isOdd (int a) {
		boolean od;
		if (a % 2 != 0) {
			return true;
		} 
		else {
			return false;
		} 
	}

	public static int oddSum(int m, int n) {
		isPositive(n);
		isOdd(n);
		if (m == n) {
			return n;
		} 
		else {
			return n + (oddSum(m, n-2));
			}
		}
	
	public static void main(String [] args) {
		int x, y;
		Scanner in = new Scanner(System.in);
		System.out.print("Enter x: ");
		x = in.nextInt();
		System.out.print("Enter y: ");
		y = in.nextInt();
		System.out.print("The sum of odd numbers of "+ x + " is: ");
		System.out.print(oddSum(y, x));
		}
}
