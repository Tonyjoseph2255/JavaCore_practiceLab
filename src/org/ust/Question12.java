package org.ust;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Question12 {

	public static void main(String[] args) {
		// TODO Auto-generated method 
		String username = "abcdefg1_job"; 
		 boolean result=   validateUserName(username);
		 System.out.println(result);
		

	}

	private static boolean validateUserName(String username) {
		String regex = "^.{8,}_job$";
		Pattern pattern = Pattern.compile(regex);
		
		Matcher matcher=pattern.matcher(username);
		System.out.println(matcher.matches());
		return matcher.matches();
		// TODO Auto-generated method stub
		
	}

}
