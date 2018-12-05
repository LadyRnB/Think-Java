import java.util.Scanner;
public class Zool {
public static void zool(int n, String s1, String s2) {
	System.out.print("The number is: ");
	System.out.print(n);
	System.out.print(", my pet's name is: ");
	System.out.print(s1);
	System.out.print(", & I grew up in the street: ");
	System.out.println(s2);
}
public static void main(String[] args) {
	int n ;
	String s1, s2 ;
	Scanner in = new Scanner(System.in);
System.out.print("Enter your number: ");
n = in.nextInt();
in.nextLine();
System.out.print("Enter your pet's name: ");
s1 = in.nextLine();
System.out.print("Enter the street in which you grew up: ");
s2 = in.nextLine();
	zool(n, s1, s2);
}

}
