class Solution {
    public String solution(String s) {
        // 나누기(t,r,y, ,h,e,l ...)
		String [] sSplit = s.split("");
		String answer= "";
		int count = 0;
        
        for(String a : sSplit) { 
            count = a.contains(" ") ? 0 : count + 1;
            answer += (count % 2 == 0) ? a.toLowerCase() : a.toUpperCase();
        }
        
		return answer;
    }
}