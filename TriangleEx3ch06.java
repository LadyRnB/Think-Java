import java.util.Scanner;
public class TriangleEx3ch06 {
	
	public static boolean isTriangle(int a, int b, int c) {
		if ( a > (b + c) || b >(a+c) || c > (a+b)) {
			return true;
		} else {
			return false;
		}
	}
	
	public static void main(String[] args) {
		int x, y, z;
		Scanner in = new Scanner(System.in);
		System.out.print("Enter x: ");
		x = in.nextInt();
		System.out.print("Enter y: ");
		y = in.nextInt();
		System.out.print("Enter z: ");
		z = in.nextInt();
		if (isTriangle(x, y, z)) {
			System.out.println("You can't form a triangle, one of the three sticks is greater than the sum of the other two sticks");
		} else {
			System.out.println("You can form a triangle.");
		}
		in.close();
	}
}
