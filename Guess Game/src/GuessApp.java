import java.util.Random;
/*
 * Programmer: Grant Bigelow
 * Date: 10/26/17
 * Description: App class that generates a random number from 0 to 100
 * and then returns it.
 */
public class GuessApp {
	private int iNbrToGuess; 
	public void setRandomNumber(){
		Random iRandNbr = new Random();
		iNbrToGuess=(iRandNbr.nextInt(100)+1);
	}
	public int getRandomNumber(){
		return iNbrToGuess;
	}
	public boolean CheckGuess(int iGuess){
		if(iNbrToGuess ==iGuess)
			return true;
		else
			return false;
	}
	

}


