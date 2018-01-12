/*
 * Programmer: Grant Bigelow
 * Date: 9/22/17
 * Description: app class that has getter and setter methods of information about specific buildings and
 * and a method that calculates the square foot of a building. 
 */
public class AppBuilding {
	private String name;
	private int numClass;
	private int width; 
	private int length;
	private boolean admin;
	private int sqfoot;
	public AppBuilding() {
		this.setName("not defined");
		this.setNumClass(0);
		this.setWidth(0);
		this.setLength(0);
		this.setAdmin(false);
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getNumClass() {
		return numClass;
	}
	public void setNumClass(int numClass) {
		this.numClass = numClass;
	}
	public int getWidth() {
		return width;
	}
	public void setWidth(int width) {
		this.width = width;
	}
	public int getLength() {
		return length;
	}
	public void setLength(int length) {
		this.length = length;
	}
	public boolean getAdmin() {
		return admin;
	}
	public void setAdmin(boolean admin) {
		this.admin = admin;
	}
	public int sqFoot() {
		sqfoot = getWidth() * getLength();
		return sqfoot;
	}
	
}
