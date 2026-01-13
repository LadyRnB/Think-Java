public class Time {

	public static void main(String[] args) {
		import java.util.Scanner;

public class Time{
   public static double elapse(double d, double h, double m, double s ){
        d = h * 3600 + m * 60 + s;
       return (d * 100.) / (24 * 3600);
    }
public static void main(String [] args){

    Scanner in = new Scanner(System.in);
    System.out.print("Enter Hour: ");
    double hour = in.nextDouble();
    System.out.print("Enter minutes: ");
    double minute = in.nextDouble();
    System.out.print("Enter seconds: ");
    double second = in.nextDouble();
    double dauer = hour * 3600 + minute * 60 + second;
    System.out.printf("\nThe number of seconds elapsed since [00:00] : %f \n", dauer);
    System.out.print("\nThe percentage of the time elapsed since [00:00]:\n" + elapse(dauer,hour,minute,second) + " %");
    System.out.println("\n\n***********************************************************\n");
    System.out.print("Enter Start  hour: ");
    double hr = in.nextDouble();
    System.out.print("Enter Start minutes: ");
    double mn = in.nextDouble();
    System.out.print("Enter Start seconds: ");
    double sc = in.nextDouble();
    double dr = hr * 3600 + mn * 60 + sc;
		System.out.print("\nSeconds elapsed since starting coding : " + (dauer - dr));
		System.out.print("\nThe percentage of the time elapsed since starting coding: ");
		System.out.print(((dauer - dr) * 100) / (24 * 3600) + " %");
		System.out.print("\nThe number of seconds remaining in the day: ");
		System.out.print((24 * 3600) - dr);
		System.out.print("\nThe percentage of the day that has passed: " + elapse(dr,hr, mn, sc) + " %");
        in.close();
   }

}
	}

}
