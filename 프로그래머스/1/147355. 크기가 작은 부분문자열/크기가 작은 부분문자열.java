class Solution {
    public int solution(String t, String p) {
        /*
        int answer = 0;
        int cnt = 0;
        
        // substring 문자열 p크기 만큼 자르기
        int pLength = p.length();
        int pNum = Integer.parseInt(p);
        
        for(int i = 0; i < t.length() - pLength + 1; i++){
            answer = Integer.parseInt(t.substring(i, i + pLength));
            if(answer <= pNum) cnt++;
        }
        
        return cnt;
        */
        int len = p.length();
		long num = Long.parseLong(p);
		int result = 0;

		for (int i = 0; i < t.length() - len + 1; i++) {
			long diff = Long.parseLong(t.substring(i, i + len));
			if (diff <= num) result++;
		}
		return result;
    }
}