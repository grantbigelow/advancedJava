import java.util.Scanner;
/*
 * Programmer: Grant Bigelow
 * Date: 10/15/17
 * Description: App class that has the user enter in a tempeture and returns
 * the probable season.  
 */
public class appWeather {
	public String Weather() {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Current Tempeture: ");
		int iValue1 = sc.nextInt();
		if ((iValue1 >= 90) &&(iValue1 <= 110))
				return ("The Season is probably Summer");
		else if ((iValue1 < 90)&& (iValue1 >= 70))
			return ("The Season is probably Spring");
		else if ((iValue1 < 70)&& (iValue1 >= 50))
			return ("The Season is probably Fall");
		else if ((iValue1 < 50)&& (iValue1 > -5))
			return ("The Season is probably Winter");
		else
			return ("Temperture is outside of valid range");
	}
	
}
