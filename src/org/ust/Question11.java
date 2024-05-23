package org.ust;

import java.time.DayOfWeek;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

public class Question11 {

	public static void main(String[] args) {
		String dob = "1999-01-25";
		String format = "yyyy-MM-dd";
		String result = getDayofWeek(dob, format);
		System.out.println(result);
	}

	private static String getDayofWeek(String dob, String format) {
		try {
			DateTimeFormatter formater = DateTimeFormatter.ofPattern(format);
			LocalDate date = LocalDate.parse(dob, formater);
			DayOfWeek dayOfWeek = date.getDayOfWeek();
			return dayOfWeek.toString();
		} catch (Exception e) {
			return ("invalid date or formate" + e);
		}

	}

}
