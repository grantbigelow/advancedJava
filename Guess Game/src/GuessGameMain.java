import java.util.Scanner;
/*
 * Programmer: Grant Bigelow
 * Date: 10/26/17
 * Description: Main class that takes the random number generated
 * in the app class and Prompts the user to enter a value Gives a hint 
 * to the user based on whether the number is higher or lower and
 * When the use guesses the number, tells them how many guesses they took to 
 * get the number and displays them a message that is appropriate for the number of guesses.
 */
public class GuessGameMain {

	public static void main(String[] args) {
		Scanner oScan = new Scanner(System.in);
		GuessApp game = new GuessApp();
		game.setRandomNumber();
		boolean bcorrect = false;
		int b = game.getRandomNumber();
		int count = 0;
		do 
		{
			System.out.println("Enter a number between 0 and 100: ");
			int a = oScan.nextInt();
			bcorrect = game.CheckGuess(a);
			count+=1;
			if(a < b)
				System.out.println("The Number you gave is too low");
			else if(a > b)
				System.out.println("The Number you gave is too high");
		}
		
		while(bcorrect==false);
		System.out.println("You guessed correctly");
		System.out.println("It took you "+count+" tries to guess correctly");
		switch(count) {
		case (2):
			System.out.println("You are the best at this!");
			break;
		case 3:
			System.out.println("You are really good at this!");
			break;
		case 4:
			System.out.println("Good job!");
			break;
		case 5:
			System.out.println("Well Done!");
			break;
		}
			
	}
}


