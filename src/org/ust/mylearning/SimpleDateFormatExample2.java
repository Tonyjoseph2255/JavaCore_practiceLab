package org.ust.mylearning;

import java.text.SimpleDateFormat;
import java.util.Date;

public class SimpleDateFormatExample2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Date date = new Date(); 
		 System.out.println("Date formate chnage by Technolamror ");
		 SimpleDateFormat formatter =  new SimpleDateFormat("E dd MMMM yyyy HH:mm:ss z"); 
		 String strDate = formatter.format(date); 
		 System.out.println("Date Format with MM/dd/yyyy : "+strDate);
	}

}
