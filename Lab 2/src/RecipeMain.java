import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class RecipeMain {

	public static void main(String[] args) throws IOException {
		String sName = "";
		String input = "";
		int count = 0;
		boolean bDone = true;
		RecipeApp app = new RecipeApp();
		Scanner oScan = new Scanner(System.in);
		System.out.println("Enter the recipe name: ");
		sName = oScan.nextLine();
		String sFile = ("C:\\Users\\grant\\eclipse-workspace\\Lab 2\\"+sName+".txt");
		FileWriter fw = new FileWriter(sFile);
		
		
		while(bDone) {
			System.out.println("Enter Ingrediant or hit enter when complete: ");
			input = oScan.nextLine();
			if(input.equals("")) {
				bDone = false;
				break;
			}
			input = app.sIngredient(input);
			fw.write(input);
			fw.write('\r');
			fw.write('\n');
			
		}
		bDone = true;
		while(bDone) {
			System.out.println("Enter recipe step or hit enter when done: ");
			input = oScan.nextLine();
			if(input.equals("")) {
				bDone = false;
				break;
			}
			count++;
			input = app.sStep(count,input);
			fw.write(input);
			fw.write('\r');
			fw.write('\n');
			
		}
		fw.close();
	}

}
