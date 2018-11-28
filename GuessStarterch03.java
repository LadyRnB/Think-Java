import java.util.Random;
/**
 * Starter code for the "Guess My Number" exercise.
 */


public class GuessStarterch03 {
public static void main(String[] args) {
Random r = new Random(); //You're gonna pick a random number.
int number = r.nextInt(100) + 1;
System.out.println(number);
}
}
