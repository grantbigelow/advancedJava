/*Programmer: Grant Bigelow
 * Date: 9/4/17
 * Challenge 3
 * Description: Main program that will use the change class to 
 * determine the change for what ever the 'amount' variable is.
 */
public class ChangeMain {
	public static double amount;
	public static void main(String[] args) {
		
		amount = (1.57);
		Change c = new Change(amount);
		int d1 = c.getDollars();
		int q = c.getQuarters();
		int d2 = c.getDimes();
		int n = c.getNickles();
		int p = c.getPennies();

		System.out.println("Dollars = " + d1);
		System.out.println("Quarters = " + q);
		System.out.println("Dimes = " + d2);
		System.out.println("Nickles = " + n);
		System.out.println("Pennies = " + p);

	}

}
