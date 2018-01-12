import java.util.Scanner;

public class GuessMain {

	public static void main(String[] args) {
		
		Scanner oScan = new Scanner(System.in);
		GuessGame game = new GuessGame();
		game.setRandomNumber();
		boolean bcorrect = false;
		int b = game.getRandomNumber();
		do 
		{
			System.out.println("Enter a number between 0 and 100: ");
			int a = oScan.nextInt();
			bcorrect = game.CheckGuess(a);
			if(a < b)
				System.out.println("The Number you gave is too low");
			else if(a > b)
				System.out.println("The Number you gave is too high");
		}
		while(bcorrect==false);
		System.out.println("You guessed correctly");
	}

}
