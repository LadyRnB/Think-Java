import java.util.*;
public class GuessMyNumberch05 {	
	public static void checkPositive(int x) {
		Scanner sca = new Scanner(System.in);
		while (x < 1 || x > 100){
			System.out.print("The number should be between 1 & 100: ");
			x = sca.nextInt();
		}
	}
	public static void guessAgain(int g, int n) {
		Scanner in = new Scanner(System.in);
		Random r = new Random();
		n = r.nextInt(100)+1;
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
	}
			else {
			System.out.println("Your guess is too low!");
			System.out.print("Sorry, the number I was thinking of is: ");
			System.out.println(n);
			System.out.print("Guess again: ");
			g = in.nextInt();
			checkPositive(g);
			guessAgain(g, n);
			}
	}
	
	public static void main(String[] args) {
	int guess, number;
	Scanner scr = new Scanner(System.in);
	Random rdm = new Random();
	System.out.print("I'm thinking of a number between 1 & 100 (including both).\nCan you guess what it is?\n");
	System.out.print("Guess a number: ");
	guess = scr.nextInt();
	number = rdm.nextInt(100) + 1;
	checkPositive(guess);
	guessAgain(guess, number);
		}
	}
