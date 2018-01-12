//Grant Bigelow
//
//this is the code for the cashier class that will give
// how many coins of each type a user should recieve.

public class Cashier
{
	private int dollars;
	private int quarters;
	private int dimes;
	private int nickles;
	private int pennies;



	public Cashier(double d, double r)
	{
		int change = (int)((r * 100) - (d * 100));

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


