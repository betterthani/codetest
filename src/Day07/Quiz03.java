package Day07;

public class Quiz03 {

	public static void main(String[] args) {
		String[] babbling = {"aya", "yee", "u", "maa", "wyeoo"};
		String[] keyword = {"aya", "ye", "woo", "ma"};
		
		int count = 0; 
		
		for(int i = 0; i < babbling.length; i++) {
			
			String cutWord[] = null;
			
			for(int j = 0; j < keyword.length; j++) {
				cutWord = babbling[i].split(keyword[j]);
			}
			
			if(cutWord[i] == null) {
				count++;
			}
			
		}
		System.out.println(count);
	}

}
