package org.ust;

import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.Date;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Question17 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Map<Integer, String>persons=new HashMap<>();
		persons.put(101, "08/03/1997");
        persons.put(102, "15/11/1990");
        persons.put(103, "20/07/1985");
        persons.put(104, "20/07/2012");
       List<Integer>votersList= votersList(persons);
       for(Integer eligibleID:votersList) {
    	   System.out.println(eligibleID);
       }

	}

	private static List<Integer> votersList(Map<Integer, String> persons) {
		// TODO Auto-generated method stub
		List<Integer> eligibleVoters = new ArrayList<>();
		 Calendar currenDate=Calendar.getInstance();
		SimpleDateFormat formatter= new SimpleDateFormat("dd/MM/yyyy");
		
		for(Map.Entry<Integer,String>entry:persons.entrySet()) {
			Integer id= entry.getKey();
			String dob=entry.getValue();
			try {
				Date actualDate=formatter.parse(dob);
				 Calendar dobCal = Calendar.getInstance();
				 dobCal.setTime(actualDate);
				 int age =currenDate.get(Calendar.YEAR)-dobCal.get(Calendar.YEAR);
				 if (age > 18) {
	                    eligibleVoters.add(id);
	                }
			} catch (Exception e) {
				System.err.println("Error parsing date for ID " + id + ": " + e.getMessage());
			}
		}
		return eligibleVoters;
		
		
		
	}

}
