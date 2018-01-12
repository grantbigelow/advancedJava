/*
 * Programmer: Grant Bigelow
 * Date: 9/22/17
 * Description: main class that takes in information about specific buildings and
 * prints that information out. 
 */
public class BuildingMain {

	public static void main(String[] args) {
		AppBuilding appResch = new AppBuilding(); 
		AppBuilding appBriggs = new AppBuilding();
		AppBuilding appHigdon = new AppBuilding();
		AppBuilding appCommons = new AppBuilding();
		
		appResch.setName("Resch");
		appResch.setNumClass(6);
		appResch.setWidth(40);
		appResch.setLength(180);
		appResch.setAdmin(false);
		System.out.println(appResch.getName() + " "+ appResch.getNumClass() + " "+appResch.getWidth() +" "+ appResch.getLength() + " "+appResch.getAdmin());
		
		appBriggs.setName("Briggs");
		appBriggs.setNumClass(10);
		appBriggs.setWidth(50);
		appBriggs.setLength(100);
		appBriggs.setAdmin(false);
		System.out.println(appBriggs.getName() + " "+appBriggs.getNumClass() +" "+ appBriggs.getWidth() + " "+appBriggs.getLength() +" "+ appBriggs.getAdmin());
		
		appHigdon.setName("Higdon");
		appHigdon.setNumClass(4);
		appHigdon.setWidth(80);
		appHigdon.setLength(80);
		appHigdon.setAdmin(true);
		System.out.println(appHigdon.getName() + " "+appHigdon.getNumClass() + " "+appHigdon.getWidth() +" "+ appHigdon.getLength() +" "+ appHigdon.getAdmin());
		
		appCommons.setName("Commons");
		appCommons.setNumClass(1);
		appCommons.setWidth(100);
		appCommons.setLength(250);
		appCommons.setAdmin(false);
		System.out.println(appCommons.getName() +" "+ appCommons.getNumClass() +" "+ appCommons.getWidth() +" "+ appCommons.getLength() + " "+appCommons.getAdmin());
		
		System.out.println("\n" + appResch.getName()+ "is " + appResch.sqFoot()+ " square feet");
		System.out.println(appBriggs.getName()+ "is " + appBriggs.sqFoot()+ " square feet");
		System.out.println(appHigdon.getName()+ "is " + appHigdon.sqFoot()+ " square feet");
		System.out.println(appCommons.getName()+ "is " + appCommons.sqFoot()+ " square feet");
	}
	

}
