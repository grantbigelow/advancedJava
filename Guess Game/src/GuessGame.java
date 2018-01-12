import java.util.Random;

public class GuessGame {
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
