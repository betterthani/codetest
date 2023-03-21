package Day07;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Scanner;

public class Main01 {
	public static void main(String[] args) {

		Map<String, Integer> scores  = new HashMap<>();
		scores.put("국어", 90);
		scores.put("수학", 85);
		scores.put("영어", 90);
		scores.put("사회", 80);
		scores.put("과학", 100);
		
		System.out.println(scores);
		
		scores.put("사회", 85);
		System.out.println(scores);
		
		
		if (scores.containsValue(100)) {
			System.out.println("수상 가능");
		} else {
			System.out.println("해당 없음");
		}

	}
}
