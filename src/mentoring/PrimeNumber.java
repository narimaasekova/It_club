package mentoring;

import java.util.ArrayList;

public class PrimeNumber {
	public boolean primeNumber(int n) {
	for (int i=2;i<n;i++) {
		if(n%i==0){
		return false;	
		}
		
	}
	return true;
	}

	public static void main(String[] args) {
		
int h=11;
PrimeNumber number=new PrimeNumber();
number.primeNumber(h);
System.out.println(number.primeNumber(h));
 }
	

}
