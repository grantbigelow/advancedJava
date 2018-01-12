import java.util.Scanner;
/*
 * Programmer: Grant Bigelow
 * Date: 10/31/17
 * Description: Main class that Prompt and accepts two values and prints
 * that value in value and the second value back to decimal .
 */
public class BinaryMain {

	public static void main(String[] args) {
		BinaryApp app = new BinaryApp();
		Scanner oScan = new Scanner(System.in);
		System.out.println("Enter a Number: ");
		int iNum = oScan.nextInt();
		System.out.print(iNum+" is ");
		app.NumToBin(iNum);
		System.out.print(" in binary.\n");
		System.out.println("Enter a Binary Number: ");
		String sBin = oScan.next();
		System.out.print(sBin+" is ");
		app.BinToNum(sBin);
		System.out.print(" in decimal.");
	}

}
