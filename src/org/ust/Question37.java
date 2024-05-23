package org.ust;

public class Question37 {
	
	public static void main(String[]args) {
		String input= "Adhithya";
		String modified=rearrageCharacter(input);
		System.out.println(modified);
	}

	private static String rearrageCharacter(String input) {
		// TODO Auto-generated method stub
		StringBuilder sb=new StringBuilder();
		char[] characterArray=input.toCharArray();
		int count=0;
		for(char result:characterArray) {
			if(result!='a') {
				sb.append(result);
				
				
				
			}else {
				count++;
			}
			
		}
		for (int i = 0; i < count; i++) {
			sb.insert(0, 'a');
		}
		System.out.println(count);
		
		
		return sb.toString();
	}
	

}
