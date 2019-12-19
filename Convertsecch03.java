import java.util.Scanner;
public class Convertsecch03 {
public static void main(String[] args) {
	int h, sec, min, remainder;
	Scanner in = new Scanner(System.in);
	System.out.print("What's the number of seconds? ");
	sec = in.nextInt();
	h = sec / 3600;
	min = (sec % 3600 ) / 60;
        remainder = ( sec % 60 ); // Or: remainder = (sec % 3600) % 60; (but that's uselessly complicated)
	System.out.printf("\n%d seconds = %d hours, %d minutes, & %d seconds!", sec, h, min, remainder);
	in.close();
}
}
