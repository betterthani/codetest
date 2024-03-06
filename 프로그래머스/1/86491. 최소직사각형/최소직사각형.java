import java.util.*;
class Solution {
    public int solution(int[][] sizes) {
        int answer = 0;
        int w_max = 0; // 가로
        int h_max = 0; // 세로
        
        for(int i = 0; i < sizes.length; i++){
            
            // 두 변중에 가장 긴 길이 = 가로
            int w = Math.max(sizes[i][0], sizes[i][1]);
            
            // 두 변중에 가장 짧은 길이 = 세로
            int h = Math.min(sizes[i][0], sizes[i][1]);
            
            if(w > w_max){
                w_max = w;
            }
            if(h > h_max){
                h_max = h;
            }
        }
        
        
        answer = w_max *h_max;
        return answer;
    }
}