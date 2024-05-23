package org.ust;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Question43 {
	public static void main(String[] args) {
	    // Code inside the main method
		 Map<String, String> productCategoryMap = new HashMap<>();
	        productCategoryMap.put("lux", "Soap");
	        productCategoryMap.put("colgate", "Toothpaste");
	        productCategoryMap.put("pears", "Soap");
	        productCategoryMap.put("sony", "Electronics");
	        productCategoryMap.put("samsung", "Electronics");
	        Map<String, Integer> productSalesMap = new HashMap<>();
	        productSalesMap.put("lux", 1000);
	        productSalesMap.put("colgate", 500);
	        productSalesMap.put("pears", 2000);
	        productSalesMap.put("sony", 100);
	        productSalesMap.put("samsung", 600);
	        
	        
	 List<String>arraResult=getmaxSold(productCategoryMap,productSalesMap);
	}

	private static List<String> getmaxSold(Map<String, String> productCategoryMap,
			Map<String, Integer> productSalesMap) {
		// TODO Auto-generated method stub
		return null;
	}

}
