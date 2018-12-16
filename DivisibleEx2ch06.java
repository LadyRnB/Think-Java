import java.util.Scanner;

public class DivisibleEx2ch06 {
	public static boolean isDivisible(int n, int m) {
		if (n % m == 0) {
			return true;
		} else { return false;
		}
			
		}
	public static void main(String[] args) {
		int x, y;
		Scanner in = new Scanner(System.in);
		
		System.out.print("Enter the number x: ");
		x = in.nextInt();
		System.out.print("Enter the number y: ");
		y = in.nextInt();
		if (isDivisible(x,y)) {
			System.out.print(x + " is divisible by " + y);
			System.out.println(", & its quotient is: " + x/y);
		}
		else {
			System.out.print(x + " is not divisible by " + y);
			System.out.print(", & its quotient is: "+ x/y);
		}
		in.close();
	}
	}
