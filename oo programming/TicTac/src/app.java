/*
	 * Programmer: Grant Bigelow
	 * Date: 11/27/17
	 * Description: App class that creates an string
	 * array and then has logic for a game of tic tac toe
	 * then print out the game as a string. 
	 */
public class app {
	private String[][] board;

	public app(){
		board = new String[4][4];
		int count = 0;
		for(int i=0;i<=3;i++){
			String def =" "; 
			for(int j=0;j<=3;j++) {
				board[i][j]=def;
				count++;
			}
			
			
		}
	}
	public void setBoard(int row,int column, String player) {
		board[row][column]=player;
	}
	public String[][] getBoard(){
		return board;
	}
	public boolean checkWin(String player){
		int win = 0;
		for(int i=0;i<=3;i++) {
			int count = 0;
			if(board[i][count]==player)
				win++;
			count++;
		}
		if(win == 3)
			return true;
		else {
			int rowWin = 0;
			for(int i=0;i<=3;i++) {
				int count = 0;
				if(board[count][i]==player)
					rowWin++;
				count++;
			}
			if(rowWin == 3)
				return true;
			else
				if(board[0][0]==player && board[1][1]==player&&board[2][2]==player)
					return true;
				else 
					return false;
		}
	}
	public String toString(){
		return("|"+board[0][0]+"|"+board[0][1]+"|"+board[0][2]+"|\n"+"_______"+"\n"+
				"|"+board[1][0]+"|"+board[1][1]+"|"+board[1][2]+"|\n"+"_______"+"\n"+
				"|"+board[2][0]+"|"+board[2][1]+"|"+board[2][2]+"|\n");
	}
}
