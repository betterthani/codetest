import java.util.*;
class Solution {
    public int solution(int[] numbers) {
        int[] answer = new int[10];
        int sum = 0;
        
        for(int i = 0; i<numbers.length; i++){
            answer[numbers[i]] = 1;
        }
        
        for(int i = 0; i < answer.length; i++){
            if(answer[i] == 0){
                sum += i;
            }
        }
        return sum;
    }
}