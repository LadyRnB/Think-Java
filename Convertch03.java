import java.util.Scanner;
/** 
*This program converts centimeters to inches & feet.
*/
public class Convertch03 {
	public static void main(String[] args) {
	double cm;
	int feet, inches, remainder;
	final double CM_PER_INCH = 2.54;
	final int IN_PER_FOOT = 12;
	Scanner in = new Scanner(System.in);
	//prompt the user & get the value
	System.out.print("Exactly how many centimeters?");
	cm = in.nextDouble();
	//Convert & output the result!
	inches = (int)(cm / CM_PER_INCH);
	feet = (int)(inches / IN_PER_FOOT);
	remainder = (inches % IN_PER_FOOT);
    //ft stands for feet, in for remainder of inches
	System.out.printf("%.2f cm = %d ft, %d in\n", cm, feet, remainder);
	in.close();
	}
}
