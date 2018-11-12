public class Time {

	public static void main(String[] args) {
		int hour= 14;
		int minute = 59;
		int second = 30;
		int d = hour * 3600 + minute * 60 + second;
		double p = (d * 100) / (24 * 3600);
		int hour1 =20;
		int minute1 = 18;
		int second1 = 40;
		int d1 = hour1 * 3600 + minute1 * 60 + second1;
		double p1 = (d1 * 100) / (24 * 3600); 
		
		System.out.println("The starting time:");
		System.out.print(hour);
		System.out.print(":");
		System.out.print(minute);
		System.out.print(":");
		System.out.println(second);
		System.out.println("\nThe number of seconds elapsed since midnight:");
		System.out.println(d);
		System.out.println("\nThe percentage of the time elapsed since midnight:");
		System.out.println(p);
		System.out.println("\nThe current time is:");
		System.out.print(hour1);
		System.out.print(":");
		System.out.print(minute1);
		System.out.print(":");
		System.out.println(second1);
		System.out.println("\nThe elapsed time since starting coding:");
		System.out.println(d1 - d);
		System.out.println("\nThe percentage of the time elapsed since starting coding:");
		System.out.println(((d1 - d) * 100) / (24 * 3600)) ;
		System.out.println("\nThe number of seconds remaining in the day:");
		System.out.println((24 * 3600) - d1 );
		System.out.println("\nThe percentage of the day that has passed:");
		System.out.println(p1);
    }

}
