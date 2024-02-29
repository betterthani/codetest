import java.util.*;
class Solution {
    public String solution(String s) {
        String answer = "";
        
        // 잘라서 배열 넣기
        char[] str = s.toCharArray();
        Arrays.sort(str);
        
        // buffer 담고 내림차순 변경
        StringBuffer strBuf = new StringBuffer(new String(str));
        answer = strBuf.reverse().toString();
        
        return answer;
    }
}