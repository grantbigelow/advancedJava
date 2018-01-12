import java.util.ArrayList;
/*
 * Programmer: Grant Bigelow
 * Date: 11/29/17
 * Description: App class that creates an arraylist using the passanger class. 
 */
public class Train {
	Passanger pass = new Passanger();
	private ArrayList<String> array=new ArrayList<String>();
	
	public Train(){
		array = new ArrayList<String>();
	}
	public void setInteger(String x){
		array.add(x);
	}
	public String toString(){
		String sResult = "";
		for(String currentInteger:array){
			sResult+=currentInteger.toString()+"\n";
		}
		return sResult;
	}
}
