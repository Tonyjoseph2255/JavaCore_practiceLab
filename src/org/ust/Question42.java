package org.ust;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.Scanner;


public class Question42 {

	public static void main(String[] args) throws ParseException {
		// TODO Auto-generated method stub
		System.out.println("select below option for formate");
		System.out.println("option1:month -date-year ex:05-26-2012");
		System.out.println("option2:date-month-year ex:26-May-12");
		System.out.println("option3:date-month-year ex:05-26-2012");
		System.out.println("option4:month -date-year ex:05/26/2012");
		System.out.println("option5:return the current year");
		System.out.println("option6:return the current month ex:May");
		System.out.println("option7:return the date 10 days after the sysdate");
		System.out.println("option7:return the date 10 days prior to sysdate");
		Scanner scanner = new Scanner(System.in);
		System.out.println("select any above option");
		int option = scanner.nextInt();
		String inputDate = "22/03/1997";

		switch (option) {
		case 1:
		case 2:
		case 3:
		case 4:
			String formattedDate = getDate(option, inputDate);
			System.out.println("Formatted date: " + formattedDate);
			break;
		case 5:
			int currentYear = getCurrentYear();
			System.out.println(currentYear);
			break;
		case 6:
			String currentMonth = getCurrentMonth(inputDate);
			System.out.println(currentMonth);
		case 7:
            String date= getDateAfter10Days();
            System.out.println(date);
            break;
		case 8:
			String date1=getDatebefore10Days();
			System.out.println(date1);
		 default:
             throw new IllegalArgumentException("Invalid option!");
		
        

		}
	}

	private static String getDatebefore10Days() {
		Calendar calendar= Calendar.getInstance();
		calendar.add(Calendar.DAY_OF_MONTH, -10);
		
				
		// TODO Auto-generated method stub
		return new SimpleDateFormat("dd/MM/yyyy").format(calendar.getTime());
	}

	private static String getDateAfter10Days() {
        Calendar calendar = Calendar.getInstance();
        calendar.add(Calendar.DAY_OF_MONTH, 10);
        return new SimpleDateFormat("dd/MM/yyyy").format(calendar.getTime());
    }


	private static String getCurrentMonth(String inputDate) {
		Calendar calendar = Calendar.getInstance();
		int month = calendar.get(Calendar.MONTH);
		String[] monthNames = { "January", "February", "March", "April", "May", "June", "July", "August", "September",
				"October", "November", "December" };
		// TODO Auto-generated method stub
		return monthNames[month];
	}

	private static int getCurrentYear() {
		// TODO Auto-generated method stub
		Calendar calendar = Calendar.getInstance();
		int year = calendar.get(Calendar.YEAR);
		return year;
	}

	private static String getDate(int option, String inputDate) throws ParseException {
		SimpleDateFormat sdf;
		switch (option) {
		case 1:
			sdf = new SimpleDateFormat("MM-dd-yyyy");
			break;
		case 2:
			sdf = new SimpleDateFormat("dd-MMM-yy");
			break;
		case 3:
			sdf = new SimpleDateFormat("dd/MM/yyyy");
			break;
		case 4:
			sdf = new SimpleDateFormat("MM/dd/yyyy");
			break;
		case 5:

		default:
			throw new IllegalArgumentException("Invalid option!");
		}
		Date date = new SimpleDateFormat("dd/MM/yyyy").parse(inputDate);
		return sdf.format(date);
	}
}
