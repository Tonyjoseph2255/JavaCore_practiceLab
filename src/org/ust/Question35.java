package org.ust;

import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;

public class Question35 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Map<String, Integer> mathFeedback = new HashMap<>();
        mathFeedback.put("Alice", 4);
        mathFeedback.put("Bob", 5);
        mathFeedback.put("Charlie", 3);
        mathFeedback.put("David", 5);

        Map<String, Integer> englishFeedback = new HashMap<>();
        englishFeedback.put("Alice", 5);
        englishFeedback.put("Bob", 4);
        englishFeedback.put("David", 3);
        englishFeedback.put("Eve", 4);

        Map<String, Integer> consolidatedFeedback = consolidateFeedback(mathFeedback, englishFeedback);
        System.out.println("Consolidated Feedback:");
        for (Map.Entry<String, Integer> entry : consolidatedFeedback.entrySet()) {
            System.out.println(entry.getKey() + ": " + entry.getValue());
        }
	}

	private static Map<String, Integer> consolidateFeedback(Map<String, Integer> mathFeedback,
			Map<String, Integer> englishFeedback) {
		Map<String, Integer>consolidatedFeedback=new HashMap<>();
		// TODO Auto-generated method stub
		for(Map.Entry<String, Integer>mathEnry:mathFeedback.entrySet()) {
			
			String teacher=mathEnry.getKey();
			
			if(englishFeedback.containsKey(teacher)) {
				Integer mathScore=mathEnry.getValue();
				int englishScore = englishFeedback.get(teacher);
				int highestScore=Math.max(mathScore,englishScore);
				consolidatedFeedback.put(teacher, highestScore);
			}
		}
		return consolidatedFeedback;
	}

}
