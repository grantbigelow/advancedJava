/*
 * Programmer: Grant Bigelow
 * Date: 11/16/17
 * Description: App class that has accessor methods and mutator methods
 * for a passanger name and their class and toString method. 
 */
public class Passanger {
	private String sname;
	private String iclass;
	
	public Passanger() {
		sname = "Name";
		iclass = "1";
	}
	public String getName() {
		return sname;
	}
	
	public void setName(String sname) {
		this.sname = sname;
	}
 
	public String getIclass() {
		return iclass;
	}

	public void setIclass(String iclass) {
		this.iclass = iclass;
	}
	
	
}
