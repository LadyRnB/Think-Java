import java.util.Scanner;
public class PrintDatech04 {
	public static void printAmerican(int date, int year, String day, String month) {
		System.out.print("The date in American format: "+day+", "+month+" "+date+", "+year+"\n");
		
	}
	public static void printEuropean(int date, int year, String day, String month) {
		System.out.print("The date in European format: "+day+" "+date+" "+month+" "+year);
	}
	public static void main(String[] args) {
		int date, year;
		String day, month;
		Scanner in = new Scanner(System.in);
		System.out.print("Enter the day: ");
		day = in.nextLine();
		System.out.print("Enter the date: ");
		date = in.nextInt();
		in.nextLine();
		System.out.print("Enter the month: ");
		month = in.nextLine();
		System.out.print("Enter the year: ");
		year = in.nextInt();
		System.out.println();
		printAmerican(date, year, day, month);
		System.out.println();
		printEuropean(date, year, day, month);
		in.close();
	}
}
