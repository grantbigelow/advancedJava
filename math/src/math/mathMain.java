package math;

public class mathMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		MathApp c = new MathApp();
		c.Add();
		c.Subtract();
		System.out.println("Product of the numbers is: " + c.MultiplyReturnProduct());
		System.out.println("The quotient of the numbers is: " + c.DivideReturnProduct());
		System.out.println("The Modulus of the numbers is: " + c.Modulus());
		c.PrintConstant();
		c.PrintPI();
		System.out.println("The answer is: " + c.Example());
		System.out.println(c.AddOne());
		c.postFix();
	}

}
