import java.util.*;

public class GuessMyNumberch05 {
	
	public static void checkPositive(int x) {
		Scanner sca = new Scanner(System.in);
		while (x < 1 || x > 100) {
			System.out.print("The number should be between 1 & 100: ");
			x = sca.nextInt(); 
			}
		/* Ignore warnings about closing Scanners!
		 * "sca.close();" is removed (means: Scanner *sca* is not closed) to prevent this kind of exceptions
		 * Exception in thread "main" java.util.NoSuchElementException
		 * at java.util.Scanner.throwFor(Unknown Source)
		 * at java.util.Scanner.next(Unknown Source)
		 * at java.util.Scanner.nextInt(Unknown Source)
		 * at java.util.Scanner.nextInt(Unknown Source)
		 * at GuessMyNumberch05.guessAgain(GuessMyNumberch05.java:37)
		 * at GuessMyNumberch05.main(GuessMyNumberch05.java:53) */
	}

	public static void guessAgain(int g, int n) {
		Scanner in = new Scanner(System.in);
		Random r = new Random();
		n = r.nextInt(100) + 1;
		if (g == n) {
			System.out.print("Bingooo, that's the number I was thinking of: ");
			System.out.print(n);
			System.out.print("!");
		}

		else if (g > n) {
			System.out.println("Your guess is too high!");
			System.out.print("Sorry, the number I was thinking of is: ");
			System.out.println(n);
			System.out.print("Guess again: ");
			g = in.nextInt();
			checkPositive(g);
			guessAgain(g, n);
		} else {
			System.out.println("Your guess is too low!");
			System.out.print("Sorry, the number I was thinking of is: ");
			System.out.println(n);
			System.out.print("Guess again: ");
			g = in.nextInt();
			checkPositive(g);
			guessAgain(g, n);
		
		}
		/* Ignore warnings about closing Scanners!
		 * "in.close();" is removed (means: Scanner *in* is not closed) to prevent this kind of exceptions
		 * Exception in thread "main" java.util.NoSuchElementException
		 * at java.util.Scanner.throwFor(Unknown Source)
		 * at java.util.Scanner.next(Unknown Source)
		 * at java.util.Scanner.nextInt(Unknown Source)
		 * at java.util.Scanner.nextInt(Unknown Source)
		 * at GuessMyNumberch05.guessAgain(GuessMyNumberch05.java:37)
		 * at GuessMyNumberch05.main(GuessMyNumberch05.java:53) */
	}

	public static void main(String[] args) {
		int guess, number;
		Scanner scr = new Scanner(System.in);
		Random rdm = new Random();
		System.out.print("I'm thinking of A number between 1 & 100 (including both).\nCan you guess what it is?\n");
		System.out.print("Guess A number: ");
		guess = scr.nextInt();
		number = rdm.nextInt(100) + 1;
		checkPositive(guess);
		guessAgain(guess, number);
		scr.close(); // That's the only Scanner remained, because it belongs to main method
	} 
	}
