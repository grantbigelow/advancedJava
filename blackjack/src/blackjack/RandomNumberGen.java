package blackjack;

/*
 * Programmers: Grant Bigelow, Gage Sanchez, Dalton Larrington
 * Date: 12/5/17
 * Description: Random number class that generates a random number and also
 * has a method that acts as a dealer and will continue adding random numbers
 * to its total until it is greater than 15. 
 */
import java.util.Random;

public class RandomNumberGen {

	private int iRandNbr;
	private int iTotal;
	public RandomNumberGen(){
		iRandNbr = 0;
		iTotal = 0;
	}
	
	public int RNumber(){//Random number method
		Random iRand = new Random();
		return(iRand.nextInt(11)+1);
		
	}
	public int Dealer() { //loop that will only exit when the dealers total is greater than 15
		Boolean dealer = true;
		while(dealer) {
			if(getiTotal()<=15)
				setiTotal(getiTotal()+RNumber());//continues adding random numbers to the dealers total. 
			else
				dealer = false;
			
		}
		return(getiTotal());
		
	}

	public int getiTotal() { //returns the total
		return iTotal;
	}

	public void setiTotal(int iTotal) {//mutator method for the total.
		this.iTotal = iTotal;
	}

}


