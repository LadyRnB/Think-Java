import java.time.Duration;
import java.time.LocalTime;
import java.util.Scanner;

public class Time {

    public static void main(String[] args) {

        LocalTime now = LocalTime.now();

        LocalTime startingTime = askForStartingTime();

        Duration durationSinceStarting = Duration.between(startingTime, now);
        System.out.printf("Time elapsed since starting: %dh %dmn %ds\n",
                durationSinceStarting.toHoursPart(),
                durationSinceStarting.toMinutesPart(),
                durationSinceStarting.toSecondsPart());


        double timePercentage = dayTimePercentage(durationSinceStarting);
        long durationInSec = Duration.between(LocalTime.MIDNIGHT, now).toSeconds();
        System.out.printf("""
                The percentage of the time elapsed since starting: %.2f %%
                The number of seconds elapsed since %s : %,d seconds
                """, timePercentage, LocalTime.MIDNIGHT, durationInSec);

        Duration durationSinceMid = Duration.between(LocalTime.MIDNIGHT, now);
        double percentSinceMid = dayTimePercentage(durationSinceMid);
        System.out.printf("""
                The percentage of the time elapsed since %s : %.2f %%
                The percentage of the remaining day: %.2f %%
                """, LocalTime.MIDNIGHT, percentSinceMid, (100 - percentSinceMid));
    }

    private static LocalTime askForStartingTime() {
        Scanner in = new Scanner(System.in);
        System.out.print("Enter starting Hour: ");
        int hour = in.nextInt();
        System.out.print("Enter starting minutes: ");
        int minute = in.nextInt();
        System.out.print("Enter starting seconds: ");
        int second = in.nextInt();
        in.close();
        return LocalTime.of(hour, minute, second);
    }

    private static double dayTimePercentage(Duration duration) {
        return (duration.toSeconds() * 100.) / Duration.ofDays(1).toSeconds();
    }

}
