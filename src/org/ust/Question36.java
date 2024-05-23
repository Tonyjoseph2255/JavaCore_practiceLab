package org.ust;

public class Question36 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int num= 12;
	int result=	getprimeSum(num);
	System.out.println(result);

	}

	private static int getprimeSum(int num) {
		int primeSum = 0;
		// TODO Auto-generated method stub
		for(int i=2;i<=num;i++) {
			boolean isPrime=true;
			for(int j=2;j<=i/2;j++) {
				if(i%j==0) {
					isPrime=false;
					break;
				}
			}if(isPrime) {
				primeSum+=i;
			}
		}
		return primeSum;
	}

}
