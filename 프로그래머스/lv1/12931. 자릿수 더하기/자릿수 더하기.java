import java.util.*;

public class Solution {
    public int solution(int n) {
        
        int number = n;
        int sum = 0;
        
        while (number > 0) {
            
            int lastNumber = number % 10; // 맨 뒷자리
            number /= 10; // 맨 뒷자리 제외한 나머지 자리
            
            sum += lastNumber;
        }
            
        return sum;
    }
}