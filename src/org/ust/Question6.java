package org.ust;

import java.util.HashMap;
import java.util.Map;

public class Question6 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		HashMap<String, Integer> studentMarks = new HashMap<>();
		studentMarks.put("101", 85);
		studentMarks.put("102", 75);
		studentMarks.put("103", 95);
		HashMap<String, String> medalDetails = GetStudents(studentMarks);
		for (Map.Entry<String, String> entry : medalDetails.entrySet()) {
			System.out.println("Reg number  " + entry.getKey() + "medal got  " + entry.getValue());

		}
	}

	private static HashMap<String, String> GetStudents(HashMap<String, Integer> studentMarks) {
		// TODO Auto-generated method stub
		HashMap<String, String> medalDetails = new HashMap<>();
		for (Map.Entry<String, Integer> entry : studentMarks.entrySet()) {
			String regNumber = entry.getKey();
			Integer mark = entry.getValue();
			String medal = "";
			if (mark >= 90) {
				medal = "Gold";
			} else if (mark >= 80) {
				medal = "Silver";

			} else if (mark >= 70) {
				medal = "Broze";

			}
			if (!medal.isEmpty()) {
				medalDetails.put(regNumber, medal);

			}

		}
		return medalDetails;
	}

}
