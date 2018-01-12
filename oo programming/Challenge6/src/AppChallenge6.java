import java.util.Scanner;
/*
 * Programmer: Grant Bigelow
 * Date: 10/3/17
 * Description: Application that ask the user for 3 numbers
 * then plugs them into the quadratic formula and prints them out.
 */
public class AppChallenge6 {
	public void QuadFunc() {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter First Number: ");
		double dValue1 = sc.nextDouble();
		System.out.println("Enter Second Number: ");
		double dValue2 = sc.nextDouble();
		System.out.println("Enter Third Number: ");
		double dValue3 = sc.nextDouble();
		
		double firstEq = (-dValue2 + (Math.pow(dValue2, 2)-(4*dValue1*dValue3)))/(2*dValue1);
		double secondEq = (-dValue2 - (Math.pow(dValue2, 2)-(4*dValue1*dValue3)))/(2*dValue1);
		
		System.out.print(firstEq +" and "+secondEq);
	}
	

}
