/*
 * Programmer: Grant Bigelow
 * Date: 11/30/17
 * Description: App Class that has a main class called game which passes
 * in a description and then a subclass that inheriets the game class and 
 * adds two attributes, whether it is a team or not and whether it ended 
 * in a tie or not.
 */
public class Game {
	private String description;
	
	public Game(String newDescription) {
		setDescription(newDescription);
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String newDescription) {
		description = newDescription;
	}
	public String toString() {
		return("description: "+description);
	}
	

	public class Sport extends Game{
		public String Team;
	
		public Sport(String newDescription,Boolean tie, String team) {
			super(newDescription);
			Team = team; 
			Tie = tie; 
			
		}
		public String toString() {
			return "Is it a team or single player? " + getTeam() + ", Tie: " + getTie()
					+ ", Description: " + getDescription() ;
		}
		public String getTeam() {
			return Team;
		}
		public void setTeam(String team) {
			Team = team;
		}
		public String getTie() {
			if(Tie == true)
				return ("Yes");
			else
				return("No");
		}
		public void setTie(Boolean tie) {
			Tie = tie;
		}
		public Boolean Tie; 
		
		
	}
}