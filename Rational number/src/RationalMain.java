import java.util.Scanner;
/*
 * Programmer: Grant Bigelow
 * Date: 11/16/17
 * Description: Main class that tests the rational numbers app class.
 */
public class RationalMain {

	public static void main(String[] args) {
		RationalApp app = new RationalApp();
		Scanner oScan = new Scanner(System.in);
		System.out.println("Enter first numerator");
		int num1 = oScan.nextInt();
		System.out.println("Enter first denominator");
		int dom1 = oScan.nextInt();
		System.out.println("Enter second numerator");
		int num2 = oScan.nextInt();
		System.out.println("Enter second denominator");
		int dom2 = oScan.nextInt();
		System.out.println("The rational numbers added together: "+app.Add(num1, num2, dom1, dom2));
		System.out.println("The rational numbers multiplied: "+app.Multiplication(num1, num2, dom1, dom2));
	}

}
