class Solution {
    public String solution(int n) {
        String answer = "";
        String waterMelon = "수박";
        int idx = 0;
        for(int i = 0 ; i < n; i++){
            answer += waterMelon.charAt(idx++);
            if(idx == 2) idx = 0;
        }
        
        return answer;
    }
}