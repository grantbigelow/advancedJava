/*
 * Programmer: Grant Bigelow
 * Date: 11/16/17
 * Description: App class that has accessor methods and mutator methods
 * for a numerator and denominator and toString and equals methods and finally
 * a addition method and multiplcation method. 
 */
public class RationalApp {
	private int iNumerator;
	private int iDenominator;
	
	public RationalApp() {
		setiNumerator(0);
		setiDenominator(1);
	}
	public int getiNumerator() {
		return iNumerator;
	}
	public void setiNumerator(int iNumerator) {
		this.iNumerator = iNumerator;
	}
	public int getiDenominator() {
		return iDenominator;
	}
	public void setiDenominator(int iDenominator) {
		this.iDenominator = iDenominator;
	}
	public String toString(){
		return(getiNumerator() + 
				"/"+getiDenominator());
	}
	public boolean equals(Object o){
		if(!(o instanceof RationalApp)){
			return false;
		}
		else{
			RationalApp objRational = (RationalApp)o;
			if( iNumerator == objRational.iNumerator
				&& iDenominator == objRational.iDenominator){
				return true;
			}
			else{
				return false;
			}
		}
	}
	public String Multiplication(int num1,int num2,int dom1,int dom2) {
		setiNumerator(num1 * num2);
		setiDenominator(dom1*dom2);
		return toString();
	}
	public String Add(int num1,int num2, int dom1, int dom2) {
		if(dom1 == dom2) {
			setiNumerator(num1 + num2);
			setiDenominator(dom1);
		}
		else {
			num1 = num1 * dom2;
			num2 = num2 * dom1;
			int dom3 = dom2 *dom1;
			setiNumerator(num1 + num2);
			setiDenominator(dom3);
		}
		return toString();
	}

}
