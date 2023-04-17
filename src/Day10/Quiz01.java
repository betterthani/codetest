package Day10;

import java.util.*;

public class Quiz01 {
	public static void main(String[] args) {
		String[] survey = {"TR", "RT", "TR"};
		int[] choices = {7, 1, 3};
		
		Map<Character, Integer> map = new HashMap<>();
		
		for(int i = 0; i < survey.length; i++) {
			char first_word = survey[i].charAt(0); // A
			char second_word = survey[i].charAt(1); // N
			
			int score;
			if(choices[i] < 4) {
				score = 4 - choices[i];
				map.put(first_word, map.getOrDefault(first_word, 0)+ score);
			} else {
				score = choices[i] - 4;
				map.put(second_word, map.getOrDefault(second_word, 0)+ score);
			}
		}
		
		StringBuilder strbuild = new StringBuilder();
		strbuild
		.append(map.getOrDefault('R', 0) >= map.getOrDefault('T', 0) ? 'R' : 'T')
		.append(map.getOrDefault('C', 0) >= map.getOrDefault('F', 0) ? 'C' : 'F')
		.append(map.getOrDefault('J', 0) >= map.getOrDefault('M', 0) ? 'J' : 'M')
		.append(map.getOrDefault('A', 0) >= map.getOrDefault('N', 0) ? 'A' : 'N')
		.toString();
		
		System.out.println(strbuild);
		
	}
}
