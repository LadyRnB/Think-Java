import java.util.Scanner;
public class Echoch03 {
	public static void main(String[] args) {
	String line;
	Scanner in = new Scanner(System.in);
	System.out.print("Type something: ");
	line = in.nextLine();
	System.out.println("You just said: " + line);
	System.out.print("Type something else: ");
	line = in.nextLine();
	System.out.println("You also said: " + line);
}
}
