class Solution {
    public String solution(String s) {
        String answer = "";
        int sLength = s.length() / 2;
        if(s.length() % 2 == 0){
            // 짝수 -> 가운데 2개
            answer = s.substring(sLength-1, sLength+1);
        } else {
            // 홀수 -> 가운데 1개
            answer = String.valueOf(s.charAt(sLength));
        }
        
        return answer;
    }
}