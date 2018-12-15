/*
 * A program to compute Ackermann function
 */
import java.util.Scanner;

public class AckCh06 {
	
	public static int ack(int m, int n) {
	if (m == 0) {
		return (n + 1);
	} else if (m > 0 && n == 0) {
		int r = ack(m - 1, 1);
		return r;
		} 
	else { 
		return ack(m - 1, ack(m, n - 1));
	}
	}
	
	public static void main(String[] args) {
		int x, y;
		Scanner in = new Scanner(System.in);
		System.out.print("Enter x: ");
		x = in.nextInt();
		System.out.print("Enter y: ");
		y = in.nextInt();
		System.out.print(ack(x, y));		
	}
	}
