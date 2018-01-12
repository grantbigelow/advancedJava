/*
 * Programmer: Grant Bigelow
 * Date: 11/29/17
 * Description: Main Class that tests the Game class and the subclass,
 * Sport. 
 */

public class MainSport {

	public static void main(String[] args) {
		Game sport = new Game("Sport").new Sport("Sport",true,"Team");
		System.out.print(sport.toString());
	}

}
