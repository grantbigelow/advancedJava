package blackjack;

/*
 * Programmers: Grant Bigelow, Gage Sanchez, Dalton Larrington
 * Date: 12/5/17
 * Description: Player class that allows a user to enter if they want to play
 * then asks them if they want to hit or stay if they say hit it will add a random number to 
 * their total if they say stay or they bust it will exit the loop and then compare it 
 * to the dealer score and tell the player if they won, the dealer won, or they busted. 
 */
import java.util.Random;
import java.util.Scanner;


public class Player1{

	private int iPlayer1total;
	private int iRandNbr;
	
	public Player1() {//constructor 
		iPlayer1total = 0;
		iRandNbr = 0;
	}
	
	public int getiPlayer1total() { //getter method
		return iPlayer1total;
	}

	public void setiPlayer1total(int iPlayer1) {//setter method
		this.iPlayer1total = iPlayer1;
	}
	
	
	public void isPlayer1(){//player 1 game loop
		Scanner oScan = new Scanner(System.in);
		RandomNumberGen dealer = new RandomNumberGen();
		boolean LoopControl;
		LoopControl = true;
		Random iRand = new Random();
		int numberAdd = 0;
		System.out.print("Does Player 1 want to play (Y/N): ");
		if (oScan.nextLine().charAt(0) == 'Y') {
			LoopControl = true;
			setiPlayer1total(iRand.nextInt(11)+1);
			System.out.println("Your total is: " + getiPlayer1total());//gives the player a random total to start out with.
	}
		else
			LoopControl = false;
			
		while (LoopControl == true && getiPlayer1total()<=21){//exits the loop if the player busts
			
			numberAdd = (iRand.nextInt(11)+1);
			
			
			
			System.out.print("Does player 1 want to Hit or Stay (H/S): ");//decides weather to exit the loop or add another random number to the total. 
			String Hit = oScan.nextLine();
		
			
			if (Hit.charAt(0) == 'S') {
				LoopControl = false;
				
				
			}
			
			else if (Hit.charAt(0) == 'H' && getiPlayer1total()<=21) {
				if(getiPlayer1total()<=21) {
					if(numberAdd == 1 |numberAdd == 11) {
						System.out.print("You got an ace would you like to add 11 or 1? "); //lets the user decide how it wants to use an Ace 
						String Ace = oScan.nextLine();
						if(Ace.length()==1)
							numberAdd = 1;
						else
							numberAdd = 11;
					}
					
					setiPlayer1total(getiPlayer1total() + numberAdd);
					System.out.println("Your total is: " + getiPlayer1total());//prints the total so the player can check their score. 
					
				}
				else
					setiPlayer1total(getiPlayer1total());
				
			}
			else
				setiPlayer1total(getiPlayer1total());
				
		}
		System.out.println("Dealer total is: " + dealer.Dealer());//calls the dealer class to compare the score
		if(getiPlayer1total()<=21) {
			if(getiPlayer1total()>dealer.Dealer() && dealer.Dealer()<21&& getiPlayer1total()<=21)
				System.out.println("Player 1 wins!");
			else if(getiPlayer1total()<dealer.Dealer() && dealer.Dealer()<21)//for each scenario checks if the player and dealer busted
				System.out.println("Dealer wins!");
			else if(dealer.Dealer()>21)
				System.out.println("Dealer Busts! You Win!");
			else {
				System.out.print("You tied with the Dealer. You Split the pot!");
				System.out.print("Thank you for Playing!");
			}
		}
		else
			System.out.println("You Busted");
			System.out.println("Thank you for Playing!");
	}
}

	


