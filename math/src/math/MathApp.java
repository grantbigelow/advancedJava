package math;
public class MathApp {
	private int iValue1 = 50;
	private int iValue2 = 25;
	private float X = 3;
	private float Y = 2;
	final private int AMOUNT = 100;
	final private float PI = 3.14f;
	
	public void Add() {
		System.out.println("Sum of the numbers is: " + (iValue1 + iValue2));
	}
	public void Subtract() {
		System.out.println("Difference of the numbers is: "+ (iValue1 - iValue2));
		
	}
	public int MultiplyReturnProduct() {
		return (iValue1 * iValue2);
	}
	public int DivideReturnProduct() {
		return (iValue1 / iValue2);
		
	}
	public int Modulus() {
		return (iValue1 % iValue2);
	}
	public void PrintConstant() {
		System.out.println("The value of the constant is: " + AMOUNT);
	}
	public void PrintPI() {
		System.out.println("The value of Pi is: " + PI);
	}
	public float Example() {
		return (X / (2 * Y));
	}
	public int AddOne() {
		return (iValue1 + 1);
	}
	public void postFix() {
		System.out.println("Value of post fix opperation " + iValue1 + " changes to:" + ++iValue1 );
	}
}

