package Day11;

public class Main01 {
	public static void main(String[] args) {
		String new_id = "";

		// 1. 대문자를 소문자로 치환
		String answer = new_id.toLowerCase();
		
		// 2. 소문자 숫자 빼기 밑줄 마침표 제외 모두 삭제
		answer = answer.replaceAll("[^0-9a-z._-]", "");
		//new_id = new_id.replaceAll("[" + removeStr + "]", "");

		// 3. .2개 이상일 경우 한개로 바꾸기
		answer = answer.replaceAll("[.]{2,}", ".");
		
		// 4. 마침표(.)가 처음이나 끝에 위치한다면 제거합니다.
		answer = answer.replaceAll("^[.]|[.]$", "");
		
		// 5. 빈 문자열이라면, new_id에 "a"를 대입합니다.
		if(answer.isEmpty()) {
			answer += "a";
		}
		
		// 6. 길이가 16자 이상이면, new_id의 첫 15개의 문자를 제외한 나머지 문자들을 모두 제거합니다.
	    // 만약 제거 후 마침표(.)가 new_id의 끝에 위치한다면 끝에 위치한 마침표(.) 문자를 제거합니다.
		if(answer.length() >= 16) {
			answer = answer.substring(0,15);
			answer = answer.replaceAll("[.]$", "");
		}
	
		
		// 7. 길이가 2자 이하라면, new_id의 마지막 문자를 new_id의 길이가 3이 될 때까지 반복해서 끝에 붙입니다.
		if(answer.length() <= 2) {
			while(answer.length() < 3) {
				answer += answer.charAt(answer.length()-1);
			}
		}
		
		/*
		for(int i = 0 ; i < new_id.length(); i++) {
			if(new_id.charAt(i) == '.') {
				int j = i+1;
				String dot = ".";
				while(j != new_id.length() && new_id.charAt(j) == '.') {
					dot += ".";
					j++;
				}
				if(dot.length() > 1) {
					new_id = new_id.replace(dot, ".");
				}
			}
		}
		*/
		
		
		
	
		
		System.out.println(new_id);
		System.out.println(answer);
	}
}
