import java.util.Scanner;

public class VolumeOfSphere {

	public static void main(String[] args) {
		Scanner oScan = new Scanner(System.in);
		
		System.out.print("Enter a radius (m): ");
		double r = oScan.nextDouble();
		System.out.println("");
		
		double volume = (4/3)*Math.PI*Math.pow(r, 3);
		System.out.printf("The Volume of a sphere with a radius of %fm is %f",r,volume);

	}

}
