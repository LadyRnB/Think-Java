/**
 * A program to get prime numbers out of a given number
 * Check Sieve Of Eratosthenes
 */
import java.util.Scanner;

public class SieveCh08 {

	public static void sieve(int n) {
		int i, j;
		boolean[] primes = new boolean[n];
		primes[0] = false;
		for (i = 2; i < primes.length; i++) {
			primes[i] = true;
		}

		for (i = 2; i < Math.sqrt(n); i++) {

			if (primes[i] == true) {
				
				for (j = (i * i); j < n; j = (j + i)) {
					primes[j] = false;
				}
			}
		}
		for (i = 2; i < primes.length; i++) {
	         if(primes[i] == true) {
	            System.out.print(i + ", ");
	         }
	      }
	}
	public static void main(String[] args) {
		int x ;
		Scanner in = new Scanner(System.in);
		System.out.print("Enter the number x: ");
		x = in.nextInt();
		System.out.println("\nThese are the prime numbers smaller than or equal to " + x + ":");
		sieve(x);
		in.close();
	}

}
