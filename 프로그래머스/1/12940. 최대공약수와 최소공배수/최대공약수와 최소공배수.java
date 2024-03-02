import java.util.*;
class Solution {
    public int[] solution(int n, int m) {
        int[] answer = new int[2];
        
        // 두 수의 최대, 최소 구하기
        int max = Math.max(n,m);
        int min = Math.min(n,m);
        
        answer[0] = gcd(max,min);
        
        answer[1] = max * min / answer[0];
        
        return answer;
        
    }
    
    //최대 공약수 함수
    int gcd(int max, int min){
        int r;
        while(min > 0){
            r = max % min;
            max = min;
            min = r;
        }
        return max;
    }
}