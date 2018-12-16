import java.util.Scanner;
public class BeerBottlech05 {
	
	public static void beforeLastVerse(int p) {
		System.out.println(p + " bottles of beer on the wall,\r\n"+p+ 
				" bottles of beer,\r\n" + 
				"ya' take one down, ya' pass it around,\r\n" +
				"no bottles of beer on the wall.");
		System.out.println();
	}
	public static void endingVerse() {
		System.out.println("No bottles of beer on the wall,\r\n" + 
				"no bottles of beer,\r\n" + 
				"ya' can't take one down, ya' can't pass it around,\r\n" + 
				"'cause there are no more bottles of beer on the wall!");
	}
	public static void countdownbeer(int n) {
		if (n==0) {
			endingVerse();
		}
		else if ((n-1) == 0 ) {
			beforeLastVerse(n);
			System.out.println();
			countdownbeer (n-1);
		}
			else { 
				System.out.println(n + " bottles of beer on the wall,\r\n"+n+ 
						" bottles of beer,\r\n" + 
						"ya' take one down, ya' pass it around,\r\n" + (n-1) +
						" bottles of beer on the wall.");
				System.out.println();
				countdownbeer (n-1);
					
				}
			}

		
	
	public static void main(String[] args) {
		int x;
		Scanner in = new Scanner(System.in);
		System.out.print("Enter the number of bottles in your song: ");
		x= in.nextInt();
		System.out.println();
		countdownbeer(x);
		in.close();
	}
}
