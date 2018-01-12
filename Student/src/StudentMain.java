import java.util.Scanner;

/*
 * Programmer: Grant Bigelow
 * Date: 9/18/17
 * Description: Main class that calls the set and get methods
 * from the Student App and prints them out. 
 */
public class StudentMain {

	public static void main(String[] args) {
		Scanner oScan = new Scanner(System.in);
		AppStudents App = new AppStudents();
		
		System.out.print("Enter the name of the student: ");
		App.setName(oScan.nextLine());
		
		System.out.print("Enter the Major of the student: ");
		App.setMajor(oScan.nextLine());
		
		System.out.print("Enter the student's grade as a percent: ");
		App.setiPercentGrade(oScan.nextInt());
		App.setGrade(App.iPercentGrade());
		
		System.out.print("Enter the student's birth year: ");
		App.setYearBorn(oScan.nextLine());
		
		
		

		

		switch(App.getGrade()) {
		case "A":
			System.out.println("'A', nice work");
		case "B":
			System.out.println("'B', good but could use improvement");
		case "C":
			System.out.println("'C', needs improvement");
		case "D":
			System.out.println("'D', needs alot of improvement, study better next time");
		case "F":
			System.out.println("'F', You failed, see the teacher after class.");
		}
		System.out.println("the Student name is: "+ App.getName());
		System.out.println("Major: "+ App.getMajor());
		System.out.println("Grade: "+ App.getGrade());
//				App.setName("Grant Bigelow");
//				App.setMajor("CSIT");
//				App.setGrade("Sophmore");
//				App.setYearBorn(1998);
//				
//				System.out.println("Name: "+ App.getName());
//				System.out.println("Major: "+ App.getMajor());
//				System.out.println("Grade: "+ App.getGrade());
//				System.out.println("Year Born: "+ App.getyearBorn());
//				App.CalcAge();

	}




}


