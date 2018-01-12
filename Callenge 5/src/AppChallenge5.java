import java.util.Random;
import java.util.Scanner;
public class AppChallenge5 {
	public int lengthOfWords(){
		int length;
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter First Word: ");
		String sValue1 = sc.nextLine();
		System.out.println("Enter Second Word: ");
		String sValue2 = sc.nextLine();
		length = sValue1.length()+sValue2.length();
		return length;
		
		
		
	}
	public String DomainName() {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Website: ");
		String sValue1 = sc.nextLine();
		return ("www."+sValue1+".com");
	}
	public void WordCapLow() {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a Word ");
		String sValue1 = sc.nextLine();
		System.out.println(sValue1.toUpperCase());
		System.out.println(sValue1.toLowerCase());
		System.out.println(sValue1);
	}
	public int RandNum() {
		Random iRandNum1 = new Random();
		Random iRandNum2 = new Random();
		int iNum = iRandNum1.nextInt(100);
		int iNum2= iRandNum2.nextInt(100);
		if(iNum<iNum2)
			return iNum;
		else
			return iNum2;
	}
	public double DoubleNum() {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a double ");
		double sValue1 = sc.nextDouble();
		return (sValue1 * sValue1 *sValue1);
	}

}
