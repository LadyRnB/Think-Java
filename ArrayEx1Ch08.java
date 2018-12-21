
/**
 * A program that displays the elements of a given array
 * raised in a given power (using a method) / Check ArrayCh08
 */
import java.util.Scanner;
import java.util.Arrays;

public class ArrayEx1Ch08 {
	public static double[] powArray(double[] m) {
		int i, p;
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter the power p: ");
		p = sc.nextInt();
		double[] t = new double[m.length];
		for (i = 0; i < m.length; i++) {
			t[i] = Math.pow(m[i], p);
		}
		sc.close();
		return t;
	}

	public static void main(String[] args) {
		int n, i;
		Scanner in = new Scanner(System.in);
		System.out.print("Enter the number of the elements of a: ");
		n = in.nextInt();
		double[] a = new double[n];
		double[] b = new double[a.length];
		for (i = 0; i < a.length; i++) {
			System.out.print("Enter the element number " + (i + 1) + " of the array: ");
			a[i] = in.nextDouble();
		}

		System.out.println("\nThis is the array a: ");
		System.out.print(Arrays.toString(a));
		System.out.println("\n");
		b = powArray(a);
		System.out.println("\nThis is the array b, \"squared a elements\": ");
		System.out.print(Arrays.toString(b));
		in.close();
	}
}
