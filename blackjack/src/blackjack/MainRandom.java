package blackjack;
import java.util.Scanner;
public class MainRandom {
/*
 * Programmers: Grant Bigelow, Gage Sanchez, Dalton Larrington
 * Date: 12/5/17
 * Description: Main class that calls the player class to play blackjack.
 */
	public static void main(String[] args) {

		Scanner oScan = new Scanner(System.in);
		RandomNumberGen oRand = new RandomNumberGen();
		Player1 oApp1 = new Player1();//creates a player object
		
		System.out.println("The Dealer is showing a:  " + oRand.RNumber());//shows the number the dealer is starting out with.

		oApp1.isPlayer1();

		
	}

}
