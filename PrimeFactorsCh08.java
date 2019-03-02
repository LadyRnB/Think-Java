
import java.util.Scanner;
import java.util.Arrays;

public class PrimeFactorsCh08 {

	public static boolean arePrimeFactors(int[] x, int n) {
		int i, j;
		int count = 0, prod = 1;
		boolean[] primes = new boolean[n];
		primes[0] = false;
		for (i = 2; i < primes.length; i++) {
			primes[i] = true;
		}

		for (i = 2; i < Math.sqrt(n); i++) {
			if (primes[i] == true) {
				for (j = i * i; j < n; j = (j + i)) {
					primes[j] = false;
				}
			}
		}

		for (i = 2; i < primes.length; i++, j++) {
			for (j = 0; j < x.length; j++) {
				if (primes[i] == true && i == x[j]) {
					count++;
				}
			}
		}
		for (j = 0; j < x.length; j++) {
			prod *= x[j];
		}
		System.out.println(Arrays.toString(x));
		System.out.println("\nThe number of primes in the array a is: " + count + ".\nTheir product is: " + prod + ".");

		if (count != x.length || prod != n) {
			System.out.println("The numbers of the array aren't all primes and/or their product isn't: " + n + ".");
			return false;
		} 
		else {
			System.out.println("The numbers of the array are all primes & their product is: " + n + ".");
			}

		return true;
	}

	public static void main(String[] args) {
		int m, i, p;
		Scanner in = new Scanner(System.in);
		System.out.print("Enter the number of the elements of the array a: ");
		p = in.nextInt();
		int[] a = new int[p];
		for (i = 0; i < a.length; i++) {
			System.out.print("Enter the element number " + (i + 1) + ": ");
			a[i] = in.nextInt();
		}
		System.out.println("\nThis is the array a: ");
		System.out.print(Arrays.toString(a));
		System.out.println();
		System.out.print("\nEnter the number m: ");
		m = in.nextInt();
		System.out.println("**********************");
		arePrimeFactors(a, m);

		in.close();
	}

}
