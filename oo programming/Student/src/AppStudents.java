/*
 * Programmer: Grant Bigelow
 * Date: 9/18/17
 * Description: App class that has set methods and get methods
 * for different parts of a student and then a method that calculates
 * the students age. 
 */

public class AppStudents {
	
	private String StudName;
	private String Major;
	private String Grade;
	private String yearBorn;
	private int StudAge;
	private int iPercentGrade;
	private final int CURRENTYEAR = 2017;
	
	public AppStudents(){
		this.StudName = "Default";
		this.Major = "CSIT";
		this.Grade = "A";
		this.yearBorn = "2017";
	}
	
	public void setName(String StudName){
		this.StudName = StudName;
	}
	public void setMajor(String Major){
		this.Major= Major;
	}
	public void setGrade(String Grade){
		this.Grade = Grade;
	}
	public void setYearBorn(String yearBorn){
		this.yearBorn = yearBorn;
	}
	
	public String getName(){
		return StudName;
	}
	public String getMajor(){
		return Major;
	}
	public String getGrade(){
		return Grade;
	}
	public String getyearBorn(){
		return yearBorn;
	}
//	public void CalcAge(){
//		StudAge =  CURRENTYEAR- yearBorn;
//		System.out.println("Student's age:" + StudAge);
//	}

	public int getiPercentGrade() {
		return iPercentGrade;
	}

	public void setiPercentGrade(int iPercentGrade) {
		this.iPercentGrade = iPercentGrade;
		
	}
	public String iPercentGrade(){
		if ((iPercentGrade <= 100) && (iPercentGrade >= 90))
			return ("A");
		else if ((iPercentGrade < 90) && (iPercentGrade >= 80))
			return("B");
		else if ((iPercentGrade < 80) && (iPercentGrade >= 70))
			return("C");
		else if ((iPercentGrade < 70) && (iPercentGrade >= 60))
			return("D");
		else 
			return("F");
	}
}


