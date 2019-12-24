import java.util.Scanner;

public class CheckFermatch05 {
	public static void checkFermat(int a, int b, int c, int n) {
		a = (int) Math.pow(a, n);
		b = (int) Math.pow(b, n);
		c = (int) Math.pow(c, n);
		// note: Better remove that type cast, Type casting an Integer is useless here,
		// since the user should introduce an integer, otherwise the program
		// will generate an InputMismatchException
		if (n > 2) {
			if ((a + b) == c) {
				System.out.print("Holy smokes, Fermat was wrong!" + a + " + " + b + " = " + c);
			} else if ((a + b) != c) {
				System.out.print("no, that doesn't work, since: " + a + " + " + b + " != " + c);
			}
		} else {
			System.out.print("See, Fermat's theory is correct!");
		}

	}

	public static void main(String[] args) {
		int x, y, z, p;
		Scanner in = new Scanner(System.in);
		System.out.print("Enter the number x: ");
		x = in.nextInt();
		System.out.print("Enter the number y: ");
		y = in.nextInt();
		System.out.print("Enter the number z: ");
		z = in.nextInt();
		System.out.print("Enter the number p: ");
		p = in.nextInt();
		System.out.print((int) Math.pow(x, p) + " + "); // Type cast is useless here as well
		System.out.print((int) Math.pow(y, p) + " = "); // since all numbers are integers
		System.out.print((int) Math.pow(x, p) + (int) Math.pow(y, p));
		System.out.println();
		checkFermat(x, y, z, p);
		in.close();
	}
}
