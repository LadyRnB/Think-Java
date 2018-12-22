/**
 * A program that generates a histogram array 
 * out of a given array
 */
import java.util.Scanner;
import java.util.Arrays;

public class HistogramCh08 {
	public static int[] histogram(int[] a) {
		int[] counters = new int [a.length];
		for (int score : a) {
			int index = score;
			counters[index]++;
		}
		return counters;
	}
	
	public static void main(String[] args) {
		int n, i;
		Scanner in = new Scanner(System.in);
		System.out.print("Enter the number of elements of the array scores: ");
		n = in.nextInt();
		int[] scores = new int[n];
		for (i = 0; i < scores.length; i++) {
			System.out.print("Enter the element number " + (i + 1) + " of the array: ");
			//The score's value should not exceed the number of elements of the array
			scores[i] = in.nextInt();
		}
		System.out.println("\nThis is the array scores: ");
		System.out.print(Arrays.toString(scores));
		System.out.println();
		int[] histogrm = new int[scores.length];
		histogrm = histogram(scores);
		System.out.println("\nThis is the histogram: ");
		System.out.print(Arrays.toString(histogrm));
		
		in.close();
	}
}
