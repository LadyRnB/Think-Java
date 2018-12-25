import java.util.Scanner;
import java.util.Arrays;

public class FactorsCh08 {
	public static boolean areFactors(int[] x, int n) {
		int i;
		int j = 0;
		int count = 0;
		int nonfac = 0;
		int[] b = new int[x.length];

		for (i = 0; i < x.length; i++) {
			if (n % x[i] != 0) {
				b[j] = x[i];
				j++;
				nonfac++;
			} else {
				count++;
			}
		}

		System.out.print("\nThe number of factors of " + n + " in the array a is: " + count + "!");

		if (count != x.length) {
			System.out.print("\n\nThis array ");
			System.out.print(Arrays.toString(x));
			System.out.print(" contains numbers that are not factors of " + n + " which are: ");
			int[] newb = new int[nonfac]; // Creating a new array
			System.arraycopy(b, 0, newb, 0, newb.length); // Copying the array b into the new created one: newb
			System.out.print(Arrays.toString(newb));
			return false;
		} else {
			System.out.println("\n\nAll numbers of the array a are factors of " + n + ".");
		}
		return true;
	}

	public static void main(String[] args) {
		int m, i, p;
		Scanner in = new Scanner(System.in);
		System.out.print("Enter the number of elements of the array a: ");
		p = in.nextInt();
		int[] a = new int[p];
		for (i = 0; i < a.length; i++) {
			System.out.print("Enter the element number " + (i + 1) + ": ");
			a[i] = in.nextInt();
		}
		System.out.println("\nThis is the array a: ");
		System.out.println(Arrays.toString(a));
		System.out.print("\nEnter the number n: ");
		m = in.nextInt();
		System.out.println("**********************");
		areFactors(a, m);
		in.close();
	}
}