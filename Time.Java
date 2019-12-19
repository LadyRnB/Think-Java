public class Time {

	public static void main(String[] args) {
		int hour = 14;
		int minute = 59;
		int second = 30;
		int d = hour * 3600 + minute * 60 + second;
		double p = (d * 100) / (24 * 3600);
		int hour1 = 21;
		int minute1 = 12;
		int second1 = 40;
		int d1 = hour1 * 3600 + minute1 * 60 + second1;
		double p1 = (d1 * 100) / (24 * 3600);

		System.out.println("The starting time:\n" + hour + ":" + minute + ":" + second);
		System.out.println("\nThe number of seconds elapsed since midnight:\n" + d);
		System.out.println("\nThe percentage of the time elapsed since midnight:\n" + p + " %");
		System.out.println("\nThe current time is:\n" + hour1 + ":" + minute1 + ":" + second1);
		System.out.println("\nThe elapsed time since starting coding:\n" + (d1 - d));
		System.out.println("\nThe percentage of the time elapsed since starting coding:");
		System.out.println(((d1 - d) * 100) / (24 * 3600) + " %");
		System.out.println("\nThe number of seconds remaining in the day:");
		System.out.println((24 * 3600) - d1);
		System.out.println("\nThe percentage of the day that has passed:\n" + p1 + " %");
	}

}
