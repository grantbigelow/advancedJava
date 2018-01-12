/*Programmer: Grant Bigelow
 * Date: 9/4/17
 * Challenge 3
 * Description: program that will take any amount put in the change method
 * and find the change with the least amount of physical money. 
 */
public class Change {
	private int dollars;
	private int quarters;
	private int dimes;
	private int nickles;
	private int pennies;



	public Change(double amount)
	{
		int change = (int)(amount*100);

		dollars = change / 100;
		change -= dollars * 100;
		quarters = change / 25;
		change -= quarters * 25;
		dimes = change / 10;
		change -= dimes * 10;
		nickles = change / 5;
		change -= nickles * 5;
		pennies = change;
		change -= pennies;
	}

	public int getDollars()
	{
		return dollars;
	}

	public int getQuarters()
	{
		return quarters;
	}

	public int getDimes()
	{
		return dimes;
	}

	public int getNickles()
	{
		return nickles;
	}

	public int getPennies()
	{
		return pennies;
	}

}
