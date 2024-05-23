package org.ust;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

public class Question33 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String purchaseDate = "22/03/1997";
		String selllingDtae = "22/11/1997";
		boolean isAfter = compareDates(purchaseDate, selllingDtae);
		System.out.println("Is selling date after purchase date? " + isAfter);

	}

	private static boolean compareDates(String purchaseDate, String selllingDtae) {
		DateTimeFormatter simpleDateFormat = DateTimeFormatter.ofPattern("dd/MM/yyyy");

		try {
			LocalDate purchaseLocalDate = LocalDate.parse(purchaseDate, simpleDateFormat);
			LocalDate sellingLocalDate = LocalDate.parse(selllingDtae, simpleDateFormat);
			return sellingLocalDate.isAfter(purchaseLocalDate);

		} catch (Exception e) {
			// TODO: handle exception
			System.err.println("Error: Invalid date format.");
			return false;
		}

		// TODO Auto-generated method stub

	}

}
