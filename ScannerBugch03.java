import java.util.Scanner;
public class ScannerBugch03 {
public static void main(String[] args) {
	String name, txt;
	int age, number;
	Scanner in = new Scanner(System.in);
	System.out.print("What's your name? ");
	name = in.nextLine();
	System.out.print("\nWhat's your age? ");
	age = in.nextInt();
	System.out.printf("\nHello %s, your age is %d!\n", name, age);
	System.out.print("\nEnter a number: ");
	number = in.nextInt();
	System.out.print("Write a text: ");
	in.nextLine();
	txt = in.nextLine();
	System.out.printf("\n%d is the number you've just entered, & your text is: %s", number , txt);
	
}
}
