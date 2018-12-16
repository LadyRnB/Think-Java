import java.util.Scanner;

public class PowerCh06 {
	public static double power(double x, int n) {
		if (n == 0) {
			return 1;
		}
		else { if (n % 2 == 0) {
			return Math.pow(Math.pow(x, n/2),2);
		} else {
			return x * Math.pow(x, (n - 1));
		}
	}
		}
	public static void main(String[] args) {
		double a;
		int m;
		Scanner in = new Scanner(System.in);
		System.out.print("Enter the number a: ");
		a = in.nextDouble();
		System.out.print("Enter the power m: ");
		m = in.nextInt();
		power(a, m);
		System.out.print(a + " power " + m + " is: ");
		System.out.printf("%.3f", power(a,m));
		in.close();
	}
}
