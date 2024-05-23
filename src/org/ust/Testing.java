package org.ust;
//question =1
public class Testing {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int result=calculateSum(5) ;
		System.out.println(result);
	}

	/**
	 * @param i
	 */
	private static  int calculateSum(int i) {
		int sum =0;
		for(int n=1;n<=i;n++) {
			
			if(n%3==0||n%5==0) {
				
				sum=sum+n;
				
				
			}
		}
		return sum;
		
	}

}
