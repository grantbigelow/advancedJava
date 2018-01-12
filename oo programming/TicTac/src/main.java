import java.util.Scanner;
/*
 * Programmer: Grant Bigelow
 * Date: 11/27/17
 * Description: Main class that tests the 
 * Tic Tac Toe app class. 
 */
public class main {

	public static void main(String[] args) {
		app app = new app();
		System.out.print(app.toString());
		boolean over = true;
		Scanner oScan = new Scanner(System.in);
		while(over) {
			System.out.println("Player 1, enter Row: ");
			int Row1 = oScan.nextInt();
			System.out.println("Player 1, enter Column: ");
			int column1 = oScan.nextInt();
			if(app.getBoard()[Row1][column1]==" ")
				app.setBoard(Row1,column1, "X");
			else
				System.out.println("Not an available spot");
			System.out.println(app.toString());
			if(app.checkWin("X")==true) {
				System.out.print("Player 1 won!");
				over = false;
				break;
			}		
			System.out.println("Player 2, enter Row: ");
			int Row2 = oScan.nextInt();
			System.out.println("Player 2, enter Column: ");
			int column2 = oScan.nextInt();
			if(app.getBoard()[Row2][column2]==" ")
				app.setBoard(Row2,column2, "O");
			else
				System.out.println("Not an available spot");
			System.out.println(app.toString());
			
			if(app.checkWin("O")==true) {
				System.out.print("Player 2 won!");
				over = false;
			}
			
		}
	}

}
