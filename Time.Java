public class Time {

	public static void main(String[] args) {
		int hour = 20;
		int minute = 18;
		int second = 40;
		int p = hour * 3600 + minute * 60 + second;
		double percentage = (p * 100) / (24 * 3600);
		
		System.out.println("The current time is:");
		System.out.print(hour);
		System.out.print(":");
		System.out.print(minute);
		System.out.print(":");
		System.out.println(second);
		System.out.println("\nThe number of seconds elapsed since midnight:");
		System.out.println(p);
		System.out.println("\nThe number of seconds remaining in the day:");
		System.out.println((24 * 3600) - p );
		System.out.println("\nThe percentage of the day that has passed:");
		System.out.println(percentage);
    }

}
