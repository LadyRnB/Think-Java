/**The program computes the multiadditionization of three given parameters*/

import java.util.Scanner;

public class MultaddCh06 {
	
	//The method to compute the multiadditionizatiov itself
public static double multadd(double a, double b, double c) {
	return a * b + c;
}
//This method to compute the multiadditionization of exponential function 
public static double expSum(double e) {
	return multadd(1, Math.exp(-e), Math.sqrt(1 - Math.exp(-e)));
}

public static void main(String[] args) {
	double x, y, z, n;
	Scanner in = new Scanner(System.in);
	System.out.print("Enter x: ");
    x = in.nextDouble();
	System.out.print("Enter y: ");
	y = in.nextDouble();
	System.out.print("Enter z: ");
	z = in.nextDouble();
	System.out.print("The result of this multiadditionization of these parameters is: ");
	System.out.print(multadd(x, y, z));
	System.out.println();
	
	//To display the result of this trigonometric function
	System.out.printf("\rThe sum of this trigonometric function is: %.3f\r",multadd(1/2, Math.cos((Math.PI)/4), Math.sin((Math.PI)/4)));

	//To display the result of this logarithmic function
	System.out.printf("\rThe sum of this logarithmic function is: %.3f\r", multadd(1, Math.log(10), Math.log(20)));

	//To display the result of this exponential function
	System.out.print("\rEnter n: ");
	 n = in.nextDouble();
	System.out.printf("The result of this exponential function is: %.3f", expSum(n));
	in.close();
}
}
