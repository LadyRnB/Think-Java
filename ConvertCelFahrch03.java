import java.util.Scanner;
public class ConvertCelFahrch03 {
	public static void main(String[] args) {
		double c, f;
		Scanner in = new Scanner(System.in);
		//prompt the user for input
		System.out.print("What's the weather in Celsius? ");
		c = in.nextDouble();
		f = (c * 1.8) + 32;
		System.out.printf("\n%.1f Celsius = %.1f Fahrenheit",c, f);
		
	}

}
