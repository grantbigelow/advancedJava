import java.util.Scanner;
/*
 * Programmer: Grant Bigelow
 * Date: 10/30/17
 * Description: Main class that Prompt and accept a value between 1 and 100.
 */
public class DivisableMain {

	public static void main(String[] args) {
		Scanner oScan = new Scanner(System.in);
		System.out.println("Enter a Number between 1 and 100: ");
		DivisableApp App = new DivisableApp();
		App.setDevNum(oScan.nextInt());
		
		

	}

}
