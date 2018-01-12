/*
 * Programmer: Grant Bigelow
 * Date: 9/12/17
 * Description: App class that uses nested for loops to
 * print and add numbers 1 through 10 and then prints the
 * total, then prints and add numbers 2 through 10 and then 
 * print the total, etc. until it reaches 10.
 */
public class NestForApp {
	public void ForLoop(){
		for(int i =1;i<=10; i++) {
			int iTotal=0;
			for(int j=i;j<=10; j++) {
				System.out.println(j);
				iTotal += j;
			}
			System.out.println(iTotal);
		}
	}
}
