package org.ust;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Question22 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Map<Integer, String> couples = new HashMap<>();
		couples.put(100, "achu-ammu");
		couples.put(101, "vimal-maliv");
		couples.put(103, "tara-rata");
		couples.put(102, "gayatry-ekarth");
		List<Integer> perfectCouples = checkPerfectCouple(couples);
		 System.out.println("Perfect couples: " + perfectCouples);
	}

	private static List<Integer>  checkPerfectCouple(Map<Integer, String> couples) {
		// TODO Auto-generated method stub
		ArrayList<Integer>perfectCoupleIds= new ArrayList<>();
		for (Map.Entry<Integer, String> entry : couples.entrySet()) {
			
			String couple = entry.getValue();
			Integer coupleId=entry.getKey();
			String[] coupleArray = couple.split("-");
			String partner1 = coupleArray[0];
			String partner2 = coupleArray[1];
			if (areCharactersEqual(partner1, partner2)) {
				perfectCoupleIds.add(coupleId);
			}
		}
		return perfectCoupleIds;

	}

	private static boolean areCharactersEqual(String partner1, String partner2) {
		// TODO Auto-generated method stub
		partner1 = partner1.toLowerCase();
		partner2 = partner2.toLowerCase();
		char []husband= partner1.toCharArray();
		char []wife=partner2.toCharArray();
		Arrays.sort(husband);
		Arrays.sort(wife);
		return  Arrays.equals(husband, wife);
	} 

}
