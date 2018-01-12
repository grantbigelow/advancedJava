/*
 * Programmer: Grant Bigelow
 * Date: 10/31/17
 * Description: App class that takes in a number and converts it to 
 * either binary or decimal.
 */
public class BinaryApp {
	
	public void NumToBin(int num) {
		int binaryNum[] = new int[8];
		int i = 0;
		while(num > 0) {
			binaryNum[i] = num%2;
			i += 1;
			num = num/2;
		}
		for(int j = i-1;j >= 0;j--){
		       System.out.print(binaryNum[j]);
		}
	}
	public void BinToNum(String binary) {
		int binaryNum = Integer.parseInt(binary);
		int num = 0;
		int power = 0;
		while(binaryNum > 0) { 
			if(binaryNum==0) {
				break;
			}
			else {
				int digit = binaryNum % 10;
				num = (int) (num + (digit*(Math.pow(2, power))));
				binaryNum /= 10;
				power += 1;
				
			}
			
		}
		System.out.print(num);

	
	}

}
