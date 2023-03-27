package Day08;

import java.util.HashSet;
import java.util.Set;

public class Quiz01 {

	public static void main(String[] args) {
		int n = 12;
		Set<Integer> arr = new HashSet<>();
        int answer = 0;
        for(int i = 1; i <= Math.sqrt(n); i++){
            if(n % i == 0){
                arr.add(i);
                arr.add(n / i);
            }
        }
        
        for(int set : arr) {
        	answer += set;
        }
        System.out.println(answer);
	}

}
