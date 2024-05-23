package org.ust;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

public class Question41 {

	public static void main(String[] args) throws ParseException {
		// TODO Auto-generated method stub
		String date = "22-05-1997";
		boolean result = validateAge(date);
		System.out.println(result);
	}

	private static boolean validateAge(String date) throws ParseException {
		// TODO Auto-generated method stub
		SimpleDateFormat simpleDateFormat = new SimpleDateFormat("dd-MM-yyy");
		Date dob = simpleDateFormat.parse(date);
		Calendar calendar = Calendar.getInstance();
		Calendar birthDate = Calendar.getInstance();
		birthDate.setTime(dob);
		int age = calendar.get(Calendar.YEAR) - birthDate.get(Calendar.YEAR);
		if (age > 21) {
			return true;

		}
		return false;

	}

}
