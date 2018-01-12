
import java.util.Scanner;
/*
 * Programmer: Grant Bigelow
 * Date: 11/19/17
 * Description: App class that has methods for putting exam scores
 * into an array and then finding the average,lowest score, highest score
 * and a method that converts the number to a string. 
 */
public class ExamScores {
	private int iSize;
	private int[] iScore;
	private int iTotal;
	private int count;
	public ExamScores(){
		iSize= 5;
		iScore = new int[iSize];
	}
	public void AcceptExamScore(){
		Scanner oScan = new Scanner(System.in);
		count=0;
		iTotal=0;
		for(int i=0; i<iSize; i++){
			System.out.print("Enter Exam Score: ");
			iScore[i]=oScan.nextInt();
			iTotal += iScore[i];
			count++;
		}
	}
	public String toString(){
		String sTemp = "";
		for(int j=0; j<iSize;j++){
			sTemp +=(iScore[j]+" ");
		}
		sTemp+=("\nAverage Score: "+AverageScore()+"\nHigh Score: "+HighScore()+"\nLowest Score: "+LowScore());
		return (sTemp);
	}
	public double AverageScore(){
		return((double)iTotal/count);
	}
	public int HighScore(){
		int high = 0;
		for(int i=0;i<iScore.length;i++) {
			if(high<iScore[i])
				high = iScore[i];
		}
		return high;
	}
	public int LowScore(){
		int low = 100;
		for(int i=0;i<iScore.length;i++) {
			if(low>iScore[i])
				low = iScore[i];
		}
		return low;
	}
}
