import java.util.*;
class Solution {
    public int solution(int n) {
        ArrayList arr = new ArrayList<>();
        
        int remainNum = 0;
        // 10진법 -> 3진법 , 반전
        while(n > 0){
            remainNum = n % 3; // 0
            arr.add(remainNum);
            n /= 3; // 15
        }

        // 3진법 -> 10진법
        int sum = 0;
        int j = 0;
        for(int i = arr.size()-1; i >= 0; i--) {
            sum += (int)arr.get(i) * (int)Math.pow(3,j++);
        }
        
        return sum;
    }
}