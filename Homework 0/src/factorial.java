
public class factorial {
	int x = 0;
	public factorial() {
		x = 10;
	}
	public int findFactorial() {
		return findFactorial(x);
	}
	public int findFactorial(int n) {
		if (n==1) {
			return 1;
		}
		else {
			return n * findFactorial(n-1);
		}
		
	}
}
