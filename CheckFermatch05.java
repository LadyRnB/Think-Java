import java.util.Scanner;
public class CheckFermatch05 {
public static void checkFermat(int a, int b, int c, int n) { 
	a = (int)Math.pow(a, n);
	b = (int)Math.pow(b, n);
	c = (int)Math.pow(c, n);
	if(n > 2) {
		if((a + b) == c)
		{
			System.out.print("Holy smokes, Fermat was wrong!");
			System.out.print(a);
			System.out.print(" + ");
			System.out.print(b);			
			System.out.print(" = ");
			System.out.print(c);
			
		}
		else {
			System.out.print("no, that doesn't work, since: ");
			System.out.print(a);
			System.out.print(" + ");
			System.out.print(b);
			System.out.print(" != ");
			System.out.print(c);
		}
	}
	
}
	public static void main(String[] args) {
		int x, y, z, p;
		Scanner in = new Scanner(System.in);
		System.out.print("Enter the number x: ");
		x = in.nextInt();
		System.out.print("Enter the number y: ");
		y = in.nextInt();
		System.out.print("Enter the number z: ");
		z = in.nextInt();
		System.out.print("Enter the number p: ");
		p = in.nextInt();
		System.out.print((int)Math.pow(x,p));
		System.out.print(" + ");
		System.out.print((int)Math.pow(y,p));
		System.out.print(" = ");
		System.out.print((int)Math.pow(x,p)+(int)Math.pow(y,p));
		System.out.println();
		checkFermat(x, y, z, p);
		in.close();
	}
}
