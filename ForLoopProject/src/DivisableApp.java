/*
 * Programmer: Grant Bigelow
 * Date: 10/30/17
 * Description: App class that has set methods and get methods
 * Prints all numbers that are divisible by the entered value.
 * Keeps track of the total numbers that are divisible.
 */
public class DivisableApp {
	private int DevNum;

	public int getDevNum() {
		return DevNum;
	}

	public void setDevNum(int DevNum) {
		DevNum = DevNum;
		int count = 0;
		for(int i=1; i<=100; i++) {
			if(DevNum%i == 0) {
				count+=1;
				System.out.println(i);	
			}		
		
		}
		System.out.println(DevNum+" is divisable by " + count+ " numbers");
	}
	

	

}
