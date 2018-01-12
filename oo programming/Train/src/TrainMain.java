import java.util.Scanner;
/*
 * Programmer: Grant Bigelow
 * Date: 11/29/17
 * Description: Main Class that tests the passanger and app class. 
 */
public class TrainMain {

	public static void main(String[] args) {
		Passanger pass = new Passanger();
		Train train = new Train();
		Scanner oScan = new Scanner(System.in);
		for(int i=0;i<9;i++) {
			System.out.println("Enter Passangers Class");
			pass.setIclass(oScan.nextLine());
			System.out.println("Enter Passangers Name");
			pass.setName(oScan.nextLine());
			String passanger = pass.getName()+" "+pass.getIclass();
			train.setInteger(passanger);
		}
		System.out.println(train.toString());

	}

}
