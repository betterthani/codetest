import java.util.*;
class Solution {
    public int solution(int[] d, int budget) {
        int answer = 0;
        
        //오름차순
        Arrays.sort(d);
        int sum = 0;
        
        for(int i : d){
            sum+= i;
            answer++;
            
            if(budget < sum){
                answer--;
                break;
            }
        }
        return answer;
    }
}