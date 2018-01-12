/*
 * Programmer: Grant Bigelow
 * Date: 9/12/17
 * Description: Application class that will convert Inches
 * to millimeters and print out the solution. 
 */
public class AppInchToMill {
	 private final double INCHES_TO_MILLIMETERS = 25.4;
	 
	 private int iInch = 2;
	 private int iInch2 = 5;
	 private int iInch3 = 10;
	 
	 public void CovertInchToMm() {
		 double Convert = iInch * INCHES_TO_MILLIMETERS;
		 double Convert2 = iInch2 * INCHES_TO_MILLIMETERS;
		 double Convert3 = iInch3 * INCHES_TO_MILLIMETERS;
		 
		 System.out.println(iInch + " Inches is " + Convert + " millimeters");
		 System.out.println(iInch2 + " Inches is " + Convert2 + " millimeters");
		 System.out.println(iInch3 + " Inches is " + Convert3 + " millimeters");
	 }

}
