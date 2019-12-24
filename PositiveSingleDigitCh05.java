
import java.util.Scanner;

public class PositiveSingleDigitCh05 {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		System.out.print("Enter your number: ");
		int nb = in.nextInt();
		while (nb > 0 && nb < 10) {
			System.out.print("Positive single digit number!\nEnter another number: ");
			nb = in.nextInt();
			while (nb < 0 || nb >= 10) {
				if (nb < 0) {
					System.out.print("That's a negative digit!\nEnter a positive digit: ");
					nb = in.nextInt();
					} else {
					System.out.println("This number has two digits!\nTry another single digit: ");
					nb = in.nextInt();
				}
			}
		}
	in.close();
	}
}