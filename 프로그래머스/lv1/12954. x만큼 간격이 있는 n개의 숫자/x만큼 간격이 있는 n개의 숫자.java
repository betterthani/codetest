import java.util.*;

class Solution {
    public long[] solution(int x, int n) {
        long[] answer = new long[n];
        long number = x;//-4
        
        for(int i = 0; i < n; i++){
            answer[i] = number;
            number += x;
        }
        
        return answer;
    }
}