
public class primeNum {

	public static void main(String[] args) {
		
		for(int x =1; x<=50; x++) {
			int counter = 0;
			for(int y = x;2*y>=1; y--) {
				if(x%y==0) {
					counter += 1;
				}
			}
				if(counter ==2)
					System.out.println(x+ " Is prime.");
			

			

	}

	}
}

