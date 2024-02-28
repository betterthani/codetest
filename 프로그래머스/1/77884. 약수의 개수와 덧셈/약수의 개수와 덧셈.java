import java.util.*;
class Solution {
    public int solution(int left, int right) {
        List<Integer> resultList = new ArrayList<>();
        int answer = 0;
        
        // 범위 (left ~ right)
        for(int i = left; i <= right; i++){
            
            // 약수 구하기
            int sq = (int)Math.sqrt(i); // 제곱근
            for(int j = 1; j <= sq; j++){
                if(i % j == 0){
                    resultList.add(j);
                    
                    if(i / j != j){
                        resultList.add( i / j);
                    }
                    
                }
            }
            
            // 약수 개수 짝수 값 더하기, 홀수경우 빼기
            if(resultList.size() % 2 == 0){
                //짝수
                answer += i;
            } else {
                answer -= i;
            }
            
            // 초기화
            resultList.clear();
            
        } //-> 범위 끝
        
        return answer;
    }
}